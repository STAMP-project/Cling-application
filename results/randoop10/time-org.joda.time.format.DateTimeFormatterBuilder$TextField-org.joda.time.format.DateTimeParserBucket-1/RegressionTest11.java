import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1439);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.util.Locale locale3 = new java.util.Locale("52 (FR_FR,ja)", "24", "java.io.IOException: -1");
        org.junit.Assert.assertEquals(locale3.toString(), "52 (fr_fr,ja)_24_java.io.IOException: -1");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.Object obj19 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale24 = java.util.Locale.US;
        dateTimeParserBucket18.saveField(dateTimeFieldType22, "centuryOfEra", locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder7.setLocale(locale24);
        java.util.Locale locale30 = new java.util.Locale("Italian");
        java.lang.String str31 = locale30.toLanguageTag();
        java.lang.String str33 = locale30.getExtension('a');
        java.util.Locale.Builder builder34 = builder7.setLocale(locale30);
        java.util.Locale.Builder builder35 = builder7.clear();
        java.util.Locale.Builder builder37 = builder35.setRegion("");
        java.util.Locale.Builder builder38 = builder35.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u7f8e\u56fd" + "'", str27, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals(locale30.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "italian" + "'", str31, "italian");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(12);
        long long4 = dateTimeZone1.adjustOffset(6048950400000L, true);
        long long6 = dateTimeZone1.previousTransition(6048863929880000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6048950400000L + "'", long4 == 6048950400000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6048863929880000L + "'", long6 == 6048863929880000L);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-tw (IT_IT)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh-tw(it_it)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.Object obj19 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale24 = java.util.Locale.US;
        dateTimeParserBucket18.saveField(dateTimeFieldType22, "centuryOfEra", locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder7.setLocale(locale24);
        java.util.Locale locale30 = new java.util.Locale("Italian");
        java.lang.String str31 = locale30.toLanguageTag();
        java.lang.String str33 = locale30.getExtension('a');
        java.util.Locale.Builder builder34 = builder7.setLocale(locale30);
        java.util.Locale.Builder builder35 = builder7.clear();
        java.util.Locale.Builder builder37 = builder35.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder35.setLanguageTag("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??? (???????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "19");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "United States" + "'", str27, "United States");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals(locale30.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "italian" + "'", str31, "italian");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        java.lang.String str4 = dateTimeZone0.toString();
        boolean boolean6 = dateTimeZone0.isStandardOffset(608340053L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName(100L, locale8);
        java.lang.String str11 = dateTimeZone0.getName(569228503L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.setLanguage("zho");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.addUnicodeLocaleAttribute("\u5951\u52aa\u514b\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder14 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setExtension(' ', "French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = builder10.build();
        java.lang.String str13 = locale12.getScript();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale4.getDisplayVariant(locale14);
        java.lang.String str17 = locale4.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale4.getISO3Language();
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 19");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "19");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "und" + "'", str17, "und");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setRegion("java.io.IOException: java.io.IOException: ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.IOException: java.io.IOException: ita [at index 0]");
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
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) 7200000);
        java.util.Locale locale11 = dateTimeParserBucket6.getLocale();
        dateTimeParserBucket6.setOffset((int) 'u');
        org.joda.time.Chronology chronology14 = dateTimeParserBucket6.getChronology();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 101537);
        java.lang.Object obj17 = dateTimeParserBucket6.saveState();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Inglese", (double) 259200024L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.59200024E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 53);
        int int4 = dateTimeZone2.getOffset(3155587199955L);
        long long6 = dateTimeZone2.convertUTCToLocal(2415601210L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 193980000 + "'", int4 == 193980000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2609581210L + "'", long6 == 2609581210L);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.lang.String str11 = locale8.getExtension('a');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.util.Locale locale3 = new java.util.Locale("120", "-8", "10 (jpn,us)");
        org.junit.Assert.assertEquals(locale3.toString(), "120_-8_10 (jpn,us)");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("gio", (double) 1242000010L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.24200001E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Locale.setDefault(locale1);
        java.lang.String str5 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setLanguage("-6011");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: -6011 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale8 = new java.util.Locale("Italian");
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder5.removeUnicodeLocaleAttribute("Chinese");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hourofhalfday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[weekOfWeekyear]");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
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
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap23);
        java.util.Set<java.lang.String> strSet25 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet25);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap30);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(localeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeList31);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("JPN");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Giapponese" + "'", str4, "Giapponese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Giapponese" + "'", str5, "Giapponese");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("120 (DECEMBER)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '120 (DECEMBER)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.util.Locale locale3 = new java.util.Locale("\u52a0\u62ff\u5927", "jpn", "\u65e5\u6587");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale3.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u52a0\u62ff\u5927\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u52a0\u62ff\u5927" + "'", str4, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JPN" + "'", str5, "JPN");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.setExtension('u', "de");
        java.util.Locale.Builder builder16 = builder14.removeUnicodeLocaleAttribute("338855");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder14.removeUnicodeLocaleAttribute("Wednesday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Wednesday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale.Builder builder10 = builder1.removeUnicodeLocaleAttribute("71340010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder1.setUnicodeLocaleKeyword("\u5fb7\u56fd,java.io.IOException: und)", "Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: cn (??,java.io.IOException: und) [at index 0]");
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
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        java.lang.String str14 = dateTimeZone1.getID();
        long long16 = dateTimeZone1.previousTransition(28857600000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale21 = new java.util.Locale("5100", "\u5927\u97d3\u6c11\u56fd");
        java.lang.String str22 = dateTimeZone1.getName(3599990L, locale21);
        boolean boolean23 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 28857600000L + "'", long16 == 28857600000L);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffset(87L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.util.Locale locale1 = new java.util.Locale("26041");
        org.junit.Assert.assertEquals(locale1.toString(), "26041");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-69363), 363338398);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363338398");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("KOR", 0.0d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.adjustOffset(604801053L, true);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) (byte) 100);
        long long10 = dateTimeZone1.previousTransition(8540279926L);
        long long12 = dateTimeZone1.nextTransition(864000210L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 604801053L + "'", long5 == 604801053L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 8540279926L + "'", long10 == 8540279926L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 864000210L + "'", long12 == 864000210L);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("48", "English");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale6);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("ja");
        java.util.Locale.Builder builder15 = builder10.setVariant("Germany");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: utc");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayName();
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.Object obj7 = locale2.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u56fd", "minuteOfDay", "-01:14");
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd_MINUTEOFDAY_-01:14");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "DE");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("Italian");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.Builder builder16 = builder13.setRegion("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.addUnicodeLocaleAttribute("DateTimeField[weekyear]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DateTimeField[weekyear] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((long) 'a');
        boolean boolean14 = dateTimeZone10.isFixed();
        int int16 = dateTimeZone10.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone18.getOffset(readableInstant21);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 3599999L);
        long long26 = dateTimeZone18.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone18.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) 8);
        long long33 = dateTimeZone1.convertLocalToUTC(102819600000L, false);
        long long36 = dateTimeZone1.adjustOffset(1562083200000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3599999L + "'", long24 == 3599999L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 8L + "'", long30 == 8L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 102819600000L + "'", long33 == 102819600000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1562083200000L + "'", long36 == 1562083200000L);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) ' ');
        long long5 = dateTimeZone1.convertUTCToLocal(259200058L);
        java.lang.String str7 = dateTimeZone1.getShortName(259200067L);
        int int9 = dateTimeZone1.getStandardOffset(266543661L);
        int int11 = dateTimeZone1.getOffset(174959998503L);
        java.lang.String str13 = dateTimeZone1.getNameKey((-61970986674993L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 259200090L + "'", long5 == 259200090L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.032" + "'", str7, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-49674615");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-49674615");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        boolean boolean3 = dateTimeZone1.isStandardOffset((-15060000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        java.lang.String str13 = dateTimeZone11.getName(2419201200L);
        java.lang.String str15 = dateTimeZone11.getShortName(15L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.util.Locale locale2 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", "era");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)_ERA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ERA" + "'", str3, "ERA");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(durationFieldType1);
        org.junit.Assert.assertNull(durationFieldType2);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.util.Locale locale3 = new java.util.Locale("Chinesisch", "ISOChronology[+100:00]", "\u4e2d\u56fd\u8a9e");
        java.lang.String str4 = locale3.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinesisch" + "'", str4, "chinesisch");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "");
        java.util.Locale.Builder builder10 = builder5.setLanguageTag("eng");
        java.util.Locale.Builder builder11 = builder5.clearExtensions();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getDisplayScript();
        java.util.Locale.Builder builder16 = builder11.setLocale(locale13);
        java.util.Locale.Builder builder19 = builder16.setExtension('a', "");
        boolean boolean20 = languageRange1.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getStandardOffset(107L);
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        int int14 = dateTimeZone1.getOffsetFromLocal((-62104060800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        boolean boolean7 = dateTimeZone1.isStandardOffset(28126798503L);
        java.lang.String str9 = dateTimeZone1.getName((long) 7223);
        long long13 = dateTimeZone1.convertLocalToUTC(21168000000L, true, 86400309L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21168000000L + "'", long13 == 21168000000L);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italiano (Italia)", (double) 604801053L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=6.04801053E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        int int15 = dateTimeZone1.getStandardOffset((-284922054L));
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) 64713599643L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setScript("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Deutschland [at index 0]");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
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
        long long30 = dateTimeZone1.convertLocalToUTC((long) (short) 1, true, (long) (short) 100);
        java.util.Locale locale35 = new java.util.Locale("10", "jpn", "us");
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale locale37 = locale35.stripExtensions();
        java.lang.String str38 = dateTimeZone1.getName(17787600000L, locale37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JPN" + "'", str25, "JPN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertEquals(locale35.toString(), "10_JPN_us");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguageTag("fr,FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: fr,FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", (double) 18000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.8E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
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
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfDay();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "10_JPN_us");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "10_JPN_us");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        java.lang.String str10 = locale7.getLanguage();
        java.lang.String str11 = locale7.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("52", "");
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setExtension('a', "weekyear");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder3.setExtension('4', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.084");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "Franz\366sisch", "fr_FR");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_FRANZ\366SISCH_fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinese (FRANZ\366SISCH,fr,FR)" + "'", str4, "chinese (FRANZ\366SISCH,fr,FR)");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("UTC");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getScript();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long10 = dateTimeZone7.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone7.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone7.getName((long) ' ', locale14);
        long long18 = dateTimeZone7.convertLocalToUTC(0L, false);
        int int20 = dateTimeZone7.getOffset(21254400000L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone7.getOffset(readableInstant21);
        java.util.Locale locale27 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean28 = locale27.hasExtensions();
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.lang.String str30 = locale27.getDisplayVariant(locale29);
        java.lang.String str31 = locale29.getDisplayCountry();
        java.lang.String str32 = dateTimeZone7.getShortName(66268800000L, locale29);
        java.lang.String str33 = locale1.getDisplayScript(locale29);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "utc" + "'", str2, "utc");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60480000010L + "'", long10 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7200000 + "'", int12 == 7200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+02:00" + "'", str15, "+02:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7200000L) + "'", long18 == (-7200000L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7200000 + "'", int20 == 7200000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7200000 + "'", int22 == 7200000);
        org.junit.Assert.assertEquals(locale27.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u56fd" + "'", str31, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+02:00" + "'", str32, "+02:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setUnicodeLocaleKeyword("21180", "dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 21180 [at index 0]");
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
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.io.IOException iOException2 = new java.io.IOException("dayofyear");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException("UTC", throwable8);
        java.io.IOException iOException10 = new java.io.IOException(throwable8);
        java.io.IOException iOException11 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException15 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException4.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException21 = new java.io.IOException("");
        java.io.IOException iOException22 = new java.io.IOException("USA", (java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException("-1", (java.lang.Throwable) iOException21);
        java.lang.Throwable[] throwableArray24 = iOException21.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException21);
        iOException4.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: java.io.IOException: dayOfYear", (java.lang.Throwable) iOException21);
        java.io.IOException iOException30 = new java.io.IOException("und");
        java.io.IOException iOException31 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException30);
        iOException27.addSuppressed((java.lang.Throwable) iOException32);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("era");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DateTimeField[dayOfWeek]", (double) (-59106067200001L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.9106067200001E13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone10, 97L);
        boolean boolean15 = dateTimeZone10.isStandardOffset((long) 10);
        int int17 = dateTimeZone10.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology20, locale21, (java.lang.Integer) (-1), 0);
        java.util.Locale locale25 = locale21.stripExtensions();
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale locale28 = builder27.build();
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale29.getDisplayCountry();
        java.lang.String str32 = locale21.getDisplayLanguage(locale29);
        java.lang.String str33 = locale21.getDisplayLanguage();
        java.lang.String str34 = dateTimeZone10.getName((long) 2922789, locale21);
        long long38 = dateTimeZone10.convertLocalToUTC(3084498489600000L, true, (-3L));
        long long41 = dateTimeZone10.adjustOffset(388172822400107L, true);
        long long45 = dateTimeZone10.convertLocalToUTC((long) 4969628, false, 3061065600000L);
        boolean boolean46 = languageRange1.equals((java.lang.Object) 4969628);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5304L + "'", long13 == 5304L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u56fd" + "'", str31, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u6cd5\u6587" + "'", str32, "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6cd5\u6587" + "'", str33, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3084498489600000L + "'", long38 == 3084498489600000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 388172822400107L + "'", long41 == 388172822400107L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 4969628L + "'", long45 == 4969628L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 100);
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale18 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.Locale locale24 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = builder26.build();
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale27.getDisplayLanguage(locale28);
        java.util.Set<java.lang.String> strSet30 = locale28.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Language();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale35.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 100);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = locale46.getISO3Language();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale46.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale51.getISO3Country();
        java.util.Locale locale53 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale35, locale40, locale43, locale46, locale51, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 100);
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale66 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        org.joda.time.Chronology chronology77 = null;
        java.util.Locale locale78 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology77, locale78, (java.lang.Integer) 100);
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale78 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale locale85 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList60, (java.util.Collection<java.util.Locale>) localeList82, filteringMode86);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap89);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CHN" + "'", str36, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zho" + "'", str37, "zho");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CHN" + "'", str47, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zho" + "'", str48, "zho");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "CHN" + "'", str52, "CHN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale78);
// flaky:         org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNull(locale85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(languageRangeList90);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2937600);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
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
        java.util.Locale.Builder builder19 = builder17.setLanguage("English");
        java.util.Locale locale20 = builder17.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder17.setScript("82");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 82 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "english");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getShortName(18748800052L);
        int int13 = dateTimeZone8.getOffsetFromLocal((long) 4969628);
        int int15 = dateTimeZone8.getOffsetFromLocal(5207L);
        java.lang.String str16 = dateTimeZone8.getID();
        int int18 = dateTimeZone8.getOffset((-1567641134995634000L));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360000000 + "'", int15 == 360000000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:00" + "'", str16, "+100:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360000000 + "'", int18 == 360000000);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("year");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder14 = builder13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setRegion("DateTimeField[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: DateTimeField[minuteOfDay] [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
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
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "");
        java.util.Locale locale16 = builder12.build();
        java.util.Locale.Builder builder17 = builder12.clear();
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        int int6 = dateTimeZone1.getStandardOffset((long) 86399);
        java.lang.String str7 = dateTimeZone1.getID();
        int int9 = dateTimeZone1.getOffset(789263999954L);
        long long11 = dateTimeZone1.nextTransition(53L);
        long long13 = dateTimeZone1.nextTransition((long) 1982);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1982L + "'", long13 == 1982L);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.util.Locale locale2 = new java.util.Locale("ISOChronology[+00:00:00.010]", "ita");
        org.junit.Assert.assertEquals(locale2.toString(), "isochronology[+00:00:00.010]_ITA");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap23);
        java.util.Set<java.lang.String> strSet25 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet25);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap28);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale30.getISO3Country();
        java.lang.String str32 = locale30.getISO3Language();
        java.util.Locale.setDefault(locale30);
        java.util.Set<java.lang.String> strSet34 = locale30.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet35 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str36 = java.util.Locale.lookupTag(languageRangeList29, (java.util.Collection<java.lang.String>) strSet35);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(localeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(86399);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertLocalToUTC((long) 363338398, false, (long) 16);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str13 = locale10.getExtension('x');
        java.lang.String str14 = dateTimeZone1.getName(2L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 363251999L + "'", long8 == 363251999L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01:26.399" + "'", str14, "+00:01:26.399");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.util.Locale locale3 = new java.util.Locale("+11:00", "DateTimeField[millisOfDay]", "Italienisch (Italien)");
        org.junit.Assert.assertEquals(locale3.toString(), "+11:00_DATETIMEFIELD[MILLISOFDAY]_Italienisch (Italien)");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("US", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale8 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale locale14 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale20 };
        java.util.ArrayList<java.util.Locale> localeList24 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList24, localeArray23);
        java.util.Locale locale26 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList24);
        java.util.Locale locale27 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList24);
        java.util.Locale locale28 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap29);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("CA");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.parse("CA");
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology38, locale39, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(100L, chronology36, locale39);
        java.lang.String str43 = locale39.getScript();
        java.lang.String str45 = locale39.getExtension('u');
        java.util.Locale locale47 = new java.util.Locale("2");
        java.lang.String str48 = locale39.getDisplayCountry(locale47);
        java.util.Set<java.lang.String> strSet49 = locale39.getUnicodeLocaleKeys();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList51, strMap52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology58, locale59, (java.lang.Integer) 100);
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale59 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.Locale locale65 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        org.joda.time.Chronology chronology70 = null;
        java.util.Locale locale71 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology70, locale71, (java.lang.Integer) 100);
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale71 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.Locale locale78 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList53, (java.util.Collection<java.util.Locale>) localeList75, filteringMode79);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strSet49, filteringMode79);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList81);
        java.lang.String str83 = java.util.Locale.lookupTag(languageRangeList30, (java.util.Collection<java.lang.String>) strList82);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals(locale47.toString(), "2");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(locale65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode79.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.util.Locale locale1 = new java.util.Locale("+53:53");
        org.junit.Assert.assertEquals(locale1.toString(), "+53:53");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("zho");
        java.util.Locale locale9 = builder3.build();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("utc");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("338");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 338 [at index 0]");
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
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder6.setScript("+08:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +08:00 [at index 0]");
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
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("utc");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        long long14 = dateTimeZone1.convertLocalToUTC(259200000L, true);
        boolean boolean15 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200000L + "'", long14 == 259200000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getStandardOffset(1210L);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        int int6 = dateTimeZone0.getOffsetFromLocal(3600000L);
        java.lang.String str7 = dateTimeZone0.toString();
        int int9 = dateTimeZone0.getStandardOffset(63072000000L);
        long long12 = dateTimeZone0.convertLocalToUTC(6021L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 6021L + "'", long12 == 6021L);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.util.Locale locale2 = new java.util.Locale("Korean (South Korea)", "11");
        org.junit.Assert.assertEquals(locale2.toString(), "korean (south korea)_11");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("cn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'cn' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.util.Locale locale3 = new java.util.Locale("dayOfYear", "35", "");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale3.getDisplayName(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.util.Locale locale10 = locale7.stripExtensions();
        java.lang.Object obj11 = locale10.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "dayofyear_35");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayofyear (35)" + "'", str8, "dayofyear (35)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.io.IOException iOException1 = new java.io.IOException("168");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
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
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket7.getZone();
        long long18 = dateTimeZone14.convertLocalToUTC(126904321620000L, false, 300097L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 126904321620000L + "'", long18 == 126904321620000L);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.util.Locale locale1 = new java.util.Locale("Sat");
        org.junit.Assert.assertEquals(locale1.toString(), "sat");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder24.setExtension('a', "+32:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: +32:00 [at index 0]");
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
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
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
        java.util.Locale locale17 = new java.util.Locale("UTC", "-2678388");
        java.lang.String str18 = locale2.getDisplayLanguage(locale17);
        java.lang.String str19 = locale2.getDisplayScript();
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
        org.junit.Assert.assertEquals(locale17.toString(), "utc_-2678388");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
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
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException: zho");
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        iOException8.addSuppressed((java.lang.Throwable) iOException21);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jpn" + "'", str3, "jpn");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jpn" + "'", str7, "jpn");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jpn" + "'", str8, "jpn");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.util.Locale locale2 = new java.util.Locale("millisOfSecond", "\u610f\u5927\u5229");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u610f\u5927\u5229");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(350701168, 26041);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 26041");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone8.toTimeZone();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone8.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone8.convertLocalToUTC((-1567641608121600000L), false);
        boolean boolean17 = dateTimeZone8.isStandardOffset((-2850284851200010L));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1567641608121600000L) + "'", long15 == (-1567641608121600000L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("IT");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("AD");
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale11 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList18);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(localeList19);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.io.IOException iOException1 = new java.io.IOException("34");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        boolean boolean11 = dateTimeField10.isSupported();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("48", "English");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale6);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("187");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 187 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.util.Locale locale3 = new java.util.Locale("monthOfYear", "java.io.IOException: en-CA", "168");
        org.junit.Assert.assertEquals(locale3.toString(), "monthofyear_JAVA.IO.IOEXCEPTION: EN-CA_168");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1439);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (-1));
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 6048000035L);
        long long12 = dateTimeZone1.convertUTCToLocal(259199566L);
        java.lang.String str14 = dateTimeZone1.getShortName(6656400010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int17 = dateTimeZone1.getOffset((-320399990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 6048000035L + "'", long10 == 6048000035L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 259199566L + "'", long12 == 259199566L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.io.IOException iOException1 = new java.io.IOException("IT");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: IT" + "'", str2, "java.io.IOException: IT");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.util.Locale locale1 = new java.util.Locale("AD");
        org.junit.Assert.assertEquals(locale1.toString(), "ad");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.lang.String str10 = dateTimeZone8.getName(946684800000L);
        boolean boolean11 = dateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("2", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        java.io.IOException iOException14 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.lang.Throwable throwable19 = null;
        java.io.IOException iOException20 = new java.io.IOException("UTC", throwable19);
        java.io.IOException iOException21 = new java.io.IOException(throwable19);
        java.io.IOException iOException22 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException21);
        iOException16.addSuppressed((java.lang.Throwable) iOException21);
        boolean boolean24 = dateTimeParserBucket7.restoreState((java.lang.Object) iOException16);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.util.Locale locale1 = new java.util.Locale("java.io.IOException: JPN");
        org.junit.Assert.assertEquals(locale1.toString(), "java.io.ioexception: jpn");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("2", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException4);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException11 = new java.io.IOException("+00:00:00.032", (java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.util.Locale locale1 = new java.util.Locale("CN");
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587", "14");
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587_14");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.String str5 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.util.Locale locale3 = new java.util.Locale("40", "April", "");
        org.junit.Assert.assertEquals(locale3.toString(), "40_APRIL");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
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
        java.util.Locale.Builder builder21 = builder10.setLocale(locale15);
        java.util.Locale.Builder builder23 = builder21.setVariant("1190");
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
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
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
        int int24 = dateTimeZone22.getOffset(117L);
        java.util.Locale locale27 = new java.util.Locale("10");
        java.lang.String str28 = dateTimeZone22.getName(259200059L, locale27);
        java.util.TimeZone timeZone29 = dateTimeZone22.toTimeZone();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals(locale27.toString(), "10");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR_FR", (double) 3124486380000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3.12448638E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder13 = builder3.setExtension('x', "Thu");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder3.setVariant("\u6708\u66dc\u65e5");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??? [at index 0]");
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
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.io.ioexception: weekyear", (double) 720301978L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.20301978E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        long long11 = dateTimeZone8.nextTransition((-86399L));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-86399L) + "'", long11 == (-86399L));
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#', locale5);
        long long8 = dateTimeZone1.nextTransition(93623040345600000L);
        long long10 = dateTimeZone1.nextTransition((long) (-43));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 93623040345600000L + "'", long8 == 93623040345600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-43L) + "'", long10 == (-43L));
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleKeys();
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale42.getISO3Country();
        java.lang.String str44 = locale42.getISO3Language();
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale42.getDisplayVariant(locale45);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 100);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getISO3Country();
        java.lang.String str55 = locale53.getISO3Language();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale58.getISO3Country();
        java.util.Locale locale60 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale42, locale47, locale50, locale53, locale58, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.Locale locale64 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList62);
        java.lang.String[] strArray68 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.lang.String str71 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList69, filteringMode72);
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap75 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap75);
        java.util.Collection<java.util.Locale> localeCollection77 = null;
        java.util.Locale locale78 = java.util.Locale.lookup(languageRangeList76, localeCollection77);
        java.util.Locale.LanguageRange[] languageRangeArray79 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList80 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80, languageRangeArray79);
        org.joda.time.Chronology chronology83 = null;
        java.util.Locale locale84 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology83, locale84, (java.lang.Integer) 100);
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale84 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap91 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, strMap91);
        java.util.Locale locale94 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str95 = locale94.getDisplayScript();
        java.util.Set<java.lang.String> strSet96 = locale94.getUnicodeLocaleAttributes();
        java.lang.String str97 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, (java.util.Collection<java.lang.String>) strSet96);
        java.util.Locale.FilteringMode filteringMode98 = null;
        java.util.List<java.lang.String> strList99 = java.util.Locale.filterTags(languageRangeList76, (java.util.Collection<java.lang.String>) strSet96, filteringMode98);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
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
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zho" + "'", str44, "zho");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(locale64);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(languageRangeList76);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertNotNull(languageRangeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertNotNull(strSet96);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertNotNull(strList99);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale6.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de" + "'", str7, "de");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale.Builder builder18 = builder15.setVariant("Thursday");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder3.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('4', "\u5341\u4e00\u6708");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setLanguageTag("-49674615");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.util.Locale locale1 = new java.util.Locale("982");
        org.junit.Assert.assertEquals(locale1.toString(), "982");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
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
        java.util.Locale locale19 = builder6.build();
        java.util.Locale.Builder builder21 = builder6.setLanguage("FR");
        java.util.Locale.Builder builder22 = builder6.clearExtensions();
        java.util.Locale.Builder builder24 = builder6.removeUnicodeLocaleAttribute("gio");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getShortName(124416086400000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        java.util.Locale locale1 = new java.util.Locale("HALFDAYOFDAY");
        org.junit.Assert.assertEquals(locale1.toString(), "halfdayofday");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("265");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '265' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet13, filteringMode14);
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] { languageRange17 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getISO3Country();
        java.lang.String str26 = locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Language();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale35.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale40.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale24, locale29, locale32, locale35, locale40, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList44, filteringMode47);
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale50 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList49);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertNull(locale50);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        java.lang.String str7 = dateTimeZone1.getName(61084800010L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology12, locale13, (java.lang.Integer) (-1), 0);
        java.lang.String str17 = locale13.getDisplayCountry();
        java.lang.String str18 = dateTimeZone1.getShortName((-22319893L), locale13);
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+02:00" + "'", str7, "+02:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+02:00" + "'", str18, "+02:00");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder8 = builder6.setRegion("168");
        java.util.Locale.Builder builder10 = builder8.setVariant("1969");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.util.Locale locale3 = new java.util.Locale("361920000", "28", "italiano (Italia)");
        java.lang.String str4 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "361920000_28_italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "361920000" + "'", str4, "361920000");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("Thu", (java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("\u30c9\u30a4\u30c4\u8a9e", (java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("eng", (java.lang.Throwable) iOException11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.util.Locale locale3 = new java.util.Locale("10", "jpn", "us");
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = new java.util.Locale("US");
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale.setDefault(category6, locale8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category6);
        java.util.Locale locale12 = java.util.Locale.getDefault(category6);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "");
        java.util.Locale.Builder builder19 = builder14.setLanguageTag("eng");
        java.util.Locale.Builder builder20 = builder14.clearExtensions();
        java.util.Locale.Builder builder21 = builder14.clear();
        java.util.Locale.Builder builder23 = builder14.setLanguage("it");
        java.util.Locale locale24 = builder14.build();
        java.lang.String str25 = locale24.getDisplayName();
        java.util.Locale.setDefault(category6, locale24);
        java.util.Locale locale27 = locale24.stripExtensions();
        java.lang.String str28 = locale3.getDisplayVariant(locale27);
        org.junit.Assert.assertEquals(locale3.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale8.toString(), "us");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "us");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "us");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Italian" + "'", str25, "Italian");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "us" + "'", str28, "us");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
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
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 53);
        dateTimeParserBucket7.setOffset(8831);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket7.getZone();
        java.lang.Object obj27 = dateTimeParserBucket7.saveState();
        org.joda.time.Chronology chronology28 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField29.getType();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(11);
        long long3 = dateTimeZone1.convertUTCToLocal(18514500000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18554100000L + "'", long3 == 18554100000L);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("2", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.lang.String str8 = iOException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: 2" + "'", str8, "java.io.IOException: 2");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.io.IOException iOException1 = new java.io.IOException("hi! (ISOCHRONOLOGY[UTC])");
        java.io.IOException iOException3 = new java.io.IOException("ISOChronology[UTC]");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException3);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder6 = builder1.setLanguage("DE");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder1.setRegion("java.io.IOException: +02:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.IOException: +02:00 [at index 0]");
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
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNull(durationFieldType2);
        org.junit.Assert.assertNull(durationFieldType3);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        long long14 = dateTimeZone1.convertLocalToUTC(259200000L, true);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.Locale locale19 = new java.util.Locale("+00:01:26.399", "UTC");
        boolean boolean20 = dateTimeZone16.equals((java.lang.Object) "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200000L + "'", long14 == 259200000L);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals(locale19.toString(), "+00:01:26.399_UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: Italia");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: Italia' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("January", "ERA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: January [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology2, locale4, (java.lang.Integer) 1, 0);
        dateTimeParserBucket7.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket7.getChronology();
        java.util.Locale locale12 = new java.util.Locale("2");
        java.util.Locale locale15 = new java.util.Locale("java.io.IOException: ita", "java.io.IOException: UTC");
        java.lang.String str16 = locale12.getDisplayScript(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(3600000L, chronology10, locale15, (java.lang.Integer) 59);
        org.joda.time.DurationField durationField19 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.millisOfSecond();
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "2");
        org.junit.Assert.assertEquals(locale15.toString(), "java.io.ioexception: ita_JAVA.IO.IOEXCEPTION: UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.io.IOException iOException2 = new java.io.IOException("utc");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("\u6708\u66dc\u65e5", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("7", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException5.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray10 = iOException5.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("Etats-Unis", (java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long3 = dateTimeZone1.previousTransition(18144000010L);
        long long7 = dateTimeZone1.convertLocalToUTC(70000L, false, 41904000000L);
        long long9 = dateTimeZone1.previousTransition(4200100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18144000010L + "'", long3 == 18144000010L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 69990L + "'", long7 == 69990L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4200100L + "'", long9 == 4200100L);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setExtension('x', "French");
        java.util.Locale.Builder builder16 = builder9.setExtension('u', "Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setRegion("dopo Cristo");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: dopo Cristo [at index 0]");
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
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("italien (Italie)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'u');
        int int3 = dateTimeZone1.getStandardOffset((-145161936000090L));
        int int5 = dateTimeZone1.getStandardOffset((-632231903470L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 421200000 + "'", int3 == 421200000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 421200000 + "'", int5 == 421200000);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket(60480000010L, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        long long7 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 5100);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(obj5);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60480000010L + "'", long7 == 60480000010L);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
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
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        java.lang.String str34 = locale33.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str37 = dateTimeZone36.getID();
        long long39 = dateTimeZone36.previousTransition((long) 'a');
        boolean boolean40 = dateTimeZone36.isFixed();
        int int42 = dateTimeZone36.getOffset((long) (short) 100);
        boolean boolean44 = dateTimeZone36.isStandardOffset((long) 0);
        int int46 = dateTimeZone36.getStandardOffset((long) 8);
        long long49 = dateTimeZone36.convertLocalToUTC(259200000L, true);
        java.util.TimeZone timeZone50 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str54 = dateTimeZone53.getID();
        long long58 = dateTimeZone53.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant59 = null;
        int int60 = dateTimeZone53.getOffset(readableInstant59);
        java.util.Locale locale64 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str65 = dateTimeZone53.getName((long) 'a', locale64);
        java.lang.String str66 = locale64.getDisplayCountry();
        java.lang.String str67 = dateTimeZone36.getName((-262800000L), locale64);
        java.lang.String str68 = locale33.getDisplayCountry(locale64);
        java.lang.String str69 = dateTimeZone9.getName(0L, locale64);
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
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 259200000L + "'", long49 == 259200000L);
        org.junit.Assert.assertNotNull(timeZone50);
// flaky:         org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 53L + "'", long58 == 53L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals(locale64.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00" + "'", str65, "+00:00");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "X-LVARIANT-0" + "'", str66, "X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00" + "'", str69, "+00:00");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("UTC");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "utc" + "'", str2, "utc");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-414749), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        long long14 = dateTimeParserBucket7.computeMillis(false, "ko_KR");
        long long17 = dateTimeParserBucket7.computeMillis(false, "FR_FR");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.io.IOException iOException2 = new java.io.IOException("Franz\366sisch");
        java.io.IOException iOException3 = new java.io.IOException("338855", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
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
        java.util.Locale locale19 = builder6.build();
        java.util.Locale.Builder builder21 = builder6.setLanguage("FR");
        java.util.Locale.Builder builder22 = builder6.clearExtensions();
        java.util.Locale.Builder builder23 = builder6.clearExtensions();
        java.util.Locale locale24 = builder6.build();
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("X-LVARIANT-0");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-lvariant-0" + "'", str3, "x-lvariant-0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-lvariant-0" + "'", str5, "x-lvariant-0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        boolean boolean27 = dateTimeZone11.isStandardOffset(0L);
        int int29 = dateTimeZone11.getOffsetFromLocal(54874799L);
        long long31 = dateTimeZone11.previousTransition(259200077L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "ita");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-62104024800001L) + "'", long14 == (-62104024800001L));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 360660000 + "'", int22 == 360660000);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 21066540000L + "'", long24 == 21066540000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 259200077L + "'", long31 == 259200077L);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinesisch");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(7223);
        dateTimeParserBucket7.setZone(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.String str13 = dateTimeFieldType12.getName();
        java.lang.String str14 = dateTimeFieldType12.getName();
        dateTimeParserBucket7.saveField(dateTimeFieldType12, 8831);
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType12.getDurationType();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "secondOfDay" + "'", str13, "secondOfDay");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "secondOfDay" + "'", str14, "secondOfDay");
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3600000));
        long long4 = dateTimeZone1.convertLocalToUTC((-359999883L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-356399883L) + "'", long4 == (-356399883L));
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("KOR");
        java.util.Locale.Builder builder8 = builder5.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((long) (-434));
        java.lang.String str5 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: +02:00", (java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("italienisch (italien)_ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italienisch (italien)_ita");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.Locale locale8 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean9 = locale8.hasExtensions();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.lang.String str15 = locale8.getDisplayCountry(locale12);
        java.lang.String str16 = dateTimeZone3.getShortName((long) (short) 1, locale12);
        java.lang.String str17 = dateTimeZone3.getID();
        int int19 = dateTimeZone3.getStandardOffset(60480000010L);
        int int21 = dateTimeZone3.getStandardOffset(259200107L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 18748800000L);
        java.util.TimeZone timeZone24 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone3.isLocalDateTimeGap(localDateTime25);
        int int28 = dateTimeZone3.getOffset(18863124L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals(locale8.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 18874800000L + "'", long23 == 18874800000L);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getShortName((long) (short) 100);
        java.lang.String str9 = dateTimeZone1.getName((long) 86399);
        java.lang.String str10 = dateTimeZone1.getID();
        long long13 = dateTimeZone1.convertLocalToUTC(27654780010L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 27654780010L + "'", long13 == 27654780010L);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
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
        java.util.Locale locale23 = builder17.build();
        java.util.Locale locale24 = builder17.build();
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
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ita__#u-35");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ita__#u-35");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("7199");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=7199");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
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
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long22 = dateTimeZone20.convertUTCToLocal((long) (short) -1);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.util.Locale.setDefault(category25, locale26);
        java.util.Locale locale29 = java.util.Locale.getDefault(category25);
        java.util.Locale locale30 = java.util.Locale.getDefault(category25);
        java.lang.String str31 = locale24.getDisplayName(locale30);
        java.lang.String str32 = dateTimeZone20.getShortName((long) 22, locale30);
        java.util.Locale.Builder builder33 = builder18.setLocale(locale30);
        java.lang.String str34 = locale30.getScript();
        java.util.Locale locale35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = locale30.getDisplayName(locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9L + "'", long22 == 9L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.FORMAT + "'", category25.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Germany" + "'", str27, "Germany");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str31, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable6);
        java.io.IOException iOException8 = new java.io.IOException(throwable6);
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException12 = new java.io.IOException("Chinese", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        java.util.TimeZone timeZone61 = dateTimeZone1.toTimeZone();
        long long65 = dateTimeZone1.convertLocalToUTC((long) (-5), false, 21600259200107L);
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 100);
        java.lang.Integer int71 = dateTimeParserBucket70.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket70.setZone(dateTimeZone74);
        boolean boolean76 = dateTimeZone74.isFixed();
        long long78 = dateTimeZone1.getMillisKeepLocal(dateTimeZone74, (-359999893L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Germany" + "'", str19, "Germany");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese (China)" + "'", str24, "Chinese (China)");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese" + "'", str25, "Chinese");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
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
        org.junit.Assert.assertNotNull(timeZone61);
// flaky:         org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-5L) + "'", long65 == (-5L));
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNull(int71);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-719999893L) + "'", long78 == (-719999893L));
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("zh-tw");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-tw [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setExtension('x', "French");
        java.util.Locale.Builder builder16 = builder9.setExtension('u', "Cina");
        java.util.Locale.Builder builder19 = builder9.setExtension('u', "");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.util.Locale locale3 = new java.util.Locale("+32:00", "java.io.IOException: ita", "x-lvariant-84");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "+32:00_JAVA.IO.IOEXCEPTION: ITA_x-lvariant-84");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-84" + "'", str4, "x-lvariant-84");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4969628, (-2089933));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -2089933");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("monthofyear (ERA,java.io.IOException: zho)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        java.util.Locale locale3 = new java.util.Locale("32_18000000", "192", "914");
        org.junit.Assert.assertEquals(locale3.toString(), "32_18000000_192_914");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("1");
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = locale1.getCountry();
        java.util.Locale locale6 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "chinese");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale.Builder builder10 = builder1.removeUnicodeLocaleAttribute("71340010");
        java.util.Locale.Builder builder12 = builder1.setLanguageTag("English");
        java.util.Locale locale13 = builder12.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "english");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("7223");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("YEAR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: YEAR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((long) 'a');
        boolean boolean14 = dateTimeZone10.isFixed();
        int int16 = dateTimeZone10.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone18.getOffset(readableInstant21);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 3599999L);
        long long26 = dateTimeZone18.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone18.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) 8);
        java.util.Locale locale33 = new java.util.Locale("86");
        java.lang.String str34 = locale33.getCountry();
        java.lang.String str35 = dateTimeZone1.getName(156764145052800000L, locale33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = locale33.getUnicodeLocaleType("jpn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: jpn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3599999L + "'", long24 == 3599999L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 8L + "'", long30 == 8L);
        org.junit.Assert.assertEquals(locale33.toString(), "86");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.util.Locale locale3 = new java.util.Locale("dayOfYear", "35", "");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale3.getDisplayName(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.util.Locale locale10 = locale7.stripExtensions();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("12");
        java.lang.String str14 = locale13.getDisplayVariant();
        boolean boolean15 = locale13.hasExtensions();
        java.util.Set<java.lang.Character> charSet16 = locale13.getExtensionKeys();
        java.lang.String str17 = locale7.getDisplayName(locale13);
        org.junit.Assert.assertEquals(locale3.toString(), "dayofyear_35");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayofyear (35)" + "'", str8, "dayofyear (35)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        java.util.Locale locale2 = new java.util.Locale("v. Chr.", "");
        org.junit.Assert.assertEquals(locale2.toString(), "v. chr.");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long8 = dateTimeZone5.adjustOffset(1L, false);
        int int10 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone5.adjustOffset((-3599903L), false);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-356399998L));
        long long20 = dateTimeZone5.adjustOffset(254099948L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360000000 + "'", int10 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599903L) + "'", long15 == (-3599903L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-712799998L) + "'", long17 == (-712799998L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 254099948L + "'", long20 == 254099948L);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3));
        long long3 = dateTimeZone1.convertUTCToLocal((-61378214400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-61378225200000L) + "'", long3 == (-61378225200000L));
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str16 = locale14.getUnicodeLocaleType("35");
        java.lang.String str17 = dateTimeZone10.getName(64713600009L, locale14);
        dateTimeParserBucket7.setZone(dateTimeZone10);
        long long20 = dateTimeParserBucket7.computeMillis(false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japanese");
        java.util.Locale locale12 = builder9.build();
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale12.getUnicodeLocaleType("de-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: de-DE");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str14, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.setExtension('a', "");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("eng");
        java.util.Locale.Builder builder14 = builder8.clearExtensions();
        java.util.Locale.Builder builder15 = builder8.clear();
        java.util.Locale.Builder builder17 = builder8.setLanguage("it");
        java.util.Locale locale18 = builder8.build();
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale21 = locale18.stripExtensions();
        java.util.Set<java.lang.Character> charSet22 = locale18.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "us");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str19, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNotNull(charSet22);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.lang.String> strCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = java.util.Locale.filterTags(languageRangeList0, strCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((-3755047523820000L));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable throwable14 = null;
        java.io.IOException iOException15 = new java.io.IOException("UTC", throwable14);
        java.io.IOException iOException16 = new java.io.IOException(throwable14);
        iOException11.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        iOException8.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException24 = new java.io.IOException("");
        java.io.IOException iOException25 = new java.io.IOException("USA", (java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException("-1", (java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException("X-LVARIANT-0", (java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        java.io.IOException iOException30 = new java.io.IOException("+100:11");
        iOException27.addSuppressed((java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException30);
        iOException18.addSuppressed((java.lang.Throwable) iOException32);
        java.lang.Throwable throwable36 = null;
        java.io.IOException iOException37 = new java.io.IOException("UTC", throwable36);
        java.io.IOException iOException38 = new java.io.IOException(throwable36);
        java.io.IOException iOException39 = new java.io.IOException("7", (java.lang.Throwable) iOException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) iOException38);
        java.lang.Throwable[] throwableArray41 = iOException38.getSuppressed();
        java.lang.Throwable[] throwableArray42 = iOException38.getSuppressed();
        iOException32.addSuppressed((java.lang.Throwable) iOException38);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("2", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException("jpn");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException("35", (java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("7565985");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '7565985' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Thu");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Germany");
        double double5 = languageRange4.getWeight();
        double double6 = languageRange4.getWeight();
        double double7 = languageRange4.getWeight();
        java.lang.String str8 = languageRange4.getRange();
        double double9 = languageRange4.getWeight();
        java.lang.String str10 = languageRange4.getRange();
        boolean boolean11 = languageRange1.equals((java.lang.Object) languageRange4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "germany" + "'", str10, "germany");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        java.io.IOException iOException1 = new java.io.IOException("23");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("tedesco", (double) 21517200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.15172E10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6926399, 33199);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 33199");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 11);
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getOffset((long) (short) 100);
        long long7 = dateTimeZone2.nextTransition((-360660010L));
        long long9 = dateTimeZone2.convertUTCToLocal(7223L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360660000 + "'", int5 == 360660000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-360660010L) + "'", long7 == (-360660010L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 360667223L + "'", long9 == 360667223L);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(44);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.util.Locale locale2 = new java.util.Locale("18720000", "71");
        org.junit.Assert.assertEquals(locale2.toString(), "18720000_71");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setLanguageTag("40");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 40 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        java.lang.String str10 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "germany" + "'", str7, "germany");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "germany" + "'", str9, "germany");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "germany" + "'", str10, "germany");
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.util.Locale locale3 = new java.util.Locale("982", "java.io.IOException: jpn", "-292275054");
        org.junit.Assert.assertEquals(locale3.toString(), "982_JAVA.IO.IOEXCEPTION: JPN_-292275054");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        java.util.Locale locale2 = new java.util.Locale("317", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("ko-kr_32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ko-kr_32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "317");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException("DateTimeField[weekOfWeekyear]");
        java.io.IOException iOException9 = new java.io.IOException("UTC");
        java.io.IOException iOException11 = new java.io.IOException("zho");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException9.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException9);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("\u65e5\u6587", (java.lang.Throwable) iOException14);
        iOException5.addSuppressed((java.lang.Throwable) iOException14);
        iOException1.addSuppressed((java.lang.Throwable) iOException14);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("7223");
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.setScript("cina");
        java.util.Locale.Builder builder15 = builder12.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: java.io.IOException: utc", "52072");
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: java.io.ioexception: utc_52072");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
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
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.monthOfYear();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology12.validate(readablePartial16, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        java.io.IOException iOException1 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-69363));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
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
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("1497", "86399997");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 1497 [at index 0]");
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
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u30a4\u30bf\u30ea\u30a2\u8a9e)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=x-lvariant-0(utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DATETIMEFIELD[DAYOFMONTH] (Januar)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("86399899", (double) 258863291L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.58863291E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
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
            java.lang.String str14 = locale5.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
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
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
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
        java.lang.String str33 = locale24.getCountry();
        java.util.Locale.setDefault(locale24);
        org.junit.Assert.assertEquals(locale3.toString(), "ko-kr_32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals(locale17.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko-kr" + "'", str32, "ko-kr");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
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
        java.util.Locale.setDefault(locale19);
        java.util.Set<java.lang.Character> charSet28 = locale19.getExtensionKeys();
        java.util.Set<java.lang.String> strSet29 = locale19.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet30 = locale19.getExtensionKeys();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(charSet30);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("year");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "year");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "year" + "'", str4, "year");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException("UTC", throwable8);
        java.io.IOException iOException10 = new java.io.IOException(throwable8);
        iOException5.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("UTC", (java.lang.Throwable) iOException10);
        iOException2.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray14 = iOException2.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("24", (java.lang.Throwable) iOException2);
        java.io.IOException iOException17 = new java.io.IOException("ita");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        iOException2.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray20 = iOException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("HALFDAYOFDAY", (double) 70000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=70000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "100");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale9.getDisplayName(locale17);
        java.lang.String str20 = locale9.getCountry();
        java.lang.Class<?> wildcardClass21 = locale9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("Chine");
        java.util.Locale.Builder builder7 = builder1.setVariant("Chine");
        java.util.Locale.Builder builder9 = builder1.addUnicodeLocaleAttribute("5131");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        boolean boolean6 = locale3.hasExtensions();
        java.lang.String str7 = locale3.getISO3Language();
        java.lang.String str8 = locale3.getDisplayName();
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale3.getDisplayScript(locale9);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinesisch (China)" + "'", str8, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone8.toTimeZone();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone8.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone8.getOffset(15L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(7);
        int int3 = dateTimeZone1.getOffset(28112398503L);
        java.lang.String str5 = dateTimeZone1.getNameKey(0L);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25200000 + "'", int3 == 25200000);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = locale3.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        boolean boolean2 = locale1.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("65721");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 65721");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("hi!_ISOCHRONOLOGY[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi!_ISOCHRONOLOGY[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        java.io.IOException iOException1 = new java.io.IOException("utc");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("jpn");
        java.io.IOException iOException8 = new java.io.IOException("UTC");
        java.io.IOException iOException10 = new java.io.IOException("zho");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("2", (java.lang.Throwable) iOException8);
        iOException5.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("jpn");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("35", (java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        iOException12.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException24 = new java.io.IOException("UTC");
        java.io.IOException iOException26 = new java.io.IOException("zho");
        iOException24.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException("2", (java.lang.Throwable) iOException24);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException28);
        java.io.IOException iOException31 = new java.io.IOException("+01:00");
        iOException28.addSuppressed((java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException28);
        iOException21.addSuppressed((java.lang.Throwable) iOException33);
        iOException1.addSuppressed((java.lang.Throwable) iOException21);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.addUnicodeLocaleAttribute("\u5fb7\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: java.io.IOException: ?? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str1 = dateTimeFieldType0.getName();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getDurationType();
        java.lang.String str4 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "secondOfMinute" + "'", str1, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "secondOfMinute" + "'", str2, "secondOfMinute");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondOfMinute" + "'", str4, "secondOfMinute");
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
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
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        long long18 = dateTimeZone1.nextTransition((-33000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-33000000L) + "'", long18 == (-33000000L));
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException("utc");
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("\u5341\u4e8c\u6708");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Allemagne", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=allemagne");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("31_FRANZ\366\u30a4\u30bf\u30ea\u30a2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=31_franzo?sisch(frankreich)_????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder13 = builder3.setUnicodeLocaleKeyword("AM", "CHINESE");
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getNameKey((long) '4');
        long long15 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str17 = dateTimeZone1.getNameKey((-60305212799980L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        java.io.IOException iOException4 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException4);
        java.io.IOException iOException10 = new java.io.IOException("dayofyear");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("Italy");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("+32:00", (java.lang.Throwable) iOException8);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: +32:00" + "'", str18, "java.io.IOException: +32:00");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder13 = builder3.setExtension('x', "Thu");
        java.util.Locale locale14 = builder3.build();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.lang.String str18 = locale14.getDisplayScript(locale17);
        java.lang.String str19 = locale14.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = dateTimeZone1.getShortName(10L, locale9);
        java.lang.String str13 = locale9.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
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
        java.util.Locale locale37 = locale35.stripExtensions();
        java.lang.String str38 = locale37.getDisplayLanguage();
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
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "utc" + "'", str38, "utc");
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale locale9 = builder1.build();
        java.util.Locale.Builder builder11 = builder1.addUnicodeLocaleAttribute("4969628");
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("11675");
        java.util.Locale.Builder builder15 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setUnicodeLocaleKeyword("Mon", "francese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Mon [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        java.io.IOException iOException1 = new java.io.IOException("Stati Uniti");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        java.util.Locale locale2 = new java.util.Locale("Italia", "19");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale8.getISO3Language();
        java.lang.String str11 = locale6.getDisplayScript(locale8);
        java.lang.String str12 = locale8.getVariant();
        java.lang.String str13 = locale2.getDisplayCountry(locale8);
        java.lang.String str14 = locale8.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "italia_19");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str9, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19" + "'", str13, "19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
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
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = dateTimeZone18.getName(156764147421600000L, locale20);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ITA" + "'", str21, "ITA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        java.io.IOException iOException1 = new java.io.IOException("ita");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("italienisch (italien)_ITA");
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        java.util.Locale locale2 = new java.util.Locale("-101:00", "und");
        org.junit.Assert.assertEquals(locale2.toString(), "-101:00_UND");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        java.io.IOException iOException4 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("italia", (java.lang.Throwable) iOException4);
        java.lang.String str10 = iOException9.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: italia" + "'", str10, "java.io.IOException: italia");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.io.IOException iOException1 = new java.io.IOException("italia");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.String str2 = dateTimeZone1.getID();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.032' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        java.util.Locale locale2 = new java.util.Locale("212400000", "5131");
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "212400000_5131");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        java.util.Locale locale1 = new java.util.Locale("SECONDOFMINUTE");
        java.lang.String str2 = locale1.toLanguageTag();
        boolean boolean4 = locale1.equals((java.lang.Object) 31449599995L);
        org.junit.Assert.assertEquals(locale1.toString(), "secondofminute");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(9, (-8807));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -8807");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        java.util.Locale locale2 = new java.util.Locale("", "halfdayOfDay");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "_HALFDAYOFDAY");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
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
        java.util.Locale.Builder builder29 = builder27.removeUnicodeLocaleAttribute("4969628");
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
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        java.io.IOException iOException1 = new java.io.IOException("\u30a4\u30bf\u30ea\u30a2");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.addUnicodeLocaleAttribute("-4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: weekyear", "Allemagne");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: weekyear_ALLEMAGNE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ALLEMAGNE" + "'", str3, "ALLEMAGNE");
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        java.util.Locale locale1 = new java.util.Locale("BC");
        org.junit.Assert.assertEquals(locale1.toString(), "bc");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.util.Locale locale4 = new java.util.Locale("hi!", "ISOChronology[UTC]");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(100L, chronology6, locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.String str22 = locale15.getDisplayScript(locale19);
        java.lang.String str23 = locale15.getISO3Language();
        dateTimeParserBucket12.saveField(dateTimeFieldType13, "DateTimeField[dayOfYear]", locale15);
        java.lang.String str25 = locale4.getDisplayName(locale15);
        java.lang.String str26 = locale4.getDisplayScript();
        java.lang.String str27 = locale1.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet28 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale32 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean33 = locale32.hasExtensions();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 100);
        java.lang.String str39 = locale32.getDisplayCountry(locale36);
        java.util.Locale locale40 = locale36.stripExtensions();
        java.lang.String str41 = locale40.getVariant();
        java.util.Locale locale42 = locale40.stripExtensions();
        java.util.Locale.setDefault(locale42);
        java.lang.String str44 = locale1.getDisplayCountry(locale42);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "_HALFDAYOFDAY");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "_HALFDAYOFDAY");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! (ISOCHRONOLOGY[UTC])" + "'", str25, "hi! (ISOCHRONOLOGY[UTC])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals(locale32.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "_HALFDAYOFDAY");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "_HALFDAYOFDAY");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "_HALFDAYOFDAY");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long5 = dateTimeZone2.adjustOffset(1L, false);
        int int7 = dateTimeZone2.getStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        long long12 = dateTimeZone2.adjustOffset((-3599903L), false);
        java.lang.String str14 = dateTimeZone2.getNameKey(67161149665L);
        int int16 = dateTimeZone2.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599903L) + "'", long12 == (-3599903L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 360000000 + "'", int16 == 360000000);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        boolean boolean10 = locale7.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleKeys();
        java.lang.String str12 = locale7.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ita" + "'", str12, "ita");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("7200000");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("US");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us" + "'", str3, "us");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder20.setVariant("37");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 37 [at index 0]");
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
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        long long7 = dateTimeZone0.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((long) 'a');
        boolean boolean13 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.convertLocalToUTC(0L, false, (long) (short) 100);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5207);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.getID();
        long long24 = dateTimeZone21.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.lang.String str26 = dateTimeZone21.getID();
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, 93623040172800008L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone0.getOffset(readableInstant29);
        java.lang.String str32 = dateTimeZone0.getName((long) (-6011));
        int int34 = dateTimeZone0.getStandardOffset((long) 187800000);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone0.getShortName(28857600110L, locale36);
        int int39 = dateTimeZone0.getOffsetFromLocal((-258389L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18748800052L + "'", long7 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5207L + "'", long19 == 5207L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 93623040172800008L + "'", long28 == 93623040172800008L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(29569);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        java.io.IOException iOException1 = new java.io.IOException("292278993");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("37");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '37' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        int int11 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        java.lang.String str14 = locale12.getExtension('x');
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        java.util.Locale locale2 = new java.util.Locale("+10:00", "-6011");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "+10:00_-6011");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        java.util.Locale locale2 = new java.util.Locale("Thu", "Italia");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "thu_ITALIA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIA" + "'", str3, "ITALIA");
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = locale10.getDisplayVariant();
        java.lang.String str16 = locale10.getDisplayScript();
        java.util.Set<java.lang.String> strSet17 = locale10.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale10);
        java.lang.String str19 = locale10.getDisplayName();
        java.util.Locale locale20 = locale10.stripExtensions();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "germany" + "'", str6, "germany");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u56fd" + "'", str6, "\u5fb7\u56fd");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Inglese");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder8.setVariant("6926399");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.removeUnicodeLocaleAttribute("-30");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -30 [at index 0]");
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
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
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
        java.lang.String str12 = locale10.getDisplayName();
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
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str12, "\u82f1\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.012");
        java.lang.String str2 = dateTimeZone1.getID();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("millisOfSecond");
        java.lang.String str6 = locale5.getDisplayVariant();
        java.util.Locale locale9 = new java.util.Locale("java.io.IOException: 35", "");
        java.lang.String str10 = locale5.getDisplayCountry(locale9);
        java.lang.String str11 = dateTimeZone1.getName((-134993458051200000L), locale9);
        java.lang.String str13 = dateTimeZone1.getNameKey(7852032000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.012" + "'", str2, "+00:00:00.012");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale9.toString(), "java.io.ioexception: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.012" + "'", str11, "+00:00:00.012");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
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
        java.util.Locale.Builder builder36 = builder22.clearExtensions();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.Builder builder41 = builder37.setExtension('x', "2008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder37.setVariant("\u4e2d\u56fd\u8a9e (FRANZ\366SISCH (FRANKREICH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??? (FRANZo?SISCH (FRANKREICH)) [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
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
            java.util.Locale.Builder builder17 = builder9.addUnicodeLocaleAttribute("yearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: yearOfCentury [at index 0]");
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
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale3.getISO3Language();
        java.lang.String str10 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Thursday", (double) 575144865532800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.751448655328E17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = null; // flaky: locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = null; // flaky: locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
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
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = null; // flaky: locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
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
        java.util.Locale.LanguageRange languageRange61 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] { languageRange61 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = null; // flaky: locale68.getISO3Country();
        java.lang.String str70 = locale68.getISO3Language();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale68.getDisplayVariant(locale71);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology75 = null;
        java.util.Locale locale76 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology75, locale76, (java.lang.Integer) 100);
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.lang.String str80 = null; // flaky: locale79.getISO3Country();
        java.lang.String str81 = locale79.getISO3Language();
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale79.getDisplayVariant(locale82);
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.lang.String str85 = null; // flaky: locale84.getISO3Country();
        java.util.Locale locale86 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale68, locale73, locale76, locale79, locale84, locale86 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.util.Locale>) localeList88, filteringMode91);
        java.util.Locale locale93 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList92);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass94 = locale93.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CHN" + "'", str15, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CHN" + "'", str20, "CHN");
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
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHN" + "'", str37, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zho" + "'", str38, "zho");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CHN" + "'", str48, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "CHN" + "'", str53, "CHN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "CHN" + "'", str69, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "zho" + "'", str70, "zho");
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
// flaky:         org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "CHN" + "'", str80, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zho" + "'", str81, "zho");
        org.junit.Assert.assertNotNull(locale82);
// flaky:         org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "CHN" + "'", str85, "CHN");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode91.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNull(locale93);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Oct");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("79206");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 79206 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: zho", "40");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: zho_40");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cn");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = null; // flaky: locale25.getISO3Country();
        java.lang.String str27 = locale25.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale25.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = null; // flaky: locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = null; // flaky: locale41.getISO3Country();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale25, locale30, locale33, locale36, locale41, locale43 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.Locale locale47 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList45);
        java.lang.String[] strArray51 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = null; // flaky: locale58.getISO3Country();
        java.lang.String str60 = locale58.getISO3Language();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale58.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 100);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = null; // flaky: locale69.getISO3Country();
        java.lang.String str71 = locale69.getISO3Language();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale69.getDisplayVariant(locale72);
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = null; // flaky: locale74.getISO3Country();
        java.util.Locale locale76 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale58, locale63, locale66, locale69, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale locale84 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList78);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CHN" + "'", str26, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHN" + "'", str37, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zho" + "'", str38, "zho");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CHN" + "'", str42, "CHN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(locale47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CHN" + "'", str59, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "zho" + "'", str60, "zho");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "CHN" + "'", str70, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zho" + "'", str71, "zho");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "CHN" + "'", str75, "CHN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNull(locale84);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        java.io.IOException iOException1 = new java.io.IOException("fr");
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) ' ', locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        java.lang.String str14 = dateTimeZone1.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+02:00" + "'", str9, "+02:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7200000L) + "'", long12 == (-7200000L));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setRegion("+00:05:45.599");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +00:05:45.599 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setVariant("363");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 363 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("weekOfWeekyear");
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.lang.String str8 = locale5.getDisplayName();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(9L, chronology10, locale11, (java.lang.Integer) 0);
        boolean boolean14 = locale11.hasExtensions();
        java.lang.String str15 = locale11.getDisplayLanguage();
        java.lang.String str16 = locale5.getDisplayCountry(locale11);
        java.lang.String str17 = locale11.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "weekofweekyear");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "weekofweekyear" + "'", str8, "weekofweekyear");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u65e5\u6587" + "'", str15, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ko");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("CHN");
        java.io.IOException iOException12 = new java.io.IOException("UTC");
        java.io.IOException iOException14 = new java.io.IOException("zho");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("2", (java.lang.Throwable) iOException12);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException12);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable throwable22 = null;
        java.io.IOException iOException23 = new java.io.IOException("UTC", throwable22);
        java.io.IOException iOException24 = new java.io.IOException(throwable22);
        java.io.IOException iOException25 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException24);
        java.lang.Throwable[] throwableArray26 = iOException25.getSuppressed();
        iOException3.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray28 = iOException25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
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
        java.lang.String str17 = dateTimeZone1.getName((long) 12);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str20 = dateTimeZone19.getID();
        long long22 = dateTimeZone19.previousTransition((long) 'a');
        boolean boolean23 = dateTimeZone19.isFixed();
        int int25 = dateTimeZone19.getOffset((long) (short) 100);
        boolean boolean27 = dateTimeZone19.isStandardOffset((long) 0);
        int int29 = dateTimeZone19.getStandardOffset((long) 8);
        long long32 = dateTimeZone19.convertLocalToUTC(259200000L, true);
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 28166398503L);
        java.lang.String str35 = dateTimeZone1.getID();
        int int37 = dateTimeZone1.getOffset(64713600010L);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone1.getOffset(readableInstant38);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone1.isLocalDateTimeGap(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 259200000L + "'", long32 == 259200000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 28166398503L + "'", long34 == 28166398503L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("zho");
        java.util.Locale locale9 = builder3.build();
        java.lang.String str10 = locale9.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        java.io.IOException iOException1 = new java.io.IOException("+01:00");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException7 = new java.io.IOException("und");
        java.io.IOException iOException8 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        iOException1.addSuppressed((java.lang.Throwable) iOException9);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
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
        java.lang.String str16 = iOException15.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str16, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
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
        java.util.Locale.Builder builder39 = builder38.clear();
        java.util.Locale locale40 = builder39.build();
        java.util.Locale.Builder builder41 = builder39.clearExtensions();
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
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        double double8 = languageRange1.getWeight();
        double double9 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(5);
        java.lang.String str3 = dateTimeZone1.getShortName((-320399990L));
        long long5 = dateTimeZone1.previousTransition(915148800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+05:00" + "'", str3, "+05:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 915148800000L + "'", long5 == 915148800000L);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) (-434));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getOffset((-1567641608121600000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone7.getID();
        int int10 = dateTimeZone7.getOffsetFromLocal(60480000010L);
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 1187L);
        long long15 = dateTimeZone7.convertLocalToUTC(244140053L, false);
        long long18 = dateTimeZone7.adjustOffset(262800010L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-434L) + "'", long3 == (-434L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1188L + "'", long12 == 1188L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 244140053L + "'", long15 == 244140053L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 262800010L + "'", long18 == 262800010L);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("DateTimeField[era]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[era]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        java.util.Locale locale3 = new java.util.Locale("8831", "DateTimeField[weekyearOfCentury]", "5207");
        java.lang.String str5 = locale3.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for DATETIMEFIELD[WEEKYEAROFCENTURY]");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "8831_DATETIMEFIELD[WEEKYEAROFCENTURY]_5207");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        long long7 = dateTimeZone0.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((long) 'a');
        boolean boolean13 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.convertLocalToUTC(0L, false, (long) (short) 100);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5207);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.getID();
        long long24 = dateTimeZone21.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.lang.String str26 = dateTimeZone21.getID();
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, 93623040172800008L);
        int int30 = dateTimeZone21.getOffset(3974400000L);
        int int32 = dateTimeZone21.getStandardOffset((-60273763200001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18748800052L + "'", long7 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5207L + "'", long19 == 5207L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 93623040172800008L + "'", long28 == 93623040172800008L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        java.util.Locale locale1 = new java.util.Locale("\u30c9\u30a4\u30c4");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.lang.String str5 = locale4.getScript();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale4);
        java.lang.String str8 = locale1.getDisplayScript(locale4);
        java.util.Set<java.lang.Character> charSet9 = locale4.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30c9\u30a4\u30c4" + "'", str2, "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        java.io.IOException iOException2 = new java.io.IOException("weekyear");
        java.io.IOException iOException4 = new java.io.IOException("CHN");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("Chinese (Taiwan)", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray7 = iOException2.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException("S\374dkorea");
        iOException2.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.lang.String str13 = iOException9.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: S\374dkorea" + "'", str13, "java.io.IOException: S\374dkorea");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.Locale locale13 = new java.util.Locale("clockhourOfDay", "+00:00:00.001");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertEquals(locale13.toString(), "clockhourofday_+00:00:00.001");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("7223");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("ja");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("Italy");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("java.io.IOException: utc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.IOException: utc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        java.io.IOException iOException2 = new java.io.IOException("jpn");
        java.io.IOException iOException5 = new java.io.IOException("UTC");
        java.io.IOException iOException7 = new java.io.IOException("zho");
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("2", (java.lang.Throwable) iOException5);
        iOException2.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("UTC");
        java.io.IOException iOException16 = new java.io.IOException("zho");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException19 = new java.io.IOException("Thu", (java.lang.Throwable) iOException18);
        iOException11.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException22 = new java.io.IOException("39600000", (java.lang.Throwable) iOException21);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        java.io.IOException iOException2 = new java.io.IOException("dayofyear");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("DateTimeField[dayOfYear]", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: ITA");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.clearExtensions();
        java.util.Locale.Builder builder14 = builder10.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3779));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("utc");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "utc");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        java.lang.Object obj11 = dateTimeParserBucket9.saveState();
        java.lang.Integer int12 = dateTimeParserBucket9.getPivotYear();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket9.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        java.io.IOException iOException3 = new java.io.IOException("weekyear");
        java.io.IOException iOException5 = new java.io.IOException("CHN");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("Chinese (Taiwan)", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray8 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException3.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException("168", (java.lang.Throwable) iOException3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
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
        java.lang.String str19 = dateTimeZone1.getName(3599999L);
        java.lang.String str21 = dateTimeZone1.getNameKey((long) (short) 1);
        java.lang.String str23 = dateTimeZone1.getShortName((-5225828147845200010L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("Japanese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setScript("+01:00_X-LVARIANT-0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +01:00_X-LVARIANT-0 [at index 0]");
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
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        java.io.IOException iOException1 = new java.io.IOException("Italia");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("UTC");
        java.io.IOException iOException7 = new java.io.IOException("zho");
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("2", (java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException("UTC");
        java.io.IOException iOException14 = new java.io.IOException("zho");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("UTC");
        iOException14.addSuppressed((java.lang.Throwable) iOException17);
        iOException9.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException22 = new java.io.IOException("UTC");
        java.io.IOException iOException24 = new java.io.IOException("zho");
        iOException22.addSuppressed((java.lang.Throwable) iOException24);
        java.lang.Throwable throwable29 = null;
        java.io.IOException iOException30 = new java.io.IOException("UTC", throwable29);
        java.io.IOException iOException31 = new java.io.IOException(throwable29);
        java.io.IOException iOException32 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = iOException32.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException("cinese", (java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException32);
        iOException24.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException37 = new java.io.IOException("\uc11c\uae30", (java.lang.Throwable) iOException35);
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        iOException17.addSuppressed((java.lang.Throwable) iOException37);
        iOException1.addSuppressed((java.lang.Throwable) iOException17);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Franz\366sisch (Frankreich)");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.lang.String str6 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str2 = locale0.getUnicodeLocaleType("35");
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean7 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.adjustOffset(6048000035L, false);
        long long12 = dateTimeZone1.nextTransition(259200058L);
        int int14 = dateTimeZone1.getOffsetFromLocal(0L);
        long long16 = dateTimeZone1.convertUTCToLocal(604801053L);
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 6048000035L + "'", long10 == 6048000035L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 259200058L + "'", long12 == 259200058L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 604801053L + "'", long16 == 604801053L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale18 = new java.util.Locale("eng");
        java.lang.String str19 = locale18.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.util.Locale.setDefault(category21, locale22);
        java.util.Locale locale25 = java.util.Locale.getDefault(category21);
        java.util.Locale locale26 = java.util.Locale.getDefault(category21);
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale29 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u5fb7\u56fd" + "'", str23, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str27, "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        boolean boolean10 = locale7.hasExtensions();
        java.lang.String str11 = locale7.getDisplayScript();
        java.util.Locale.setDefault(locale7);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("+100:32");
        java.lang.String str15 = locale7.getDisplayLanguage(locale14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("+00:00:00.031");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it-IT" + "'", str18, "it-IT");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        java.util.Locale locale3 = new java.util.Locale("x-lvariant-en", "java.io.IOException: java.io.IOException: jpn", "-10368000");
        org.junit.Assert.assertEquals(locale3.toString(), "x-lvariant-en_JAVA.IO.IOEXCEPTION: JAVA.IO.IOEXCEPTION: JPN_-10368000");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("30");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale2);
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayLanguage(locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        java.io.IOException iOException1 = new java.io.IOException("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "germany" + "'", str6, "germany");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "germany" + "'", str7, "germany");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable6);
        java.io.IOException iOException8 = new java.io.IOException(throwable6);
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("UTC", (java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException();
        java.io.IOException iOException13 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException12);
        iOException8.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("Italienisch", (java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray16 = iOException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(86399);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) (-62074702));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FR");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.io.IOException iOException1 = new java.io.IOException("120 (DECEMBER)");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
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
        double double13 = languageRange1.getWeight();
        java.lang.String str14 = languageRange1.getRange();
        java.lang.String str15 = languageRange1.getRange();
        double double16 = languageRange1.getWeight();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "germany" + "'", str14, "germany");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "germany" + "'", str15, "germany");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale8.getISO3Language();
        java.lang.String str11 = locale6.getDisplayScript(locale8);
        java.lang.String str12 = locale6.getDisplayName();
        java.lang.String str13 = locale6.getVariant();
        java.lang.String str14 = locale6.getLanguage();
        java.util.Locale.Builder builder15 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder17 = builder15.addUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder19 = builder17.removeUnicodeLocaleAttribute("UTC");
        java.util.Locale.Builder builder20 = builder17.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str9, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
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
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (-2678388));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -2678388");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: java.io.IOException: 35", "\u4e00\u6708", "DateTimeField[dayOfMonth]");
        java.util.Locale locale5 = new java.util.Locale("2");
        java.util.Locale locale8 = new java.util.Locale("java.io.IOException: ita", "java.io.IOException: UTC");
        java.lang.String str9 = locale5.getDisplayScript(locale8);
        java.lang.String str10 = locale3.getDisplayCountry(locale5);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e00\u6708_DateTimeField[dayOfMonth]");
        org.junit.Assert.assertEquals(locale5.toString(), "2");
        org.junit.Assert.assertEquals(locale8.toString(), "java.io.ioexception: ita_JAVA.IO.IOEXCEPTION: UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e00\u6708" + "'", str10, "\u4e00\u6708");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale4.getUnicodeLocaleType("hi! (ISOCHRONOLOGY[UTC])");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi! (ISOCHRONOLOGY[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR", (double) 223959686400032L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.23959686400032E14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        java.io.IOException iOException1 = new java.io.IOException("\u610f\u5927\u5229");
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.lang.String str5 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean7 = dateTimeZone1.isStandardOffset(0L);
        long long10 = dateTimeZone1.convertLocalToUTC(259200149L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 259200149L + "'", long10 == 259200149L);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("java.io.IOException: -292275054", "-01:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: -292275054 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ita");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("52073340", "58");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 52073340 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("3");
        java.lang.String str2 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        java.util.Locale locale3 = new java.util.Locale("italy", "\u30c9\u30a4\u30c4\u8a9e", "31_FRANZ\366\u30a4\u30bf\u30ea\u30a2");
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str6 = locale4.getISO3Language();
        java.lang.String str7 = locale4.getVariant();
        java.util.Locale locale8 = locale4.stripExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder14 = builder12.clear();
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale locale17 = new java.util.Locale("Italian");
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale.Builder builder19 = builder14.setLocale(locale17);
        java.lang.String str20 = locale4.getDisplayVariant(locale17);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale24, (java.lang.Integer) (-101), (int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        java.util.Locale locale35 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.lang.String str38 = locale35.getDisplayVariant(locale37);
        dateTimeParserBucket28.saveField(dateTimeFieldType29, "hi!", locale37);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("Franz\366sisch (Frankreich)");
        java.lang.String str42 = locale41.toLanguageTag();
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleKeys();
        java.lang.String str44 = locale37.getDisplayLanguage(locale41);
        java.lang.String str45 = locale41.getCountry();
        java.lang.String str46 = locale17.getDisplayScript(locale41);
        java.lang.String str47 = locale3.getDisplayLanguage(locale17);
        java.lang.String str48 = locale3.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30c9\u30a4\u30c4\u8a9e_31_FRANZ\366\u30a4\u30bf\u30ea\u30a2");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str5, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ita" + "'", str6, "ita");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals(locale17.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italian" + "'", str18, "italian");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u56fd" + "'", str25, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertEquals(locale35.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "und" + "'", str42, "und");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chinese" + "'", str44, "Chinese");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "italy" + "'", str47, "italy");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str48, "\u30c9\u30a4\u30c4\u8a9e");
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale locale9 = builder1.build();
        java.util.Locale.Builder builder11 = builder1.addUnicodeLocaleAttribute("4969628");
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("11675");
        java.util.Locale.Builder builder16 = builder14.setLanguage("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
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
        java.util.Locale.Builder builder19 = builder17.setLanguage("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder17.setExtension('a', "2_CHINESE_clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 2 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("DateTimeField[weekOfWeekyear]");
        java.util.Locale.setDefault(locale10);
        boolean boolean12 = locale10.hasExtensions();
        java.lang.String str13 = locale10.getScript();
        java.util.Locale.Builder builder14 = builder1.setLocale(locale10);
        java.util.Locale.Builder builder15 = builder14.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('#', "fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder16 = builder13.setExtension('x', "11");
        java.util.Locale.Builder builder18 = builder13.removeUnicodeLocaleAttribute("86203");
        java.util.Locale.Builder builder20 = builder13.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder20.setUnicodeLocaleKeyword("\u661f\u671f\u516d", "Franz\366sisch (Frankreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(64713600009L);
        int int6 = dateTimeZone1.getStandardOffset(6652801000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(100L, chronology9, locale12);
        java.lang.String str16 = locale12.getScript();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.lang.String str18 = locale12.getDisplayCountry();
        java.lang.String str19 = dateTimeZone1.getName(259286399L, locale12);
        java.lang.String str20 = locale12.getDisplayLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 64713600009L + "'", long4 == 64713600009L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
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
        java.util.Set<java.lang.String> strSet31 = locale28.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        java.io.IOException iOException1 = new java.io.IOException("Chinese (Taiwan)");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        java.util.Locale locale2 = new java.util.Locale("946", "DE");
        org.junit.Assert.assertEquals(locale2.toString(), "946_DE");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(19, 14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
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
        java.lang.String str39 = locale38.getDisplayCountry();
        java.lang.String str40 = locale38.getScript();
        java.util.Locale locale41 = locale38.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("japonais");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ITALIANO");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italiano");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = locale4.getDisplayName(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale14.getDisplayScript();
        java.lang.String str19 = locale14.getISO3Country();
        java.lang.String str20 = locale4.getDisplayScript(locale14);
        java.util.Locale.Builder builder21 = builder0.setLocale(locale14);
        java.lang.String str22 = locale14.toLanguageTag();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "und" + "'", str22, "und");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException9 = new java.io.IOException("UTC");
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
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
        java.util.Locale.Builder builder16 = builder14.setVariant("italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setScript("java.io.IOException: Oct");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: Oct [at index 0]");
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
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        java.io.IOException iOException1 = new java.io.IOException("inglese");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        java.io.IOException iOException1 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable6);
        java.io.IOException iOException8 = new java.io.IOException(throwable6);
        java.io.IOException iOException9 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException1.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException15 = new java.io.IOException("");
        java.lang.Throwable throwable19 = null;
        java.io.IOException iOException20 = new java.io.IOException("UTC", throwable19);
        java.io.IOException iOException21 = new java.io.IOException(throwable19);
        java.io.IOException iOException22 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException21);
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException("cinese", (java.lang.Throwable) iOException22);
        iOException15.addSuppressed((java.lang.Throwable) iOException22);
        iOException1.addSuppressed((java.lang.Throwable) iOException15);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("de");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder14 = builder10.setLanguage("tedesco");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setUnicodeLocaleKeyword("Allemagne", "FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Allemagne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        java.util.Locale locale2 = new java.util.Locale("kor", "86203");
        org.junit.Assert.assertEquals(locale2.toString(), "kor_86203");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        java.io.IOException iOException1 = new java.io.IOException("10 (JPN,us)");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        int int6 = dateTimeZone1.getStandardOffset((long) 86399);
        int int8 = dateTimeZone1.getStandardOffset(70000L);
        long long10 = dateTimeZone1.nextTransition((long) 10);
        long long12 = dateTimeZone1.nextTransition(98L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 98L + "'", long12 == 98L);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = locale14.getISO3Language();
        java.lang.String str17 = locale12.getDisplayScript(locale14);
        java.lang.String str18 = locale7.getDisplayScript(locale14);
        java.util.Locale.setDefault(locale14);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str15, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale12 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str13 = dateTimeZone1.getName((long) 'a', locale12);
        java.lang.String str15 = dateTimeZone1.getShortName((-323999998L));
        long long17 = dateTimeZone1.previousTransition((-323999998L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName(1349913629376000000L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-323999998L) + "'", long17 == (-323999998L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.lang.String str10 = locale4.getExtension('u');
        java.lang.String str11 = locale4.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italiano" + "'", str11, "italiano");
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        java.lang.String str2 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.008" + "'", str2, "+00:00:00.008");
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) ' ', locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int14 = dateTimeZone1.getOffset(21254400000L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        java.util.Locale locale21 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str24 = locale21.getDisplayVariant(locale23);
        java.lang.String str25 = locale23.getDisplayCountry();
        java.lang.String str26 = dateTimeZone1.getShortName(66268800000L, locale23);
        long long29 = dateTimeZone1.convertLocalToUTC((-3530000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+02:00" + "'", str9, "+02:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7200000L) + "'", long12 == (-7200000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7200000 + "'", int14 == 7200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7200000 + "'", int16 == 7200000);
        org.junit.Assert.assertEquals(locale21.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+02:00" + "'", str26, "+02:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-10730000L) + "'", long29 == (-10730000L));
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        java.util.Locale locale2 = new java.util.Locale("Italiano", "germania");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(100L, chronology4, locale7);
        int int11 = dateTimeParserBucket10.getOffset();
        java.lang.Object obj12 = dateTimeParserBucket10.saveState();
        java.util.Locale locale13 = dateTimeParserBucket10.getLocale();
        int int14 = dateTimeParserBucket10.getOffset();
        java.util.Locale locale15 = dateTimeParserBucket10.getLocale();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale locale20 = new java.util.Locale("+05:00", "Deutschland", "Deutschland");
        java.lang.String str22 = locale20.getExtension('u');
        java.lang.String str23 = locale15.getDisplayVariant(locale20);
        java.lang.String str24 = locale2.getDisplayName(locale15);
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_GERMANIA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it-IT" + "'", str16, "it-IT");
        org.junit.Assert.assertEquals(locale20.toString(), "+05:00_DEUTSCHLAND_Deutschland");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italiano (GERMANIA)" + "'", str24, "italiano (GERMANIA)");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(40, 937710);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 937710");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        java.util.Locale locale3 = new java.util.Locale("thu (ITALIA)", "java.io.IOException: cinese", "+53:53");
        org.junit.Assert.assertEquals(locale3.toString(), "thu (italia)_JAVA.IO.IOEXCEPTION: CINESE_+53:53");
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        java.util.Locale locale3 = new java.util.Locale("10", "jpn", "us");
        java.util.Locale.setDefault(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.util.Locale locale10 = new java.util.Locale("\u52a0\u62ff\u5927", "jpn", "\u65e5\u6587");
        java.lang.String str11 = locale3.getDisplayLanguage(locale10);
        boolean boolean12 = locale3.hasExtensions();
        java.lang.String str13 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(charSet6);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u52a0\u62ff\u5927\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JPN" + "'", str13, "JPN");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder11.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        java.util.Locale.Builder builder16 = builder12.setRegion("120");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguage("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: java.io.IOException: ?? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cina");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
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
        java.lang.String str44 = locale41.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
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
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.clearExtensions();
        java.util.Locale.Builder builder12 = builder1.addUnicodeLocaleAttribute("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension(' ', "en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("de");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("\u4e2d\u56fd\u8a9e (UTC)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??? (UTC) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.lang.String str10 = dateTimeZone8.getName(946684800000L);
        long long13 = dateTimeZone8.adjustOffset((long) 12, false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 12L + "'", long13 == 12L);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        boolean boolean10 = locale7.hasExtensions();
        java.util.Locale.setDefault(locale7);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("thu (ITALIA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=thu(italia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Chinesisch (China)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
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
        java.lang.String str25 = dateTimeZone8.getShortName(60220800000L);
        java.util.TimeZone timeZone26 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 432000000L + "'", long21 == 432000000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getName(60822000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (???)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        java.lang.String str12 = dateTimeZone10.getNameKey(4492800011L);
        long long14 = dateTimeZone10.previousTransition((-134993474380800000L));
        int int16 = dateTimeZone10.getStandardOffset((long) 168);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ita");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-134993474380800000L) + "'", long14 == (-134993474380800000L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) 12);
        java.util.Locale locale11 = dateTimeParserBucket6.getLocale();
        int int12 = dateTimeParserBucket6.getOffset();
        long long13 = dateTimeParserBucket6.computeMillis();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 105L + "'", long13 == 105L);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.Object obj19 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale24 = java.util.Locale.US;
        dateTimeParserBucket18.saveField(dateTimeFieldType22, "centuryOfEra", locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder7.setLocale(locale24);
        java.util.Locale.Builder builder29 = builder7.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ita");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "United States" + "'", str27, "United States");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        java.util.Locale locale1 = new java.util.Locale("Chinese (Taiwan)");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese (taiwan)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("cinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setUnicodeLocaleKeyword("\u5fb7\u56fd,java.io.IOException: und)", "java.io.IOException: -8");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: cn (??,java.io.IOException: und) [at index 0]");
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
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("zh-cn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("-525593976");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -525593976 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        java.util.Locale locale1 = new java.util.Locale("zho");
        org.junit.Assert.assertEquals(locale1.toString(), "zho");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("\u4e0a\u5348", "chinese (FRANZ\366SISCH,fr,FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
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
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffsetFromLocal(223959686400032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.Locale locale8 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean9 = locale8.hasExtensions();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.lang.String str15 = locale8.getDisplayCountry(locale12);
        java.lang.String str16 = dateTimeZone3.getShortName((long) (short) 1, locale12);
        java.lang.String str17 = dateTimeZone3.getID();
        int int19 = dateTimeZone3.getStandardOffset(60480000010L);
        int int21 = dateTimeZone3.getStandardOffset(259200107L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 18748800000L);
        java.util.TimeZone timeZone24 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long28 = dateTimeZone26.convertUTCToLocal(518399566L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals(locale8.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 18874800000L + "'", long23 == 18874800000L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 518399566L + "'", long28 == 518399566L);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
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
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setVariant("DAYOFWEEK");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DAYOFWEEK [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("58", (java.lang.Throwable) iOException4);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("UTC", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.io.IOException iOException5 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException4);
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        java.io.IOException iOException11 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        iOException5.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str2 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str6 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "era" + "'", str2, "era");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        java.io.IOException iOException4 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException4);
        java.io.IOException iOException10 = new java.io.IOException("dayofyear");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("Italy");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        iOException8.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException("\uc11c\uae30", (java.lang.Throwable) iOException14);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
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
        org.joda.time.Chronology chronology15 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfDay();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "chn");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "chn");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-101537));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        java.io.IOException iOException2 = new java.io.IOException("weekyear");
        java.io.IOException iOException4 = new java.io.IOException("CHN");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable throwable11 = null;
        java.io.IOException iOException12 = new java.io.IOException("UTC", throwable11);
        java.io.IOException iOException13 = new java.io.IOException(throwable11);
        java.io.IOException iOException14 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException13);
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("cinese", (java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("ISOChronology[+00:00:00.010]", (java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("DateTimeField[year]", (java.lang.Throwable) iOException16);
        iOException4.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException20 = new java.io.IOException("cina", (java.lang.Throwable) iOException4);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 325);
        java.lang.String str10 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.convertLocalToUTC((-61970730540000L), true, (long) (-69363));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-61970730540000L) + "'", long14 == (-61970730540000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = builder0.build();
        java.lang.String str5 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset(64713600009L);
        java.lang.String str13 = dateTimeZone8.getNameKey((long) 3600000);
        java.lang.String str15 = dateTimeZone8.getNameKey((-86346032L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("14", (double) 3599990L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3599990.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 360300000);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-374399947));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
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
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Builder builder23 = builder20.setVariant("3540063");
        java.util.Locale locale24 = builder23.build();
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
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale locale10 = builder1.build();
        java.util.Locale.Builder builder13 = builder1.setExtension('x', "");
        java.util.Locale.Builder builder14 = builder13.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        java.io.IOException iOException3 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException("dayofyear");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException("Italy");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        iOException7.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException18 = new java.io.IOException("Franz\366sisch");
        iOException13.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 5);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long6 = dateTimeZone2.nextTransition(24200L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360300000 + "'", int4 == 360300000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 24200L + "'", long6 == 24200L);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.lang.String str3 = dateTimeZone1.getShortName(39600010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setScript("fr-fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr-fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder10 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.setLanguageTag("10 (JPN,us)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 10 (JPN,us) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.Object obj19 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale24 = java.util.Locale.US;
        dateTimeParserBucket18.saveField(dateTimeFieldType22, "centuryOfEra", locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder7.setLocale(locale24);
        java.util.Locale locale30 = new java.util.Locale("Italian");
        java.lang.String str31 = locale30.toLanguageTag();
        java.lang.String str33 = locale30.getExtension('a');
        java.util.Locale.Builder builder34 = builder7.setLocale(locale30);
        java.util.Locale.Builder builder35 = builder7.clear();
        java.util.Locale.Builder builder37 = builder35.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder37.removeUnicodeLocaleAttribute("\u4e0a\u5348");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u7f8e\u56fd" + "'", str27, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals(locale30.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "italian" + "'", str31, "italian");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        java.io.IOException iOException1 = new java.io.IOException("-713");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("DateTimeField[weekyearOfCentury]", (java.lang.Throwable) iOException4);
        java.io.IOException iOException11 = new java.io.IOException("US");
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) iOException11);
        iOException4.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("weekyear");
        java.io.IOException iOException17 = new java.io.IOException("CHN");
        iOException15.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException15);
        iOException4.addSuppressed((java.lang.Throwable) iOException19);
        iOException1.addSuppressed((java.lang.Throwable) iOException19);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException(throwable3);
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("\u5fb7\u6587");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        iOException8.addSuppressed((java.lang.Throwable) iOException11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("java.io.ioexception: zho", "10");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.ioexception: zho [at index 0]");
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
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setScript("utc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: utc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        java.io.IOException iOException3 = new java.io.IOException("utc");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("0", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("1969", (java.lang.Throwable) iOException3);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        java.io.IOException iOException1 = new java.io.IOException("utc");
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        java.io.IOException iOException10 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException10);
        java.io.IOException iOException15 = new java.io.IOException("Stati Uniti", (java.lang.Throwable) iOException10);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) iOException15);
        iOException1.addSuppressed((java.lang.Throwable) iOException15);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(5207);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:05.207" + "'", str3, "+00:00:05.207");
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setExtension(' ', "\u65e5\u672c\u8a9e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
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
        java.util.Locale locale25 = new java.util.Locale("Italian");
        java.lang.String str26 = locale25.toLanguageTag();
        java.lang.String str27 = locale25.toLanguageTag();
        java.lang.String str28 = locale19.getDisplayVariant(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale25.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italian");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italian" + "'", str26, "italian");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italian" + "'", str27, "italian");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: java.io.IOException: dayOfYear", "italiano (Italia)", "DateTimeField[dayOfYear]");
        java.lang.String str4 = locale3.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "java.io.ioexception: java.io.ioexception: dayofyear_ITALIANO (ITALIA)_DateTimeField[dayOfYear]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.ioexception: java.io.ioexception: dayofyear" + "'", str4, "java.io.ioexception: java.io.ioexception: dayofyear");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str3 = dateTimeFieldType0.toString();
        java.lang.String str4 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "clockhourOfHalfday" + "'", str3, "clockhourOfHalfday");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "clockhourOfHalfday" + "'", str4, "clockhourOfHalfday");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ITALIANO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ITALIANO' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
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
        java.util.Locale.Builder builder42 = builder41.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder45 = builder41.setExtension('a', "Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Chinesisch [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str17 = locale12.getDisplayCountry();
        java.lang.String str18 = locale12.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italien" + "'", str17, "Italien");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italienisch (Italien)" + "'", str18, "Italienisch (Italien)");
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1982);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.util.Locale locale3 = new java.util.Locale("-8", "weekofweekyear (UTC,+00:00)", "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertEquals(locale3.toString(), "-8_WEEKOFWEEKYEAR (UTC,+00:00)_hi!_ISOCHRONOLOGY[UTC]");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        java.util.Locale locale2 = new java.util.Locale("francese", "DateTimeField[weekOfWeekyear]");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "francese_DATETIMEFIELD[WEEKOFWEEKYEAR]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DATETIMEFIELD[WEEKOFWEEKYEAR]" + "'", str3, "DATETIMEFIELD[WEEKOFWEEKYEAR]");
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("August");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'August' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('4', "DateTimeField[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        int int15 = dateTimeZone1.getOffset((long) 5207);
        long long17 = dateTimeZone1.nextTransition(3103354800000L);
        java.lang.String str19 = dateTimeZone1.getShortName((-2819900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3103354800000L + "'", long17 == 3103354800000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        java.util.Locale locale3 = new java.util.Locale("August", "+01:55:26.399", "-30");
        org.junit.Assert.assertEquals(locale3.toString(), "august_+01:55:26.399_-30");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.Chronology chronology11 = chronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology8.getDateTimeMillis(360660000, 1970, (-100751458), 1421524);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360660000 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("zho");
        java.util.Locale locale9 = builder3.build();
        java.util.Locale.Builder builder10 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.setUnicodeLocaleKeyword("7200000", "\u661f\u671f\u4e94");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 7200000 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("US");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange1.equals(obj3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us" + "'", str2, "us");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("20", "11675");
        java.util.Locale.Builder builder17 = builder12.setLanguage("USA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.addUnicodeLocaleAttribute("java.io.IOException: -292275054");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: -292275054 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: DateTimeField[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:datetimefield[weekofweekyear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology11 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekyearOfCentury();
        int int14 = dateTimeField12.getMaximumValue((long) 2067);
        long long16 = dateTimeField12.roundCeiling(3382732800035L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3408220800000L + "'", long16 == 3408220800000L);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30a4\u30bf\u30ea\u30a2\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=99_?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getNameKey(345599916L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        java.lang.String str14 = dateTimeZone1.getID();
        long long18 = dateTimeZone1.convertLocalToUTC((-3599959L), false, 338765L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3599959L) + "'", long18 == (-3599959L));
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
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
        java.lang.String str29 = dateTimeZone1.getName(112933438437600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "-01:00", "italienisch (italien)_ITA");
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_-01:00_italienisch (italien)_ITA");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale locale9 = builder1.build();
        java.util.Locale.Builder builder11 = builder1.addUnicodeLocaleAttribute("4969628");
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("11675");
        java.util.Locale.Builder builder15 = builder11.clear();
        java.util.Locale.Builder builder17 = builder15.removeUnicodeLocaleAttribute("7343661");
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = builder19.build();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale24 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology22, locale24, (java.lang.Integer) 1, 0);
        java.lang.String str28 = locale20.getDisplayVariant(locale24);
        java.util.Set<java.lang.Character> charSet29 = locale24.getExtensionKeys();
        java.util.Locale.Builder builder30 = builder17.setLocale(locale24);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(18089075, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 200");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("BC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'BC' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        long long12 = dateTimeParserBucket7.computeMillis(true);
        long long13 = dateTimeParserBucket7.computeMillis();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u56fd_CHN");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        java.io.IOException iOException1 = new java.io.IOException("weekyearOfCentury");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        iOException4.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("UTC", (java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException();
        java.io.IOException iOException14 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException13);
        iOException9.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.lang.Throwable throwable20 = null;
        java.io.IOException iOException21 = new java.io.IOException("UTC", throwable20);
        java.io.IOException iOException22 = new java.io.IOException(throwable20);
        iOException17.addSuppressed((java.lang.Throwable) iOException22);
        iOException9.addSuppressed((java.lang.Throwable) iOException22);
        iOException1.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.String str26 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException: weekyearOfCentury" + "'", str26, "java.io.IOException: weekyearOfCentury");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayLanguage(locale7);
        java.util.Locale locale12 = new java.util.Locale("3600000", "292278993", "DATETIMEFIELD[DAYOFYEAR]");
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale5.getDisplayCountry(locale12);
        java.lang.String str15 = locale0.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "3600000_292278993_DATETIMEFIELD[DAYOFYEAR]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3600000" + "'", str13, "3600000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(4967658);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        boolean boolean13 = dateTimeZone1.isStandardOffset(10368000000L);
        int int15 = dateTimeZone1.getOffsetFromLocal((-57L));
        long long17 = dateTimeZone1.convertUTCToLocal((-2114380800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2114380800000L) + "'", long17 == (-2114380800000L));
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale10, (java.lang.Integer) (-101), (int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        java.util.Locale locale21 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str24 = locale21.getDisplayVariant(locale23);
        dateTimeParserBucket14.saveField(dateTimeFieldType15, "hi!", locale23);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("Franz\366sisch (Frankreich)");
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.lang.String str30 = locale23.getDisplayLanguage(locale27);
        java.util.Locale.Builder builder31 = builder4.setLocale(locale27);
        java.lang.String str32 = locale27.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals(locale21.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "und" + "'", str28, "und");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal(102816006301L);
        java.lang.String str11 = dateTimeZone8.toString();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u56fd_CHN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        int int11 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Locale locale14 = locale12.stripExtensions();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("DateTimeField[millisOfDay]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[millisofday]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
