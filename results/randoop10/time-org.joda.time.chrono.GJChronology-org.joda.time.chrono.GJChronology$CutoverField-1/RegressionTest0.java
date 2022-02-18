import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("English", "English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_TW" + "'", str1, "zh_TW");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Locale locale2 = new java.util.Locale("English (United States)", "");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "english (united states)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english (united states)" + "'", str3, "english (united states)");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("english (united states)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedstates)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'English' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        boolean boolean3 = locale0.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English (United States)" + "'", str1, "English (United States)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("DurationField[millis]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DurationField[millis] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((int) (short) 0, (int) ' ', (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis((long) 100, (int) ' ', 100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("DurationField[millis]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DurationField[millis] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(10L, 4, (int) (short) -1, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(100, (int) (short) 1, (int) 'u', (int) (byte) -1, (int) (byte) 1, (int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology2.add(readablePeriod5, (long) 'a', (int) '4');
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePartial9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray6 = new int[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial4, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("english (united states)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"english (united states)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 100, (int) (short) -1, 10, 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology2.getDateTimeMillis((-1), (int) (byte) 0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray7 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            gJChronology5.validate(readablePartial6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'English (United States)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension(' ', "zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension(' ', "UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis(4, (int) ' ', (int) (short) 100, (int) (short) 1, (int) '#', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gJChronology2.get(readablePartial4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology5.getDateTimeMillis(4, (int) (short) 10, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[Etc/UTC]" + "'", str7, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis(10, (int) (short) 0, (int) (short) 0, (int) '4', 10, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setRegion("GJChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: GJChronology[Etc/UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        boolean boolean9 = dateTimeField8.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod10, 0L, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        boolean boolean7 = durationField3.isPrecise();
        long long10 = durationField3.getValueAsLong(1L, (long) 0);
        long long13 = durationField3.subtract((long) '#', (int) '4');
        long long16 = durationField3.getMillis(4324200000L, (long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2246399965L) + "'", long13 == (-2246399965L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 186805440000000000L + "'", long16 == 186805440000000000L);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("English", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'zh_TW' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.052' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = gJChronology2.get(readablePartial16, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis(100L, 0, (int) 'u', (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setScript("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension(' ', "und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-US", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis(0, (int) 'u', (int) '4', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.monthOfYear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial7, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        java.lang.String str16 = gJChronology2.toString();
        org.joda.time.DurationField durationField17 = gJChronology2.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = durationField17.getValue((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[Etc/UTC]" + "'", str16, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        boolean boolean4 = instant1.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = instant1.get(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant(52L);
        boolean boolean5 = instant4.isEqualNow();
        java.lang.String str6 = instant4.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant4.toMutableDateTime();
        boolean boolean11 = instant4.isEqual((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str6, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = gJChronology2.set(readablePartial5, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("utc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'utc' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gJChronology2.get(readablePartial5, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(100, 4, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JP" + "'", str1, "JP");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "ja_JP");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology4.getDateTimeMillis(52L, 100, (int) 'a', (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis(0, 100, (int) ' ', (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        int int8 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.weekyearOfCentury();
        boolean boolean11 = locale0.equals((java.lang.Object) dateTimeField10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale6.getUnicodeLocaleType("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: eng");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = gJChronology2.get(readablePeriod14, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology2.getDateTimeMillis((-3155695200000L), 10, 100, (int) (short) 100, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(0, (int) (byte) 0, 100, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        long long10 = gJChronology2.add(97L, (long) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis(0, 1, (-1), 100, (int) ' ', 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "english");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        int int11 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.weekyearOfCentury();
        org.joda.time.Instant instant17 = gJChronology14.getGregorianCutover();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.millisOfSecond();
        int int26 = instant21.get(dateTimeField25);
        org.joda.time.Instant instant28 = instant21.plus(0L);
        int int29 = instant19.compareTo((org.joda.time.ReadableInstant) instant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = instant28.isSupported(dateTimeFieldType30);
        int int32 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant28);
        org.joda.time.ReadableInstant readableInstant33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = instant28.compareTo(readableInstant33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        boolean boolean4 = instant1.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = instant1.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = instant1.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((-61827926999999L), (int) 'u', (-1), 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = gJChronology2.get(readablePartial18, 4320000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[Etc/UTC]" + "'", str17, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis(52, 52, (int) (short) 10, (int) (byte) 1, (int) (short) 100, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        long long6 = durationField5.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 604800000L + "'", long6 == 604800000L);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) (byte) -1, 100, 0, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis((int) 'u', 100, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("hi!", "UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        boolean boolean7 = durationField3.isPrecise();
        long long10 = durationField3.getValueAsLong(1L, (long) 0);
        long long12 = durationField3.getMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 43200000L + "'", long12 == 43200000L);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis(4, (int) (short) 10, (int) '4', 4, (int) 'x', (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis((int) '#', (int) (byte) 0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DurationField durationField4 = gJChronology2.months();
        long long7 = durationField4.subtract((long) (short) 1, 10L);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.halfdays();
        long long15 = gJChronology10.add((long) 'a', (-1L), (int) (short) 0);
        long long19 = gJChronology10.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.minuteOfHour();
        org.joda.time.DurationField durationField21 = gJChronology10.hours();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology10.millisOfSecond();
        org.joda.time.DurationField durationField24 = gJChronology10.seconds();
        int int25 = durationField4.compareTo(durationField24);
        long long28 = durationField24.getMillis((int) '#', (long) 4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-26438399999L) + "'", long7 == (-26438399999L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5200L + "'", long19 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35000L + "'", long28 == 35000L);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.millis();
        long long14 = durationField11.subtract((long) (byte) -1, (-1L));
        long long17 = durationField11.getMillis((long) (short) 0, (long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray8 = new int[] { (byte) 100, 'x', 10 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial4, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 120, 10]");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) gJChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long7 = dateTimeZone1.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.lang.String[] strArray23 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList24, filteringMode27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.lang.String[] strArray42 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList33, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.lang.String[] strArray56 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList59);
        boolean boolean61 = dateTimeZone1.equals((java.lang.Object) languageRangeList14);
        java.util.Collection<java.lang.String> strCollection62 = null;
        java.lang.String str63 = java.util.Locale.lookupTag(languageRangeList14, strCollection62);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5200L + "'", long7 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setUnicodeLocaleKeyword("DurationField[millis]", "und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: DurationField[millis] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.set(readablePartial13, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePeriod9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePartial7, 3155760000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray13 = new int[] { 4, 'u', 100, (byte) -1, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial6, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[4, 117, 100, -1, 1, 100]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 'u');
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        long long11 = gJChronology6.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean13 = gJChronology6.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.clockhourOfHalfday();
        org.joda.time.DateTime dateTime18 = instant1.toDateTime((org.joda.time.Chronology) gJChronology6);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        long long26 = gJChronology21.add((long) 'a', (-1L), (int) (short) 0);
        long long30 = gJChronology21.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology21.year();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology21);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = gJChronology21.get(readablePeriod35, 4320000001L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5200L + "'", long30 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((-64983772799999L), (int) '#', (int) 'u', (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, 349200000L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) "Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Chinese\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long7 = dateTimeZone1.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.lang.String[] strArray23 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList24, filteringMode27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.lang.String[] strArray42 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList33, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.lang.String[] strArray56 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList59);
        boolean boolean61 = dateTimeZone1.equals((java.lang.Object) languageRangeList14);
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.lang.String str64 = locale63.getISO3Language();
        java.lang.String str65 = dateTimeZone1.getShortName((long) 'a', locale63);
        java.lang.String str66 = dateTimeZone1.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (long) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5200L + "'", long7 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "eng" + "'", str64, "eng");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00" + "'", str65, "+00:00");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Etc/UTC" + "'", str66, "Etc/UTC");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis((long) (byte) 1, (int) (byte) 100, (int) (byte) 0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        boolean boolean5 = dateTimeField4.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.DateTime dateTime24 = instant8.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = dateTime24.isSupported(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str13, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str14, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (United States)", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united states)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology2.set(readablePartial7, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'CN' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'JP' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        int int16 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.set(readablePartial17, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "en_CA");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        java.lang.String str16 = gJChronology2.toString();
        org.joda.time.DurationField durationField17 = gJChronology2.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = durationField17.subtract(52L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[Etc/UTC]" + "'", str16, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("GJChronology[Etc/UTC]", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: GJChronology[Etc/UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.Locale locale2 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getCountry();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        long long16 = gJChronology11.add((long) 'a', (-1L), (int) (short) 0);
        long long20 = gJChronology11.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.minuteOfHour();
        org.joda.time.DurationField durationField22 = gJChronology11.hours();
        long long24 = durationField22.getValueAsLong((long) '4');
        boolean boolean25 = locale3.equals((java.lang.Object) '4');
        org.junit.Assert.assertEquals(locale2.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "utc" + "'", str6, "utc");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5200L + "'", long20 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setLanguage("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gJChronology2.get(readablePeriod5, 306102434400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(117L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 117L + "'", long12 == 117L);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale5.getUnicodeLocaleType("utc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        boolean boolean9 = dateTimeField8.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.set(readablePartial8, 115200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("+01:10", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(70, (int) (short) 1, 70, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod11, 4320000100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[Etc/UTC]" + "'", str10, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean12 = dateTimeZone5.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology13 = gJChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = gJChronology2.set(readablePartial4, 43201764L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology2.add(readablePeriod5, (long) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((int) (short) -1, 10, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("utc", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        long long8 = gJChronology2.add((long) (byte) 0, 4324200000L, 4);
        long long12 = gJChronology2.add(3155760000000L, (long) (short) 10, (int) 'u');
        org.joda.time.DurationField durationField13 = gJChronology2.weekyears();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.set(readablePartial14, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17296800000L + "'", long8 == 17296800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3155760001170L + "'", long12 == 3155760001170L);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis(1L, 1, (int) 'a', 1, 1431201);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.set(readablePartial11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTime dateTime11 = instant1.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dateTime11.get(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str4, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((int) (byte) 10, (int) 'a', (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology5.add(readablePeriod8, (long) (short) -1, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology5.getDateTimeMillis(0, 70, 0, 0, (int) 'u', (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.DateTime dateTime24 = instant8.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = instant8.get(dateTimeFieldType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str13, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str14, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis((int) '4', 1431201, (int) 'a', (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1431201 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        long long13 = dateTimeZone1.convertLocalToUTC((-26438399999L), false, 3155695200000L);
        org.joda.time.Instant instant15 = new org.joda.time.Instant(52L);
        boolean boolean16 = instant15.isEqualNow();
        java.lang.String str17 = instant15.toString();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getCountry();
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getDisplayName();
        java.lang.String str26 = locale22.getDisplayScript(locale24);
        boolean boolean27 = dateTimeZone19.equals((java.lang.Object) locale24);
        int int29 = dateTimeZone19.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.weekyearOfCentury();
        org.joda.time.Instant instant35 = gJChronology32.getGregorianCutover();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Instant instant39 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.millisOfSecond();
        int int44 = instant39.get(dateTimeField43);
        org.joda.time.Instant instant46 = instant39.plus(0L);
        int int47 = instant37.compareTo((org.joda.time.ReadableInstant) instant46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant46.isSupported(dateTimeFieldType48);
        int int50 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) instant46);
        boolean boolean51 = instant15.isAfter((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Instant instant53 = instant46.withMillis((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant53, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-26438399999L) + "'", long13 == (-26438399999L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str17, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(instant53);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(0, (int) (short) 10, (int) 'u', (int) (byte) 100, (int) (byte) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology2.get(readablePeriod12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = instant10.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod11, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[Etc/UTC]" + "'", str10, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.set(readablePartial8, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = gJChronology2.millis();
        org.joda.time.DurationField durationField7 = gJChronology2.halfdays();
        int int9 = durationField7.getValue((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = durationField7.getDifference(186805440000000000L, 3155760000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4324126950");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        long long13 = gJChronology2.add(262974600000L, (long) (byte) 100, (int) '4');
        org.joda.time.DurationField durationField14 = gJChronology2.hours();
        long long15 = durationField14.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 262974605200L + "'", long13 == 262974605200L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setRegion("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("+00:10", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +00:10 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("DurationField[centuries]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=durationfield[centuries]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("DurationField[weekyears]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DurationField[weekyears] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayScript(locale4);
        java.lang.String str9 = locale1.getVariant();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        boolean boolean15 = locale14.hasExtensions();
        java.util.Locale.Builder builder16 = builder11.setLocale(locale14);
        java.lang.String str18 = locale14.getExtension('u');
        java.lang.String str19 = locale14.getCountry();
        boolean boolean20 = locale1.equals((java.lang.Object) str19);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale4.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.set(readablePartial11, 4320000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = gJChronology2.getDateTimeMillis(1431201, (int) ' ', (int) (short) -1, 10, (int) 'x', (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology5.set(readablePartial8, 43200100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray9 = new int[] { (short) 1, 4, 1431201 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial5, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 4, 1431201]");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) (-1));
        int int6 = dateTimeZone1.getOffset((-61827926399999L));
        org.joda.time.Instant instant8 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.millisOfSecond();
        int int13 = instant8.get(dateTimeField12);
        boolean boolean14 = instant8.isEqualNow();
        org.joda.time.DateTime dateTime15 = instant8.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        int int12 = durationField9.getValue((-42L), 4320000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        java.lang.String[] strArray22 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strList23, filteringMode26);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList27, filteringMode28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Set<java.lang.String> strSet33 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList42, strMap43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.lang.String[] strArray53 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList54);
        java.util.Locale.FilteringMode filteringMode57 = null;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags(languageRangeList44, (java.util.Collection<java.lang.String>) strList54, filteringMode57);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList58, filteringMode59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList68, strMap69);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, strMap74);
        java.lang.String[] strArray79 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strList80);
        java.util.Locale.FilteringMode filteringMode83 = null;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList70, (java.util.Collection<java.lang.String>) strList80, filteringMode83);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList84, filteringMode85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList60, filteringMode85);
        java.lang.String str88 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strList60);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = gJChronology11.get(readablePeriod13, 4324200000L, 5200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        long long13 = dateTimeZone10.convertUTCToLocal(262974605200L);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = gJChronology16.halfdays();
        long long21 = gJChronology16.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.secondOfMinute();
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        boolean boolean26 = instant25.isEqualNow();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant25.plus(readableDuration27);
        boolean boolean29 = gJChronology16.equals((java.lang.Object) instant25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = instant25.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = instant25.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone34 = instant25.getZone();
        org.joda.time.Instant instant36 = instant25.plus((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant36, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 262974605200L + "'", long13 == 262974605200L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(instant36);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        org.joda.time.DurationField durationField9 = gJChronology2.weekyears();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.era();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = gJChronology12.millis();
        org.joda.time.DurationField durationField17 = gJChronology12.seconds();
        int int18 = durationField9.compareTo(durationField17);
        long long21 = durationField9.subtract((long) '4', 70);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-2208729599948L) + "'", long21 == (-2208729599948L));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology5.getDateTimeMillis((int) ' ', (int) (short) -1, (int) (short) 1, 4, (int) '#', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[Etc/UTC]" + "'", str7, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.weeks();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology2.set(readablePartial7, 43200100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DurationField durationField13 = gJChronology2.days();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis(52, (int) (byte) -1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        boolean boolean6 = locale0.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = gJChronology2.millis();
        org.joda.time.DurationField durationField7 = gJChronology2.seconds();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePeriod8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis((-1), 10, (int) (byte) -1, (int) (byte) -1, 100, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.Object obj6 = locale5.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "zh");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.lang.String str20 = locale19.getCountry();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale19.getDisplayScript(locale21);
        boolean boolean24 = dateTimeZone16.equals((java.lang.Object) locale21);
        org.joda.time.Chronology chronology25 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.ReadablePartial readablePartial26 = null;
        int[] intArray31 = new int[] { 'u', 1431201, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial26, intArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[117, 1431201, 0, 1]");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = gJChronology2.set(readablePartial19, 126000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod6, 306102434400000L, 3155760001170L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) category0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale$Category");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.lang.String[] strArray13 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList22, strMap23);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.getDisplayVariant();
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale31.getCountry();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str37 = locale36.toLanguageTag();
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getCountry();
        java.lang.String str41 = locale39.getLanguage();
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean44 = locale43.hasExtensions();
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.lang.String str49 = locale48.getCountry();
        java.lang.String str50 = locale48.getCountry();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getDisplayName();
        java.lang.String str55 = locale53.getDisplayVariant();
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.lang.String str57 = locale56.getDisplayScript();
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale58.getDisplayName();
        java.util.Locale locale60 = java.util.Locale.CANADA;
        java.lang.String str61 = locale60.getISO3Language();
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = locale62.toLanguageTag();
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.lang.String str67 = locale66.getCountry();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale68.getDisplayName();
        java.lang.String str70 = locale66.getDisplayScript(locale68);
        java.util.Locale locale71 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale72 = java.util.Locale.JAPAN;
        java.lang.String str73 = locale72.getCountry();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.lang.String str76 = locale75.getCountry();
        java.lang.String str77 = locale75.getScript();
        java.util.Locale locale78 = java.util.Locale.CANADA;
        java.lang.String str79 = locale78.getISO3Language();
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.lang.String str81 = locale80.getDisplayName();
        java.lang.String str82 = locale80.getDisplayVariant();
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale27, locale29, locale31, locale33, locale34, locale36, locale39, locale43, locale45, locale48, locale51, locale52, locale53, locale56, locale58, locale60, locale62, locale66, locale71, locale72, locale75, locale78, locale80 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale locale86 = java.util.Locale.lookup(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale87 = java.util.Locale.lookup(languageRangeList24, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList84);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "cinese" + "'", str28, "cinese");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JP" + "'", str32, "JP");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "und" + "'", str37, "und");
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zho" + "'", str46, "zho");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "cinese" + "'", str54, "cinese");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "cinese" + "'", str59, "cinese");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "eng" + "'", str61, "eng");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "cinese" + "'", str63, "cinese");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zh" + "'", str64, "zh");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "cinese" + "'", str69, "cinese");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "JP" + "'", str73, "JP");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "eng" + "'", str79, "eng");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "cinese" + "'", str81, "cinese");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "halfdays");
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNull(locale88);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("GJChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GJChronology[Etc/UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        boolean boolean6 = locale0.hasExtensions();
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh_TW" + "'", str8, "zh_TW");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        int int10 = durationField7.getValue((-42L), 604800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 'u');
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        long long11 = gJChronology6.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean13 = gJChronology6.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.clockhourOfHalfday();
        org.joda.time.DateTime dateTime18 = instant1.toDateTime((org.joda.time.Chronology) gJChronology6);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getOffset((long) (byte) 1);
        long long24 = dateTimeZone19.adjustOffset((-1L), false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime18.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = mutableDateTime25.get(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.set(readablePartial16, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.months();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = gJChronology19.halfdays();
        long long23 = durationField20.add((long) 100, 100L);
        boolean boolean24 = durationField20.isPrecise();
        int int25 = durationField16.compareTo(durationField20);
        long long28 = durationField20.getMillis(35L, (-8380800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4320000100L + "'", long23 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1512000000L + "'", long28 == 1512000000L);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology5.getDateTimeMillis(52, 0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[Etc/UTC]" + "'", str7, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        java.lang.String str10 = locale6.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale6.getUnicodeLocaleType("GJChronology[+00:10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: GJChronology[+00:10]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese" + "'", str7, "cinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = locale3.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese" + "'", str4, "cinese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.Locale locale2 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale3.getUnicodeLocaleType("cinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: cinese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "utc" + "'", str6, "utc");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("it", "\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 'u');
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        long long11 = gJChronology6.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean13 = gJChronology6.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.clockhourOfHalfday();
        org.joda.time.DateTime dateTime18 = instant1.toDateTime((org.joda.time.Chronology) gJChronology6);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        long long26 = gJChronology21.add((long) 'a', (-1L), (int) (short) 0);
        long long30 = gJChronology21.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology21.year();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology21);
        org.joda.time.Instant instant35 = instant1.toInstant();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5200L + "'", long30 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(instant35);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setVariant("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone11 = instant1.getZone();
        long long12 = instant1.getMillis();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str6, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, 100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((long) (short) 0, (int) (byte) 100, 52, 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod9, (long) 70, 1512000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("eng", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        long long14 = gJChronology9.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean16 = gJChronology9.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.dayOfMonth();
        org.joda.time.DurationField durationField18 = gJChronology9.millis();
        int int19 = durationField3.compareTo(durationField18);
        long long22 = durationField3.getMillis((int) (short) 10, (-1L));
        int int25 = durationField3.getValue(4320000100L, 349200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 432000000L + "'", long22 == 432000000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.setScript("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((int) (short) 10, (int) (byte) 10, (int) 'u', (int) (byte) 0, (int) (byte) 0, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.set(readablePartial8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setLanguage("+00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +00:00:00.052 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = gJChronology2.get(readablePeriod18, (long) 'x', 152L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePartial15, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        long long10 = gJChronology2.add(97L, (long) (byte) 100, 0);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis((int) (short) -1, (int) (byte) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        long long9 = durationField6.getValueAsLong((long) 100, (long) 10);
        long long12 = durationField6.getMillis((int) (short) 1, 432000001L);
        java.lang.String str13 = durationField6.toString();
        long long15 = durationField6.getValueAsLong((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = durationField6.add(97000L, 171253440000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1321400073709551616");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3155760000000L + "'", long12 == 3155760000000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DurationField[centuries]" + "'", str13, "DurationField[centuries]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 'u');
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        long long11 = gJChronology6.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean13 = gJChronology6.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.clockhourOfHalfday();
        org.joda.time.DateTime dateTime18 = instant1.toDateTime((org.joda.time.Chronology) gJChronology6);
        org.joda.time.Instant instant20 = instant1.plus(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant23 = instant1.withDurationAdded(1136050274678400000L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1136050274678400000 * 10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(instant20);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology5.seconds();
        long long11 = durationField8.add(262974600000L, 70);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 262974670000L + "'", long11 == 262974670000L);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray14 = new int[] { ' ', (short) 1, (byte) 10, ' ', '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial7, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 1, 10, 32, 35, 100]");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("", "tedesco");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("DurationField[centuries]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'DurationField[centuries]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.set(readablePartial16, 432000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) 0, false);
        int int7 = dateTimeZone1.getOffsetFromLocal((-26438399999L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (long) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        long long17 = dateTimeZone12.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean19 = dateTimeZone12.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology20 = gJChronology9.withZone(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime21 = instant1.toMutableDateTime(dateTimeZone12);
        boolean boolean22 = mutableDateTime21.isAfterNow();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        long long30 = gJChronology25.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean31 = mutableDateTime21.equals((java.lang.Object) gJChronology25);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = gJChronology25.getDateTimeMillis(70, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) '#');
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant13 = instant11.withMillis((long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = gJChronology2.getDateTimeMillis((int) 'u', (int) (short) -1, (int) 'x', (int) 'x', (int) 'a', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.withDurationAdded(115200000L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant1.getZone();
        java.lang.String str9 = dateTimeZone8.getID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str4, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology5.add(readablePeriod8, (long) (short) -1, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = gJChronology5.get(readablePeriod13, 3600000L, (-22087032463023600L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-8380800000L));
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-8568000000L) + "'", long8 == (-8568000000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.halfdays();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray22 = new int[] { 1, ' ', (short) 100, ' ', 0, 1431201 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial15, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 32, 100, 32, 0, 1431201]");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePartial8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Set<java.lang.String> strSet3 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str4 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.lang.String[] strArray15 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList16, filteringMode19);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList31, strMap32);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale38.getDisplayVariant();
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.lang.String str41 = locale40.getCountry();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str46 = locale45.toLanguageTag();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.lang.String str49 = locale48.getCountry();
        java.lang.String str50 = locale48.getLanguage();
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean53 = locale52.hasExtensions();
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale54.getISO3Language();
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.lang.String str58 = locale57.getCountry();
        java.lang.String str59 = locale57.getCountry();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale62.getDisplayName();
        java.lang.String str64 = locale62.getDisplayVariant();
        java.util.Locale locale65 = java.util.Locale.ROOT;
        java.lang.String str66 = locale65.getDisplayScript();
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale67.getDisplayName();
        java.util.Locale locale69 = java.util.Locale.CANADA;
        java.lang.String str70 = locale69.getISO3Language();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.lang.String str73 = locale71.toLanguageTag();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.lang.String str76 = locale75.getCountry();
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = locale77.getDisplayName();
        java.lang.String str79 = locale75.getDisplayScript(locale77);
        java.util.Locale locale80 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale81 = java.util.Locale.JAPAN;
        java.lang.String str82 = locale81.getCountry();
        java.util.Locale locale84 = new java.util.Locale("hi!");
        java.lang.String str85 = locale84.getCountry();
        java.lang.String str86 = locale84.getScript();
        java.util.Locale locale87 = java.util.Locale.CANADA;
        java.lang.String str88 = locale87.getISO3Language();
        java.util.Locale locale89 = java.util.Locale.getDefault();
        java.lang.String str90 = locale89.getDisplayName();
        java.lang.String str91 = locale89.getDisplayVariant();
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale36, locale38, locale40, locale42, locale43, locale45, locale48, locale52, locale54, locale57, locale60, locale61, locale62, locale65, locale67, locale69, locale71, locale75, locale80, locale81, locale84, locale87, locale89 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList33, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale97 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chinese" + "'", str37, "Chinese");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "JP" + "'", str41, "JP");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "und" + "'", str46, "und");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Chinese" + "'", str63, "Chinese");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Chinese" + "'", str68, "Chinese");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "eng" + "'", str70, "eng");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Chinese" + "'", str72, "Chinese");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zh" + "'", str73, "zh");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Chinese" + "'", str78, "Chinese");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "JP" + "'", str82, "JP");
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "eng" + "'", str88, "eng");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Chinese" + "'", str90, "Chinese");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "halfdays");
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNull(locale97);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = gJChronology2.get(readablePartial21, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[Etc/UTC]" + "'", str19, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("DurationField[millis]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DurationField[millis] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Collection<java.util.Locale> localeCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale3 = java.util.Locale.lookup(languageRangeList1, localeCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("+01:10", "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +01:10 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = gJChronology5.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology5.getDateTimeMillis(4, (int) (byte) -1, 52, (int) 'x', 4, 0, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        java.lang.String str6 = locale0.getDisplayName();
        java.lang.Object obj7 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (Taiwan)" + "'", str6, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "zh_TW");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.toString();
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) 'u');
        org.joda.time.Instant instant7 = new org.joda.time.Instant(52L);
        boolean boolean8 = instant7.isEqualNow();
        java.lang.String str9 = instant7.toString();
        java.lang.String str10 = instant7.toString();
        org.joda.time.Instant instant12 = new org.joda.time.Instant(52L);
        boolean boolean13 = instant12.isEqualNow();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.plus(readableDuration14);
        boolean boolean16 = instant7.isBefore((org.joda.time.ReadableInstant) instant15);
        org.joda.time.DateTime dateTime17 = instant7.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant7, 1431201);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 1431201");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str9, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str10, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setRegion("halfdays");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: halfdays [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("+01:10", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+01:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePartial7, (-8568000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePeriod14, (long) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"eng\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = gJChronology2.get(readablePeriod6, 262974670000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("972022-02-11T09:43:15.789Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 972022-02-11T09:43:15.789Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("+00:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:10\" is malformed at \":10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField5 = chronology4.years();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField5.getMillis((-61827926399999L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -61827926399999 * 31556952000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        java.lang.String str16 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = gJChronology2.get(readablePeriod17, 186805440000000000L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[Etc/UTC]" + "'", str16, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        long long25 = instant21.getMillis();
        java.lang.String str26 = instant21.toString();
        org.joda.time.Instant instant27 = instant21.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant21.withDurationAdded(readableDuration28, (int) 'x');
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.yearOfCentury();
        int int36 = instant30.get(dateTimeField35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = gJChronology37.get(readablePeriod38, 4320000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deutsch" + "'", str7, "Deutsch");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 70 + "'", int36 == 70);
        org.junit.Assert.assertNotNull(gJChronology37);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = gJChronology5.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology5.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology5.getDateTimeMillis(35000L, (int) ' ', 10, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[Etc/UTC]" + "'", str7, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(1L, (int) (byte) 10, (int) '4', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayVariant();
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getCountry();
        java.lang.String str18 = locale16.getLanguage();
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getCountry();
        java.lang.String str27 = locale25.getCountry();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale30.getDisplayName();
        java.lang.String str32 = locale30.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.lang.String str34 = locale33.getDisplayScript();
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale37.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.lang.String str41 = locale39.toLanguageTag();
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.lang.String str44 = locale43.getCountry();
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale45.getDisplayName();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.JAPAN;
        java.lang.String str50 = locale49.getCountry();
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getCountry();
        java.lang.String str54 = locale52.getScript();
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale57.getDisplayName();
        java.lang.String str59 = locale57.getDisplayVariant();
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale11, locale13, locale16, locale20, locale22, locale25, locale28, locale29, locale30, locale33, locale35, locale37, locale39, locale43, locale48, locale49, locale52, locale55, locale57 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale locale63 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale locale64 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone66);
        org.joda.time.DurationField durationField68 = gJChronology67.halfdays();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology67.millisOfDay();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology67.minuteOfDay();
        org.joda.time.DurationField durationField71 = gJChronology67.centuries();
        int int72 = gJChronology67.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology67.weekyear();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology67.weekyearOfCentury();
        org.joda.time.DurationField durationField75 = gJChronology67.halfdays();
        org.joda.time.Instant instant76 = gJChronology67.getGregorianCutover();
        java.lang.String str77 = gJChronology67.toString();
        boolean boolean78 = locale64.equals((java.lang.Object) str77);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u5fb7\u6587" + "'", str5, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JP" + "'", str9, "JP");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "deu" + "'", str23, "deu");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u5fb7\u6587" + "'", str31, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u5fb7\u6587" + "'", str36, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "eng" + "'", str38, "eng");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u5fb7\u6587" + "'", str40, "\u5fb7\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "de" + "'", str41, "de");
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u5fb7\u6587" + "'", str46, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "JP" + "'", str50, "JP");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "eng" + "'", str56, "eng");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u5fb7\u6587" + "'", str58, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "halfdays");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "halfdays");
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(gJChronology67);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(instant76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "GJChronology[Etc/UTC]" + "'", str77, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone0.isStandardOffset(115200000L);
        long long5 = dateTimeZone0.adjustOffset(3692163384000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3692163384000L + "'", long5 == 3692163384000L);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) (byte) 10, (int) (byte) 100, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology2.get(readablePeriod12, (-42L), 349200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.Instant instant13 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis(0, 10, (int) (byte) 1, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        java.lang.String str7 = durationField3.toString();
        long long10 = durationField3.add((long) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = durationField3.add((-2208729599948L), 262974670000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 262974670000 * 43200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DurationField[halfdays]" + "'", str7, "DurationField[halfdays]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 43200100L + "'", long10 == 43200100L);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.halfdayOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        long long30 = gJChronology25.add((long) 'a', (-1L), (int) (short) 0);
        long long34 = gJChronology25.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField35 = gJChronology25.years();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology25.getZone();
        org.joda.time.Chronology chronology38 = gJChronology2.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology2.days();
        // The following exception was thrown during execution in test generation
        try {
            long long47 = gJChronology2.getDateTimeMillis((-5914428), (int) (short) -1, 1582, (int) (short) 1, (int) (short) 0, 52, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[Etc/UTC]" + "'", str19, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5200L + "'", long34 == 5200L);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DurationField durationField4 = gJChronology2.months();
        long long7 = durationField4.subtract((long) (short) 1, 10L);
        java.lang.Class<?> wildcardClass8 = durationField4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-26438399999L) + "'", long7 == (-26438399999L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = gJChronology19.halfdays();
        long long24 = gJChronology19.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology19.secondOfMinute();
        org.joda.time.Instant instant28 = new org.joda.time.Instant(52L);
        boolean boolean29 = instant28.isEqualNow();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant28.plus(readableDuration30);
        boolean boolean32 = gJChronology19.equals((java.lang.Object) instant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = instant28.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = instant28.isSupported(dateTimeFieldType35);
        org.joda.time.DateTimeZone dateTimeZone37 = instant28.getZone();
        boolean boolean38 = instant1.isAfter((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Instant instant40 = instant1.minus((long) 70);
        org.joda.time.Instant instant42 = instant1.withMillis((-64983772799999L));
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = instant42.get(dateTimeFieldType43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[Etc/UTC]" + "'", str14, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(instant42);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.era();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.centuryOfEra();
        org.joda.time.Chronology chronology13 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField14 = gJChronology9.years();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology9.getDateTimeMillis((int) (short) 100, 10, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = instant7.toMutableDateTime((org.joda.time.Chronology) gJChronology10);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = gJChronology10.getDateTimeMillis(1431201, 1582, (int) '4', (-1), (int) (short) 100, (int) 'u', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension('#', "it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        java.lang.String[] strArray26 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.FilteringMode filteringMode30 = null;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList17, (java.util.Collection<java.lang.String>) strList27, filteringMode30);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale36.getDisplayVariant();
        java.util.Locale locale38 = java.util.Locale.JAPAN;
        java.lang.String str39 = locale38.getCountry();
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str44 = locale43.toLanguageTag();
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.lang.String str47 = locale46.getCountry();
        java.lang.String str48 = locale46.getLanguage();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean51 = locale50.hasExtensions();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getISO3Language();
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.lang.String str56 = locale55.getCountry();
        java.lang.String str57 = locale55.getCountry();
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale60.getDisplayName();
        java.lang.String str62 = locale60.getDisplayVariant();
        java.util.Locale locale63 = java.util.Locale.ROOT;
        java.lang.String str64 = locale63.getDisplayScript();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getDisplayName();
        java.util.Locale locale67 = java.util.Locale.CANADA;
        java.lang.String str68 = locale67.getISO3Language();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.lang.String str71 = locale69.toLanguageTag();
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.lang.String str74 = locale73.getCountry();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.lang.String str76 = locale75.getDisplayName();
        java.lang.String str77 = locale73.getDisplayScript(locale75);
        java.util.Locale locale78 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale79 = java.util.Locale.JAPAN;
        java.lang.String str80 = locale79.getCountry();
        java.util.Locale locale82 = new java.util.Locale("hi!");
        java.lang.String str83 = locale82.getCountry();
        java.lang.String str84 = locale82.getScript();
        java.util.Locale locale85 = java.util.Locale.CANADA;
        java.lang.String str86 = locale85.getISO3Language();
        java.util.Locale locale87 = java.util.Locale.getDefault();
        java.lang.String str88 = locale87.getDisplayName();
        java.lang.String str89 = locale87.getDisplayVariant();
        java.util.Locale[] localeArray90 = new java.util.Locale[] { locale34, locale36, locale38, locale40, locale41, locale43, locale46, locale50, locale52, locale55, locale58, locale59, locale60, locale63, locale65, locale67, locale69, locale73, locale78, locale79, locale82, locale85, locale87 };
        java.util.ArrayList<java.util.Locale> localeList91 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList91, localeArray90);
        java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList33, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList91);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u5fb7\u6587" + "'", str35, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "JP" + "'", str39, "JP");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "und" + "'", str44, "und");
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "deu" + "'", str53, "deu");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "de");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u5fb7\u6587" + "'", str61, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u5fb7\u6587" + "'", str66, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "eng" + "'", str68, "eng");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u5fb7\u6587" + "'", str70, "\u5fb7\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "de" + "'", str71, "de");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
// flaky:         org.junit.Assert.assertEquals(locale75.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u5fb7\u6587" + "'", str76, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "JP" + "'", str80, "JP");
        org.junit.Assert.assertEquals(locale82.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "eng" + "'", str86, "eng");
        org.junit.Assert.assertNotNull(locale87);
// flaky:         org.junit.Assert.assertEquals(locale87.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\u5fb7\u6587" + "'", str88, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(localeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "halfdays");
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNull(locale95);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology15.getDateTimeMillis(70, 70, (-5914428), (int) '#', (int) (short) -1, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u6587" + "'", str2, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        boolean boolean19 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (-42L), 432000001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 432000001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField5 = gJChronology2.minutes();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = gJChronology2.get(readablePartial6, (-61827926999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.removeUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("DurationField[centuries]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DurationField[centuries] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.DurationField durationField18 = gJChronology2.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = gJChronology2.getDateTimeMillis((long) (byte) -1, (-1), 1582, (int) 'x', (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[Etc/UTC]" + "'", str17, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale2.getLanguage();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        long long14 = gJChronology9.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean16 = gJChronology9.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.dayOfMonth();
        org.joda.time.DurationField durationField18 = gJChronology9.days();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        long long29 = dateTimeZone24.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean31 = dateTimeZone24.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology32 = gJChronology21.withZone(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone24.isLocalDateTimeGap(localDateTime33);
        boolean boolean35 = dateTimeZone24.isFixed();
        org.joda.time.Chronology chronology36 = gJChronology9.withZone(dateTimeZone24);
        boolean boolean37 = locale2.equals((java.lang.Object) dateTimeZone24);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587" + "'", str4, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField11 = gJChronology2.hours();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray19 = new int[] { 100, 4200000, (byte) 1, 432000001, 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial12, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 4200000, 1, 432000001, 1, 0]");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CHN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        org.joda.time.DurationField durationField9 = gJChronology2.weekyears();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology2.get(readablePeriod11, (long) (short) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[Etc/UTC]" + "'", str10, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        long long9 = gJChronology2.add(43201764L, 262974600000L, (int) (short) 100);
        org.joda.time.DurationField durationField10 = gJChronology2.centuries();
        long long13 = durationField10.add(306102434400000L, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 26297503201764L + "'", long9 == 26297503201764L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 309258108000000L + "'", long13 == 309258108000000L);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension(' ', "inglese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        long long16 = instant11.getMillis();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.era();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.centuryOfEra();
        org.joda.time.DurationField durationField22 = gJChronology19.hours();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.dayOfWeek();
        int int25 = instant11.get(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant(52L);
        boolean boolean14 = instant13.isEqualNow();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant13.plus(readableDuration15);
        long long17 = instant13.getMillis();
        java.lang.String str18 = instant13.toString();
        org.joda.time.Instant instant19 = instant13.toInstant();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant13.withDurationAdded(readableDuration20, (int) 'x');
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.yearOfCentury();
        int int28 = instant22.get(dateTimeField27);
        org.joda.time.Instant instant29 = instant22.toInstant();
        int int30 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) instant22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str18, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 70 + "'", int28 == 70);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("seconds");
        double double2 = languageRange1.getWeight();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) 100);
        boolean boolean7 = dateTimeZone4.isFixed();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        int int9 = gJChronology8.getMinimumDaysInFirstWeek();
        java.lang.String str10 = gJChronology8.toString();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = gJChronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.millisOfSecond();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (-8380800000L));
        org.joda.time.Chronology chronology26 = chronology15.withZone(dateTimeZone18);
        boolean boolean27 = languageRange1.equals((java.lang.Object) dateTimeZone18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[Etc/UTC]" + "'", str10, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-8568000000L) + "'", long25 == (-8568000000L));
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        org.joda.time.DurationField durationField12 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = gJChronology2.getDateTimeMillis((int) (byte) 0, 4, (int) '#', (int) '#', 4200000, 1582, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.Chronology chronology6 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePartial7, (-61827926399999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology5.add(readablePeriod8, (long) (short) -1, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology5.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) dateTimeField13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, 747221760000000000L, (-5914428));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -5914428");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray20 = new int[] { 70, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial17, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[70, 1]");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        java.lang.Class<?> wildcardClass5 = gJChronology2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        long long12 = dateTimeZone8.convertLocalToUTC(12888000000L, true, 604800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 12888000000L + "'", long12 == 12888000000L);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.dayOfYear();
        java.lang.String str14 = gJChronology2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[Etc/UTC]" + "'", str14, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.centuryOfEra();
        boolean boolean6 = locale0.equals((java.lang.Object) dateTimeField5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("GB", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DurationField durationField4 = gJChronology2.months();
        java.lang.String str5 = durationField4.getName();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = gJChronology8.halfdays();
        long long12 = durationField9.add((long) 100, 100L);
        boolean boolean13 = durationField9.isPrecise();
        long long16 = durationField9.getValueAsLong(1L, (long) 0);
        int int17 = durationField4.compareTo(durationField9);
        long long20 = durationField9.getMillis((int) (byte) 100, (long) '4');
        long long22 = durationField9.getValueAsLong((long) 4);
        int int25 = durationField9.getDifference(3155760001170L, (long) 'x');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "months" + "'", str5, "months");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4320000100L + "'", long12 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4320000000L + "'", long20 == 4320000000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 73050 + "'", int25 == 73050);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        boolean boolean12 = durationField11.isSupported();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = gJChronology2.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology2.getDateTimeMillis(0, 100, 432000001, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((long) 0, false);
        int int7 = dateTimeZone1.getOffsetFromLocal((-26438399999L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.052' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-61827926399999L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) 100);
        boolean boolean13 = dateTimeZone10.isFixed();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        long long16 = dateTimeZone10.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList21, strMap22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.lang.String[] strArray32 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.FilteringMode filteringMode36 = null;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList33, filteringMode36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.lang.String[] strArray51 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strList54);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        java.lang.String[] strArray65 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList66);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList68);
        boolean boolean70 = dateTimeZone10.equals((java.lang.Object) languageRangeList23);
        long long72 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'u');
        java.lang.String str73 = dateTimeZone1.getID();
        java.lang.String str75 = dateTimeZone1.getNameKey((-52L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61827926999999L) + "'", long8 == (-61827926999999L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5200L + "'", long16 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 117L + "'", long72 == 117L);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Etc/UTC" + "'", str73, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "UTC" + "'", str75, "UTC");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(1431201, (int) (short) 1, 4200000, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setExtension('#', "DurationField[halfdays]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePeriod9, 3155760000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.setRegion("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setUnicodeLocaleKeyword("utc", "cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: utc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology2.getZone();
        java.lang.String str13 = dateTimeZone12.toString();
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        boolean boolean19 = locale16.hasExtensions();
        java.lang.String str20 = dateTimeZone12.getName((-61827739199999L), locale16);
        java.util.Set<java.lang.String> strSet21 = locale16.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u6cd5\u6587" + "'", str18, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        long long9 = instant8.getMillis();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = gJChronology12.halfdays();
        long long17 = gJChronology12.add((long) 'a', (-1L), (int) (short) 0);
        long long21 = gJChronology12.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField22 = gJChronology12.years();
        org.joda.time.Instant instant23 = gJChronology12.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology12.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime25 = instant8.toMutableDateTime((org.joda.time.Chronology) gJChronology12);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = gJChronology12.get(readablePeriod26, 35000L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5200L + "'", long21 == 5200L);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese(taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.removeUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        boolean boolean2 = instant0.isBefore(0L);
        org.joda.time.Instant instant4 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant6 = instant4.withMillis((long) 'u');
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        long long14 = gJChronology9.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean16 = gJChronology9.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology9.clockhourOfHalfday();
        org.joda.time.DateTime dateTime21 = instant4.toDateTime((org.joda.time.Chronology) gJChronology9);
        boolean boolean22 = instant0.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = instant0.get(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant12 = instant9.plus((long) (short) 100);
        java.lang.String str13 = instant9.toString();
        boolean boolean15 = instant9.isBefore((-3155695200000L));
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = instant9.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str4, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str13, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        org.joda.time.DurationField durationField8 = gJChronology2.minutes();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        java.lang.String str16 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = gJChronology2.get(readablePeriod17, 26297503201764L, 5200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[Etc/UTC]" + "'", str16, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("seconds");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField5 = gJChronology4.halfdays();
        long long9 = gJChronology4.add((long) 'a', (-1L), (int) (short) 0);
        long long13 = gJChronology4.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology4.minuteOfHour();
        org.joda.time.DurationField durationField15 = gJChronology4.hours();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology4.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology4.millisOfSecond();
        org.joda.time.DurationField durationField18 = gJChronology4.months();
        org.joda.time.DurationField durationField19 = gJChronology4.hours();
        boolean boolean20 = languageRange1.equals((java.lang.Object) durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5200L + "'", long13 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        boolean boolean11 = dateTimeZone1.isStandardOffset(43200100L);
        java.util.Locale locale15 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale.setDefault(locale16);
        java.lang.String str19 = locale15.getDisplayLanguage(locale16);
        java.lang.String str20 = locale16.getVariant();
        java.lang.String str21 = locale16.getCountry();
        java.util.Locale locale24 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        boolean boolean26 = locale25.hasExtensions();
        java.util.Locale.setDefault(locale25);
        java.lang.String str28 = locale24.getDisplayLanguage(locale25);
        java.lang.String str29 = locale25.getVariant();
        java.lang.String str30 = locale16.getDisplayName(locale25);
        java.lang.String str31 = dateTimeZone1.getShortName((-2208729599948L), locale25);
        java.util.Set<java.lang.Character> charSet32 = locale25.getExtensionKeys();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals(locale15.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "utc" + "'", str19, "utc");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale24.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "utc" + "'", str28, "utc");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertNotNull(charSet32);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (United States)", (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.weekyear();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePartial15, (-3155673600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = gJChronology8.halfdays();
        long long12 = durationField9.add((long) 100, 100L);
        boolean boolean13 = durationField9.isPrecise();
        long long16 = durationField9.getValueAsLong(1L, (long) 0);
        long long19 = durationField9.subtract((long) '#', (int) '4');
        int int20 = durationField5.compareTo(durationField9);
        org.joda.time.DurationFieldType durationFieldType21 = durationField9.getType();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4320000100L + "'", long12 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2246399965L) + "'", long19 == (-2246399965L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        java.lang.String str7 = locale4.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale4.getUnicodeLocaleType("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.removeUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension(' ', "United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = gJChronology2.get(readablePeriod18, (long) 1431201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[Etc/UTC]" + "'", str17, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology2.add(readablePeriod13, (long) '#', (int) (byte) 1);
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.set(readablePartial17, (-220870497598236L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.setRegion("CN");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setRegion("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-64983772799999L));
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dateTime2.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePeriod7, (-1L), (-2246399965L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis((int) (byte) 10, (int) ' ', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Etc/UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.Chronology chronology6 = gJChronology2.withUTC();
        org.joda.time.Instant instant7 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePeriod9, 5200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant(52L);
        boolean boolean3 = instant2.isEqualNow();
        java.lang.String str4 = instant2.toString();
        java.lang.String str5 = instant2.toString();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(52L);
        boolean boolean8 = instant7.isEqualNow();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant7.plus(readableDuration9);
        boolean boolean11 = instant2.isBefore((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant2.minus((long) 0);
        org.joda.time.Instant instant15 = new org.joda.time.Instant(52L);
        boolean boolean16 = instant15.isEqualNow();
        java.lang.String str17 = instant15.toString();
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        java.lang.String str21 = instant19.toString();
        java.lang.String str22 = instant19.toString();
        org.joda.time.Instant instant25 = instant19.withDurationAdded(115200000L, (int) (short) 1);
        int int26 = instant15.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant28 = new org.joda.time.Instant(52L);
        boolean boolean29 = instant28.isEqualNow();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant28.plus(readableDuration30);
        boolean boolean33 = instant31.equals((java.lang.Object) ' ');
        boolean boolean34 = instant19.isAfter((org.joda.time.ReadableInstant) instant31);
        boolean boolean35 = instant2.isEqual((org.joda.time.ReadableInstant) instant31);
        org.joda.time.ReadableInstant readableInstant36 = null;
        boolean boolean37 = instant2.isBefore(readableInstant36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant2, 1431201);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 1431201");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str4, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str5, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str17, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str21, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        long long10 = durationField7.add(747221760000000000L, (-8380800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 747221751619200000L + "'", long10 == 747221751619200000L);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology2.add(readablePeriod7, (long) '4', (int) (byte) -1);
        org.joda.time.DurationField durationField11 = gJChronology2.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis(432000001, (int) 'x', 70, 73050, (int) 'u', (int) (short) 100, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73050 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.halfdays();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        long long22 = dateTimeZone17.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean24 = dateTimeZone17.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology25 = gJChronology14.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone17.isLocalDateTimeGap(localDateTime26);
        boolean boolean28 = dateTimeZone17.isFixed();
        org.joda.time.Chronology chronology29 = gJChronology2.withZone(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (-220870497598236L), 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray20 = new int[] { (byte) 1, 'u', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial16, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 117, 100]");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.Chronology chronology11 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis(70, (int) (byte) 1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[Etc/UTC]" + "'", str10, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology4.getDateTimeMillis(1582, (int) ' ', (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gJChronology2.get(readablePeriod4, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis(73050, 0, 52, (int) (short) 1, 1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        org.joda.time.DurationField durationField9 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField10 = gJChronology2.minutes();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        boolean boolean3 = instant1.isBefore(0L);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant7 = instant5.withMillis((long) 'u');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.halfdays();
        long long15 = gJChronology10.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean17 = gJChronology10.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology10.clockhourOfHalfday();
        org.joda.time.DateTime dateTime22 = instant5.toDateTime((org.joda.time.Chronology) gJChronology10);
        boolean boolean23 = instant1.isEqual((org.joda.time.ReadableInstant) dateTime22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.Instant instant11 = gJChronology2.getGregorianCutover();
        java.lang.String str12 = gJChronology2.toString();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.set(readablePartial13, (-3155673600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[Etc/UTC]" + "'", str12, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        org.joda.time.DurationField durationField9 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField10 = gJChronology2.minutes();
        long long13 = durationField10.subtract((long) (-6720000), (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-6720000L) + "'", long13 == (-6720000L));
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.Chronology chronology6 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(4200000, 52, (int) 'u', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField14 = gJChronology2.years();
        org.joda.time.DurationField durationField15 = gJChronology2.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis((int) (byte) 100, 1431201, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1431201 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        int int10 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        int int6 = durationField3.getDifference(262974670000L, 3964200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5995 + "'", int6 == 5995);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis(4200000, 100, 4200000, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        long long10 = gJChronology2.add(97L, (long) (byte) 100, 0);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology2.get(readablePeriod13, (-3155673600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = gJChronology2.getDateTimeMillis((int) (byte) 0, (int) '4', 1431201, (int) (short) 0, 5995, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5995 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[Etc/UTC]" + "'", str17, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("millis");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: millis [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("DurationField[halfdays]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DurationField[halfdays] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setRegion("DurationField[weekyears]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: DurationField[weekyears] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguageTag("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(1970, (-6720000), 4200000, 73050, 100, (int) (short) 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73050 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (-4199880L), 1582);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 1582");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale4.getDisplayLanguage(locale5);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = locale4.getDisplayVariant(locale7);
        java.lang.String str10 = locale4.getDisplayName();
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.Object obj12 = locale4.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (Taiwan)" + "'", str10, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u52a0\u62ff\u5927" + "'", str11, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "zh_TW");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        boolean boolean20 = dateTimeZone12.equals((java.lang.Object) locale17);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone12);
        org.joda.time.ReadablePartial readablePartial22 = null;
        int[] intArray25 = new int[] { 'u', 'u' };
        // The following exception was thrown during execution in test generation
        try {
            chronology21.validate(readablePartial22, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "halfdays");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "halfdays" + "'", str18, "halfdays");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[117, 117]");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add(0L, (long) (short) -1, (int) '4');
        org.joda.time.DurationField durationField8 = gJChronology2.weekyears();
        int int11 = durationField8.getDifference((long) (short) 1, (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-52L) + "'", long7 == (-52L));
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1959 + "'", int11 == 1959);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        long long8 = gJChronology2.add((long) (byte) 0, 4324200000L, 4);
        long long12 = gJChronology2.add(3155760000000L, (long) (short) 10, (int) 'u');
        org.joda.time.DurationField durationField13 = gJChronology2.weekyears();
        java.lang.String str14 = durationField13.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = durationField13.add(349200000L, 306102434400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 306102434400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17296800000L + "'", long8 == 17296800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3155760001170L + "'", long12 == 3155760001170L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DurationField[weekyears]" + "'", str14, "DurationField[weekyears]");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.Chronology chronology18 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        long long14 = gJChronology9.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean16 = gJChronology9.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.dayOfMonth();
        org.joda.time.DurationField durationField18 = gJChronology9.millis();
        int int19 = durationField3.compareTo(durationField18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = durationField3.getDifference(747221760000000000L, 97000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 17296799999");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("DurationField[months]", "tedesco");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: DurationField[months] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField5 = chronology4.seconds();
        int int8 = durationField5.getDifference((long) (-1), (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField5.getMillis((-22087032463023600L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -22087032463023600 * 1000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        long long10 = gJChronology2.add(97L, (long) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((long) (short) -1, (int) '4', 100, 73050, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = gJChronology1.getDateTimeMillis((int) (short) 1, 5995, 1970, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5995 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology1);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.setRegion("CN");
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = locale14.getDisplayName();
        java.util.Locale.Builder builder16 = builder9.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder9.setExtension('x', "\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        org.joda.time.DurationField durationField6 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField8 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.era();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(262974600000L, (int) 'a', (int) (short) 100, (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = gJChronology11.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology11.getDateTimeMillis(1959, 1970, 1959, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        boolean boolean8 = dateTimeField7.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add(0L, (long) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfYear();
        java.lang.String str16 = gJChronology10.toString();
        org.joda.time.DurationField durationField17 = gJChronology10.years();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.joda.time.Chronology chronology22 = gJChronology10.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology23 = gJChronology2.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField24 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology2.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = gJChronology2.get(readablePeriod26, 3155760000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-52L) + "'", long7 == (-52L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[Etc/UTC]" + "'", str16, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gJChronology2.get(readablePartial4, 3964200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = gJChronology18.get(readablePeriod19, 1512000000L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setLanguage("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US_#u-deu");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setScript("english (united states)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: english (united states) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("en", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("972022-02-11T09:43:15.789Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 972022-02-11T09:43:15.789Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        int int8 = durationField3.getValue((long) 'a');
        long long11 = durationField3.subtract((long) 1582, (long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-431998418L) + "'", long11 == (-431998418L));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.lang.String str20 = locale19.getCountry();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale19.getDisplayScript(locale21);
        boolean boolean24 = dateTimeZone16.equals((java.lang.Object) locale21);
        org.joda.time.Chronology chronology25 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = chronology25.get(readablePeriod26, 186805440000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        long long7 = dateTimeZone1.adjustOffset((long) (short) 10, true);
        int int9 = dateTimeZone1.getOffset(1L);
        int int11 = dateTimeZone1.getOffset(262974605200L);
        int int13 = dateTimeZone1.getOffsetFromLocal(3732480000000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = gJChronology11.millis();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology11.get(readablePeriod15, (-23458387L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((int) (short) 10, (int) 'x', (int) '#', 1970, (-6720000), 73050, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.Locale locale3 = new java.util.Locale("weekyears", "DurationField[millis]", "inglese");
        org.junit.Assert.assertEquals(locale3.toString(), "weekyears_DURATIONFIELD[MILLIS]_inglese");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        boolean boolean7 = locale6.hasExtensions();
        java.lang.String str8 = locale6.getISO3Language();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale10.getDisplayLanguage(locale11);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = locale10.getDisplayVariant(locale13);
        java.lang.String str16 = locale10.getDisplayName();
        java.util.Locale.setDefault(category5, locale10);
        java.util.Locale locale18 = java.util.Locale.getDefault(category5);
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Locale.Builder builder21 = builder3.setLocale(locale18);
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = locale23.getDisplayScript();
        java.util.Locale.Builder builder25 = builder3.setLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.setVariant("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eng" + "'", str14, "eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str16, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.halfdays();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePartial15, 5185792L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology2.months();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField9.getMillis(3155760000000L, (-61827739199999L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 3155760000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.set(readablePartial10, 262974670000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        long long10 = gJChronology2.add(97L, (long) (byte) 100, 0);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = gJChronology2.get(readablePeriod13, (long) (byte) 100, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = gJChronology2.get(readablePeriod19, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant12 = new org.joda.time.Instant(52L);
        boolean boolean13 = instant12.isEqualNow();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.plus(readableDuration14);
        long long16 = instant12.getMillis();
        java.lang.String str17 = instant12.toString();
        org.joda.time.Instant instant18 = instant12.toInstant();
        boolean boolean19 = instant9.isAfter((org.joda.time.ReadableInstant) instant12);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.era();
        org.joda.time.DurationField durationField24 = gJChronology22.months();
        long long27 = durationField24.subtract((long) (short) 1, 10L);
        boolean boolean28 = instant9.equals((java.lang.Object) durationField24);
        java.lang.String str29 = durationField24.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str4, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str17, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-26438399999L) + "'", long27 == (-26438399999L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "months" + "'", str29, "months");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField5 = gJChronology2.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis(1970, (int) 'x', (int) ' ', 1431201, (int) (short) -1, 4200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1431201 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("Etc/UTC", "\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Etc/UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime(chronology4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant(52L);
        boolean boolean8 = instant7.isEqualNow();
        org.joda.time.Instant instant10 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant12 = instant10.withMillis((long) 'u');
        boolean boolean13 = instant7.isAfter((org.joda.time.ReadableInstant) instant10);
        boolean boolean14 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) instant10);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.minuteOfDay();
        org.joda.time.DurationField durationField21 = gJChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.dayOfYear();
        java.lang.String str23 = gJChronology17.toString();
        org.joda.time.DurationField durationField24 = gJChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology17.clockhourOfHalfday();
        org.joda.time.DateTime dateTime26 = mutableDateTime5.toDateTime((org.joda.time.Chronology) gJChronology17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GJChronology[Etc/UTC]" + "'", str23, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology9.getDateTimeMillis((int) 'x', (int) (short) 100, 73050, 0, (int) (byte) 100, (int) (byte) 100, (-5914428));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.halfdayOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        long long30 = gJChronology25.add((long) 'a', (-1L), (int) (short) 0);
        long long34 = gJChronology25.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField35 = gJChronology25.years();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology25.getZone();
        org.joda.time.Chronology chronology38 = gJChronology2.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology2.days();
        org.joda.time.DurationField durationField40 = gJChronology2.years();
        long long41 = durationField40.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[Etc/UTC]" + "'", str19, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5200L + "'", long34 == 5200L);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 31556952000L + "'", long41 == 31556952000L);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayScript(locale4);
        java.lang.String str9 = locale1.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray10 = new int[] { 1582 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial8, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1582]");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        long long19 = durationField16.getMillis((long) 'a', (-8380800000L));
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.DurationField durationField23 = gJChronology22.years();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = gJChronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.minuteOfDay();
        org.joda.time.DurationField durationField30 = gJChronology26.centuries();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = gJChronology33.halfdays();
        long long37 = durationField34.add((long) 100, 100L);
        boolean boolean38 = durationField34.isPrecise();
        int int39 = durationField30.compareTo(durationField34);
        boolean boolean40 = gJChronology22.equals((java.lang.Object) durationField30);
        long long43 = durationField30.getMillis(1L, 0L);
        int int44 = durationField16.compareTo(durationField30);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = durationField16.getDifference((-740275200000000000L), 117L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -740275200000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97000L + "'", long19 == 97000L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4320000100L + "'", long37 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3155760000000L + "'", long43 == 3155760000000L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant5.plus(readableDuration7);
        boolean boolean10 = instant8.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, 4320000000L);
        boolean boolean18 = instant8.equals((java.lang.Object) 4320000000L);
        org.joda.time.Instant instant20 = instant8.withMillis(10L);
        boolean boolean21 = locale2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u6587" + "'", str1, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4324200000L + "'", long17 == 4324200000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod11, 306102434400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale locale3 = new java.util.Locale("zh", "en", "");
        boolean boolean4 = locale3.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-US");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_EN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod7, 42600100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology2.get(readablePeriod12, 262974600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = gJChronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.minuteOfDay();
        org.joda.time.DurationField durationField24 = gJChronology20.centuries();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.halfdayOfDay();
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        boolean boolean30 = gJChronology20.equals((java.lang.Object) locale28);
        org.joda.time.DateTime dateTime31 = instant7.toDateTime((org.joda.time.Chronology) gJChronology20);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = gJChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.minuteOfDay();
        org.joda.time.DurationField durationField38 = gJChronology34.centuries();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology34.dayOfYear();
        java.lang.String str40 = gJChronology34.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology34.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology34.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology34.clockhourOfDay();
        org.joda.time.DurationField durationField44 = gJChronology34.months();
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime31.toMutableDateTime((org.joda.time.Chronology) gJChronology34);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = dateTime31.get(dateTimeFieldType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GJChronology[Etc/UTC]" + "'", str40, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.yearOfEra();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray13 = new int[] { 35, 52, (short) 0, (byte) 1, 1970 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial7, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 52, 0, 1, 1970]");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        org.joda.time.DurationField durationField12 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePartial15, (long) 1582);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        java.lang.String str10 = locale6.getCountry();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.Object obj14 = locale6.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "zh");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        boolean boolean25 = instant8.equals((java.lang.Object) 349200L);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.CANADA;
        java.lang.String str33 = locale32.getDisplayVariant();
        java.util.Locale locale34 = java.util.Locale.JAPAN;
        java.lang.String str35 = locale34.getCountry();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str40 = locale39.toLanguageTag();
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.lang.String str43 = locale42.getCountry();
        java.lang.String str44 = locale42.getLanguage();
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean47 = locale46.hasExtensions();
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale48.getISO3Language();
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.lang.String str52 = locale51.getCountry();
        java.lang.String str53 = locale51.getCountry();
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale56.getDisplayName();
        java.lang.String str58 = locale56.getDisplayVariant();
        java.util.Locale locale59 = java.util.Locale.ROOT;
        java.lang.String str60 = locale59.getDisplayScript();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale61.getDisplayName();
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.lang.String str64 = locale63.getISO3Language();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getDisplayLanguage();
        java.lang.String str67 = locale65.toLanguageTag();
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.lang.String str70 = locale69.getCountry();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale71.getDisplayName();
        java.lang.String str73 = locale69.getDisplayScript(locale71);
        java.util.Locale locale74 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale75 = java.util.Locale.JAPAN;
        java.lang.String str76 = locale75.getCountry();
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.lang.String str79 = locale78.getCountry();
        java.lang.String str80 = locale78.getScript();
        java.util.Locale locale81 = java.util.Locale.CANADA;
        java.lang.String str82 = locale81.getISO3Language();
        java.util.Locale locale83 = java.util.Locale.getDefault();
        java.lang.String str84 = locale83.getDisplayName();
        java.lang.String str85 = locale83.getDisplayVariant();
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale30, locale32, locale34, locale36, locale37, locale39, locale42, locale46, locale48, locale51, locale54, locale55, locale56, locale59, locale61, locale63, locale65, locale69, locale74, locale75, locale78, locale81, locale83 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList29, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale locale90 = java.util.Locale.lookup(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList87);
        boolean boolean91 = instant8.equals((java.lang.Object) locale90);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = locale90.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for halfdays");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str13, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str14, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587" + "'", str31, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JP" + "'", str35, "JP");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "und" + "'", str40, "und");
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u6587" + "'", str57, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u4e2d\u6587" + "'", str62, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "eng" + "'", str64, "eng");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u6587" + "'", str66, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh" + "'", str67, "zh");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\u4e2d\u6587" + "'", str72, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "JP" + "'", str76, "JP");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "eng" + "'", str82, "eng");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\u4e2d\u6587" + "'", str84, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "halfdays");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        java.lang.String str4 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) (short) 100, (-1), 35, 52, (int) (byte) 0, 52, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[Etc/UTC]" + "'", str4, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DurationField durationField4 = gJChronology2.months();
        java.lang.String str5 = durationField4.getName();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = gJChronology8.halfdays();
        long long12 = durationField9.add((long) 100, 100L);
        boolean boolean13 = durationField9.isPrecise();
        long long16 = durationField9.getValueAsLong(1L, (long) 0);
        int int17 = durationField4.compareTo(durationField9);
        int int20 = durationField9.getDifference(0L, (-61827926399999L));
        long long23 = durationField9.subtract((long) 1970, (long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "months" + "'", str5, "months");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4320000100L + "'", long12 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1431201 + "'", int20 == 1431201);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-431998030L) + "'", long23 == (-431998030L));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((-2246399965L), true);
        long long10 = dateTimeZone1.convertLocalToUTC(4320000000L, true, (long) 'a');
        org.joda.time.Instant instant12 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.millisOfSecond();
        int int17 = instant12.get(dateTimeField16);
        org.joda.time.Instant instant19 = instant12.plus(0L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.DurationField durationField23 = gJChronology22.halfdays();
        org.joda.time.Chronology chronology24 = gJChronology22.withUTC();
        java.lang.String str25 = gJChronology22.toString();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology22.hourOfHalfday();
        int int27 = instant12.get(dateTimeField26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2246399965L) + "'", long6 == (-2246399965L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4320000000L + "'", long10 == 4320000000L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GJChronology[Etc/UTC]" + "'", str25, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.util.Locale.setDefault(category0, locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale10.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ??");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u82f1\u6587");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = gJChronology5.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.weekyear();
        org.joda.time.DurationField durationField8 = gJChronology5.centuries();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (-61827926399999L));
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str21 = dateTimeZone19.getNameKey((long) 100);
        boolean boolean22 = dateTimeZone19.isFixed();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        long long25 = dateTimeZone19.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList30, strMap31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.lang.String[] strArray41 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.FilteringMode filteringMode45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList42, filteringMode45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.lang.String[] strArray60 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList51, (java.util.Collection<java.lang.String>) strList63);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList64);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        java.lang.String[] strArray74 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList77);
        boolean boolean79 = dateTimeZone19.equals((java.lang.Object) languageRangeList32);
        long long81 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (long) 'u');
        java.lang.String str82 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology83 = gJChronology5.withZone(dateTimeZone10);
        int int85 = dateTimeZone10.getStandardOffset(432000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926999999L) + "'", long17 == (-61827926999999L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5200L + "'", long25 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 117L + "'", long81 == 117L);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Etc/UTC" + "'", str82, "Etc/UTC");
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis((int) (byte) -1, 1959, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology2.add(readablePeriod7, (long) '4', (int) (byte) -1);
        org.joda.time.DurationField durationField11 = gJChronology2.weekyears();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology2.get(readablePeriod12, 152L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.halfdays();
        int int11 = durationField9.getValue(4320000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.Chronology chronology6 = gJChronology2.withUTC();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long6 = durationField3.add((long) 100, 100L);
        int int8 = durationField3.getValue((long) 'a');
        long long10 = durationField3.getMillis(17296800000L);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = durationField3.subtract(152L, 259200006000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -259200006000000 * 43200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4320000100L + "'", long6 == 4320000100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 747221760000000000L + "'", long10 == 747221760000000000L);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField8 = gJChronology2.years();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis(747159923736000000L, 97, (int) 'u', 0, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        int int10 = gJChronology2.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(4200000, (int) (byte) 0, 73050, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.Chronology chronology10 = gJChronology2.withUTC();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey((long) 100);
        boolean boolean15 = dateTimeZone12.isFixed();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        int int17 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology16.add(readablePeriod19, (long) (short) -1, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology16.getZone();
        org.joda.time.Chronology chronology24 = chronology10.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = chronology10.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.year();
        org.joda.time.ReadablePartial readablePartial22 = null;
        int[] intArray28 = new int[] { 4, 70, (-1), (-5914428), 'x' };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology20.validate(readablePartial22, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[4, 70, -1, -5914428, 120]");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = gJChronology5.hours();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        long long14 = gJChronology9.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.secondOfMinute();
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        boolean boolean22 = gJChronology9.equals((java.lang.Object) instant18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = instant18.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = instant18.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = instant18.getZone();
        long long29 = dateTimeZone27.nextTransition(349200L);
        org.joda.time.Chronology chronology30 = gJChronology5.withZone(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = chronology30.getDateTimeMillis((long) (short) 0, (int) (byte) 1, (-6720000), 100, 97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6720000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349200L + "'", long29 == 349200L);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis(0, 4, 10, 73050);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = gJChronology2.getDateTimeMillis((int) 'a', (int) 'u', 1582, 73050, (int) (byte) -1, (int) 'x', (-5914428));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73050 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Locale locale3 = new java.util.Locale("zh", "en", "");
        boolean boolean4 = locale3.hasExtensions();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.minuteOfDay();
        org.joda.time.DurationField durationField11 = gJChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.year();
        org.joda.time.DurationField durationField14 = gJChronology7.weekyears();
        java.lang.String str15 = gJChronology7.toString();
        boolean boolean16 = locale3.equals((java.lang.Object) str15);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_EN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[Etc/UTC]" + "'", str15, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis(1959, 1959, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DurationField durationField6 = gJChronology2.eras();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray14 = new int[] { 1959, (-6720000), 10, 52, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial7, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1959, -6720000, 10, 52, 1, 100]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str3 = locale0.getUnicodeLocaleType("it");
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_GB");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology2.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(73050, 100, 432000001, 1582);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.era();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology9.add(readablePeriod13, (-26438399999L), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = gJChronology9.getDateTimeMillis((int) ' ', (int) 'u', 1970, 35, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-26438399999L) + "'", long16 == (-26438399999L));
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguage("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("seconds");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        boolean boolean6 = languageRange1.equals((java.lang.Object) locale5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "seconds" + "'", str3, "seconds");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.Class<?> wildcardClass1 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.setLanguageTag("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.years();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.minuteOfDay();
        org.joda.time.DurationField durationField10 = gJChronology6.centuries();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        long long17 = durationField14.add((long) 100, 100L);
        boolean boolean18 = durationField14.isPrecise();
        int int19 = durationField10.compareTo(durationField14);
        boolean boolean20 = gJChronology2.equals((java.lang.Object) durationField10);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = gJChronology2.getDateTimeMillis((int) 'a', (int) (byte) 1, 1959, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1959 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4320000100L + "'", long17 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: cinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.halfdayOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        long long30 = gJChronology25.add((long) 'a', (-1L), (int) (short) 0);
        long long34 = gJChronology25.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField35 = gJChronology25.years();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology25.getZone();
        org.joda.time.Chronology chronology38 = gJChronology2.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology2.days();
        org.joda.time.DurationField durationField40 = gJChronology2.years();
        int int43 = durationField40.getValue(14452100L, 5200L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[Etc/UTC]" + "'", str19, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5200L + "'", long34 == 5200L);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis(432000001, (int) (short) 10, (-5914428), (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 432000001 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        boolean boolean4 = instant1.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = instant1.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = instant1.isSupported(dateTimeFieldType7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        org.joda.time.Chronology chronology19 = gJChronology11.withZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = instant1.toMutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant23 = instant1.withDurationAdded(readableDuration21, 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[Etc/UTC]" + "'", str14, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        long long12 = dateTimeZone1.convertLocalToUTC((long) 'a', true, 0L);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long21 = dateTimeZone14.getMillisKeepLocal(dateTimeZone19, (-61827926399999L));
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = dateTimeZone19.getShortName(186805440000000000L, locale23);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 43200100L);
        java.util.Locale locale30 = new java.util.Locale("hi!");
        java.lang.String str31 = locale30.getCountry();
        java.lang.String str32 = locale30.getLanguage();
        java.lang.String str33 = locale30.getDisplayVariant();
        java.lang.String str34 = dateTimeZone19.getShortName(12888000000L, locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = locale30.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61827926999999L) + "'", long21 == (-61827926999999L));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese" + "'", str24, "Chinese");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:10" + "'", str25, "+00:10");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 42600100L + "'", long27 == 42600100L);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:10" + "'", str34, "+00:10");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.plus(readableDuration11);
        long long13 = instant9.getMillis();
        java.lang.Object obj14 = null;
        boolean boolean15 = instant9.equals(obj14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.plus(readableDuration19);
        long long21 = instant17.getMillis();
        java.lang.String str22 = instant17.toString();
        org.joda.time.Instant instant23 = instant17.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant17.withDurationAdded(readableDuration24, (int) 'x');
        org.joda.time.Instant instant27 = instant17.toInstant();
        int int28 = instant9.compareTo((org.joda.time.ReadableInstant) instant17);
        boolean boolean29 = instant1.isBefore((org.joda.time.ReadableInstant) instant17);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = gJChronology32.halfdays();
        long long37 = gJChronology32.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology32.secondOfMinute();
        org.joda.time.Instant instant41 = new org.joda.time.Instant(52L);
        boolean boolean42 = instant41.isEqualNow();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant41.plus(readableDuration43);
        boolean boolean45 = gJChronology32.equals((java.lang.Object) instant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant41.isSupported(dateTimeFieldType46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant41.isSupported(dateTimeFieldType48);
        java.lang.String str50 = instant41.toString();
        boolean boolean51 = instant1.isAfter((org.joda.time.ReadableInstant) instant41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = instant1.toString(dateTimeFormatter52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = instant1.get(dateTimeFieldType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str50, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str53, "1970-01-01T00:00:00.052Z");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        org.joda.time.DurationField durationField19 = gJChronology18.eras();
        java.lang.String str20 = durationField19.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = durationField19.subtract(1104493320000L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eras" + "'", str20, "eras");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        long long15 = gJChronology2.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DurationField durationField16 = gJChronology2.years();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str20 = dateTimeZone18.getNameKey((long) 100);
        boolean boolean21 = dateTimeZone18.isFixed();
        java.lang.String str22 = dateTimeZone18.toString();
        boolean boolean24 = dateTimeZone18.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.Chronology chronology26 = gJChronology2.withZone(dateTimeZone18);
        org.joda.time.ReadablePartial readablePartial27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long29 = gJChronology2.set(readablePartial27, 4000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Etc/UTC" + "'", str22, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale0.getDisplayCountry(locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        boolean boolean11 = locale3.equals((java.lang.Object) builder10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder4.setUnicodeLocaleKeyword("", "+00:01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        org.joda.time.DurationField durationField9 = gJChronology2.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology2.add(readablePeriod10, 0L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePeriod15, (long) 87696);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        java.lang.String str10 = gJChronology2.toString();
        int int11 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology12.set(readablePartial13, (long) 87696);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[Etc/UTC]" + "'", str10, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology2.getZone();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfSecond();
        int int21 = instant16.get(dateTimeField20);
        org.joda.time.Instant instant23 = instant16.plus(0L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = gJChronology26.halfdays();
        org.joda.time.Chronology chronology28 = gJChronology26.withUTC();
        java.lang.String str29 = gJChronology26.toString();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.hourOfHalfday();
        int int31 = instant16.get(dateTimeField30);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = gJChronology34.halfdays();
        long long39 = gJChronology34.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology34.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology34.secondOfMinute();
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant46 = instant43.plus(readableDuration45);
        boolean boolean47 = gJChronology34.equals((java.lang.Object) instant43);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant43.isSupported(dateTimeFieldType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = instant43.isSupported(dateTimeFieldType50);
        org.joda.time.DateTimeZone dateTimeZone52 = instant43.getZone();
        boolean boolean53 = instant16.isAfter((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Instant instant55 = instant16.minus((long) 70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant55, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GJChronology[Etc/UTC]" + "'", str29, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(instant55);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        long long8 = gJChronology2.add((long) (byte) 0, 4324200000L, 4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePeriod9, (-2208729596000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17296800000L + "'", long8 == 17296800000L);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = durationField4.getDifference(186641343849600000L, (-22087032463023600L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 208728376312623600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.era();
        org.joda.time.DurationField durationField8 = gJChronology5.centuries();
        long long11 = durationField8.getMillis(100L, 31556952000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 315569520000000L + "'", long11 == 315569520000000L);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = gJChronology2.millis();
        org.joda.time.DurationField durationField7 = gJChronology2.halfdays();
        int int9 = durationField7.getValue((long) (byte) 100);
        long long11 = durationField7.getValueAsLong(747159923736000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 17295368605L + "'", long11 == 17295368605L);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField11 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis(97, 35, 432086114, 1431201, 73050, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1431201 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English (United States)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfMonth();
        boolean boolean16 = dateTimeField15.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        int int10 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology2.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis(5200L, 52, 4200000, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        boolean boolean20 = dateTimeZone12.equals((java.lang.Object) locale17);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = gJChronology2.set(readablePartial24, 259200006000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC]" + "'", str8, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setVariant("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: cinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayScript(locale4);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayLanguage(locale11);
        java.lang.String str14 = locale1.getDisplayScript(locale11);
        java.lang.String str15 = locale11.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "de" + "'", str15, "de");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone11 = instant1.getZone();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology14.millis();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology14.add(readablePeriod17, (long) 'a', (int) '4');
        org.joda.time.DateTimeField dateTimeField21 = gJChronology14.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology14);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        long long33 = dateTimeZone28.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean35 = dateTimeZone28.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology36 = gJChronology25.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone28.isLocalDateTimeGap(localDateTime37);
        int int40 = dateTimeZone28.getStandardOffset(4320000000L);
        org.joda.time.DateTime dateTime41 = mutableDateTime22.toDateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str6, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField14 = gJChronology2.years();
        org.joda.time.DurationField durationField15 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.set(readablePartial17, 49923098064000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        long long13 = gJChronology2.add(262974600000L, (long) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long21 = gJChronology2.getDateTimeMillis(100, 4200000, (int) 'u', (-1), (-6720000), (int) (byte) 100, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 262974605200L + "'", long13 == 262974605200L);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant25 = instant23.withMillis((long) 'u');
        boolean boolean26 = instant18.isBefore((org.joda.time.ReadableInstant) instant23);
        boolean boolean27 = instant1.isEqual((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = instant23.get(dateTimeFieldType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[Etc/UTC]" + "'", str14, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        long long13 = gJChronology2.add(262974600000L, (long) (byte) 100, (int) '4');
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = gJChronology2.weeks();
        long long18 = durationField15.add(262974600000L, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 262974605200L + "'", long13 == 262974605200L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 262974600000L + "'", long18 == 262974600000L);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology2.getZone();
        long long7 = dateTimeZone5.nextTransition(4320000000L);
        boolean boolean9 = dateTimeZone5.isStandardOffset(3155760001170L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.weekyearOfCentury();
        org.joda.time.Instant instant15 = gJChronology12.getGregorianCutover();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.millisOfSecond();
        int int24 = instant19.get(dateTimeField23);
        org.joda.time.Instant instant26 = instant19.plus(0L);
        int int27 = instant17.compareTo((org.joda.time.ReadableInstant) instant26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = gJChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.minuteOfDay();
        org.joda.time.DurationField durationField34 = gJChronology30.centuries();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology30.halfdayOfDay();
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale36.getDisplayVariant(locale38);
        boolean boolean40 = gJChronology30.equals((java.lang.Object) locale38);
        org.joda.time.DateTime dateTime41 = instant17.toDateTime((org.joda.time.Chronology) gJChronology30);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) dateTime41);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = gJChronology42.getDateTimeMillis((int) (short) 100, (-1), (int) 'u', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4320000000L + "'", long7 == 4320000000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(gJChronology42);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("3929-04-02T00:00:00.051Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.year();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = gJChronology20.getDateTimeMillis(600000, (int) (short) 0, 70, (int) (byte) -1, (int) '4', 73050, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(100, 5995, 0, 52, 1431201, 1970, 87696);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[Etc/UTC]" + "'", str5, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.setRegion("CN");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setUnicodeLocaleKeyword("+00:00", "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((-6720000), (int) (short) 1, 1970, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        org.joda.time.DurationField durationField12 = gJChronology2.seconds();
        long long13 = durationField12.getUnitMillis();
        int int16 = durationField12.getValue((long) 1, 117L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1000L + "'", long13 == 1000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) "Canada");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Canada\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DurationField durationField18 = gJChronology2.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'French' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("CA", "DurationField[millis]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: DurationField[millis] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }
}
