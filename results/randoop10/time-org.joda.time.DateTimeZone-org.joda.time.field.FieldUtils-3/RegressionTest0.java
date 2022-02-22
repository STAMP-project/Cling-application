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
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        long long6 = java.util.Date.UTC((int) (byte) 0, (int) (short) 10, 1, (int) (byte) 1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2182719659000L) + "'", long6 == (-2182719659000L));
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 100, (int) '4', 0, (int) (short) 0, (int) (byte) 1, (int) (short) 1, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 10, 0, 0, (int) 'a', 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "hi!");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 0, (int) 'a', (int) '4', (int) (byte) 1, 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) property3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("45");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 45 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) durationFieldType0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(6, (int) (byte) 1, 2, 53625, (int) '4', 0, 0, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime2.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int4 = date3.getTimezoneOffset();
        java.lang.Class<?> wildcardClass5 = date3.getClass();
        org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 UTC 1909");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withDayOfWeek((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setTime(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455227426,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=426,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusMonths((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withCenturyOfEra(53626948);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626948 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53627 + "'", int3 == 53627);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime((int) (byte) 1, 4, (int) '#', 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455227811,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=811,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("47");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 47 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        int int2 = calendar0.compareTo(calendar1);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455227985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455227985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(12, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 1, 32772, 53627827, 1, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("2022-02-21T14:54:47.855Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime2.withSecondOfMinute(53626948);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626948 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) timeZone2, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.SimpleTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 0, 53628560);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53627827, 7, 12, (int) (short) 10, (int) (byte) 10, 53628560, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628560 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) -1, (int) '4', 0, 0, 0, 53628014);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628014 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDateTime1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDate5.toString("Nov 29, 1909 12:00:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: N");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        int int3 = calendar0.compareTo(calendar2);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455229344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=49,MILLISECOND=344,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455229345,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=49,MILLISECOND=345,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Korean (South Korea)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: clockhourOfHalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(53626975);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53626975) + "'", int1 == (-53626975));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53625, (int) (byte) -1, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withDayOfMonth(53627);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        java.util.Locale locale7 = new java.util.Locale("clockhourOfHalfday");
        boolean boolean8 = locale7.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDateTime1.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals(locale7.toString(), "clockhourofhalfday");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime.Property property7 = localTime2.hourOfDay();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property7.setCopy("Korean", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 53626, 53627827, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626 for clockhourOfHalfday must be in the range [53627827,15]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String[] strArray4 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        org.joda.time.base.BaseInterval[] baseIntervalArray8 = new org.joda.time.base.BaseInterval[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.base.BaseInterval[] baseIntervalArray9 = strSet5.toArray(baseIntervalArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(baseIntervalArray8);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 53626948);
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 53626948, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etc/UTC" + "'", str2, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        int int9 = date6.getYear();
        java.lang.String str10 = date6.toString();
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 23:01:00 GMT+00:00 1901");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Fri Feb 08 23:01:00 GMT+00:00 1901" + "'", str10, "Fri Feb 08 23:01:00 GMT+00:00 1901");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, 53);
        org.joda.time.LocalTime localTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDate14.toLocalDateTime(localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(53628014);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628014 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("50");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate(5, (int) (short) 0, 53631);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53631");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455231630,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=632,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: KOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) 1.0d, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property3.setCopy(53625);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        long long6 = java.util.Date.UTC(53630324, 12, 53627, 53631, (int) (byte) 1, 53626);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1692412209208486000L + "'", long6 == 1692412209208486000L);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = calendar14.isSet(53627827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53627827");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455232712,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=714,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strSet0.add("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withCenturyOfEra(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime5.toString("2022-02-21T14:54:51.341Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("51");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 51 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withYearOfCentury(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.DateTime dateTime7 = dateTime1.minusMinutes((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime1.withSecondOfMinute(53626975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626975 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53633 + "'", int3 == 53633);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(53626948);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53626948) + "'", int1 == (-53626948));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("clockhourofhalfday", "secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: clockhourofhalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        java.util.Date date1 = localDate0.toDate();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime dateTime8 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.LocalTime localTime10 = localTime4.plusMillis((-1));
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = localDate0.isEqual((org.joda.time.ReadablePartial) localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 00:00:00 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = dateTime4.get(dateTimeFieldType5);
        boolean boolean7 = localDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = localDateTime9.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime2.minusSeconds(53626975);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra(12);
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(localTime16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        java.lang.String str22 = dateTimeZone19.getShortName((long) 5);
        boolean boolean23 = localDate15.equals((java.lang.Object) str22);
        org.joda.time.LocalDate.Property property24 = localDate15.yearOfEra();
        org.joda.time.LocalDate localDate26 = localDate15.withCenturyOfEra((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localTime2.compareTo((org.joda.time.ReadablePartial) localDate26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withFieldAdded(durationFieldType8, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property4 = localDate2.property(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withYear((int) '#');
        int[] intArray16 = new int[] { 2022, 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = dateTimeField5.set((org.joda.time.ReadablePartial) localDateTime12, 53626975, intArray16, 53627827);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627827 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2022, 10]");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("45");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 45 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = gregorianCalendar10.getMaximum(53629);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53629");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        boolean boolean2 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getActualMaximum(53634);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 53634");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455234938,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=54,MILLISECOND=938,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        int int10 = dateTimeZone7.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone7);
        int int12 = localDate11.size();
        org.joda.time.LocalDate.Property property13 = localDate11.weekyear();
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        int[] intArray22 = new int[] { 99, 558, 14, 53633, 15, 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField5.add((org.joda.time.ReadablePartial) localDate14, 53626, intArray22, 53629404);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53626");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "55" + "'", str4, "55");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[99, 558, 14, 53633, 15, 10]");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int7 = dateTimeField5.get((long) ' ');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        int int18 = dateTimeField16.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plusSeconds(6);
        int int25 = localDateTime20.getYear();
        int[] intArray32 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int33 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDateTime20, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField5.set((org.joda.time.ReadablePartial) localTime9, 53626, intArray32, 53634698);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634698 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "55" + "'", str4, "55");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "55" + "'", str15, "55");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 59 + "'", int33 == 59);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(725L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 726L + "'", long2 == 726L);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime.Property property9 = dateTime5.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53635 + "'", int3 == 53635);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int7 = dateTimeField5.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds(6);
        int int14 = localDateTime9.getYear();
        int[] intArray21 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int22 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime9, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField5, 10, 53629, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for secondOfMinute must be in the range [53629,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "55" + "'", str4, "55");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.toString();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 32772);
        long long14 = dateTimeZone8.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) readablePeriod4, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localDateTime15.getField(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Etc/UTC" + "'", str9, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology5.get(readablePeriod8, (long) 53625);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int7 = dateTimeField5.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds(6);
        int int14 = localDateTime9.getYear();
        int[] intArray21 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int22 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime9, intArray21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withPeriodAdded(readablePeriod27, 53625);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withPeriodAdded(readablePeriod30, (int) (byte) 0);
        int[] intArray35 = new int[] { (-53626975) };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField5.set((org.joda.time.ReadablePartial) localDateTime29, (-53626975), intArray35, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -53626975");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "55" + "'", str4, "55");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-53626975]");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getDurationType();
        java.lang.String str10 = dateTimeFieldType8.toString();
        int int11 = localDateTime6.indexOf(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property12 = localDate2.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "clockhourOfHalfday" + "'", str10, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        timeZone2.setID("1970");
        java.lang.String str17 = timeZone2.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455235939,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=55,MILLISECOND=941,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GMT+00:00" + "'", str17, "GMT+00:00");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.util.Date date5 = new java.util.Date(0, 0, 0, 9, (int) '#');
        java.util.Date date9 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant10 = date9.toInstant();
        int int11 = date5.compareTo(date9);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Dec 31 09:35:00 GMT+00:00 1899");
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        int int9 = date6.getYear();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromDateFields(date6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime10.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 23:01:00 GMT+00:00 1901");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = dateTimeZone2.getName(0L, locale8);
        java.lang.String str10 = locale8.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53632, 15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setRegion("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 1970);
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withMillis(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53636 + "'", int3 == 53636);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withFieldAdded(durationFieldType3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDurationAdded(readableDuration8, 7);
        org.joda.time.Chronology chronology11 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(53627, 53628014, 53628, 19, 0, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628014 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar14.getMinimum(53633202);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53633202");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455236931,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=56,MILLISECOND=933,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths(53628);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withDayOfMonth(53629404);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53629404 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property9.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField13 = localTime11.getField(0);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        boolean boolean15 = calendar14.isWeekDateSupported();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromCalendarFields(calendar14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localTime11.compareTo((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455237080,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=57,MILLISECOND=80,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = property3.setCopy("UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 167L + "'", long4 == 167L);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder0.setInstant(53633152L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property18 = localDate4.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate4.withDayOfWeek(53627);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.Object obj7 = null;
        org.joda.time.tz.Provider provider8 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone10 = provider8.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj7, dateTimeZone10);
        int int13 = dateTimeZone10.getStandardOffset(1266764034698L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(53635206, 7, (-1), 99, 2, 53637188, (int) '4', dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(15, 53634900, 53633, 99, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53635);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) '4', 53633931);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime10.getValue(53635206);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53635206");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime6.getFieldTypes();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(53628014, 53631, 3, 53626975, 53634, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626975 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 53633202, (long) 53628560);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4642L + "'", long2 == 4642L);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology4.getDateTimeMillis((int) (short) 1, (int) (byte) 100, (int) (short) 10, 53, 1970, 53636, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 0);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        boolean boolean11 = calendar10.isWeekDateSupported();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromCalendarFields(calendar10);
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645455238640,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=640,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        int int9 = date6.getYear();
        date6.setMonth((int) (byte) 10);
        boolean boolean13 = date6.equals((java.lang.Object) 53637);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Nov 08 23:01:00 GMT+00:00 1901");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition(9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ko-KR\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53628014, 53628, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set(53635, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        int int4 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks(15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        date6.setSeconds((int) ' ');
        java.time.Instant instant11 = date6.toInstant();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDateTime14.getFieldTypes();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.months();
        boolean boolean19 = durationFieldType12.isSupported(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) instant11, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 23:01:32 GMT+00:00 1901");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int4 = date3.getTimezoneOffset();
        java.util.Date date10 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean11 = date3.before(date10);
        java.time.Instant instant12 = date10.toInstant();
        date10.setSeconds((int) (short) 0);
        java.lang.String str15 = date10.toString();
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Sun Dec 31 09:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sun Dec 31 09:35:00 GMT+00:00 1899" + "'", str15, "Sun Dec 31 09:35:00 GMT+00:00 1899");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay((int) (short) 0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.era();
        java.lang.String str10 = property9.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getMonthOfYear();
        org.joda.time.Interval interval19 = localDate4.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate4.withDayOfWeek((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(interval19);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withYear((int) '#');
        int int7 = localDateTime1.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localDateTime1.getField(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.time.Instant instant0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("2022-02-21T14:54:57.513Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(56, 53633202, 14, (int) (short) 100, 10, 575, 53634900);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime14.withDate(53635206, 53626948, 53630);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626948 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53640426 + "'", int5 == 53640426);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53640 + "'", int9 == 53640);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension(' ', "Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone2, locale5);
        java.lang.String str7 = locale5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455240655,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=655,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de" + "'", str7, "de");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        timeZone15.setID("+00:00");
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone15, locale18);
        java.lang.String str20 = timeZone2.getDisplayName(locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645455240812,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=812,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GMT+00:00" + "'", str20, "GMT+00:00");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, 53634, 3, 7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:52.912Z");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) timeZone1, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(zoneId2);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime4.getValue(53630);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53630");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime8.getFieldTypes();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.months();
        long long16 = chronology11.add(1692412209208486000L, (long) 53634698, 53628014);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(0, (-46800000), 9, 53633931, 53641141, 14, 53631, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633931 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1695288531543715772L + "'", long16 == 1695288531543715772L);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ko-KR\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("59");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.Locale locale1 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourofhalfday" + "'", str2, "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "clockhourofhalfday" + "'", str3, "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "clockhourofhalfday" + "'", str4, "clockhourofhalfday");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("2022-02-21T14:54:47.855Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay((int) (short) 0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDate(4, 53630324, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630324 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        java.lang.String str8 = dateTime6.toString("+00:00");
        org.joda.time.DateTime.Property property9 = dateTime6.millisOfDay();
        org.joda.time.DateTime.Property property10 = dateTime6.dayOfYear();
        int int11 = property10.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField12, 53626948, (int) (byte) 100, 53635);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626948 for dayOfYear must be in the range [100,53635]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate.Property property3 = localDate0.property(dateTimeFieldType2);
        int int4 = property3.getLeapAmount();
        java.util.Locale locale7 = new java.util.Locale("clockhourOfHalfday");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property3.setCopy("2022-02-21T14:54:47.855Z", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:54:47.855Z\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(locale7.toString(), "clockhourofhalfday");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2, 53627, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear(57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53627827, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455241897,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=897,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, 1);
        org.joda.time.YearMonthDay yearMonthDay18 = dateTime14.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime14.withMonthOfYear(15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53641924 + "'", int5 == 53641924);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53641 + "'", int9 == 53641);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.SimpleTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 32772);
        long long7 = dateTimeZone1.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek(53635);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etc/UTC" + "'", str2, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale12 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str13 = locale9.getDisplayLanguage(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property7.setCopy("clockhourofhalfday", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"clockhourofhalfday\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str10, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals(locale12.toString(), "clockhourofhalfday");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Korean" + "'", str13, "Korean");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        java.lang.Object obj4 = null;
        boolean boolean5 = localDateTime1.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 100, 53638, 53, 21, 53628, 53638);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = calendar0.getMinimum(53628);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53628");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455242327,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=327,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("56");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        boolean boolean2 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455242378,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=378,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("clockhourofhalfday");
        java.util.Locale locale3 = new java.util.Locale("Korean (South Korea)");
        java.lang.String str4 = timeZone1.getDisplayName(locale3);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals(locale3.toString(), "korean (south korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Greenwich Mean Time" + "'", str4, "Greenwich Mean Time");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getEra();
        int int11 = dateTime9.getSecondOfDay();
        org.joda.time.DateTime dateTime13 = dateTime9.minusYears(12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime13.toMutableDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int17 = mutableDateTime15.get(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime5.withField(dateTimeFieldType16, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53642 + "'", int3 == 53642);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53642 + "'", int11 == 53642);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getDurationType();
        java.lang.String str9 = dateTimeFieldType7.toString();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDurationAdded(readableDuration13, 7);
        org.joda.time.Chronology chronology16 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType7.getField(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((int) (byte) 1, 53625, 99, 1970, 53634, 35, 53626, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "clockhourOfHalfday" + "'", str9, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setScript("Fri Feb 08 23:01:00 GMT+00:00 1901");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Fri Feb 08 23:01:00 GMT+00:00 1901 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("0", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime7.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        int int19 = dateTimeField17.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfDay();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusSeconds(6);
        int int26 = localDateTime21.getYear();
        int[] intArray33 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int34 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime21, intArray33);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = property39.getLocalDateTime();
        java.util.Locale locale42 = new java.util.Locale("50");
        java.lang.String str43 = property39.getAsText(locale42);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = dateTimeField6.set((org.joda.time.ReadablePartial) localDate10, 99, intArray33, "hi!", locale42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2" + "'", str16, "2");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 59 + "'", int34 == 59);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertEquals(locale42.toString(), "50");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1" + "'", str43, "1");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate(53634, 53636, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455242991,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=993,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology4.add(readablePeriod5, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField9 = chronology4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology4.getDateTimeMillis(23, 53633931, 57, 53634);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633931 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 53633152L + "'", long8 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.size();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property9 = localDate5.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        calendar0.set((-53626948), 53629, 53632, 53633, 53632);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar0.getActualMinimum(56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=-53626948,MONTH=53629,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=53632,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=53633,MINUTE=53632,SECOND=3,MILLISECOND=504,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getGreatestMinimum(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455243659,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=3,MILLISECOND=659,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.size();
        int int7 = localDate5.getWeekOfWeekyear();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtCurrentTime(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate5.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Etc/UTC" + "'", str10, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar14.getMaximum(53627);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53627");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455244189,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=4,MILLISECOND=191,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.lang.Object obj4 = date3.clone();
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(obj4);
// flaky:         org.junit.Assert.assertEquals(obj4.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Mon Nov 29 00:00:00 GMT+00:00 1909");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Mon Nov 29 00:00:00 GMT+00:00 1909");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withEra((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(53637188);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53637188) + "'", int1 == (-53637188));
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.DateTime dateTime7 = dateTime1.minusMinutes((-1));
        java.lang.String str8 = dateTime7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime7.withTime((-53626948), 53634698, 53634698, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53626948 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53644 + "'", int3 == 53644);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T14:55:04.476Z" + "'", str8, "2022-02-21T14:55:04.476Z");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property6 = localDate5.centuryOfEra();
        org.joda.time.LocalDate localDate7 = property6.roundHalfCeilingCopy();
        java.lang.Object obj8 = null;
        org.joda.time.tz.Provider provider9 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone11 = provider9.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj8, dateTimeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtMidnight(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(10, 53640, 7, 6, 53626, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDate2.getFieldTypes();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime dateTime10 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.LocalTime localTime12 = localTime6.plusMillis((-1));
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate2.compareTo((org.joda.time.ReadablePartial) localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1 Jan 1970 00:00:00 GMT\" is malformed at \" Jan 1970 00:00:00 GMT\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        int int9 = property8.getLeapAmount();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDateTime12.getFieldTypes();
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.months();
        boolean boolean17 = durationFieldType10.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) property8, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(53630, 53627827, 0, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627827 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.DateTime dateTime7 = dateTime1.minusMinutes((-1));
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears(53628);
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withFieldAdded(durationFieldType12, 53640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53644 + "'", int3 == 53644);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T14:55:04.899Z" + "'", str8, "2022-02-21T14:55:04.899Z");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant4 = date3.toInstant();
        java.lang.Object obj5 = date3.clone();
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(obj5);
// flaky:         org.junit.Assert.assertEquals(obj5.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Mon Nov 29 00:00:00 GMT+00:00 1909");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Mon Nov 29 00:00:00 GMT+00:00 1909");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate15 = localDate4.withCenturyOfEra((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate15.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        int int4 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusWeeks(15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((-53626948), 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMillis((int) (byte) 10);
        int int5 = localDateTime1.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDayOfMonth(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.addCopy(19);
        java.lang.String str12 = property9.toString();
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getISO3Country();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = property9.setCopy("8 Feb 1901 23:01:00 GMT", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"8 Feb 1901 23:01:00 GMT\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        java.lang.String str8 = localTime2.toString("+00:00");
        org.joda.time.LocalTime localTime10 = localTime2.withMillisOfDay((int) 'x');
        java.lang.Class<?> wildcardClass11 = localTime10.getClass();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withDayOfWeek(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(32769, (int) (short) 10, 53634698, 53642927, 53626975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642927 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder1.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) builder1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withEra(53635);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withWeekOfWeekyear(605139);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 605139 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int7 = dateTimeField5.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds(6);
        int int14 = localDateTime9.getYear();
        int[] intArray21 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int22 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime9, intArray21);
        java.lang.String str23 = dateTimeField5.getName();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = property26.addToCopy((long) 3);
        int[] intArray30 = new int[] { '#' };
        int int31 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28, intArray30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withWeekyear(53632);
        int int34 = localDateTime28.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5" + "'", str4, "5");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "secondOfMinute" + "'", str23, "secondOfMinute");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 59 + "'", int31 == 59);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int8 = dateTimeField5.getDifference(606L, (long) 1970);
        long long10 = dateTimeField5.remainder((long) (short) 1);
        org.joda.time.DurationField durationField11 = dateTimeField5.getDurationField();
        long long13 = durationField11.getMillis((int) '#');
        long long15 = durationField11.getMillis(10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6" + "'", str4, "6");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35000L + "'", long13 == 35000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology4.getDateTimeMillis(53634, 53645777, 53629404, (int) (byte) 10, 53633152, 366, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633152 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2022, 57, 22, (-53626975), 53645, 53630, 53645777);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53626975 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1970, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withPeriodAdded(readablePeriod19, 53625);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getShortName((long) 32772);
        long long29 = dateTimeZone23.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) readablePeriod19, dateTimeZone23);
        boolean boolean32 = dateTimeZone23.isStandardOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) localDate14, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Etc/UTC" + "'", str24, "Etc/UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        int int15 = localDateTime13.getYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withCenturyOfEra(3);
        int[] intArray20 = new int[] { 32769, 53628014 };
        int int21 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime17, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = localDateTime17.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -999 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32769, 53628014]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(101, 53635, 3, 32770, 52, 53645083, 53629, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusWeeks(9);
        java.util.Date date8 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant9 = date8.toInstant();
        boolean boolean10 = localDateTime4.equals((java.lang.Object) instant9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plusHours(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withEra(53643123);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643123 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        long long14 = dateTimeField11.addWrapField((long) ' ', 53628014);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5097600032L + "'", long14 == 5097600032L);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 1970);
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.plus((long) 53630);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53646 + "'", int3 == 53646);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Locale locale1 = new java.util.Locale("2");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "2");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "2");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "2");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "2");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMonthOfYear(53637188);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637188 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime dateTime20 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalTime localTime22 = localTime16.plusMillis((-1));
        org.joda.time.LocalTime localTime24 = localTime22.plusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = property13.compareTo((org.joda.time.ReadablePartial) localTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) (byte) 100);
        int int13 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate10.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate17 = localDate10.minusWeeks(12);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime8.compareTo((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        calendar0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(53634698, 53636369);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455247459,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=7,MILLISECOND=459,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar6 = builder5.build();
        java.lang.String str7 = calendar6.toString();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str7, "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime8.withPeriodAdded(readablePeriod11, (int) '4');
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int21 = dateTime19.get(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = localTime15.withField(dateTimeFieldType20, 53636369);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636369 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, 53627, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        java.lang.Object obj4 = null;
        boolean boolean5 = localDateTime1.equals(obj4);
        int int6 = localDateTime1.getMillisOfSecond();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        boolean boolean8 = calendar7.isWeekDateSupported();
        int int10 = calendar7.getActualMinimum(15);
        calendar7.setLenient(true);
        boolean boolean13 = localDateTime1.equals((java.lang.Object) calendar7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withYearOfEra((-53637188));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53637188 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455247740,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=7,MILLISECOND=740,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-46800000) + "'", int10 == (-46800000));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.toString();
        int int8 = dateTimeZone5.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtMidnight(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDate0.getField(53636);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53636");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 53632, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusMinutes(53);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.dayOfWeek();
        int int15 = localDateTime7.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        java.lang.String str19 = dateTimeFieldType17.toString();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDurationAdded(readableDuration23, 7);
        org.joda.time.Chronology chronology26 = localDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType17.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.monthOfYear();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        int int32 = localDateTime30.getYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withCenturyOfEra(3);
        int[] intArray37 = new int[] { 32769, 53628014 };
        int int38 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localDateTime34, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField5.add((org.joda.time.ReadablePartial) localDateTime7, 19, intArray37, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "clockhourOfHalfday" + "'", str19, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32769, 53628014]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 12 + "'", int38 == 12);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 57);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(2);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = localTime1.isAfter((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        date6.setSeconds((int) ' ');
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(2);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology16.add(readablePeriod17, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField22 = durationFieldType11.getField(chronology16);
        boolean boolean23 = date6.equals((java.lang.Object) durationFieldType11);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 23:01:32 GMT+00:00 1901");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53633152L + "'", long20 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str1, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, 1);
        org.joda.time.YearMonthDay yearMonthDay18 = dateTime14.toYearMonthDay();
        org.joda.time.DateTime dateTime20 = dateTime14.withDayOfYear((int) 'x');
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears(365);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime22.withSecondOfMinute(53629878);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53629878 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53648524 + "'", int5 == 53648524);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53648 + "'", int9 == 53648);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder5.setInstant((long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        calendar0.set((-53626948), 53629, 53632, 53633, 53632);
        calendar0.set((int) (short) 1, (int) ' ', 53630324, 53629404, 5);
        calendar0.set(13, 3, 53635, 53635, 53633202);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar0.getMaximum(53626948);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53626948");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=3,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=53635,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=53635,MINUTE=53633202,SECOND=8,MILLISECOND=617,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        java.lang.String str8 = localTime2.toString("+00:00");
        org.joda.time.LocalTime localTime10 = localTime2.withMillisOfDay((int) 'x');
        int int11 = localTime2.getHourOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        java.lang.String str16 = dateTimeZone13.getShortName((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) int11, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology4.getDateTimeMillis(0L, 53626, (-53637188), 32772, 558);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        calendar0.setLenient(false);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = calendar0.getDisplayName(365, 366, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455248927,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=8,MILLISECOND=927,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMinutes(53);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks((int) '4');
        java.util.Locale locale11 = new java.util.Locale("Korean (South Korea)");
        boolean boolean12 = localDateTime9.equals((java.lang.Object) locale11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minusMillis(53633202);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = localDateTime14.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -201 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals(locale11.toString(), "korean (south korea)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 53647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53647 + "'", int1 == 53647);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.centuryOfEra();
        int int7 = dateTimeField5.get((long) (byte) 1);
        boolean boolean8 = dateTimeField5.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField5.set((long) '4', 53633202);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633202 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime dateTime8 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.LocalTime localTime10 = localTime4.plusMillis((-1));
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfSecond();
        boolean boolean12 = locale1.equals((java.lang.Object) localTime10);
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = property3.roundHalfFloorCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTime4.toString(dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        org.joda.time.DateTime dateTime12 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str14 = localTime8.toString("+00:00");
        org.joda.time.LocalTime localTime16 = localTime8.withMillisOfDay((int) 'x');
        int[] intArray22 = new int[] { (short) 10, 100, 53644, 86399999, 53628560 };
        // The following exception was thrown during execution in test generation
        try {
            chronology4.validate((org.joda.time.ReadablePartial) localTime8, intArray22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 100, 53644, 86399999, 53628560]");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = dateTime4.get(dateTimeFieldType5);
        boolean boolean7 = localDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusYears((int) (byte) 1);
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime9.compareTo(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime8.withPeriodAdded(readablePeriod11, (int) '4');
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime17 = property14.addNoWrapToCopy((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localTime17.toString("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        int int6 = timeZone2.getOffset((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.util.Collection<java.lang.String> strCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strSet3.addAll(strCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str1, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOR" + "'", str2, "KOR");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(53642927, 0, 53645083, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        calendar14.setFirstDayOfWeek(53635206);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.clear(53647287);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53647287");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455251021,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=53635206,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=23,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        int int8 = dateTimeZone5.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone5);
        int int10 = localDate9.size();
        int int11 = localDate9.getWeekOfWeekyear();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter3.withZone(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.parse("Nov 29, 1909 12:00:00 AM", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Etc/UTC" + "'", str14, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.String[] strArray4 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        java.lang.Object[] objArray8 = strSet5.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14);
        boolean boolean17 = strSet5.removeAll((java.util.Collection<java.lang.String>) strList14);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        int int23 = dateTime22.getEra();
        org.joda.time.DateTime dateTime24 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalTime localTime26 = localTime20.plusMillis((-1));
        java.lang.String[] strArray31 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        boolean boolean34 = strSet32.isEmpty();
        java.lang.Object[] objArray35 = strSet32.toArray();
        boolean boolean36 = localTime26.equals((java.lang.Object) strSet32);
        boolean boolean37 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet32);
        org.joda.time.DurationField[] durationFieldArray38 = new org.joda.time.DurationField[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationField[] durationFieldArray39 = strSet32.toArray(durationFieldArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(durationFieldArray38);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        gregorianCalendar10.setTimeInMillis(141027563462453628L);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar10.setWeekDate(53649, 2922789, (-53626975));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -53626975");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 0, 53642476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology4.getDateTimeMillis(605139, (int) '4', 22, 53652, 53651407, 101, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53652 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53628014, (int) ' ', (-53637188), 53626975, 8, 53629878);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626975 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(1645455248000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1645455248000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("00:00:00.099");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 00:00:00.099 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        java.lang.String str5 = localDateTime4.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.001" + "'", str5, "1970-01-01T00:00:00.001");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime8.withPeriodAdded(readablePeriod11, (int) '4');
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate18 = localDate16.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra(12);
        org.joda.time.LocalTime localTime21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTime(localTime21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        java.lang.String str27 = dateTimeZone24.getShortName((long) 5);
        boolean boolean28 = localDate20.equals((java.lang.Object) str27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int32 = dateTime30.get(dateTimeFieldType31);
        boolean boolean33 = localDate20.isSupported(dateTimeFieldType31);
        int int34 = localDate20.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = property14.compareTo((org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.Instant instant9 = instant7.minus((long) 53629878);
        org.joda.time.Instant instant10 = instant7.toInstant();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfYear(53640);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.LocalTime localTime9 = localTime6.withSecondOfMinute(59);
        org.joda.time.LocalTime localTime11 = localTime6.minusMillis(5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime6.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        boolean boolean10 = dateTime7.isSupported(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.withMillisOfSecond(53640590);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640590 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Date date5 = new java.util.Date(0, 0, 0, 9, (int) '#');
        int int6 = date5.getYear();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = date5.compareTo(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Dec 31 09:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53641, 53652, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53641 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53625, 21, (int) (short) 0, 32770, 32772, 53633931);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withSecondOfMinute(53645);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53645 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime8.withPeriodAdded(readablePeriod11, (int) '4');
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTime dateTime20 = property18.roundCeilingCopy();
        int int21 = property14.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime22 = property14.withMinimumValue();
        org.joda.time.LocalTime localTime24 = property14.addCopy((long) 53626948);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.hourOfDay();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withDurationAdded(readableDuration28, 7);
        int int31 = localDateTime26.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localTime24.compareTo((org.joda.time.ReadablePartial) localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "13" + "'", str19, "13");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 365 + "'", int31 == 365);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(52, 53629878, 894, 2922789, 53631, 53650, 558);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        long long7 = dateTimeField5.roundCeiling(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "13" + "'", str4, "13");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        date6.setSeconds((int) ' ');
        java.time.Instant instant11 = date6.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) instant11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 23:01:32 GMT+00:00 1901");
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        int int4 = localDateTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime1.getField(53627);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53627");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        int int10 = dateTime8.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        boolean boolean13 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime4.minusMonths(53628014);
        org.joda.time.DateTime.Property property16 = dateTime4.yearOfCentury();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withMonthOfYear(53646261);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53646261 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53653 + "'", int10 == 53653);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ko-KR\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMillis((int) (byte) 10);
        int int5 = localDateTime1.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withWeekOfWeekyear(53647);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53647 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        org.joda.time.DateTime dateTime13 = dateTime7.minusMinutes((-1));
        long long14 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.getDisplayName();
        java.lang.String str18 = locale16.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property3.setCopy("Sun Dec 31 09:35:00 GMT+00:00 1899", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Sun Dec 31 09:35:00 GMT+00:00 1899\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "13" + "'", str4, "13");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53653 + "'", int9 == 53653);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60L) + "'", long14 == (-60L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str17, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str18, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        int int10 = dateTime8.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        boolean boolean13 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime4.minusMonths(53628014);
        int int16 = dateTime4.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime4.toString("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53653 + "'", int10 == 53653);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMillis((int) (byte) 10);
        int int5 = localDateTime1.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localDateTime1.getField(53643437);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53643437");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(53626948);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626948 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder1.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setRegion("French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.DateTime dateTime7 = dateTime1.minusMinutes((-1));
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears(53628);
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.setCopy(53634698);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634698 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53654 + "'", int3 == 53654);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T14:55:14.235Z" + "'", str8, "2022-02-21T14:55:14.235Z");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime.Property property7 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = localTime2.plusHours(53626975);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        java.lang.String str12 = dateTimeFieldType10.toString();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDurationAdded(readableDuration16, 7);
        org.joda.time.Chronology chronology19 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType10.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) localTime9, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "clockhourOfHalfday" + "'", str12, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withPeriodAdded(readablePeriod23, 53625);
        org.joda.time.LocalDateTime.Property property26 = localDateTime20.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localDate4.compareTo((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("Fri Feb 08 23:01:00 GMT+00:00 1901", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime8.withPeriodAdded(readablePeriod11, (int) '4');
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTime dateTime20 = property18.roundCeilingCopy();
        int int21 = property14.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime22 = property14.withMinimumValue();
        org.joda.time.LocalTime localTime24 = property14.addCopy((long) 53626948);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.LocalTime localTime30 = localTime24.withField(dateTimeFieldType27, 3);
        org.joda.time.LocalTime localTime32 = localTime24.plusMillis(53634698);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = localTime24.toString("DateTimeField[clockhourOfHalfday]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "14" + "'", str19, "14");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate4.withDayOfYear(53629878);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53629878 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        int int6 = dateTimeZone3.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, dateTimeZone3);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 575, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition(53638, 605139);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField3 = property1.getField();
        org.joda.time.DurationField durationField4 = dateTimeField3.getLeapDurationField();
        boolean boolean5 = dateTimeField3.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeField3.set((-2174086740000L), (-46800000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -46800000 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        calendar0.setLenient(true);
        calendar0.set(21, 53634900, (-1), (int) (byte) -1, 53643437, 53628);
        boolean boolean13 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=21,MONTH=53634900,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=-1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=-1,MINUTE=53643437,SECOND=53628,MILLISECOND=125,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        int int9 = dateTimeField6.getDifference((long) (-53637188), 343L);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = dateTimeField6.getType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime19 = localTime13.plusMillis((-1));
        java.lang.String[] strArray24 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean27 = strSet25.isEmpty();
        java.lang.Object[] objArray28 = strSet25.toArray();
        boolean boolean29 = localTime19.equals((java.lang.Object) strSet25);
        int[] intArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localTime19, 52, intArray31, 53640);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[Nov 29, 1909 12:00:00 AM, Etc/UTC, 47, ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.weekOfWeekyear();
        int int5 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusWeeks(15);
        boolean boolean8 = locale0.equals((java.lang.Object) localDateTime2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.toString();
        int int11 = dateTimeZone8.getOffsetFromLocal((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(53629404, 23, (-53626948), 53643437, 292269054, 0, (int) (byte) 0, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643437 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Etc/UTC" + "'", str9, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withField(dateTimeFieldType5, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.lang.String str9 = dateTimeZone6.getShortName((long) 5);
        java.lang.String str10 = dateTimeZone6.getID();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        int int17 = dateTime13.getMillisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusYears(12);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfHour();
        int int28 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(32769, 53643, 53634, 53642927, 53651, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642927 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Etc/UTC" + "'", str10, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53655603 + "'", int17 == 53655603);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53655 + "'", int21 == 53655);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.tz.NameProvider nameProvider16 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        timeZone20.setID("+00:00");
        timeZone20.setRawOffset(2);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        timeZone27.setID("+00:00");
        boolean boolean30 = timeZone20.hasSameRules(timeZone27);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone20, locale31);
        java.lang.String str33 = locale31.getLanguage();
        java.lang.String str36 = nameProvider16.getName(locale31, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getISO3Country();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.lang.String str41 = locale38.getScript();
        java.lang.String str43 = locale38.getUnicodeLocaleType("57");
        java.lang.String str46 = nameProvider16.getShortName(locale38, "49", "GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter15.withLocale(locale38);
        java.io.Writer writer48 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        int int54 = dateTime53.getEra();
        org.joda.time.DateTime dateTime55 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalTime localTime57 = localTime51.plusMillis((-1));
        org.joda.time.LocalTime localTime59 = localTime51.minusSeconds(53626975);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalTime localTime62 = localTime51.withPeriodAdded(readablePeriod60, 20);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer48, (org.joda.time.ReadablePartial) localTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(nameProvider16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455255630,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=632,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime62);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTime.Property property5 = dateTime3.dayOfYear();
        org.joda.time.DateTime dateTime7 = property5.setCopy("59");
        java.util.Date date8 = dateTime7.toDate();
        org.joda.time.DateTime dateTime10 = dateTime7.plusYears((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Thu Feb 28 14:54:15 GMT+00:00 222");
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(53630);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime8.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("Fri Feb 08 23:01:00 GMT+00:00 1901");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property13.setCopy("2022-02-21", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear((int) (byte) 100);
        int int7 = localDate4.getDayOfWeek();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        int int12 = dateTimeZone9.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime13 = localDate4.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime1.toMutableDateTime(dateTimeZone9);
        long long16 = dateTimeZone9.convertUTCToLocal((long) (-1));
        int int18 = dateTimeZone9.getStandardOffset((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Etc/UTC" + "'", str10, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        long long9 = dateTime8.getMillis();
        boolean boolean11 = dateTime8.isEqual(552L);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 972021600000100L + "'", long9 == 972021600000100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusWeeks(9);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusMinutes(53628560);
        java.lang.String str7 = localDateTime6.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2071-12-19T01:19:59.999" + "'", str7, "2071-12-19T01:19:59.999");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 53651407);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.3651407E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar.Builder builder10 = builder0.setTimeOfDay((int) (short) -1, 53629404, 53629, 0);
        java.util.Calendar.Builder builder14 = builder0.setWeekDate((int) (short) 100, 365, 12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        int int22 = dateTimeField20.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusSeconds(6);
        int int29 = localDateTime24.getYear();
        int[] intArray36 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int37 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localDateTime24, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder38 = builder14.setFields(intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "16" + "'", str19, "16");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 59 + "'", int37 == 59);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear((int) (byte) 100);
        int int7 = localDate4.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate4.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear((int) (short) -1);
        org.joda.time.Interval interval12 = localDate9.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.util.stream.Stream<java.lang.String> strStream4 = strSet3.stream();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTimeISO();
        int int10 = dateTime6.getMillisOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        int int14 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime12.minusYears(12);
        boolean boolean17 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate20 = localDate18.withDayOfYear((int) (byte) 100);
        int int21 = localDate18.getDayOfWeek();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        int int26 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime27 = localDate18.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = dateTime6.toDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        org.joda.time.DateTime dateTime31 = dateTime28.minusYears(53638);
        boolean boolean32 = strSet3.equals((java.lang.Object) 53638);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str1, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOR" + "'", str2, "KOR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53657004 + "'", int10 == 53657004);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53657 + "'", int14 == 53657);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Etc/UTC" + "'", str24, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar6 = builder5.build();
        java.util.Calendar calendar7 = builder5.build();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder13 = builder8.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar.Builder builder18 = builder8.setTimeOfDay((int) (short) -1, 53629404, 53629, 0);
        java.util.Calendar calendar19 = builder18.build();
        int int20 = calendar7.compareTo(calendar19);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=3217814269000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2071,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=354,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=17,SECOND=49,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder1.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("45");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 45 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(53641, 4, 2922789, 53630, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-21T14:55:03.940Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:55:03.940Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy(53629404);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withYearOfCentury(53646831);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53646831 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        calendar0.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53647031, 53627);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getMonthOfYear();
        org.joda.time.Interval interval19 = localDate4.toInterval();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate4.minus(readablePeriod20);
        int int22 = localDate4.getYear();
        int int23 = localDate4.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDate4.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("50");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 50 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar6 = builder5.build();
        java.util.Calendar calendar7 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate(53654791, 53627, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=51022099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withPeriodAdded(readablePeriod9, 53625);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withDate(53, 53651407, 53642927);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53651407 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DateTimeField dateTimeField24 = chronology5.clockhourOfHalfday();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        int int29 = dateTimeZone26.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now(dateTimeZone26);
        int int31 = localDate30.size();
        int int32 = localDate30.getWeekOfWeekyear();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.lang.String str35 = dateTimeZone34.toString();
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtCurrentTime(dateTimeZone34);
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.Builder builder40 = builder37.setScript("");
        java.util.Locale locale41 = builder37.build();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.lang.String str43 = locale42.getDisplayName();
        java.lang.String str44 = locale42.getISO3Country();
        java.util.Locale locale45 = locale42.stripExtensions();
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.lang.String str48 = locale45.getISO3Language();
        java.util.Locale.setDefault(locale45);
        java.lang.String str50 = locale41.getDisplayCountry(locale45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDate30, locale41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1970, 1, 1, 53642476]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Etc/UTC" + "'", str35, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str43, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "KOR" + "'", str44, "KOR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "kor" + "'", str48, "kor");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = durationField8.getDifference((long) 32770, 141029491132800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2350491518879");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 62L + "'", long4 == 62L);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(53643123, 32769, 53652961, 53635206, 53642927, 53633152);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635206 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.set(292269054, 53634900, 0, (int) '4', 11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar0.getGreatestMinimum(53652);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53652");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=292269054,MONTH=53634900,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=52,MINUTE=11,SECOND=0,MILLISECOND=205,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate.Property property3 = localDate0.property(dateTimeFieldType2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType2.getField(chronology4);
        int int7 = dateTimeField5.get(0L);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        timeZone7.setID("+00:00");
        timeZone7.setRawOffset(2);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        timeZone14.setID("+00:00");
        boolean boolean17 = timeZone7.hasSameRules(timeZone14);
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone7, locale18);
        java.lang.String str20 = locale18.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTime3.toString("GMT+00:00", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645455258535,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=18,MILLISECOND=537,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        java.lang.String str11 = localTime10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime10.withMinuteOfHour(53635206);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635206 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:05.099" + "'", str11, "00:00:05.099");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", "14");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (???????????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime12.getFieldType(558);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 558");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.halfdayOfDay();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property8 = localDate7.centuryOfEra();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        int[] intArray11 = null;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = dateTimeField6.set((org.joda.time.ReadablePartial) localDate9, 53633931, intArray11, "minuteOfDay", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minuteOfDay\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 100, 53641141, 53649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusWeeks(9);
        java.util.Date date8 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant9 = date8.toInstant();
        boolean boolean10 = localDateTime4.equals((java.lang.Object) instant9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plusHours(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withWeekOfWeekyear(53656);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53656 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53646261, 100, 53630324, 53637188, 53654002, (int) (byte) 10, 53629878);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637188 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy(0L);
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property7.setCopy("French (France)", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"French (France)\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter2.parseLocalDate("3");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology9.millis();
        org.joda.time.DurationField durationField13 = chronology9.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology9.getDateTimeMillis(54, 32769, 54, 53646831);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.lang.String[] strArray4 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval11 = localDate8.toInterval();
        boolean boolean12 = strSet5.remove((java.lang.Object) interval11);
        java.util.stream.Stream<java.lang.String> strStream13 = strSet5.stream();
        org.joda.time.tz.Provider provider14 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.tz.Provider provider16 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.tz.Provider provider17 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider17);
        org.joda.time.DateTimeZone.setProvider(provider17);
        org.joda.time.tz.Provider[] providerArray20 = new org.joda.time.tz.Provider[] { provider14, provider16, provider17 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.Provider[] providerArray21 = strSet5.toArray(providerArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertNotNull(provider16);
        org.junit.Assert.assertNotNull(provider17);
        org.junit.Assert.assertNotNull(providerArray20);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        int int14 = timeZone9.getOffset((long) (short) 10);
        boolean boolean15 = timeZone9.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTime dateTime11 = dateTime8.minusDays(53631);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone16);
        int int21 = localDate20.size();
        int int22 = localDate20.getWeekOfWeekyear();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.toString();
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter14.withZone(dateTimeZone24);
        java.lang.Integer int28 = dateTimeFormatter14.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTime11.toString(dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 972021600000100L + "'", long9 == 972021600000100L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Etc/UTC" + "'", str25, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(int28);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = dateTimeZone2.getName(0L, locale8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale8);
        int int11 = calendar10.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar10.roll(53642476, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645455259679,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=19,MILLISECOND=679,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Etc/UTC");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        java.lang.String str5 = dateTimeFieldType3.toString();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDurationAdded(readableDuration9, 7);
        org.joda.time.Chronology chronology12 = localDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType3.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) provider0, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.ZoneInfoProvider");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "clockhourOfHalfday" + "'", str5, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale13.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455259889,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=19,MILLISECOND=891,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withPeriodAdded(readablePeriod16, 53625);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.year();
        java.lang.String str20 = property19.getAsShortText();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale.Builder builder26 = builder23.setScript("");
        org.joda.time.tz.NameProvider nameProvider27 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        timeZone31.setID("+00:00");
        timeZone31.setRawOffset(2);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        timeZone38.setID("+00:00");
        boolean boolean41 = timeZone31.hasSameRules(timeZone38);
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone31, locale42);
        java.lang.String str44 = locale42.getLanguage();
        java.lang.String str47 = nameProvider27.getName(locale42, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale.Builder builder48 = builder26.setLocale(locale42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDateTime21, 53653, locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53653");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(nameProvider27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1645455259912,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=19,MILLISECOND=914,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zh" + "'", str44, "zh");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.tz.NameProvider nameProvider16 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        timeZone20.setID("+00:00");
        timeZone20.setRawOffset(2);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        timeZone27.setID("+00:00");
        boolean boolean30 = timeZone20.hasSameRules(timeZone27);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone20, locale31);
        java.lang.String str33 = locale31.getLanguage();
        java.lang.String str36 = nameProvider16.getName(locale31, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getISO3Country();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.lang.String str41 = locale38.getScript();
        java.lang.String str43 = locale38.getUnicodeLocaleType("57");
        java.lang.String str46 = nameProvider16.getShortName(locale38, "49", "GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter15.withLocale(locale38);
        java.lang.Appendable appendable48 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfDay();
        int int52 = localDateTime50.getYear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable48, (org.joda.time.ReadablePartial) localDateTime50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(nameProvider16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455260070,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=72,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        int int14 = dateTimeZone11.getOffsetFromLocal((long) (short) -1);
        int int16 = dateTimeZone11.getStandardOffset((long) 13);
        long long19 = dateTimeZone11.convertLocalToUTC((long) 53641, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withZone(dateTimeZone11);
        java.lang.Appendable appendable21 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths(605139);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable21, (org.joda.time.ReadablePartial) localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Etc/UTC" + "'", str12, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 53641L + "'", long19 == 53641L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\ud55c\uad6d\uc5b4", (double) (-53637000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.3637E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        int int2 = localDate0.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (short) -1);
        int int14 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDateTime21.getFieldTypes();
        org.joda.time.Chronology chronology24 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.months();
        boolean boolean26 = durationFieldType19.isSupported(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withPeriodAdded(readablePeriod32, 53625);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.year();
        org.joda.time.LocalDateTime localDateTime37 = property35.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime38 = property35.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withMillisOfSecond(11);
        int[] intArray42 = chronology24.get((org.joda.time.ReadablePartial) localDateTime40, (long) 53642476);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.util.TimeZone timeZone47 = dateTimeZone46.toTimeZone();
        int int49 = dateTimeZone46.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) 0, dateTimeZone46);
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.lang.String str53 = dateTimeZone46.getName(0L, locale52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray54 = dateTimeField11.set((org.joda.time.ReadablePartial) localDate15, 605139, intArray42, "zho", locale52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zho\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1970, 1, 1, 53642476]");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00" + "'", str53, "+00:00");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate0.minusWeeks(12);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate0.minus(readablePeriod8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(2);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology15.add(readablePeriod16, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.minuteOfHour();
        org.joda.time.DurationField durationField21 = durationFieldType10.getField(chronology15);
        java.lang.String str22 = durationFieldType10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate0.withFieldAdded(durationFieldType10, 53630324);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 53633152L + "'", long19 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "seconds" + "'", str22, "seconds");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ko-KR");
        java.lang.Object obj2 = null;
        boolean boolean3 = languageRange1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 53648);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay(53648784);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53648784 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        java.lang.String str6 = dateTimeFieldType4.toString();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 7);
        org.joda.time.Chronology chronology13 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType4.getField(chronology13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(53654002, 53626948, 9, 8, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53654002 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "clockhourOfHalfday" + "'", str6, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar.Builder builder10 = builder0.setTimeOfDay((int) (short) -1, 53629404, 53629, 0);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        int int16 = dateTimeZone13.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 0, dateTimeZone13);
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = dateTimeZone13.getName(0L, locale19);
        java.util.Calendar.Builder builder21 = builder10.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder24 = builder21.setWeekDefinition(53633152, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology4);
        int int8 = localDateTime7.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(53648784, 366, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(11, 15, 53645, 53643, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        boolean boolean3 = property2.isLeap();
        org.joda.time.LocalDateTime localDateTime4 = property2.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfCeilingCopy();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        int int12 = dateTimeZone9.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 0, dateTimeZone9);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = dateTimeZone9.getName(0L, locale15);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property2.setCopy("+00:00", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455261424,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=424,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.Locale locale1 = new java.util.Locale("50");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "50");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "50");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "50");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "50");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfMinute();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (byte) 100);
        int int14 = localDate11.getDayOfWeek();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime8.toMutableDateTime(dateTimeZone16);
        int int23 = dateTimeZone16.getOffsetFromLocal((long) 53626975);
        java.lang.String str24 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-61779834366119L), dateTimeZone16);
        long long27 = dateTimeZone5.getMillisKeepLocal(dateTimeZone16, (long) 9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(53633152, 53646, 35, 558, 53656981, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 558 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Etc/UTC" + "'", str17, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Etc/UTC" + "'", str24, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9L + "'", long27 == 9L);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "eras", "45", "", "Korean", "2022-02-21T14:54:51.341Z", "+00:00", "53635", "Fri Feb 08 23:01:00 GMT+00:00 1901", "58", "minuteOfDay", "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", "", "Sun Dec 31 09:35:00 GMT+00:00 1899", "2022-02-21", "1970", "58", "50", "2022-02-21T14:54:51.341Z", "2022-02-21T14:54:57.513Z", "59", "2022-02-21", "ko-KR", "Korean", "eras", "55", "57", "47", "GMT", "GMT", "", "Fri Feb 08 23:01:00 GMT+00:00 1901", "2022-02-21T14:54:52.912Z", "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", "AD", "", "1 Jan 1970 00:00:00 GMT", "UTC", "Fri Feb 08 23:01:00 GMT+00:00 1901", "55", "Nov 29, 1909 12:00:00 AM", "50", "Fri Feb 08 23:01:00 GMT+00:00 1901", "UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList52);
        java.util.stream.Stream<java.lang.String> strStream55 = strList54.stream();
        boolean boolean56 = strSet45.addAll((java.util.Collection<java.lang.String>) strList54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.tz.Provider provider7 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone9 = provider7.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) (short) 1, 0, 3, 53652, (-46800000), 53626948, 53626975, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53652 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        timeZone8.setID("+00:00");
        timeZone8.setRawOffset(2);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        timeZone15.setID("+00:00");
        boolean boolean18 = timeZone8.hasSameRules(timeZone15);
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone8, locale19);
        java.lang.String str21 = locale19.getLanguage();
        java.lang.String str24 = nameProvider4.getName(locale19, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale.Builder builder25 = builder3.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder3.setScript("15");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 15 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455261907,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=909,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("seconds");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: seconds [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.tz.NameProvider nameProvider16 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        timeZone20.setID("+00:00");
        timeZone20.setRawOffset(2);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        timeZone27.setID("+00:00");
        boolean boolean30 = timeZone20.hasSameRules(timeZone27);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone20, locale31);
        java.lang.String str33 = locale31.getLanguage();
        java.lang.String str36 = nameProvider16.getName(locale31, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getISO3Country();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.lang.String str41 = locale38.getScript();
        java.lang.String str43 = locale38.getUnicodeLocaleType("57");
        java.lang.String str46 = nameProvider16.getShortName(locale38, "49", "GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter15.withLocale(locale38);
        java.io.Writer writer48 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.hourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusWeeks(9);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer48, (org.joda.time.ReadablePartial) localDateTime53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(nameProvider16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455262094,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=96,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder1.setLanguage("zh");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("14", "1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: 1 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53642);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = dateTimeFormatter10.parseLocalTime("14:54:10.291");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = dateTimeFormatter2.parseLocalTime("Property[millisOfSecond]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology4.get(readablePeriod7, (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(53655035, 53646261);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53655035 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.Object obj0 = null;
        org.joda.time.tz.Provider provider1 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone3 = provider1.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.DateTime dateTime11 = property8.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime12 = property8.getDateTime();
        int int13 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        java.lang.String str16 = dateTimeFieldType14.toString();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDurationAdded(readableDuration20, 7);
        org.joda.time.Chronology chronology23 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType14.getField(chronology23);
        java.lang.String str25 = dateTimeFieldType14.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime12.withField(dateTimeFieldType14, 53659798);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53659798 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22" + "'", str9, "22");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "clockhourOfHalfday" + "'", str16, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "clockhourOfHalfday" + "'", str25, "clockhourOfHalfday");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-51606-02-21T14:55:03.940Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-51606-02-21t14:55:03.940z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 53647031, (long) 53635);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2877358507685L + "'", long2 == 2877358507685L);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(53633152, 70, (int) 'x', 53633202, 1, 53654791, (int) ' ', chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633202 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Date date2 = new java.util.Date(66L);
        java.lang.String str3 = date2.toGMTString();
        java.util.Calendar.Builder builder4 = builder0.setInstant(date2);
        java.lang.String str5 = date2.toString();
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str3, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(builder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jan 01 00:00:00 GMT+00:00 1970" + "'", str5, "Thu Jan 01 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(2);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withChronology(chronology20);
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter26.printTo(writer27, (long) 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53633152L + "'", long24 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter2.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.Date date6 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date6.setYear(1);
        date6.setSeconds((int) ' ');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra(12);
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(localTime16);
        boolean boolean18 = date6.equals((java.lang.Object) localTime16);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 08 23:01:32 GMT+00:00 1901");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.DateTime dateTime6 = property3.setCopy("46", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTime6.toString("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        int int11 = dateTimeZone8.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, dateTimeZone8);
        org.joda.time.DateTime dateTime13 = localTime12.toDateTimeToday();
        org.joda.time.LocalTime localTime15 = localTime12.withSecondOfMinute(59);
        org.joda.time.LocalTime localTime17 = localTime12.minusMillis(5);
        org.joda.time.LocalTime localTime19 = localTime12.withMillisOfDay(53640590);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusWeeks(9);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusMinutes(53628560);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plus(readableDuration28);
        int[] intArray30 = localDateTime29.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = dateTimeField5.set((org.joda.time.ReadablePartial) localTime12, 18, intArray30, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[2071, 12, 19, 4799999]");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53663 + "'", int3 == 53663);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        java.lang.Object obj4 = null;
        boolean boolean5 = localDateTime1.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withDate(1969, 53640590, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640590 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale locale1 = new java.util.Locale("1 Jan 1970 00:00:00 GMT");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getDisplayLanguage();
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = locale1.getDisplayCountry(locale2);
        java.lang.Object obj7 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "1 jan 1970 00:00:00 gmt");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str3, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str4, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1 jan 1970 00:00:00 gmt");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1 jan 1970 00:00:00 gmt");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1 jan 1970 00:00:00 gmt");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property15.withMinimumValue();
        org.joda.time.LocalDate localDate17 = property15.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate17.withEra(53648);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53648 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology4.getDateTimeMillis((long) 53656981, 53663032, 53627827, 605139, 53636);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53663032 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getDurationType();
        java.lang.String str9 = dateTimeFieldType7.toString();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDurationAdded(readableDuration13, 7);
        org.joda.time.Chronology chronology16 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType7.getField(chronology16);
        org.joda.time.DurationField durationField18 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(53628, 53650168, (int) (byte) 100, 13, 53661, 14, 53647031, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53661 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "clockhourOfHalfday" + "'", str9, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        long long6 = java.util.Date.UTC((int) '4', 53657, 53655, 53659088, 53657910, 14);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 341564063414000L + "'", long6 == 341564063414000L);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(10000L);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(2);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53642);
        java.util.Locale locale12 = dateTimeFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant13 = org.joda.time.Instant.parse("hi!", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DateTimeField dateTimeField24 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = chronology5.get(readablePeriod25, 497L, (long) 53632);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1970, 1, 1, 53642476]");
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeField5.set((long) 53651407, "Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean (South Korea)\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.Date date3 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant4 = date3.toInstant();
        java.util.Date date5 = java.util.Date.from(instant4);
        java.util.Date date6 = java.util.Date.from(instant4);
        java.lang.String str7 = date6.toString();
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mon Nov 29 00:00:00 GMT+00:00 1909" + "'", str7, "Mon Nov 29 00:00:00 GMT+00:00 1909");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        calendar14.setFirstDayOfWeek(53635206);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        int int26 = dateTimeField24.get((long) ' ');
        long long29 = dateTimeField24.add((long) 53637188, (long) 22);
        java.util.Locale locale30 = java.util.Locale.CANADA;
        int int31 = dateTimeField24.getMaximumTextLength(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = calendar14.getDisplayName((int) (byte) 1, 53652, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455264189,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=53635206,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=191,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "24" + "'", str23, "24");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 53659188L + "'", long29 == 53659188L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        long long9 = chronology4.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTimeField dateTimeField10 = chronology4.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray14 = new int[] { 53629 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField10.add(readablePartial11, 9, intArray14, 53661);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1695288531543715772L + "'", long9 == 1695288531543715772L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[53629]");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        java.util.Date date1 = localDate0.toDate();
        java.util.Date date5 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant6 = date5.toInstant();
        java.util.Date date7 = java.util.Date.from(instant6);
        java.util.Date date8 = java.util.Date.from(instant6);
        int int9 = date1.compareTo(date8);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 00:00:00 GMT+00:00 2022");
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 29 00:00:00 GMT+00:00 1909");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 53654, 956L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54610L + "'", long2 == 54610L);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology4.getDateTimeMillis(0L, 53650822, 365, 53660, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53650822 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        boolean boolean12 = timeZone2.hasSameRules(timeZone9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar14.getActualMaximum(53647031);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 53647031");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455264847,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=849,ZONE_OFFSET=2,DST_OFFSET=0]");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setRegion("2");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology9.millis();
        org.joda.time.DurationField durationField13 = chronology9.hours();
        java.lang.Object obj14 = null;
        org.joda.time.tz.Provider provider15 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone17 = provider15.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj14, dateTimeZone17);
        int int20 = dateTimeZone17.getStandardOffset(1266764034698L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) chronology9, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        long long6 = calendar0.getTimeInMillis();
        int int8 = calendar0.getLeastMaximum((int) (short) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime19 = localTime13.plusMillis((-1));
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfSecond();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("Fri Feb 08 23:01:00 GMT+00:00 1901");
        int int23 = property20.getMaximumShortTextLength(locale22);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("46");
        java.lang.String str26 = locale22.getDisplayName(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = calendar0.getDisplayName(53656981, 575, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455264977,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=977,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645455264977L + "'", long6 == 1645455264977L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292269054 + "'", int8 == 292269054);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        calendar0.clear();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean6 = calendar0.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar0.getMinimum(53643123);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53643123");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T14:55:03.940Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DurationField durationField11 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        int int18 = dateTime17.getEra();
        org.joda.time.DateTime dateTime19 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalTime.Property property20 = localTime15.hourOfDay();
        int int21 = localTime15.getSecondOfMinute();
        org.joda.time.LocalTime localTime23 = localTime15.withMinuteOfHour(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        java.lang.String str27 = dateTimeFieldType25.toString();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.hourOfDay();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withDurationAdded(readableDuration31, 7);
        org.joda.time.Chronology chronology34 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType25.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.monthOfYear();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        int int40 = localDateTime38.getYear();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withCenturyOfEra(3);
        int[] intArray45 = new int[] { 32769, 53628014 };
        int int46 = dateTimeField36.getMaximumValue((org.joda.time.ReadablePartial) localDateTime42, intArray45);
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.lang.String str50 = locale49.getISO3Country();
        java.util.Locale locale51 = locale49.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = dateTimeField12.set((org.joda.time.ReadablePartial) localTime15, 53630324, intArray45, "Thu Jan 01 00:00:00 GMT+00:00 1970", locale49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Jan 01 00:00:00 GMT+00:00 1970\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "clockhourOfHalfday" + "'", str27, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32769, 53628014]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 12 + "'", int46 == 12);
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.Instant instant27 = instant26.toInstant();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53665281 + "'", int5 == 53665281);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53665 + "'", int9 == 53665);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Etc/UTC" + "'", str19, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(instant27);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        long long9 = chronology4.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTimeField dateTimeField10 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime19 = localTime13.plusMillis((-1));
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfSecond();
        org.joda.time.LocalTime localTime21 = property20.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime22 = property20.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime24 = property20.addNoWrapToCopy((int) (short) 1);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        int int31 = dateTime30.getEra();
        org.joda.time.DateTime dateTime32 = localTime28.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalTime.Property property33 = localTime28.hourOfDay();
        int int34 = localTime28.getSecondOfMinute();
        org.joda.time.LocalTime localTime36 = localTime28.withMinuteOfHour(19);
        int[] intArray37 = localTime28.getValues();
        java.util.Locale locale39 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField10.set((org.joda.time.ReadablePartial) localTime24, 53633152, intArray37, "Korean (South Korea)", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean (South Korea)\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1695288531543715772L + "'", long9 == 1695288531543715772L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(53646831);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53646831 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property4 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate7 = property4.roundHalfFloorCopy();
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property4.compareTo(readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone2);
        int int7 = timeZone2.getOffset((long) 53626);
        timeZone2.setRawOffset(53641);
        java.lang.String str12 = timeZone2.getDisplayName(false, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT+00:00" + "'", str12, "GMT+00:00");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        int int4 = localDate0.size();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        int int9 = dateTimeZone6.getOffsetFromLocal((long) 12);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight11 = localDate0.toDateMidnight(dateTimeZone6);
        int int12 = dateMidnight11.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfWeek(53649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(2);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withChronology(chronology20);
        java.io.Writer writer27 = null;
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfYear((int) (byte) 100);
        org.joda.time.DateTime dateTime31 = localDate30.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(writer27, (org.joda.time.ReadablePartial) localDate30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53633152L + "'", long24 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String[] strArray4 = new java.lang.String[] { "Nov 29, 1909 12:00:00 AM", "Etc/UTC", "47", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        boolean boolean16 = strSet5.addAll((java.util.Collection<java.lang.String>) strList13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime dateTime23 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        boolean boolean24 = strSet5.equals((java.lang.Object) dateTime21);
        java.util.Collection<java.lang.String> strCollection25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = strSet5.addAll(strCollection25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime11.toString("GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        int int8 = dateTimeZone5.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone5);
        int int10 = localDate9.size();
        int int11 = localDate9.getWeekOfWeekyear();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter3.withZone(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.parse("49", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Etc/UTC" + "'", str14, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int3 = calendar0.getActualMinimum(15);
        int int5 = calendar0.getGreatestMinimum(12);
        calendar0.setLenient(false);
        java.util.TimeZone timeZone8 = calendar0.getTimeZone();
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale12.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone8.getDisplayName(true, 10, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455266334,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00,offset=53641,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=55,SECOND=19,MILLISECOND=975,ZONE_OFFSET=53641,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-46800000) + "'", int3 == (-46800000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(53634);
        int int4 = localDateTime1.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime1.getValue(86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar.Builder builder10 = builder0.setTimeOfDay((int) (short) -1, 53629404, 53629, 0);
        java.util.Calendar calendar11 = builder10.build();
        java.util.Calendar.Builder builder15 = builder10.setTimeOfDay(0, 53642, 53628);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        java.lang.String str18 = dateTimeFieldType16.toString();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withDurationAdded(readableDuration22, 7);
        org.joda.time.Chronology chronology25 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.monthOfYear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        int int31 = localDateTime29.getYear();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withCenturyOfEra(3);
        int[] intArray36 = new int[] { 32769, 53628014 };
        int int37 = dateTimeField27.getMaximumValue((org.joda.time.ReadablePartial) localDateTime33, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder38 = builder15.setFields(intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=3217814215359,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=53641,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2071,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=354,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=17,SECOND=49,MILLISECOND=0,ZONE_OFFSET=53641,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "clockhourOfHalfday" + "'", str18, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32769, 53628014]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 12 + "'", int37 == 12);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int7 = dateTimeField5.get((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = dateTimeField5.getType();
        int int9 = dateTimeField5.getMaximumValue();
        java.lang.String str11 = dateTimeField5.getAsShortText(1645455252691L);
        int int12 = dateTimeField5.getMaximumValue();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra(12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        int int26 = dateTimeField24.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusSeconds(6);
        int int33 = localDateTime28.getYear();
        int[] intArray40 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int41 = dateTimeField24.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = dateTimeField5.set((org.joda.time.ReadablePartial) localDate15, 53628560, intArray40, 53636369);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636369 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26" + "'", str4, "26");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "12" + "'", str11, "12");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "26" + "'", str23, "26");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 59 + "'", int41 == 59);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.addCopy(19);
        java.lang.String str12 = property9.toString();
        java.util.Locale locale15 = new java.util.Locale("clockhourOfHalfday");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = locale15.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = property9.setCopy("0035-12-31T23:59:59.999", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0035-12-31T23:59:59.999\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertEquals(locale15.toString(), "clockhourofhalfday");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 0, 6, 53656);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53656 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.LocalDate.Property property13 = localDate4.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property15.withMinimumValue();
        org.joda.time.LocalDate localDate17 = property15.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int21 = dateTime19.get(dateTimeFieldType20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTimeISO();
        int int23 = dateTime19.getMillisOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        int int26 = dateTime25.getEra();
        int int27 = dateTime25.getSecondOfDay();
        org.joda.time.DateTime dateTime29 = dateTime25.minusYears(12);
        boolean boolean30 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate33 = localDate31.withDayOfYear((int) (byte) 100);
        int int34 = localDate31.getDayOfWeek();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str37 = dateTimeZone36.toString();
        int int39 = dateTimeZone36.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime40 = localDate31.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.DateTime dateTime41 = dateTime19.toDateTime(dateTimeZone36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((java.lang.Object) property15, dateTimeZone36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53666636 + "'", int23 == 53666636);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53666 + "'", int27 == 53666);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Etc/UTC" + "'", str37, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property9.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime14 = property12.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property12.setCopy(53643437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643437 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = dateTimeFormatter15.parseLocalTime("2022-02-21T14:55:09.502Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate4.withEra(53633152);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633152 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        timeZone2.setRawOffset(2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeZone2.getOffset(1439, 7, (int) 'x', 53647031, 53662, 894);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 1439");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = property2.withMinimumValue();
        java.lang.String str5 = localDateTime3.toString("13");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime3.getValue(53666699);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53666699");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "13" + "'", str5, "13");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.centuryOfEra();
        long long8 = dateTimeField5.getDifferenceAsLong((long) 53633202, 34214400000L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar6 = builder5.build();
        java.util.Calendar calendar7 = builder5.build();
        java.util.Calendar.Builder builder11 = builder5.setDate(605139, 14, 20);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        int int19 = dateTimeField17.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfDay();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusSeconds(6);
        int int26 = localDateTime21.getYear();
        int[] intArray33 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int34 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime21, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder35 = builder5.setFields(intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=50968458,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=53641,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=53641,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=50968458,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=53641,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=10,SECOND=22,MILLISECOND=99,ZONE_OFFSET=53641,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "27" + "'", str16, "27");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 59 + "'", int34 == 59);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.weekyear();
        int int8 = localDateTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withHourOfDay((-53626948));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53626948 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "de");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(53634);
        int int4 = localDateTime1.getDayOfWeek();
        org.joda.time.Chronology chronology5 = localDateTime1.getChronology();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology5.get(readablePeriod6, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        java.lang.Integer int16 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter2.print((long) 53650853);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(2);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter15.withChronology(chronology20);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate29 = localDate27.withDayOfYear((int) (byte) 100);
        int int30 = localDate27.getDayOfWeek();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str33 = dateTimeZone32.toString();
        int int35 = dateTimeZone32.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime36 = localDate27.toDateTimeAtMidnight(dateTimeZone32);
        org.joda.time.LocalDate localDate38 = localDate27.plusDays((int) '4');
        org.joda.time.Chronology chronology39 = localDate27.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dateTimeFormatter26.print((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53633152L + "'", long24 == 53633152L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Etc/UTC" + "'", str33, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder1.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Thu Jan 01 00:00:00 GMT+00:00 1970");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Thu Jan 01 00:00:00 GMT+00:00 1970 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("14");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar0.getActualMinimum(86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86399999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455268552,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=53641,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=55,SECOND=22,MILLISECOND=193,ZONE_OFFSET=53641,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(2);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withChronology(chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53642);
        java.util.Locale locale12 = dateTimeFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant13 = org.joda.time.Instant.parse("Etc/UTC", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate4.minus(readablePeriod13);
        org.joda.time.LocalDate.Property property15 = localDate4.era();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale17.getISO3Country();
        java.util.Locale locale20 = locale17.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale20.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = property15.setCopy("minuteOfDay", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minuteOfDay\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str18, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "KOR" + "'", str19, "KOR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "kor" + "'", str23, "kor");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone2);
        int int7 = timeZone2.getOffset((long) 53626);
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone2, locale9);
        java.lang.String str11 = locale9.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645455268709,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=709,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone4);
        int int9 = localDate8.size();
        int int10 = localDate8.getWeekOfWeekyear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.tz.NameProvider nameProvider16 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        timeZone20.setID("+00:00");
        timeZone20.setRawOffset(2);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        timeZone27.setID("+00:00");
        boolean boolean30 = timeZone20.hasSameRules(timeZone27);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone20, locale31);
        java.lang.String str33 = locale31.getLanguage();
        java.lang.String str36 = nameProvider16.getName(locale31, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getISO3Country();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.lang.String str41 = locale38.getScript();
        java.lang.String str43 = locale38.getUnicodeLocaleType("57");
        java.lang.String str46 = nameProvider16.getShortName(locale38, "49", "GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter15.withLocale(locale38);
        org.joda.time.format.DateTimeParser dateTimeParser48 = dateTimeFormatter47.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate50 = dateTimeFormatter47.parseLocalDate("2022-02-21T14:54:47.855Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(nameProvider16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455268790,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=2,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=792,ZONE_OFFSET=2,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNull(dateTimeParser48);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(15778476000L, (long) 53649);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 846499458924000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate.Property property4 = localDate2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withDayOfYear(53656028);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53656028 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455268942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=942,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField6, 292269054, 53644, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292269054 for weekOfWeekyear must be in the range [53644,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set(53642535, 53668);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(2);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withChronology(chronology8);
        org.joda.time.Chronology chronology10 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.parse("51", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getMonthOfYear();
        org.joda.time.Interval interval19 = localDate4.toInterval();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate4.minus(readablePeriod20);
        org.joda.time.LocalDate localDate23 = localDate4.plusWeeks(53628014);
        org.joda.time.LocalDate localDate25 = localDate4.minusWeeks(53626975);
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = localDate25.toString("2022-02-21T14:54:52.912Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        java.lang.String str8 = dateTime6.toString("+00:00");
        org.joda.time.DateTime.Property property9 = dateTime6.millisOfDay();
        org.joda.time.DateTime.Property property10 = dateTime6.dayOfYear();
        int int11 = property10.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusWeeks(9);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusMinutes(53628560);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        int int25 = dateTime24.getEra();
        org.joda.time.DateTime.Property property26 = dateTime24.secondOfMinute();
        java.lang.String str27 = property26.getAsString();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        int int30 = dateTimeField28.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusSeconds(6);
        int int37 = localDateTime32.getYear();
        int[] intArray44 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int45 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localDateTime32, intArray44);
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = dateTimeField12.set((org.joda.time.ReadablePartial) localDateTime21, 53633, intArray44, "", locale47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "30" + "'", str27, "30");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 6, 53629404, 3, 52, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 59 + "'", int45 == 59);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Chronology chronology8 = instant0.getChronology();
        long long9 = instant0.getMillis();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30" + "'", str5, "30");
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
        org.junit.Assert.assertNotNull(chronology8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645455270185L + "'", long9 == 1645455270185L);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalTime localTime3 = localTime0.withPeriodAdded(readablePeriod1, (-53626948));
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime0.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNull(durationFieldType5);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        int int14 = dateTimeZone11.getOffsetFromLocal((long) (short) -1);
        int int16 = dateTimeZone11.getStandardOffset((long) 13);
        long long19 = dateTimeZone11.convertLocalToUTC((long) 53641, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withZone(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = dateTimeFormatter20.parseLocalDate("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Etc/UTC" + "'", str12, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 53641L + "'", long19 == 53641L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53633152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology9.getDateTimeMillis(0L, 53633202, (-292275054), 53666, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633202 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clockhourOfHalfday" + "'", str2, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate0.getValue(53655);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53655");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        int int11 = localTime8.getMillisOfSecond();
        int int12 = localTime8.getSecondOfMinute();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = localTime8.isEqual((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Etc/UTC" + "'", str19, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMinutes(53);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusWeeks((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withWeekyear(20);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime1.getValue(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32770");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }
}
