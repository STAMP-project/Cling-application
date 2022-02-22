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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((-1), 0, 1, (int) (short) 1, (int) (byte) 10, (int) (short) 100, (int) (short) 0, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.withMinuteOfHour((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withFieldAdded(durationFieldType1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = timeOfDay2.isAfter((org.joda.time.ReadablePartial) localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((java.lang.Object) locale1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        int int3 = dateMidnight2.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDayOfMonth(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withFieldAdded(durationFieldType1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField8.getMillis((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusMinutes((int) '4');
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) timeOfDay7, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.TimeOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(1, (int) (short) -1, (int) (byte) -1, (int) ' ', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime5.withTime((int) '4', 2, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T00:01:00.000Z" + "'", str7, "1969-12-31T00:01:00.000Z");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate0.withDayOfWeek(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str4, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_TW" + "'", str5, "zh_TW");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(100, 70, (int) (short) 1, (int) (byte) -1, 8, (int) (short) -1, (int) (byte) 10, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField8.getMillis((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField8.getDifferenceAsLong((long) 70, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withYearOfCentury((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("\u4e2d\u6587", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((int) 'x', 8, (int) (byte) 10, (int) (byte) 100, (int) (byte) -1, (int) 'a', (int) (byte) 1, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = durationField8.getDifference((long) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean15 = localDate13.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate13.toDateMidnight(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeOfDay6.compareTo((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        mutableDateTime16.setMillisOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("\u4e2d\u6587", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField10.set((long) '#', "1969-12-31T00:01:00.000Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T00:01:00.000Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 1, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        mutableDateTime16.setMillisOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePartial) timeOfDay12, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((int) (short) 10, 5, (int) (byte) -1, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: zh");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.minusMonths((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate6.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology13.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((int) 'x', 35, 8, 5, (int) 'a', 8, (int) (byte) 1, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = new org.joda.time.Interval((java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfHalfday();
        long long28 = dateTimeField26.roundHalfFloor(0L);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        int int30 = dateTimeField26.getMaximumShortTextLength(locale29);
        java.lang.String str31 = locale29.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology18, locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) timeOfDay13, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh" + "'", str31, "zh");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology13.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(8, 21, 365, (int) ' ', (int) (byte) 10, (int) (byte) 1, 3, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) property9, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        boolean boolean40 = calendar38.isSet(1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDayOfWeek(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) (byte) 1, 0, 100, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setMinuteOfHour((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1, 4, 100, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        int int25 = mutableDateTime24.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.property(dateTimeFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property28 = timeOfDay2.property(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology6.get(readablePeriod10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.set((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField8.subtract((-2678399900L), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusMinutes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeOfDay7.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        int int8 = dateMidnight5.getCenturyOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        long long21 = dateTimeField19.roundHalfFloor(0L);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        int int23 = dateTimeField19.getMaximumShortTextLength(locale22);
        java.lang.String str24 = locale22.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology11, locale22);
        java.lang.String str26 = locale22.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateMidnight5.toString("Chinese", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale1.getDisplayName(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str5, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType3.getField(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) builder2, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Calendar$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        int int4 = localDate0.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate0.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withField(dateTimeFieldType8, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withField(dateTimeFieldType5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        int[] intArray14 = chronology6.get((org.joda.time.ReadablePartial) timeOfDay9, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[23, 59, 59, 999]");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setMinuteOfHour((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime1.withPeriodAdded(readablePeriod3, (int) '4');
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.minusYears((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        java.lang.Object obj17 = mutableDateTime16.clone();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        long long20 = durationField17.subtract(0L, 19);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-11491200000L) + "'", long20 == (-11491200000L));
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(5, 365, 0, 35, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = calendar38.getMaximum(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        long long9 = dateTimeField7.roundHalfFloor(0L);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.LocalDate localDate13 = localDate10.withWeekyear((-1));
        int int14 = localDate10.getYearOfCentury();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        int[] intArray30 = chronology22.get((org.joda.time.ReadablePartial) timeOfDay25, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = dateTimeField7.add((org.joda.time.ReadablePartial) localDate10, 35, intArray30, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[23, 59, 59, 999]");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        int[] intArray14 = chronology6.get((org.joda.time.ReadablePartial) timeOfDay9, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay9.withHourOfDay(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = timeOfDay16.toString("1969-12-31T00:01:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime8.withWeekOfWeekyear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (short) 10, 70, (int) (short) -1, 7, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (short) 0, 70, (int) (short) 1, 8, 35, (int) '#', dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        mutableDateTime20.setYear(3);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        mutableDateTime20.setZone(dateTimeZone25);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(0L, dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1, 70, 3, dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        mutableDateTime16.setMinuteOfDay(8);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setTime((-292275054), 7, 15, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray14 = timeOfDay13.getValues();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay17.minusMinutes((int) '4');
        int int23 = timeOfDay13.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = chronology30.eras();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay13.withChronologyRetainFields(chronology30);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight36.withWeekyear(2);
        org.joda.time.DateMidnight.Property property41 = dateMidnight36.weekOfWeekyear();
        java.lang.String str42 = property41.getAsString();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.clockhourOfHalfday();
        long long52 = dateTimeField50.roundHalfFloor(0L);
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        int int54 = dateTimeField50.getMaximumShortTextLength(locale53);
        int int55 = property41.getMaximumShortTextLength(locale53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) timeOfDay33, locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate2.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        long long50 = dateTimeField48.roundHalfFloor(0L);
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        int int52 = dateTimeField48.getMaximumShortTextLength(locale51);
        java.lang.String str53 = locale51.getLanguage();
        java.util.Locale locale54 = locale51.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = calendar38.getDisplayName((int) (short) -1, 1, locale54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh" + "'", str53, "zh");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight4.getZone();
        int int11 = dateTimeZone9.getStandardOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = new org.joda.time.Interval(604800000L, (long) 22, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str10 = dateTimeZone9.toString();
        boolean boolean11 = dateTimeZone9.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((int) ' ', 4, 0, (int) (byte) -1, 11, 2, (int) (byte) 10, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.setCopy(0);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekyear((-1));
        int int10 = localDate9.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime5.compareTo((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime3.minusSeconds((int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.minuteOfHour();
        java.lang.String str17 = property16.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.withPeriodAdded(readablePeriod24, (int) (short) 0);
        int int27 = property16.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime28 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) dateTime23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property3.setCopy("1969-12-31T00:01:00.000Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T00:01:00.000Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        mutableDateTime16.setYear(3);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        mutableDateTime16.setZone(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime23.withDayOfWeek(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        int int47 = date42.getDay();
        java.lang.Object obj48 = date42.clone();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "Tue Apr 30 00:00:00 UTC 1912");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate0.getField(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        java.util.TimeZone timeZone47 = null;
        calendar38.setTimeZone(timeZone47);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = calendar38.getWeeksInWeekYear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property2.setCopy("+10:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+10:00\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.withWeekyear(2);
        org.joda.time.DateMidnight.Property property16 = dateMidnight11.weekOfWeekyear();
        java.lang.String str17 = property16.getAsString();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale19 = locale18.stripExtensions();
        int int20 = property16.getMaximumTextLength(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = property7.setCopy("1969-12-31T00:01:00.000Z", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T00:01:00.000Z\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        java.util.TimeZone timeZone47 = null;
        calendar38.setTimeZone(timeZone47);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = calendar38.getActualMinimum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMonthOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType0.getField(chronology24);
        int int36 = dateTimeField34.getMinimumValue(100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate7.toDateMidnight(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate7.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property13 = localDate7.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.millis();
        boolean boolean15 = localDate7.isSupported(durationFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay5.withFieldAdded(durationFieldType14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Chronology chronology42 = instant40.getChronology();
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setRounding(dateTimeField44, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.set(15);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.weekyear();
        org.joda.time.LocalDate localDate41 = localDate38.withWeekyear((-1));
        java.util.Locale locale43 = java.util.Locale.US;
        java.lang.String str44 = localDate41.toString("+00:00", locale43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime45 = property34.set("+10:00", locale43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+10:00\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        boolean boolean19 = mutableDateTime16.isBefore((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setWeekOfWeekyear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.setCopy("+10:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+10:00\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.setWeekDate((int) (short) 1, 19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        int[] intArray18 = chronology10.get((org.joda.time.ReadablePartial) timeOfDay13, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology10);
        org.joda.time.DurationField durationField20 = chronology10.weeks();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        long long26 = chronology10.set((org.joda.time.ReadablePartial) localTime23, (-2678399900L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((int) ' ', 22, 22, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-2678399965L) + "'", long26 == (-2678399965L));
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 14, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.property(dateTimeFieldType21);
        mutableDateTime20.setHourOfDay(5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.set((int) (short) 100, (int) '#', (int) ' ');
        boolean boolean43 = calendar38.isLenient();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=35,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=32,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        int[] intArray35 = chronology27.get((org.joda.time.ReadablePartial) timeOfDay30, (long) (short) -1);
        mutableDateTime20.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField37 = chronology27.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((int) (byte) 100, (-292275054), 5, 12, chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("Etc/UTC", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = property8.getDateMidnight();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.minuteOfHour();
        java.lang.String str15 = property14.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.withPeriodAdded(readablePeriod22, (int) (short) 0);
        int int25 = property14.compareTo((org.joda.time.ReadableInstant) dateTime21);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = property14.getAsShortText(locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight28 = property8.setCopy("+00:00", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.LocalTime localTime35 = localTime33.minusMillis(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime37 = localTime33.withSecondOfMinute(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("1", (java.lang.Throwable) iOException2);
        java.lang.String str7 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.LocalTime localTime35 = localTime33.minusMillis(21);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = localTime35.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        int[] intArray14 = chronology6.get((org.joda.time.ReadablePartial) timeOfDay9, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay9.withHourOfDay(0);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((java.lang.Object) timeOfDay16, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy(15);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        long long18 = dateTimeField16.roundHalfFloor(0L);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        int int20 = dateTimeField16.getMaximumShortTextLength(locale19);
        java.lang.String str21 = locale19.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology8, locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = property3.setCopy("zh_TW", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh_TW\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("+00:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology8);
        java.lang.String str19 = dateTime18.toString();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str19, "1969-12-31T23:59:59.999Z");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = property7.setCopy("zh");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        int int47 = date42.getDay();
        int int48 = date42.getSeconds();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.withDurationAdded(readableDuration55, (int) (short) 1);
        long long58 = dateTime57.getMillis();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.minus(readablePeriod59);
        boolean boolean61 = date42.equals((java.lang.Object) dateTime60);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-86340000L) + "'", long58 == (-86340000L));
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) (short) 1);
        int int4 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime localTime6 = localTime1.plusSeconds(100);
        org.joda.time.LocalTime.Property property7 = localTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekOfWeekyear\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        boolean boolean9 = durationField8.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField8.getValueAsLong((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType0.getField(chronology24);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = chronology24.get(readablePeriod35, (long) 19, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) '#', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology8);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.plusMillis(100);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = durationField8.getDifference(0L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property3.setCopy("weekOfWeekyear", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekOfWeekyear\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        long long12 = dateTimeField9.set((long) '#', 8);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 8035L + "'", long12 == 8035L);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField8.getMillis(23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology6.get(readablePeriod7, (long) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = property8.getDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = property8.setCopy("zh");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.setCopy(0);
        org.joda.time.LocalTime localTime7 = property2.addWrapFieldToCopy(19);
        int int8 = property2.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.addNoWrapToCopy(365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("1969-12-31T00:01:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        java.lang.String str47 = date42.toString();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Tue Apr 30 00:00:00 UTC 1912" + "'", str47, "Tue Apr 30 00:00:00 UTC 1912");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withTime((-1), 8, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology7.yearOfEra();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean22 = localDate20.isSupported(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = localDate20.toDateMidnight(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate20.minusMonths((int) (short) 10);
        int int27 = localDate20.getDayOfYear();
        org.joda.time.LocalDate.Property property28 = localDate20.centuryOfEra();
        int[] intArray35 = new int[] { 19, '#', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField19.addWrapField((org.joda.time.ReadablePartial) localDate20, 365, intArray35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[19, 35, 52, 97, 97]");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        int int20 = property19.getMaximumValueOverall();
        int int21 = property19.getMinimumValueOverall();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        long long34 = dateTimeField32.roundHalfFloor(0L);
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        int int36 = dateTimeField32.getMaximumShortTextLength(locale35);
        java.lang.String str37 = locale35.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology24, locale35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime39 = property19.set("1970-01-01T00:00:00.000Z", locale35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.000Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zh" + "'", str37, "zh");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.minusYears((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = localDate3.toString("+00:00", locale5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        mutableDateTime24.setChronology(chronology31);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(chronology31);
        boolean boolean42 = dateTimeFieldType7.isSupported(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((java.lang.Object) str6, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePartial) timeOfDay12, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(10, 11, (int) ' ', chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        java.util.TimeZone timeZone5 = dateTimeZone3.toTimeZone();
        int int6 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        boolean boolean9 = durationField8.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField8.getMillis((long) (-292275054), (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        java.util.TimeZone timeZone47 = null;
        calendar38.setTimeZone(timeZone47);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = calendar38.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(8, 52, 14, 1, (-292275054), (int) (byte) -1, 52, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.Chronology chronology7 = localTime1.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        org.joda.time.DateTime dateTime10 = localTime1.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime1.withField(dateTimeFieldType11, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        int int20 = property19.getMaximumValueOverall();
        int int21 = property19.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = property19.set((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en_GB");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.weekyear();
        org.joda.time.LocalDate localDate6 = localDate3.withWeekyear((-1));
        java.util.Date date7 = localDate3.toDate();
        date7.setDate((int) ' ');
        java.util.Calendar.Builder builder10 = builder0.setInstant(date7);
        java.lang.Object obj11 = date7.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 04 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Fri Mar 04 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Fri Mar 04 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Fri Mar 04 00:00:00 UTC 2022");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate2 = property1.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay6.minuteOfHour();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, (int) (short) 0);
        int int18 = property7.compareTo((org.joda.time.ReadableInstant) dateTime14);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = property7.getAsShortText(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = property1.setCopy("\u4e2d\u6587\u53f0\u7063)", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?? (??)\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone51, locale53);
        java.lang.String str55 = timeZone51.getDisplayName();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=1645455482271,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=2,MILLISECOND=271,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Coordinated Universal Time" + "'", str55, "Coordinated Universal Time");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        int int5 = dateMidnight4.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean7 = dateMidnight4.isSupported(dateTimeFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        org.joda.time.DateTime dateTime4 = localDate3.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str8 = dateTimeZone7.toString();
        boolean boolean9 = dateTimeZone7.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object) localDate3, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDate localDate2 = localDateTime0.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime5.withMinuteOfHour((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 0, chronology24);
        org.joda.time.DateTimeField dateTimeField36 = chronology24.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = chronology24.get(readablePeriod37, (long) 5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        long long62 = dateTimeField60.roundHalfFloor(0L);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        int int64 = dateTimeField60.getMaximumShortTextLength(locale63);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale65.getDisplayName(locale67);
        java.lang.String str70 = locale63.getDisplayLanguage(locale65);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone51, locale65);
        java.lang.String str72 = timeZone51.getID();
        boolean boolean73 = timeZone51.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str69, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u4e2d\u6587" + "'", str70, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar71);
// flaky:         org.junit.Assert.assertEquals(calendar71.toString(), "java.util.GregorianCalendar[time=1645455482823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=2,MILLISECOND=823,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "UTC" + "'", str72, "UTC");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("+00:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        mutableDateTime16.setMillisOfDay((int) (short) 100);
        int int37 = mutableDateTime16.getHourOfDay();
        mutableDateTime16.setTime(7, 21, 8, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.add(durationFieldType43, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(durationFieldType43);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10, (-1), 31, (int) (byte) 100, (int) (byte) 10, 35, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology21.getZone();
        org.joda.time.Chronology chronology26 = chronology9.withZone(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(23, 11, (int) ' ', dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        mutableDateTime24.setYear(3);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        mutableDateTime24.setZone(dateTimeZone29);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(0L, dateTimeZone29);
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        int[] intArray49 = chronology41.get((org.joda.time.ReadablePartial) timeOfDay44, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, chronology41);
        mutableDateTime50.setYear(3);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone55 = instant54.getZone();
        mutableDateTime50.setZone(dateTimeZone55);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(0L, dateTimeZone55);
        java.util.TimeZone timeZone58 = dateTimeZone55.toTimeZone();
        boolean boolean59 = timeZone32.hasSameRules(timeZone58);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone58, locale72);
        java.lang.String str79 = timeZone58.getID();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(3, 10, (-1), 5, 4, 1970, 52, dateTimeZone80);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str76, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\u4e2d\u6587" + "'", str77, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar78);
// flaky:         org.junit.Assert.assertEquals(calendar78.toString(), "java.util.GregorianCalendar[time=1645455483335,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=3,MILLISECOND=335,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "UTC" + "'", str79, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone80);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime16.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        int[] intArray58 = chronology50.get((org.joda.time.ReadablePartial) timeOfDay53, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(0L, chronology50);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        int[] intArray74 = chronology66.get((org.joda.time.ReadablePartial) timeOfDay69, (long) (short) -1);
        mutableDateTime59.setChronology(chronology66);
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime(chronology66);
        org.joda.time.DateTimeField dateTimeField77 = chronology66.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight((java.lang.Object) property42, chronology66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField77);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.property(dateTimeFieldType21);
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        mutableDateTime23.setSecondOfDay(35);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = locale27.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = mutableDateTime23.toString("Tue Apr 30 00:00:00 UTC 1912", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) (byte) 100, (int) (short) 1);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        long long7 = instant1.getMillis();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDateTime0.toString("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        int int7 = dateTimeZone3.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        java.util.Date date47 = calendar38.getTime();
        java.lang.String str48 = calendar38.toString();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str48, "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("1969-12-31T00:01:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T00:01:00.000Z\" is malformed at \"69-12-31T00:01:00.000Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.secondOfMinute();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        long long16 = dateTimeField14.roundHalfFloor(0L);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        int int18 = dateTimeField14.getMaximumShortTextLength(locale17);
        java.lang.String str19 = locale17.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology6, locale17);
        java.lang.String str21 = locale17.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property3.setCopy("java.io.IOException: ", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.io.IOException: \" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh" + "'", str19, "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("hourOfDay", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) '#', dateTimeZone22);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime localTime28 = localTime26.minusMinutes(15);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.property(dateTimeFieldType34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime9.minusSeconds((int) (byte) 100);
        int int19 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withMonthOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.LocalDate localDate5 = dateMidnight4.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withDayOfWeek((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(23, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withDurationAdded((long) 2, 100);
        int int14 = dateMidnight2.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        int int15 = dateMidnight2.getYearOfCentury();
        org.joda.time.DateMidnight.Property property16 = dateMidnight2.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight18 = property16.addToCopy((long) 3);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime23 = property22.withMinimumValue();
        java.util.Locale locale24 = java.util.Locale.UK;
        int int25 = property22.getMaximumTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight26 = property16.setCopy("\u53f0\u7063", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        int int6 = yearMonthDay5.getYear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate7.toDateMidnight(dateTimeZone10);
        int int12 = dateMidnight11.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean14 = dateMidnight11.isSupported(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay5.withField(dateTimeFieldType13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1904 + "'", int6 == 1904);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        java.util.Date date4 = localDate0.toDate();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate0.plus(readablePeriod5);
        org.joda.time.LocalDate localDate8 = localDate0.plusWeeks((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDate8.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.withYearOfCentury(1);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        long long20 = dateTimeField18.roundHalfFloor(0L);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        int int22 = dateTimeField18.getMaximumShortTextLength(locale21);
        java.lang.String str23 = locale21.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateMidnight2.toString("1970-01-01T00:00:00.000Z", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 10, (int) (short) 10, 70, 8, 366, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.lang.String str16 = locale12.getDisplayVariant();
        java.lang.String str17 = locale12.toString();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh_TW" + "'", str17, "zh_TW");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 1970, 19, 69, (int) (short) 1, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.withWeekyear(2);
        org.joda.time.DateMidnight.Property property15 = dateMidnight10.weekOfWeekyear();
        java.lang.String str16 = property15.getAsString();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = locale17.stripExtensions();
        int int19 = property15.getMaximumTextLength(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property6.setCopy("zh_TW", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh_TW\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        timeZone25.setID("1969-12-31T23:59:59.999Z");
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMinimumValue();
        java.util.Locale locale4 = java.util.Locale.UK;
        int int5 = property2.getMaximumTextLength(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        long long20 = durationField17.add((long) (byte) 10, (long) 'a');
        long long23 = durationField17.subtract((long) 10, (long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        mutableDateTime40.setChronology(chronology47);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.DateTimeField dateTimeField58 = chronology47.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField59 = chronology47.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) (short) 0, chronology47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 58665600010L + "'", long20 == 58665600010L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology6.getDateTimeMillis((int) '#', (int) (byte) -1, 70, 11, 35, 19, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeOfDay22.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        int int15 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime14.withWeekOfWeekyear(1904);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1904 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.set((-292275054), 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfEra((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMonthOfYear(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plus(readablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(1904);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1904 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime3 = timeOfDay2.toDateTimeToday();
        java.lang.String str4 = timeOfDay2.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "T00:01:00.000" + "'", str4, "T00:01:00.000");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withSecondOfMinute(865);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 865 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.set(12, 36000000, (int) 'a', 8, 23, 14);
        long long46 = calendar38.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int48 = calendar38.getActualMinimum(366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 366");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=94611019623794000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3000073,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=314,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=23,SECOND=14,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 94611019623794000L + "'", long46 == 94611019623794000L);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks((int) 'a');
        org.joda.time.LocalDate.Property property9 = localDate8.weekOfWeekyear();
        int int10 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMillisOfDay(2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime0.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.Interval interval9 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.Interval interval11 = interval9.withEndMillis((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant12 = new org.joda.time.Instant((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        int int8 = dateMidnight5.getCenturyOfEra();
        int int9 = dateMidnight5.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.String str6 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: " + "'", str6, "java.io.IOException: ");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        int[] intArray14 = chronology6.get((org.joda.time.ReadablePartial) timeOfDay9, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[23, 59, 59, 999]");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\u516c\u5143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight15.getZone();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.Chronology chronology28 = instant26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfHalfday();
        long long31 = dateTimeField29.roundHalfFloor(0L);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        int int33 = dateTimeField29.getMaximumShortTextLength(locale32);
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale34.getDisplayName(locale36);
        java.lang.String str39 = locale32.getDisplayLanguage(locale34);
        java.lang.String str40 = dateTimeZone20.getName((long) 'x', locale34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) '4', dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str38, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u6587" + "'", str39, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime18.toMutableDateTime(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime29.setDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(1970, 10, 32769, 14, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        java.util.TimeZone timeZone47 = null;
        calendar38.setTimeZone(timeZone47);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.setMinimalDaysInFirstWeek((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=32,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.withFieldAdded(durationFieldType7, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(70, 19, 31, 1904);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = timeOfDay2.getFieldTypes();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        org.joda.time.DateTime dateTime4 = localDate3.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withDayOfWeek(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusDays(5);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plus(readablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withDate((int) (byte) 0, 1439, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate0.minusMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate8.withMonthOfYear(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.Chronology chronology7 = localTime1.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        org.joda.time.DateTime dateTime10 = localTime1.toDateTimeToday(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime1.withMillisOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coordinated Universal Time" + "'", str1, "Coordinated Universal Time");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDateTime(36000000, 36000000, 10, (int) (byte) -1, 52, 12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) timeOfDay17, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, chronology14);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        int[] intArray38 = chronology30.get((org.joda.time.ReadablePartial) timeOfDay33, (long) (short) -1);
        mutableDateTime23.setChronology(chronology30);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(chronology30);
        org.joda.time.DateTimeField dateTimeField41 = chronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField42 = chronology30.seconds();
        org.joda.time.DurationField durationField43 = chronology30.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(31, (int) '4', 23, 32769, (int) (short) 100, (int) (short) -1, (int) (short) 100, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((int) (byte) 10, 19, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.dayOfWeek();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology23);
        org.joda.time.DurationField durationField33 = chronology23.weeks();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((-86340000L), chronology23);
        boolean boolean35 = localTime14.isAfter((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        long long47 = dateTimeField45.roundHalfFloor(0L);
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        int int49 = dateTimeField45.getMaximumShortTextLength(locale48);
        java.lang.String str50 = locale48.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology37, locale48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = dateTimeField12.getAsText((org.joda.time.ReadablePartial) localTime34, locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh" + "'", str50, "zh");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        int[] intArray57 = chronology49.get((org.joda.time.ReadablePartial) timeOfDay52, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(0L, chronology49);
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        org.joda.time.Chronology chronology65 = instant63.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        int[] intArray73 = chronology65.get((org.joda.time.ReadablePartial) timeOfDay68, (long) (short) -1);
        mutableDateTime58.setChronology(chronology65);
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime(chronology65);
        org.joda.time.DateTimeField dateTimeField76 = chronology65.weekOfWeekyear();
        boolean boolean77 = calendar38.equals((java.lang.Object) dateTimeField76);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("T00:01:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'T00:01:00.000' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        calendar38.clear();
        java.lang.Object obj50 = calendar38.clone();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        long long18 = durationField17.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = durationField17.getMillis(1645455486111L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645455486111 * 604800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 604800000L + "'", long18 == 604800000L);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(14, (-1));
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        int[] intArray18 = chronology10.get((org.joda.time.ReadablePartial) timeOfDay13, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder19 = builder0.setFields(intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[23, 59, 59, 999]");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        java.util.Date date2 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusHours(3);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology12.dayOfYear();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        long long28 = chronology12.set((org.joda.time.ReadablePartial) localTime25, (-2678399900L));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localDateTime0.isAfter((org.joda.time.ReadablePartial) localTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 14:58:08 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-2678399965L) + "'", long28 == (-2678399965L));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.yearOfEra();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray42 = timeOfDay41.getValues();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property47 = timeOfDay46.minuteOfHour();
        java.lang.String str48 = property47.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.withPeriodAdded(readablePeriod55, (int) (short) 0);
        int int58 = property47.compareTo((org.joda.time.ReadableInstant) dateTime54);
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = property47.getAsShortText(locale59);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = dateTimeField33.set((org.joda.time.ReadablePartial) localDateTime34, 36000000, intArray42, "\u53f0\u7063", locale59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1" + "'", str48, "1");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1" + "'", str60, "1");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        long long62 = dateTimeField60.roundHalfFloor(0L);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        int int64 = dateTimeField60.getMaximumShortTextLength(locale63);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale65.getDisplayName(locale67);
        java.lang.String str70 = locale63.getDisplayLanguage(locale65);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone51, locale65);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = timeZone51.getOffset(865, 10, (int) '#', 100, (int) (short) 100, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 865");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str69, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u4e2d\u6587" + "'", str70, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar71);
// flaky:         org.junit.Assert.assertEquals(calendar71.toString(), "java.util.GregorianCalendar[time=1645455488353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=8,MILLISECOND=353,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) timeOfDay17, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, chronology14);
        mutableDateTime23.setYear(3);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        mutableDateTime23.setZone(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone28);
        java.lang.String str32 = dateTimeZone28.getName((long) 'x');
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(0L, dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(32772, 1439, (int) 'a', 8, (-292275054), 1, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.ReadableDuration readableDuration0 = null;
        java.util.Date date4 = new java.util.Date(0, (int) '4', 0);
        int int5 = date4.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date4);
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.Interval interval9 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear((int) (byte) 0);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.setCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localTime5.toString("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("\u4e00\u6708", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology8);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = timeOfDay12.isBefore(readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundFloorCopy();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay9.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = property10.addWrapFieldToCopy(1);
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = property10.getAsShortText(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property2.setCopy("Tue Apr 30 00:00:00 UTC 1912", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Tue Apr 30 00:00:00 UTC 1912\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        timeZone25.setID("1969-12-31T23:59:59.999Z");
        int int28 = timeZone25.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = property3.getAsShortText(locale15);
        int int17 = property3.get();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight20.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight20.getZone();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfHalfday();
        long long36 = dateTimeField34.roundHalfFloor(0L);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        int int38 = dateTimeField34.getMaximumShortTextLength(locale37);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale39.getDisplayName(locale41);
        java.lang.String str44 = locale37.getDisplayLanguage(locale39);
        java.lang.String str45 = dateTimeZone25.getName((long) 'x', locale39);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.withDurationAdded(readableDuration50, (int) (byte) 0);
        org.joda.time.DateTime dateTime54 = dateTime49.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime58 = dateTime56.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime58.getZone();
        java.lang.String str60 = dateTimeZone59.getID();
        long long62 = dateTimeZone25.getMillisKeepLocal(dateTimeZone59, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((java.lang.Object) property3, dateTimeZone59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.TimeOfDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str43, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u6587" + "'", str44, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plus(readablePeriod4);
        java.util.Date date9 = new java.util.Date(0, (int) '4', 0);
        int int10 = date9.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay11 = org.joda.time.YearMonthDay.fromDateFields(date9);
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.withPeriodAdded(readablePeriod13, (int) '#');
        java.lang.String str16 = yearMonthDay15.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime5.compareTo((org.joda.time.ReadablePartial) yearMonthDay15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1904-04-30" + "'", str16, "1904-04-30");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        int[] intArray18 = chronology10.get((org.joda.time.ReadablePartial) timeOfDay13, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology10);
        mutableDateTime19.setYear(3);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        mutableDateTime19.setZone(dateTimeZone24);
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale27.getDisplayName(locale29);
        java.lang.String str32 = dateTimeZone24.getName(100L, locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((int) (byte) 100, 365, 1904, dateTimeZone24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str31, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusDays(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.Chronology chronology28 = instant26.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        int[] intArray36 = chronology28.get((org.joda.time.ReadablePartial) timeOfDay31, (long) (short) -1);
        mutableDateTime21.setChronology(chronology28);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((-292275054), 365, 34, (int) (byte) 10, 2, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[23, 59, 59, 999]");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.time.ZoneId[] zoneIdArray1 = new java.time.ZoneId[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId[] zoneIdArray2 = strSet0.toArray(zoneIdArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(zoneIdArray1);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(19, 21, (int) (short) 100, 19, 22, (int) (byte) 10, 865, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '#', 52, (int) (byte) 100, 34, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.weekyear();
        org.joda.time.LocalDate localDate6 = localDate3.withWeekyear((-1));
        java.util.Date date7 = localDate3.toDate();
        date7.setDate((int) ' ');
        java.util.Calendar.Builder builder10 = builder0.setInstant(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder10.set(7, 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 04 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        int int36 = mutableDateTime16.getEra();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime16.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setHourOfDay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay2.minusMinutes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeOfDay14.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = dateTimeField7.getLeapDurationField();
        long long11 = dateTimeField7.add((long) 52, 1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600052L + "'", long11 == 3600052L);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) (short) 0);
        int int3 = localDate0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withEra(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant11 = new org.joda.time.Instant((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        calendar38.clear();
        boolean boolean50 = calendar38.isLenient();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setTime(8, (int) 'a', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.weekOfWeekyear();
        int int26 = localDateTime23.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight29.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight32.minusWeeks(0);
        boolean boolean37 = localDateTime23.equals((java.lang.Object) 0);
        int int38 = localDateTime23.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int39 = timeOfDay22.compareTo((org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        mutableDateTime16.setYear(3);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        mutableDateTime16.setZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setSecondOfMinute((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.roll(34, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfCentury();
        int int4 = localDateTime0.getDayOfYear();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withFieldAdded(durationFieldType5, 23);
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.setCopy("zh");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime3.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        int int22 = mutableDateTime21.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.property(dateTimeFieldType23);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        long long34 = dateTimeField32.roundHalfFloor(0L);
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        int int36 = dateTimeField32.getMaximumShortTextLength(locale35);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = locale35.getDisplayLanguage(locale37);
        java.util.Calendar calendar43 = mutableDateTime21.toCalendar(locale37);
        int int44 = property3.getMaximumTextLength(locale37);
        java.lang.String str45 = property3.getAsString();
        org.joda.time.ReadablePartial readablePartial46 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = property3.compareTo(readablePartial46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str41, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, (int) (short) 1);
        int int10 = dateTime6.getDayOfYear();
        int int11 = dateTime6.getDayOfMonth();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        int[] intArray28 = chronology20.get((org.joda.time.ReadablePartial) timeOfDay23, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, chronology20);
        mutableDateTime29.setYear(3);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        mutableDateTime29.setZone(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(dateTimeZone34);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) '#', dateTimeZone34);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime6.withChronology(chronology38);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        long long49 = dateTimeField47.roundHalfFloor(0L);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        int int51 = dateTimeField47.getMaximumShortTextLength(locale50);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale55 = locale54.stripExtensions();
        java.lang.String str56 = locale52.getDisplayName(locale54);
        java.lang.String str57 = locale50.getDisplayLanguage(locale52);
        java.lang.String str58 = locale50.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology38, locale50);
        int int60 = dateTimeParserBucket59.getOffset();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str56, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u6587" + "'", str57, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        java.lang.String str6 = dateTimeField5.getName();
        java.util.Date date10 = new java.util.Date(0, (int) '4', 0);
        int int11 = date10.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromDateFields(date10);
        org.joda.time.DateTime dateTime13 = yearMonthDay12.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.withPeriodAdded(readablePeriod14, (int) '#');
        java.lang.String str17 = yearMonthDay16.toString();
        int[] intArray25 = new int[] { 3, 32769, 865, 0, 36000000, 34 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField5.addWrapField((org.joda.time.ReadablePartial) yearMonthDay16, 52, intArray25, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yearOfEra" + "'", str6, "yearOfEra");
        org.junit.Assert.assertEquals(date10.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1904-04-30" + "'", str17, "1904-04-30");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[3, 32769, 865, 0, 36000000, 34]");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(14, (-1));
        java.util.Date date7 = new java.util.Date(0, (int) '4', 0);
        int int8 = date7.getMinutes();
        date7.setYear(12);
        date7.setHours((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder3.setInstant(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 30 10:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(865, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 865 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.add(21, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.util.Locale locale16 = java.util.Locale.US;
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale16.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        int int1 = timeOfDay0.getSecondOfMinute();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime9.minusSeconds((int) (byte) 100);
        int int19 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) dateTime18);
        mutableDateTime4.addMillis(70);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDayOfMonth(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime9.minusSeconds((int) (byte) 100);
        int int19 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) dateTime18);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDateTime((int) ' ', 20, 22, (int) (byte) 100, (int) (byte) 10, (-292275054), 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        int int4 = localDate0.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate0.getValue((-11491200));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -11491200");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        int int18 = mutableDateTime17.getEra();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setDayOfYear(6);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        mutableDateTime38.setChronology(chronology45);
        boolean boolean55 = mutableDateTime38.isEqualNow();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime38.secondOfDay();
        boolean boolean57 = mutableDateTime38.isAfterNow();
        mutableDateTime38.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime38.add(readablePeriod60);
        mutableDateTime38.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone65);
        mutableDateTime66.addMinutes((int) (short) -1);
        mutableDateTime66.addHours(0);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime66);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setDateTime(11, 1, (int) 'a', 31, (int) (short) 10, 100, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeZone65);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        mutableDateTime16.setYear(3);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        mutableDateTime16.setZone(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime4 = property2.addCopy(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        java.lang.String str5 = date3.toGMTString();
        int int6 = date3.getHours();
        java.lang.Object obj7 = null;
        boolean boolean8 = date3.equals(obj7);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30 Apr 1904 00:00:00 GMT" + "'", str5, "30 Apr 1904 00:00:00 GMT");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) (short) 0);
        int int3 = localDate0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withDayOfMonth((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekyear((-1));
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = localDate9.toString("+00:00", locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property3.setCopy("ISOChronology[UTC]", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[UTC]\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("Jan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Jan [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (byte) 10);
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale3.getDisplayName(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateMidnight1.toString("java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str7, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.addWeekyears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.set(dateTimeFieldType38, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks((int) 'a');
        org.joda.time.LocalDate.Property property9 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property9.setCopy("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.io.IOException\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths(70);
        int int10 = dateMidnight9.getEra();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.plusWeeks(4);
        org.joda.time.DateMidnight.Property property13 = dateMidnight9.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property13.addToCopy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 100, (int) (short) 0, 2022, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime18.toMutableDateTime(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime29.setDateTime(2022, (int) '#', (int) '4', 201, 36000000, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 201 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.DateMidnight dateMidnight10 = property7.addWrapFieldToCopy(8);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((-1880L));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = property7.compareTo((org.joda.time.ReadablePartial) timeOfDay12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u897f\u5143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '??' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property3.setCopy("UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.monthOfYear();
        int int14 = property13.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight10.getZone();
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone15, 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) iOException1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.io.IOException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime3.withCenturyOfEra((-11491200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11491200 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval(120L, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) timeOfDay17, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, chronology14);
        mutableDateTime23.setYear(3);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        mutableDateTime23.setZone(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone28);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) '#', dateTimeZone28);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.LocalTime localTime35 = localTime32.withField(dateTimeFieldType33, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime5.withField(dateTimeFieldType33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plus(readablePeriod1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder2.setDate(32772, 31, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.addWeekyears((int) (short) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime41.withDurationAdded(readableDuration42, (int) (byte) 0);
        org.joda.time.DateTime dateTime46 = dateTime41.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.plusMinutes((int) (byte) 10);
        int int49 = dateTime48.getDayOfYear();
        boolean boolean50 = mutableDateTime16.equals((java.lang.Object) int49);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDateTime((int) (byte) 0, 70, (-292275054), 52, 14, (int) 'a', 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        int[] intArray35 = chronology27.get((org.joda.time.ReadablePartial) timeOfDay30, (long) (short) -1);
        int int36 = timeOfDay30.size();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = timeOfDay30.toString(dateTimeFormatter37);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = property19.compareTo((org.joda.time.ReadablePartial) timeOfDay30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "T00:01:00.000" + "'", str38, "T00:01:00.000");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone51, locale53);
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime62 = timeOfDay59.toDateTime((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Chronology chronology63 = instant61.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.clockhourOfHalfday();
        long long66 = dateTimeField64.roundHalfFloor(0L);
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        int int68 = dateTimeField64.getMaximumShortTextLength(locale67);
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale70 = locale69.stripExtensions();
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str73 = locale69.getDisplayName(locale71);
        java.lang.String str74 = locale67.getDisplayLanguage(locale69);
        java.lang.String str75 = locale67.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = timeZone51.getDisplayName(true, 10, locale67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=1645455494785,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=14,MILLISECOND=785,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str73, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u4e2d\u6587" + "'", str74, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        // The following exception was thrown during execution in test generation
        try {
            calendar38.setWeekDate(1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder2.setTimeOfDay((int) '#', 2, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.lang.String str54 = timeZone25.getDisplayName(locale53);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Koordinierte Universalzeit" + "'", str54, "Koordinierte Universalzeit");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean14 = interval10.abuts((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd(readableDuration15);
        org.joda.time.Interval interval17 = interval5.overlap((org.joda.time.ReadableInterval) interval13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        mutableDateTime34.setYear(3);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        mutableDateTime34.setZone(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone39);
        boolean boolean42 = interval13.contains((org.joda.time.ReadableInstant) dateTime41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval44 = interval13.withEndMillis((-86340000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNull(interval17);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        boolean boolean39 = localTime34.isSupported(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property40 = yearMonthDay0.property(dateTimeFieldType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        boolean boolean7 = interval5.containsNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval9 = interval5.withStartMillis((long) 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 201);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.withYearOfCentury(1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusWeeks((int) (short) 0);
        int int12 = dateMidnight9.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray6 = timeOfDay5.getValues();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay9.minusMinutes((int) '4');
        int int15 = timeOfDay5.compareTo((org.joda.time.ReadablePartial) timeOfDay9);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay5.withChronologyRetainFields(chronology22);
        org.joda.time.Chronology chronology26 = timeOfDay5.getChronology();
        org.joda.time.Chronology chronology27 = chronology26.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((int) '4', (int) (short) -1, 34, chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone51, locale53);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = calendar54.getActualMinimum(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=1645455495752,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=15,MILLISECOND=752,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(23, 15, (int) ' ', 19, (int) (short) -1, 12, 34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = mutableDateTime16.toString("Koordinierte Universalzeit");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: oo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (short) 100, 2922789, 100, 34, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[23, 59, 59, 999]");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.year();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        long long18 = dateTimeField16.roundHalfFloor(0L);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        int int20 = dateTimeField16.getMaximumShortTextLength(locale19);
        java.lang.String str21 = locale19.getScript();
        java.lang.String str22 = dateTimeField7.getAsText((int) (short) 1, locale19);
        java.util.Locale locale26 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.lang.String str27 = locale19.getDisplayLanguage(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = locale26.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ??");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals(locale26.toString(), "\u516c\u5143_0_weekOfWeekyear");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime16.dayOfYear();
        long long43 = property42.remainder();
        int int44 = property42.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 366 + "'", int44 == 366);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate0.year();
        org.joda.time.DateTime dateTime8 = localDate0.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) localDate0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("java.io.IOException", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        int int9 = property8.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.DateMidnight dateMidnight12 = property8.setCopy((-292275054));
        int int13 = dateMidnight12.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.minusWeeks(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -9223372014192000000 + -60480000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-292275054) + "'", int9 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.lang.Integer int16 = dateTimeParserBucket15.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.clockhourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology24.eras();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType17.getField(chronology24);
        long long30 = dateTimeField27.add((long) (short) 100, (long) (byte) -1);
        boolean boolean31 = dateTimeField27.isSupported();
        dateTimeParserBucket15.saveField(dateTimeField27, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = dateTimeParserBucket15.computeMillis(false, "Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"Coordinated Universal Time\": Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-2678399900L) + "'", long30 == (-2678399900L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("java.io.IOException", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = property2.setCopy("DurationField[halfdays]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DurationField[halfdays]\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set((int) (short) -1, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime18.toMutableDateTime(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = mutableDateTime29.toString("millis");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime dateTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears(8);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        boolean boolean9 = durationField8.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = durationField8.getValue((long) 69, 14L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMinimumValue();
        int int4 = localTime3.size();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime3.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plus(readablePeriod1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay6 = property3.setCopy((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) timeOfDay17, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, chronology14);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        int[] intArray38 = chronology30.get((org.joda.time.ReadablePartial) timeOfDay33, (long) (short) -1);
        mutableDateTime23.setChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType6.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField41 = chronology30.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(11, 34, 36000000, 35, 2, (-11491200), chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        mutableDateTime16.setYear(3);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        mutableDateTime16.setZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setSecondOfMinute(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks((int) 'a');
        org.joda.time.LocalDate.Property property9 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        int int47 = date42.getDay();
        date42.setDate((int) (byte) 1);
        int int50 = date42.getDay();
        java.lang.String str51 = date42.toString();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Mon Apr 01 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Mon Apr 01 00:00:00 UTC 1912" + "'", str51, "Mon Apr 01 00:00:00 UTC 1912");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        boolean boolean32 = dateTimeParserBucket15.restoreState((java.lang.Object) (short) -1);
        java.util.Locale locale33 = dateTimeParserBucket15.getLocale();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withDurationAdded(readableDuration38, (int) (byte) 0);
        org.joda.time.DateTime dateTime42 = dateTime37.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone47 = dateTime46.getZone();
        boolean boolean48 = locale33.equals((java.lang.Object) dateTime46);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) (short) 1);
        int int4 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.millis();
        boolean boolean7 = localTime1.isSupported(durationFieldType6);
        org.joda.time.LocalTime localTime9 = localTime1.plusHours(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        int int18 = mutableDateTime16.getWeekyear();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded(readableDuration23, (int) (byte) 0);
        org.joda.time.DateTime dateTime27 = dateTime22.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int33 = dateTime31.get(dateTimeFieldType32);
        org.joda.time.Chronology chronology34 = null;
        boolean boolean35 = dateTimeFieldType32.isSupported(chronology34);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.set(dateTimeFieldType32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Interval interval9 = interval5.withPeriodAfterStart(readablePeriod8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Interval interval11 = interval9.withDurationAfterStart(readableDuration10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        org.joda.time.DateTime dateTime15 = instant13.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval16 = interval11.withEnd((org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        java.lang.Object obj53 = timeZone51.clone();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        timeZone25.setID("1969-12-31T23:59:59.999Z");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone25);
        int int29 = timeZone25.getRawOffset();
        boolean boolean30 = timeZone25.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645455497693,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1969-12-31T23:59:59.999Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=17,MILLISECOND=693,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime9.minusSeconds((int) (byte) 100);
        int int19 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay21.dayOfMonth();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight28.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone33 = dateMidnight28.getZone();
        long long35 = dateTimeZone25.getMillisKeepLocal(dateTimeZone33, 10L);
        org.joda.time.DateTime dateTime36 = yearMonthDay21.toDateTimeAtCurrentTime(dateTimeZone33);
        int int37 = dateTime36.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder2.set(53891, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(0, (int) (byte) 100, 2022, (int) '4', 12, (int) (byte) 0, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        calendar38.clear();
        java.lang.String str50 = calendar38.getCalendarType();
        calendar38.set(14, 32769, 23);
        int int56 = calendar38.get(1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=24452236800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2744,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=316,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "gregory" + "'", str50, "gregory");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2744 + "'", int56 == 2744);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        java.util.Date date3 = localDateTime0.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withHourOfDay(865);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 865 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 14:58:18 UTC 2022");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks((int) 'a');
        org.joda.time.LocalDate.Property property9 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight13.getZone();
        long long22 = dateTimeZone18.convertLocalToUTC(0L, true, (long) 5);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = dateTimeZone18.getName((-1L), locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) property9, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        int int6 = yearMonthDay5.getYear();
        int int7 = yearMonthDay5.getDayOfMonth();
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay5.dayOfMonth();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate9.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate9.minusMonths((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.centuries();
        boolean boolean17 = localDate9.isSupported(durationFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay5.withFieldAdded(durationFieldType16, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1904 + "'", int6 == 1904);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setMinuteOfHour(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateMidnight40);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 10, 14, 2022, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate8.minusMonths((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.centuries();
        boolean boolean16 = localDate8.isSupported(durationFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay5.withFieldAdded(durationFieldType15, 1968);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray4 = timeOfDay3.getValues();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay7.minusMinutes((int) '4');
        int int13 = timeOfDay3.compareTo((org.joda.time.ReadablePartial) timeOfDay7);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay3.withChronologyRetainFields(chronology20);
        org.joda.time.Chronology chronology24 = timeOfDay3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) "zh_TW", chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh_TW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        boolean boolean7 = interval5.containsNow();
        boolean boolean9 = interval5.isBefore((long) 0);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean16 = interval12.abuts((org.joda.time.ReadableInterval) interval15);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean23 = interval19.abuts((org.joda.time.ReadableInterval) interval22);
        long long24 = interval22.getStartMillis();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean31 = interval27.abuts((org.joda.time.ReadableInterval) interval30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Interval interval33 = interval30.withDurationBeforeEnd(readableDuration32);
        org.joda.time.Interval interval34 = interval22.overlap((org.joda.time.ReadableInterval) interval30);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Chronology chronology42 = instant40.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        int[] intArray50 = chronology42.get((org.joda.time.ReadablePartial) timeOfDay45, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, chronology42);
        mutableDateTime51.setYear(3);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone56 = instant55.getZone();
        mutableDateTime51.setZone(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone56);
        boolean boolean59 = interval30.contains((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean60 = interval15.contains((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Interval interval61 = interval5.overlap((org.joda.time.ReadableInterval) interval30);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology63 = localDateTime62.getChronology();
        org.joda.time.LocalTime localTime64 = localDateTime62.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = interval61.equals((java.lang.Object) localDateTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNull(interval34);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(interval61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(localTime64);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        long long13 = dateTimeField10.add((long) (short) 100, (long) (byte) -1);
        boolean boolean14 = dateTimeField10.isSupported();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime18 = localTime16.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime20 = localTime16.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay24.minusMinutes((int) '4');
        int[] intArray30 = timeOfDay29.getValues();
        int[] intArray32 = dateTimeField10.add((org.joda.time.ReadablePartial) localTime16, 36000000, intArray30, 52);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight36.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone41 = dateMidnight36.getZone();
        long long45 = dateTimeZone41.convertLocalToUTC(0L, true, (long) 5);
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str48 = dateTimeZone41.getName((-1L), locale47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = dateTimeField10.getAsText((int) '4', locale47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2678399900L) + "'", long13 == (-2678399900L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[23, 9, 0, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 9, 0, 0]");
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((long) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plusMonths(8);
        int int9 = dateMidnight8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology8);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.minuteOfHour();
        java.lang.String str18 = property17.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withPeriodAdded(readablePeriod25, (int) (short) 0);
        int int28 = property17.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime29 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str36 = dateTimeZone35.toString();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod31, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = timeOfDay12.toDateTimeToday(dateTimeZone35);
        org.joda.time.DateTime dateTime40 = dateTime38.minusYears(1);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        int[] intArray56 = chronology48.get((org.joda.time.ReadablePartial) timeOfDay51, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, chronology48);
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime63 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) instant62);
        org.joda.time.Chronology chronology64 = instant62.getChronology();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime70 = timeOfDay67.toDateTime((org.joda.time.ReadableInstant) instant69);
        int[] intArray72 = chronology64.get((org.joda.time.ReadablePartial) timeOfDay67, (long) (short) -1);
        mutableDateTime57.setChronology(chronology64);
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(chronology64);
        org.joda.time.DateTimeField dateTimeField75 = chronology64.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay76 = new org.joda.time.TimeOfDay((java.lang.Object) 1, chronology64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+10:00" + "'", str36, "+10:00");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (short) 10, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        int[] intArray20 = localTime19.getValues();
        org.joda.time.LocalTime localTime22 = localTime19.plusMinutes((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime19.withPeriodAdded(readablePeriod23, (int) '4');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime19.plus(readablePeriod26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.weekOfWeekyear();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withDurationAdded(readableDuration38, (int) (byte) 0);
        org.joda.time.DateTime dateTime42 = dateTime37.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime37.minus(readableDuration43);
        org.joda.time.DateTime dateTime46 = dateTime37.minusSeconds((int) (byte) 100);
        int int47 = mutableDateTime32.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology48 = dateTime46.getChronology();
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(chronology48);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone52 = instant51.getZone();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime53.withDurationAdded(readableDuration54, (int) (byte) 0);
        org.joda.time.DateTime dateTime58 = dateTime53.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime60 = dateTime58.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime62 = dateTime60.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone63 = dateTime62.getZone();
        java.lang.String str64 = dateTimeZone63.getID();
        org.joda.time.Interval interval65 = yearMonthDay49.toInterval(dateTimeZone63);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = localTime27.compareTo((org.joda.time.ReadablePartial) yearMonthDay49);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "UTC" + "'", str64, "UTC");
        org.junit.Assert.assertNotNull(interval65);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(22, 69, 52, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 10);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.dayOfWeek();
        java.util.Locale locale38 = new java.util.Locale("hourOfDay", "1969-12-31T00:01:00.000Z", "java.io.IOException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dateTimeField33.getAsText(32772, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertEquals(locale38.toString(), "hourofday_1969-12-31T00:01:00.000Z_java.io.IOException: ");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, readablePeriod10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Interval interval13 = interval11.withPeriodBeforeEnd(readablePeriod12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Interval interval15 = interval13.withDurationBeforeEnd(readableDuration14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = interval13.withEndMillis(670L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval15);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone43);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=isochronology[utc]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay6.minuteOfHour();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, (int) (short) 0);
        int int18 = property7.compareTo((org.joda.time.ReadableInstant) dateTime14);
        boolean boolean19 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) dateTime14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setHourOfDay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.days();
        int int13 = durationField10.getValue((long) '4', (long) (byte) 10);
        long long14 = durationField10.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((-11491200));
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        long long8 = property7.remainder();
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = timeOfDay2.getFields();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        int[] intArray40 = chronology32.get((org.joda.time.ReadablePartial) timeOfDay35, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, chronology32);
        mutableDateTime41.setYear(3);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        mutableDateTime41.setZone(dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(dateTimeZone46);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) '#', dateTimeZone46);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.LocalTime localTime53 = localTime50.withField(dateTimeFieldType51, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay55 = timeOfDay2.withField(dateTimeFieldType51, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localTime53);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-21T00:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.property(dateTimeFieldType21);
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfCeiling();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plus(readablePeriod1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay2.withFieldAdded(durationFieldType5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withHourOfDay(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.lang.Integer int16 = dateTimeParserBucket15.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.clockhourOfHalfday();
        org.joda.time.DurationField durationField26 = chronology24.eras();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType17.getField(chronology24);
        long long30 = dateTimeField27.add((long) (short) 100, (long) (byte) -1);
        boolean boolean31 = dateTimeField27.isSupported();
        dateTimeParserBucket15.saveField(dateTimeField27, 0);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) ' ');
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean38 = localDate36.isSupported(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = localDate36.toDateMidnight(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDate36.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property42 = localDate36.yearOfEra();
        org.joda.time.LocalDate.Property property43 = localDate36.weekyear();
        boolean boolean44 = localDate35.isAfter((org.joda.time.ReadablePartial) localDate36);
        int int45 = localDate35.getDayOfMonth();
        org.joda.time.LocalDate localDate47 = localDate35.withCenturyOfEra((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray52 = timeOfDay51.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray54 = dateTimeField27.add((org.joda.time.ReadablePartial) localDate47, 34, intArray52, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-2678399900L) + "'", long30 == (-2678399900L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 1, 0, 0]");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy(20995200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20995200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.millis();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.set(12, 36000000, (int) 'a', 8, 23, 14);
        calendar38.set(20, (-11491200), 0, (int) ' ', (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            calendar38.roll((int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=20,MONTH=-11491200,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=32,MINUTE=120,SECOND=14,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) ' ');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = localDate2.toDateMidnight(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property8 = localDate2.yearOfEra();
        org.joda.time.LocalDate.Property property9 = localDate2.weekyear();
        boolean boolean10 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate2);
        int int11 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate.Property property12 = localDate1.dayOfWeek();
        boolean boolean13 = property12.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = property12.setCopy(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(9);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        long long13 = dateTimeField10.add((long) (short) 100, (long) (byte) -1);
        boolean boolean14 = dateTimeField10.isSupported();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        long long25 = dateTimeField23.roundHalfFloor(0L);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        int int27 = dateTimeField23.getMaximumShortTextLength(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.util.Locale locale29 = locale26.stripExtensions();
        java.lang.String str30 = dateTimeField10.getAsShortText((long) 10, locale26);
        boolean boolean32 = locale26.equals((java.lang.Object) "30 Apr 1904 00:00:00 GMT");
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2678399900L) + "'", long13 == (-2678399900L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh" + "'", str28, "zh");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e00\u6708" + "'", str30, "\u4e00\u6708");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 50400000, chronology1);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(36000000, 11, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.LocalTime localTime35 = localTime33.minusMillis(21);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        int[] intArray51 = chronology43.get((org.joda.time.ReadablePartial) timeOfDay46, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, chronology43);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        int[] intArray67 = chronology59.get((org.joda.time.ReadablePartial) timeOfDay62, (long) (short) -1);
        mutableDateTime52.setChronology(chronology59);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(chronology59);
        org.joda.time.DateTimeField dateTimeField70 = chronology59.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField71 = chronology59.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((java.lang.Object) localTime33, chronology59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property12.add((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfMonth();
        int int10 = dateTimeField8.getLeapAmount((long) 8);
        long long13 = dateTimeField8.getDifferenceAsLong(864000069L, 8035L);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        int[] intArray30 = chronology22.get((org.joda.time.ReadablePartial) timeOfDay25, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, chronology22);
        mutableDateTime31.setYear(3);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        mutableDateTime31.setZone(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) '#', dateTimeZone36);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime42 = localTime39.minus(readablePeriod41);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray47 = timeOfDay46.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray49 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localTime39, 1968, intArray47, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1968");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9L + "'", long13 == 9L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 1, 0, 0]");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusSeconds(34);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        long long19 = dateTimeField17.roundHalfFloor(0L);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        int int21 = dateTimeField17.getMaximumShortTextLength(locale20);
        java.lang.String str22 = locale20.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale20);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        long long27 = dateTimeParserBucket23.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, chronology36);
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        org.joda.time.Chronology chronology52 = instant50.getChronology();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        int[] intArray60 = chronology52.get((org.joda.time.ReadablePartial) timeOfDay55, (long) (short) -1);
        mutableDateTime45.setChronology(chronology52);
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType28.getField(chronology52);
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale65 = locale64.stripExtensions();
        dateTimeParserBucket23.saveField(dateTimeFieldType28, "hi!", locale65);
        java.lang.String str67 = locale65.getLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter7.withLocale(locale65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = timeOfDay4.toString(dateTimeFormatter68);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh" + "'", str22, "zh");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh" + "'", str67, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        int[] intArray20 = localTime19.getValues();
        org.joda.time.LocalTime localTime22 = localTime19.plusMinutes((int) (byte) 1);
        org.joda.time.LocalTime localTime24 = localTime22.plusHours(2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        mutableDateTime16.setYear(21);
        int int20 = mutableDateTime16.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDateTime(52, 12, 50400000, 6, (int) (short) 100, 1439, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfHalfday();
        boolean boolean10 = dateTimeField9.isLenient();
        long long12 = dateTimeField9.roundFloor((long) (-1));
        long long14 = dateTimeField9.roundHalfEven((long) 'x');
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3600000L) + "'", long12 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 52);
        dateTimeParserBucket15.setOffset((java.lang.Integer) 1904);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket15.getChronology();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 50400000);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded(readableDuration17, (int) (byte) 0);
        org.joda.time.DateTime dateTime21 = dateTime16.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime16.minus(readableDuration22);
        org.joda.time.DateTime dateTime25 = dateTime16.minusSeconds((int) (byte) 100);
        int int26 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology27 = dateTime25.getChronology();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(366, 20, 3, 2, 1904, (int) (short) 0, 6, chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1904 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        long long62 = dateTimeField60.roundHalfFloor(0L);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        int int64 = dateTimeField60.getMaximumShortTextLength(locale63);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale65.getDisplayName(locale67);
        java.lang.String str70 = locale63.getDisplayLanguage(locale65);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone51, locale65);
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = java.util.Locale.CHINA;
        java.lang.String str76 = locale74.getDisplayScript(locale75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = calendar71.getDisplayName(70, 20, locale75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
// flaky:         org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str69, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u4e2d\u6587" + "'", str70, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar71);
// flaky:         org.junit.Assert.assertEquals(calendar71.toString(), "java.util.GregorianCalendar[time=1645455503975,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=23,MILLISECOND=975,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readableDuration12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder4 = builder0.setCalendarType("Koordinierte Universalzeit");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Koordinierte Universalzeit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime dateTime9 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime11 = property7.setCopy(7);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.minuteOfHour();
        java.lang.String str17 = property16.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.withPeriodAdded(readablePeriod24, (int) (short) 0);
        int int27 = property16.compareTo((org.joda.time.ReadableInstant) dateTime23);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = property16.getAsShortText(locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTime11.toString("1969-12-31T23:59:59.999Z", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology11.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.dayOfWeek();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) 4, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(3, (-292275054), 4, (int) 'x', chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight55.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone60 = dateMidnight55.getZone();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.Chronology chronology68 = instant66.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.clockhourOfHalfday();
        long long71 = dateTimeField69.roundHalfFloor(0L);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        int int73 = dateTimeField69.getMaximumShortTextLength(locale72);
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Locale locale76 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale77 = locale76.stripExtensions();
        java.lang.String str78 = locale74.getDisplayName(locale76);
        java.lang.String str79 = locale72.getDisplayLanguage(locale74);
        java.lang.String str80 = dateTimeZone60.getName((long) 'x', locale74);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(locale74);
        java.lang.String str82 = timeZone51.getDisplayName(locale74);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
// flaky:         org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateMidnight59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str78, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u4e2d\u6587" + "'", str79, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+00:00" + "'", str80, "+00:00");
        org.junit.Assert.assertNotNull(calendar81);
// flaky:         org.junit.Assert.assertEquals(calendar81.toString(), "java.util.GregorianCalendar[time=1645455504378,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=24,MILLISECOND=378,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\u5354\u8abf\u4e16\u754c\u6642\u9593" + "'", str82, "\u5354\u8abf\u4e16\u754c\u6642\u9593");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 100);
        int int2 = timeOfDay1.getMinuteOfHour();
        org.joda.time.TimeOfDay.Property property3 = timeOfDay1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = property3.setCopy(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1970-01-01T00:00:00.000Z", (double) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2022.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusYears((int) ' ');
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        java.lang.String str8 = property7.getAsShortText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "58" + "'", str8, "58");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withDayOfWeek((-11491200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11491200 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate0.year();
        org.joda.time.LocalDate.Property property8 = localDate0.dayOfMonth();
        java.util.Date date12 = new java.util.Date(0, (int) '4', 0);
        int int13 = date12.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromDateFields(date12);
        int int15 = yearMonthDay14.getYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay14.minus(readablePeriod16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay14.withPeriodAdded(readablePeriod18, 2022);
        int int21 = localDate0.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField23 = localDate0.getField(34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 34");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1904 + "'", int15 == 1904);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 0, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime35.setMinuteOfDay(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.setCopy(0);
        org.joda.time.LocalTime localTime7 = property2.addWrapFieldToCopy(19);
        int int8 = property2.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.addNoWrapToCopy((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-11491200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        mutableDateTime43.setYear(3);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        mutableDateTime43.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(0L, dateTimeZone48);
        java.util.TimeZone timeZone51 = dateTimeZone48.toTimeZone();
        boolean boolean52 = timeZone25.hasSameRules(timeZone51);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        long long62 = dateTimeField60.roundHalfFloor(0L);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        int int64 = dateTimeField60.getMaximumShortTextLength(locale63);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale65.getDisplayName(locale67);
        java.lang.String str70 = locale63.getDisplayLanguage(locale65);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone51, locale65);
        java.lang.String str72 = timeZone51.getID();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.lang.String str74 = timeZone51.getID();
        timeZone51.setID("2022-02-21T00:00:00.000Z");
        timeZone51.setRawOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = timeZone51.getOffset(53897, 100, 50400000, (int) (short) 0, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 53897");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str69, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u4e2d\u6587" + "'", str70, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar71);
// flaky:         org.junit.Assert.assertEquals(calendar71.toString(), "java.util.GregorianCalendar[time=1645455505196,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=2022-02-21T00:00:00.000Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=25,MILLISECOND=196,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "UTC" + "'", str72, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "UTC" + "'", str74, "UTC");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1968-02-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        mutableDateTime3.add(durationFieldType6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setWeekOfWeekyear(36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone9);
        int int14 = dateTimeZone9.getStandardOffset((long) ' ');
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = dateTimeZone9.getName((long) 3, locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property3.setCopy("Taiwan", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Taiwan\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        timeZone25.setID("1969-12-31T23:59:59.999Z");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone25);
        int int29 = timeZone25.getRawOffset();
        timeZone25.setID("zho");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'zho' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645455505597,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=zho,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=25,MILLISECOND=597,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        long long23 = dateTimeField21.roundHalfFloor(0L);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        int int25 = dateTimeField21.getMaximumShortTextLength(locale24);
        java.lang.String str26 = locale24.getLanguage();
        int int27 = dateTimeField13.getMaximumTextLength(locale24);
        boolean boolean28 = date3.equals((java.lang.Object) int27);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime16.dayOfYear();
        long long43 = property42.remainder();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.clockhourOfHalfday();
        long long56 = dateTimeField54.roundHalfFloor(0L);
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        int int58 = dateTimeField54.getMaximumShortTextLength(locale57);
        java.lang.String str59 = locale57.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology46, locale57);
        java.util.Locale locale61 = dateTimeParserBucket60.getLocale();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.Chronology chronology68 = instant66.getChronology();
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant73 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTime((org.joda.time.ReadableInstant) instant73);
        int[] intArray76 = chronology68.get((org.joda.time.ReadablePartial) timeOfDay71, (long) (short) -1);
        boolean boolean77 = dateTimeParserBucket60.restoreState((java.lang.Object) (short) -1);
        java.util.Locale locale78 = dateTimeParserBucket60.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime79 = property42.set("Chinese", locale78);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Chinese\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zh" + "'", str59, "zh");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_TW");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.dayOfYear();
        java.lang.String str20 = dateTimeField18.getAsShortText(58665600010L);
        int int21 = dateTimeField18.getMinimumValue();
        org.joda.time.DurationField durationField22 = dateTimeField18.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "315" + "'", str20, "315");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(durationField22);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        java.util.Date date4 = localDate0.toDate();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate0.plus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate0.withEra(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.weekOfWeekyear();
        int int3 = localDateTime0.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.minusWeeks(0);
        boolean boolean14 = localDateTime0.equals((java.lang.Object) 0);
        int int15 = localDateTime0.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime0.withMillisOfDay((-457079));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -457079 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(1439, 4, 0, 53897, (-1), 32769, 2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53897 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight2.getZone();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        long long18 = dateTimeField16.roundHalfFloor(0L);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        int int20 = dateTimeField16.getMaximumShortTextLength(locale19);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale21.getDisplayName(locale23);
        java.lang.String str26 = locale19.getDisplayLanguage(locale21);
        java.lang.String str27 = dateTimeZone7.getName((long) 'x', locale21);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale21);
        int int30 = calendar28.getLeastMaximum(15);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.clockhourOfHalfday();
        long long40 = dateTimeField38.roundHalfFloor(0L);
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        int int42 = dateTimeField38.getMaximumShortTextLength(locale41);
        boolean boolean43 = calendar28.equals((java.lang.Object) dateTimeField38);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str25, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645455506140,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=26,MILLISECOND=140,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50400000 + "'", int30 == 50400000);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((int) (byte) 100, 1, (int) (short) 100, 0, 865, 21, 100, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 865 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfWeek();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) 4, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((int) 'x', 30, 42, 8, 4, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("\u897f\u5143");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.weekOfWeekyear();
        int int3 = localDateTime0.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.minusWeeks(0);
        boolean boolean14 = localDateTime0.equals((java.lang.Object) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime0.minus(readableDuration15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withFieldAdded(durationFieldType18, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        mutableDateTime16.setYear(3);
        int int19 = mutableDateTime16.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.year();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withDurationAdded(readableDuration25, (int) (byte) 0);
        org.joda.time.DateTime dateTime29 = dateTime24.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime33 = dateTime31.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.set(dateTimeFieldType34, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.dayOfYear();
        java.lang.String str20 = dateTimeField18.getAsShortText((long) 2022);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeOfDay13.toString(dateTimeFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime4 = property2.addCopy(21);
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) 'a');
        java.lang.String str8 = localTime7.toString();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01:37:00.035" + "'", str8, "01:37:00.035");
    }
}
