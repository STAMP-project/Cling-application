import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(0, (int) (short) -1, (int) (byte) 1, (int) '#', (int) (short) 1, (int) 'a', (int) 'a', chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 1.0f, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, (int) (short) -1, (int) (byte) 10, (int) (byte) 10, 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((java.lang.Object) 100.0d, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) dateTimeFieldType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((java.lang.Object) 10, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long11 = dateTimeZone9.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(0, (int) (byte) 10, (int) (byte) 0, 100, (int) ' ', (int) (short) 1, (int) (byte) 1, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3599990L) + "'", long11 == (-3599990L));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType4.getField(chronology5);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = new org.joda.time.DurationFieldType[] { durationFieldType0, durationFieldType1, durationFieldType2, durationFieldType3, durationFieldType4 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.forFields(durationFieldTypeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [seconds, seconds, seconds, seconds]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) 100, (int) '4', (int) (short) 10, (int) 'u', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = period2.withField(durationFieldType3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) -1, periodType5, chronology6);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) mutablePeriod7, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) ' ', dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withEra(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-1), (int) (short) -1, (int) (byte) -1, (int) (byte) 10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        boolean boolean5 = dateTime3.isAfter((long) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dateTime3.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = property7.getAsText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property7.set("United States");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"United States\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "48" + "'", str10, "48");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime7, (org.joda.time.ReadablePartial) yearMonthDay9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay11.minusDays((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period22 = period19.plusHours((int) 'a');
        org.joda.time.Period period24 = period19.withWeeks((int) (byte) -1);
        int[] intArray25 = period24.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) yearMonthDay15, 100, intArray25, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:26.747Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:26.747Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:26.747Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, -1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        java.lang.Object obj14 = mutableDateTime13.clone();
        org.joda.time.Chronology chronology15 = mutableDateTime13.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100, (int) (byte) 100, (int) '#', (int) (short) 100, (int) (byte) 10, (int) (short) 10, 12, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "1969-12-31T14:48:26.771Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1969-12-31T14:48:26.771Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1969-12-31T14:48:26.771Z");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        java.lang.Object obj11 = mutableDateTime10.clone();
        org.joda.time.Chronology chronology12 = mutableDateTime10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) -1, (int) (short) 0, (int) 'u', (int) 'a', chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "1969-12-31T14:48:26.923Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1969-12-31T14:48:26.923Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1969-12-31T14:48:26.923Z");
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDayOfMonth((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale4 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = partial0.toString("United States", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object) 86399999, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "1969-12-31T14:48:27.626Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1969-12-31T14:48:27.626Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1969-12-31T14:48:27.626Z");
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDate17.compareTo((org.joda.time.ReadablePartial) localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int) (short) 100, (int) (short) 0, (int) (byte) -1, 12, (int) ' ', (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        mutableDateTime6.setMillis((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withField(dateTimeFieldType18, (int) '4');
        int int21 = mutableDateTime6.get(dateTimeFieldType18);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        java.lang.Object obj29 = mutableDateTime28.clone();
        org.joda.time.Chronology chronology30 = mutableDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.era();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setRounding(dateTimeField31, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:27.950Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:27.950Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:27.950Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86399999 + "'", int21 == 86399999);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(obj29);
// flaky:         org.junit.Assert.assertEquals(obj29.toString(), "1969-12-31T14:48:27.951Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1969-12-31T14:48:27.951Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1969-12-31T14:48:27.951Z");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"clockhourOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology8.getDateTimeMillis(0L, 86399999, 21, (-1), 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:28.099Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:28.099Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:28.099Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = property6.setCopy("", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = partial0.toString("1969-12-31T13:48:28.296-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.Class<?> wildcardClass1 = dateTimeFieldType0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(31, (-1), 0, 0, 0, (int) (short) -1, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = localDate8.getField((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate8.toString("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale15 = locale14.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = property11.set("hi!", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:29.055Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:29.055Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:29.055Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = localDate8.getField((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeField18.set((-1L), "clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"clockhourOfDay\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = locale9.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateMidnight4.toString("PT0S", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period6 = period5.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period5.getValue(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        java.lang.Object obj14 = mutableDateTime13.clone();
        org.joda.time.Chronology chronology15 = mutableDateTime13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) period6, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "1969-12-31T14:48:29.556Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1969-12-31T14:48:29.556Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1969-12-31T14:48:29.556Z");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = property16.setCopy("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"clockhourOfDay\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(20, (int) 'u', 4, (-292275054), (int) (byte) 10, (-292275054), 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        org.joda.time.DateTime dateTime8 = dateTime5.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((java.lang.Object) "United States", chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate39 = localDate36.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0S");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        int int11 = dateTimeField9.getMaximumValue((long) (short) 100);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeField9.getAsShortText(100, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:29.856Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:29.856Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:29.856Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime localTime3 = localTime0.withHourOfDay(20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime0.withSecondOfMinute((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.Partial partial10 = partial0.with(dateTimeFieldType6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = partial0.getFieldType(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(partial10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:30.279Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:30.279Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:30.279Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField11.set((long) 'u', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "1969-12-31T14:48:30.413Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1969-12-31T14:48:30.413Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1969-12-31T14:48:30.413Z");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) -1, periodType18, chronology19);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (short) -1, periodType22, chronology23);
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod24);
        int[] intArray27 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod24, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(86399999, 0, 31, 23, (int) (short) 10, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "1969-12-31T14:48:30.776Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "1969-12-31T14:48:30.776Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "1969-12-31T14:48:30.776Z");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) -1, periodType17, chronology18);
        mutablePeriod15.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        int[] intArray22 = chronology9.get((org.joda.time.ReadablePeriod) mutablePeriod19, (long) (short) 100);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime localTime26 = localTime23.withHourOfDay(20);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Period period34 = period29.withWeeks((int) (byte) -1);
        int[] intArray35 = period34.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate((org.joda.time.ReadablePartial) localTime23, intArray35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "1969-12-31T14:48:30.935Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1969-12-31T14:48:30.935Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1969-12-31T14:48:30.935Z");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, -1, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.Period period2 = new org.joda.time.Period(100L, (long) '#');
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekOfWeekyear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property7.set("PT0S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight8 = org.joda.time.DateMidnight.now(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = localDate6.toDateMidnight(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate6.withDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = localDateTime7.isSupported(durationFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.property(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.dayOfMonth();
        int int27 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        int int28 = localDateTime7.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599990L) + "'", long22 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 69 + "'", int28 == 69);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology11 = mutableDateTime9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((int) '4', 31, (int) (byte) 100, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "1969-12-31T14:48:31.625Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1969-12-31T14:48:31.625Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1969-12-31T14:48:31.625Z");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime.Property property2 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addCopy((long) 4);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone5);
        org.joda.time.Chronology chronology10 = chronology2.withZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology10.getDateTimeMillis(59L, 0, 0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3599990L) + "'", long7 == (-3599990L));
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.withField(dateTimeFieldType7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.property(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(8, 86399999, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'clockhourOfDay' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfWeek(49709009);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49709009 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 1.0f, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime.Property property2 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addCopy(31);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("ISOChronology[Etc/UTC]", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[Etc/UTC]\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        int int18 = localDate17.getCenturyOfEra();
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDate17.toString("hi!", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property39 = localDate36.property(dateTimeFieldType38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0S");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        boolean boolean11 = dateTime10.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        java.lang.Object obj11 = mutableDateTime10.clone();
        org.joda.time.Chronology chronology12 = mutableDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.era();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType3.getField(chronology12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (short) -1, periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (short) -1, periodType20, chronology21);
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        int[] intArray25 = chronology12.get((org.joda.time.ReadablePeriod) mutablePeriod22, (long) (short) 100);
        java.lang.String str26 = chronology12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((int) (byte) 10, (-3600000), (int) (byte) 1, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "1969-12-31T14:48:33.007Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1969-12-31T14:48:33.007Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1969-12-31T14:48:33.007Z");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str26, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) 'u');
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withMonthOfYear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:33.085Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:33.085Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:33.085Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599990L) + "'", long12 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone6);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 59);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = timeOfDay12.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 59L + "'", long11 == 59L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        mutablePeriod3.add((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = mutablePeriod3.getFieldType(69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(12, 100, 23, 49709009, 1969, (int) ' ', (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49709009 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) chronology8, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:33.665Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:33.665Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:33.665Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals(obj19.toString(), "1969-12-31T14:48:33.665Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "1969-12-31T14:48:33.665Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "1969-12-31T14:48:33.665Z");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        java.lang.Object obj11 = mutableDateTime10.clone();
        org.joda.time.Chronology chronology12 = mutableDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) '4', (int) (short) -1, (int) '4', (int) ' ', chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "1969-12-31T14:48:33.788Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1969-12-31T14:48:33.788Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1969-12-31T14:48:33.788Z");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 49709009);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 49709009");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = locale15.getISO3Country();
        java.lang.String str18 = dateTimeField11.getAsShortText((long) 31, locale15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now(dateTimeZone20);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfDay();
        org.joda.time.LocalTime localTime26 = property25.roundCeilingCopy();
        org.joda.time.LocalTime localTime27 = property25.getLocalTime();
        int[] intArray32 = new int[] { 31, (short) 100, 14 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = dateTimeField11.set((org.joda.time.ReadablePartial) localTime27, (int) (byte) 1, intArray32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "1969-12-31T14:48:33.859Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1969-12-31T14:48:33.859Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1969-12-31T14:48:33.859Z");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599990L) + "'", long22 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[31, 100, 14]");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        long long25 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) 59);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay13.toDateMidnight(dateTimeZone15);
        mutableDateTime6.setZoneRetainFields(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay29.toDateTime(timeOfDay30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime31.toMutableDateTime();
        java.lang.Object obj35 = mutableDateTime34.clone();
        org.joda.time.Chronology chronology36 = mutableDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        boolean boolean39 = dateTimeField37.isLeap((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setRounding(dateTimeField37, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599990L) + "'", long17 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599990L) + "'", long22 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 59L + "'", long25 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(obj35);
// flaky:         org.junit.Assert.assertEquals(obj35.toString(), "1969-12-31T14:48:33.905Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "1969-12-31T14:48:33.905Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "1969-12-31T14:48:33.905Z");
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight21 = property19.addWrapFieldToCopy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight23 = property19.setCopy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight21);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate19.withMonthOfYear(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) property10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.LocalDate localDate9 = dateMidnight8.toLocalDate();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.LocalDate localDate16 = localDate9.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod13, (int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate9.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate9.minusDays((int) (short) 10);
        int int21 = localDate20.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long25 = dateTimeZone23.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withField(dateTimeFieldType27, (int) '4');
        org.joda.time.LocalDate localDate30 = dateMidnight29.toLocalDate();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        java.lang.Object obj35 = mutablePeriod34.clone();
        org.joda.time.LocalDate localDate37 = localDate30.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod34, (int) (byte) 1);
        org.joda.time.Period period38 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate20, (org.joda.time.ReadablePartial) localDate37);
        org.joda.time.Chronology chronology39 = localDate20.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.millis();
        org.joda.time.DurationField durationField41 = chronology39.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((java.lang.Object) 100.0f, chronology39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT0S");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3599990L) + "'", long25 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "PT0S");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime11.getField(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period13 = period10.plusHours((int) 'a');
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period15 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        boolean boolean19 = period13.isSupported(durationFieldType16);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay7.withFieldAdded(durationFieldType16, 30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) timeOfDay21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.TimeOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeOfDay21);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '4', 1969, 2022, (-3600000), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-01:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        int int9 = dateMidnight7.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((-292275054));
        org.joda.time.YearMonthDay yearMonthDay7 = dateTime4.toYearMonthDay();
        int int8 = yearMonthDay7.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property10 = yearMonthDay7.property(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1969 + "'", int8 == 1969);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = chronology1.getDateTimeMillis(31, 2022, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.minusHours(12);
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology11 = mutableDateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 12, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "1969-12-31T14:48:37.413Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1969-12-31T14:48:37.413Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1969-12-31T14:48:37.413Z");
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfMonth();
        int int9 = property8.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime10.getValue(49709009);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 49709009");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTime();
        java.lang.Object obj9 = mutableDateTime8.clone();
        org.joda.time.Chronology chronology10 = mutableDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology10.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(603, 3, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 603 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "1969-12-31T14:48:37.437Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "1969-12-31T14:48:37.437Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "1969-12-31T14:48:37.437Z");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        java.lang.Object obj14 = mutableDateTime13.clone();
        org.joda.time.Chronology chronology15 = mutableDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.millisOfSecond();
        org.joda.time.DurationField durationField18 = chronology15.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(12, (-1), (int) '#', 3, 14, (int) '4', (int) (short) 100, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "1969-12-31T14:48:37.474Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1969-12-31T14:48:37.474Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1969-12-31T14:48:37.474Z");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType2 = partial0.getFieldType((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField7 = null;
        mutableDateTime6.setRounding(dateTimeField7, (int) '#');
        mutableDateTime6.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone14);
        mutableDateTime6.setZoneRetainFields(dateTimeZone14);
        int int20 = mutableDateTime6.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setTime(3, 69, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((long) 86399999);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plus(readableDuration13);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime14, (org.joda.time.ReadablePartial) timeOfDay15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        long long5 = durationField2.subtract((-1L), (-3599990L));
        int int7 = durationField2.getValue((long) (short) 0);
        java.lang.String str8 = durationField2.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3599989999L + "'", long5 == 3599989999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "seconds" + "'", str8, "seconds");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        int int19 = timeOfDay7.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = timeOfDay7.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 848 + "'", int19 == 848);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean11 = localDate8.isSupported(dateTimeFieldType10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate8, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("1969-12-31T13:48:28.296-01:00", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(59);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withTime(365, 20, 30, (-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599990L) + "'", long15 == (-3599990L));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, readableDuration7, periodType8);
        org.joda.time.DateTime dateTime12 = dateTime3.withMillisOfDay(1970);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTime12.get(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("d\351c.", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = yearMonthDay5.toString("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((long) 86399999);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight22 = localDate19.toDateMidnight(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight22);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        int int11 = localDate10.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        boolean boolean8 = property7.isLeap();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property7.set("PT0S", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone13);
        long long18 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((int) (byte) -1, 3, (-3600000), 86399999, (int) (byte) -1, 8, 21, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599990L) + "'", long15 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 59L + "'", long18 == 59L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = localDate36.compareTo((org.joda.time.ReadablePartial) localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0S");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("seconds", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDate18.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:38.985Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:38.985Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:38.985Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        boolean boolean11 = dateTimeField9.isLeap((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeField21.getAsText((long) 100, locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeField9.getAsText(31, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:39.105Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:39.105Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:39.105Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "82800" + "'", str24, "82800");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property13 = localDateTime9.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = property19.setCopy("2022-02-21");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology8.getDateTimeMillis(1, 22, 97, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:39.219Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:39.219Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:39.219Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("PT0S", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = property19.setCopy("1969-12-31T13:48:28.296-01:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T13:48:28.296-01:00\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime3.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withDayOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray1 = new int[] {};
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Partial partial3 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray1, chronology2);
        int[] intArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial5 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology8.getDateTimeMillis(14, 182, 2, 3, (int) (short) 10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 182 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:39.604Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:39.604Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:39.604Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone8);
        org.joda.time.DateTime dateTime13 = dateTime3.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 14, (int) (byte) 0);
        boolean boolean18 = dateTime13.isBefore((long) 851);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        java.lang.Object obj24 = mutableDateTime23.clone();
        org.joda.time.Chronology chronology25 = mutableDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.era();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = localDate8.withField(dateTimeFieldType28, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals(obj24.toString(), "1969-12-31T14:48:39.707Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "1969-12-31T14:48:39.707Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "1969-12-31T14:48:39.707Z");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.plusMonths(0);
        org.joda.time.Duration duration22 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration22);
        int int24 = dateMidnight8.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1972 + "'", int24 == 1972);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTime.Property property7 = dateTime6.year();
        int int8 = dateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        mutablePeriod3.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = dateTime10.withZoneRetainFields(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((java.lang.Object) ' ', dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "P32Y");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology11 = mutableDateTime9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology11.add(readablePeriod13, (long) (byte) -1, 1969);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(1972, (int) (byte) -1, 603, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "1969-12-31T14:48:40.170Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1969-12-31T14:48:40.170Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1969-12-31T14:48:40.170Z");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay5.dayOfMonth();
        int int8 = yearMonthDay5.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        java.lang.Object obj17 = mutableDateTime16.clone();
        org.joda.time.Chronology chronology18 = mutableDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.era();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType9.getField(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) int8, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "1969-12-31T14:48:40.210Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1969-12-31T14:48:40.210Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1969-12-31T14:48:40.210Z");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDate8.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        boolean boolean10 = durationField9.isPrecise();
        long long11 = durationField9.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:40.616Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:40.616Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:40.616Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 31556952000L + "'", long11 == 31556952000L);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("dayOfMonth", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        long long25 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) 59);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay13.toDateMidnight(dateTimeZone15);
        mutableDateTime6.setZoneRetainFields(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setSecondOfMinute(97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599990L) + "'", long17 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599990L) + "'", long22 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 59L + "'", long25 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight26);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, readableDuration14, periodType15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = dateTime21.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime10.withZone(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        org.joda.time.DateTime dateTime32 = dateTime28.withEarlierOffsetAtOverlap();
        int int33 = dateTime28.getYearOfCentury();
        int int34 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(19, 8, (int) (byte) 1, (int) (byte) 0, 20, 97, (int) '4', dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 69 + "'", int33 == 69);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.parse("d\351c.", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withDayOfYear(851);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 851 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int) '#', 86399, 1, (int) (byte) 10, 603, 30, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 603 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology11 = mutableDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.era();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology11.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(571, (int) '4', 69, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "1969-12-31T14:48:41.557Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1969-12-31T14:48:41.557Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1969-12-31T14:48:41.557Z");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray1 = new int[] {};
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Partial partial3 = new org.joda.time.Partial(dateTimeFieldTypeArray0, intArray1, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale20.getVariant();
        java.lang.String str22 = locale20.getISO3Country();
        java.lang.String str23 = dateTimeField16.getAsShortText((long) 31, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = partial3.toString("seconds", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "1969-12-31T14:48:41.612Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "1969-12-31T14:48:41.612Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "1969-12-31T14:48:41.612Z");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withField(dateTimeFieldType8, (int) (byte) 1);
        int int11 = dateMidnight4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime localTime3 = localTime0.withHourOfDay(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withField(dateTimeFieldType4, 259);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 259 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, readableDuration7, periodType8);
        org.joda.time.Period period11 = period10.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period11.withWeeks(571);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) ' ');
        int int2 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DurationField durationField5 = durationFieldType3.getField(chronology4);
        long long8 = durationField5.subtract((-1L), (-3599990L));
        int int10 = durationField5.getValue((long) (short) 0);
        int int11 = durationField2.compareTo(durationField5);
        long long14 = durationField2.getValueAsLong((long) 14, (long) 1970);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3599989999L + "'", long8 == 3599989999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(31);
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = localTime7.isAfter(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        int int9 = dateTimeZone5.getStandardOffset((long) (byte) 100);
        int int11 = dateTimeZone5.getStandardOffset((long) 1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(86399999, 49709009, 2022, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49709009 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3599990L) + "'", long7 == (-3599990L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3600000) + "'", int9 == (-3600000));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) '#', (-292275054), (-3600000), 30, 2022, 49709009, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = org.joda.time.DateMidnight.parse("year", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.Partial partial10 = partial0.with(dateTimeFieldType6, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        int int15 = mutablePeriod14.getHours();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weekyears();
        int int17 = mutablePeriod14.get(durationFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial19 = partial0.withFieldAdded(durationFieldType16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField7 = null;
        mutableDateTime6.setRounding(dateTimeField7, (int) '#');
        mutableDateTime6.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone14);
        mutableDateTime6.setZoneRetainFields(dateTimeZone14);
        mutableDateTime6.setHourOfDay((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay22 = property19.setCopy("PT1009843200S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT1009843200S\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("seconds", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.halfdayOfDay();
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        int int25 = dateTimeField23.getMaximumTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = property16.setCopy("999", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(97, 571, 21, (int) 'u', 59, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 851);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("12", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.Chronology chronology19 = mutableDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.era();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) dateTimeField10, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:45.575Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:45.575Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:45.575Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(obj18);
// flaky:         org.junit.Assert.assertEquals(obj18.toString(), "1969-12-31T14:48:45.575Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "1969-12-31T14:48:45.575Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "1969-12-31T14:48:45.575Z");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DurationField durationField5 = durationFieldType3.getField(chronology4);
        long long8 = durationField5.subtract((-1L), (-3599990L));
        int int10 = durationField5.getValue((long) (short) 0);
        int int11 = durationField2.compareTo(durationField5);
        long long14 = durationField2.subtract(23L, 0);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3599989999L + "'", long8 == 3599989999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 23L + "'", long14 == 23L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 851);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter2.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        int int8 = mutableDateTime6.getHourOfDay();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay14.monthOfYear();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        mutableDateTime6.setRounding(dateTimeField17);
        org.joda.time.DurationField durationField19 = dateTimeField17.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField17.set((long) 3, "d\351c.");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"de?c.\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:45.902Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:45.902Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:45.902Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMinutes((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.withField(dateTimeFieldType19, (int) '4');
        org.joda.time.LocalDate localDate22 = dateMidnight21.toLocalDate();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableDuration24);
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.LocalDate localDate29 = localDate22.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod26, (int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate22.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate33 = localDate22.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long37 = dateTimeZone35.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = localDate33.toDateTimeAtStartOfDay(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDate33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599990L) + "'", long17 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "PT0S");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3599990L) + "'", long37 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.addCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        int int7 = dateTime3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) int7, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(0);
        int int12 = localDateTime11.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withDayOfMonth(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        java.lang.Class<?> wildcardClass19 = yearMonthDay5.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = localDateTime7.isSupported(durationFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withYearOfCentury(20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime7.withDayOfMonth(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime4.yearOfEra();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime10 = property7.setCopy((int) (short) 100);
        int int11 = dateTime10.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long6 = dateTimeZone4.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withField(dateTimeFieldType8, (int) '4');
        org.joda.time.LocalDate localDate11 = dateMidnight10.toLocalDate();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableDuration13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        java.lang.Object obj16 = mutablePeriod15.clone();
        org.joda.time.LocalDate localDate18 = localDate11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, (int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate11.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = localDate11.minusDays((int) (short) 10);
        int int23 = localDate22.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long27 = dateTimeZone25.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withField(dateTimeFieldType29, (int) '4');
        org.joda.time.LocalDate localDate32 = dateMidnight31.toLocalDate();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.MutablePeriod mutablePeriod36 = period35.toMutablePeriod();
        java.lang.Object obj37 = mutablePeriod36.clone();
        org.joda.time.LocalDate localDate39 = localDate32.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod36, (int) (byte) 1);
        org.joda.time.Period period40 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.Chronology chronology41 = localDate22.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(571, 1, 571, chronology41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 571 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3599990L) + "'", long6 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "PT0S");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3599990L) + "'", long27 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "PT0S");
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        mutablePeriod3.add((long) (short) 0);
        int int6 = mutablePeriod3.getSeconds();
        int int7 = mutablePeriod3.size();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutablePeriod3.getValue(571);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 571");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(59);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime10.withDayOfWeek(851);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 851 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(1);
        org.joda.time.LocalTime localTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDate18.toLocalDateTime(localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.minusHours(12);
        org.joda.time.DateTime dateTime3 = localTime0.toDateTimeToday();
        int int4 = dateTime3.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DurationField durationField15 = durationFieldType13.getField(chronology14);
        boolean boolean16 = localDateTime9.isSupported(durationFieldType13);
        int int17 = localDateTime9.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology11 = mutableDateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((int) (byte) 1, (int) '4', (int) (short) -1, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "1969-12-31T14:48:46.811Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1969-12-31T14:48:46.811Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1969-12-31T14:48:46.811Z");
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime5.withFieldAdded(durationFieldType7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = localDateTime7.isSupported(durationFieldType10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.weekOfWeekyear();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) localDateTime7, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        java.lang.Object obj12 = mutablePeriod11.clone();
        mutablePeriod11.setYears((int) ' ');
        int int15 = mutablePeriod11.getDays();
        mutableDateTime6.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfYear(1972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1972 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:47.171Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:47.171Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:47.171Z");
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P32Y");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(59);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withEra(851);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 851 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599990L) + "'", long15 == (-3599990L));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, (int) '#');
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DurationField durationField5 = durationFieldType3.getField(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial7 = partial2.withFieldAddWrapped(durationFieldType3, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = localDateTime7.isSupported(durationFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime7.withYearOfEra(21);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime7.minusYears((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMinuteOfHour(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withField(dateTimeFieldType18, (int) '4');
        boolean boolean21 = dateMidnight12.isBefore((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = dateMidnight12.isEqual(readableInstant22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = mutableDateTime6.compareTo(readableInstant22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:47.452Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:47.452Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:47.452Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(0);
        int int12 = localDateTime9.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1910 + "'", int12 == 1910);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTime dateTime7 = dateTime4.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withYearOfCentury(182);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 182 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime7.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray12 = new int[] {};
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Partial partial14 = new org.joda.time.Partial(dateTimeFieldTypeArray11, intArray12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withField(dateTimeFieldType20, (int) '4');
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.LocalDate localDate30 = localDate23.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod27, (int) (byte) 1);
        org.joda.time.LocalDate localDate32 = localDate23.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate34 = localDate23.minusDays((int) (short) 10);
        int int35 = localDate34.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long39 = dateTimeZone37.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.withField(dateTimeFieldType41, (int) '4');
        org.joda.time.LocalDate localDate44 = dateMidnight43.toLocalDate();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableDuration46);
        org.joda.time.MutablePeriod mutablePeriod48 = period47.toMutablePeriod();
        java.lang.Object obj49 = mutablePeriod48.clone();
        org.joda.time.LocalDate localDate51 = localDate44.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod48, (int) (byte) 1);
        org.joda.time.Period period52 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate34, (org.joda.time.ReadablePartial) localDate51);
        org.joda.time.Chronology chronology53 = localDate34.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial54 = new org.joda.time.Partial(dateTimeFieldTypeArray10, intArray12, chronology53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3599990L) + "'", long18 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "PT0S");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-3599990L) + "'", long39 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "PT0S");
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(chronology53);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        java.lang.Object obj11 = mutableDateTime10.clone();
        org.joda.time.Chronology chronology12 = mutableDateTime10.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, (long) (byte) -1, 1969);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.halfdayOfDay();
        boolean boolean19 = dateTimeFieldType3.isSupported(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime1.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "1969-12-31T14:48:47.818Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1969-12-31T14:48:47.818Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1969-12-31T14:48:47.818Z");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("December");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"December\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        int int9 = property6.getMinimumValueOverall();
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = property6.getAsText(locale10);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale10.getDisplayName(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "December" + "'", str11, "December");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        int int8 = mutableDateTime6.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        mutablePeriod12.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTime(timeOfDay18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTime();
        org.joda.time.DateTime dateTime23 = dateTime19.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration24 = mutablePeriod12.toDurationTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration25 = duration24.toDuration();
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration24);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMonthOfYear(259);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 259 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:48.010Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:48.010Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:48.010Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "P32Y");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration25);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "eng", "monthOfYear", "ISOChronology[Etc/UTC]", "seconds", "999", "82800000", "\u30ab\u30ca\u30c0", "December", "year", "1969-12-29T00:00:00.000", "seconds", "-1", "GBR", "-1", "999", "1970", "1970", "1970-01-01T00:00:00.010", "PT0S", "monthOfYear", "892", "GBR", "1970", "Dec", "82800000", "ISOChronology[UTC]", "d\351c.", "United States", "2022-02-21T14:48:47.294Z", "2022-02-21", "274", "82800", "PeriodType[YearMonthDay]", "weekyears" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.parse("monthOfYear", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 851);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer6 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis((-292275054));
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime11.toYearMonthDay();
        int int15 = yearMonthDay14.getYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long19 = dateTimeZone17.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.withField(dateTimeFieldType21, (int) '4');
        org.joda.time.LocalDate localDate24 = dateMidnight23.toLocalDate();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.LocalDate localDate31 = localDate24.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod28, (int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay14.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadablePartial) yearMonthDay14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1969 + "'", int15 == 1969);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3599990L) + "'", long19 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "PT0S");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(yearMonthDay32);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 365);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = localTime9.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49728473 + "'", int10 == 49728473);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        java.lang.Object obj16 = mutableDateTime15.clone();
        org.joda.time.Chronology chronology17 = mutableDateTime15.getChronology();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime15.add(readableDuration18);
        mutableDateTime15.setMillis((long) (-1));
        int int22 = mutableDateTime15.getMinuteOfHour();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        int int24 = mutableDateTime6.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime6.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setSecondOfMinute(851);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 851 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:48.495Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:48.495Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:48.495Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "1969-12-31T14:48:48.495Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "1969-12-31T14:48:48.495Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "1969-12-31T14:48:48.495Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86399 + "'", int24 == 86399);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekyear();
        int int11 = property10.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusMonths((int) ' ');
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DurationField durationField25 = durationFieldType23.getField(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withFieldAdded(durationFieldType23, 14);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withYearOfCentury((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = localDateTime36.getFieldTypes();
        org.joda.time.Chronology chronology40 = localDateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfDay();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableDuration43);
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        java.lang.Object obj46 = mutablePeriod45.clone();
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod45.toMutablePeriod();
        mutablePeriod47.setPeriod((int) (short) 100, (int) (short) 10, (-292275054), 14, 12, (int) (byte) -1, 4, 31);
        int[] intArray59 = chronology40.get((org.joda.time.ReadablePeriod) mutablePeriod47, (long) 851, 978307200035L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = dateTimeField12.set((org.joda.time.ReadablePartial) localDateTime22, 31, intArray59, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-292275054) + "'", int11 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599990L) + "'", long17 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3599990L) + "'", long33 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[30, 11, 4, 2, 23, 59, 59, 184]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, readableDuration7, periodType8);
        org.joda.time.PeriodType periodType11 = periodType8.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.Partial partial10 = partial0.with(dateTimeFieldType6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = partial0.getFieldType(851);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 851");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(partial10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        boolean boolean2 = locale0.equals((java.lang.Object) instant1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone13);
        long long18 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) 59);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(49709, (int) (short) 0, 571, (int) (byte) 10, 49709009, 1972, 0, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49709009 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599990L) + "'", long15 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 59L + "'", long18 == 59L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 851);
        java.lang.Appendable appendable5 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (org.joda.time.ReadablePartial) localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        long long5 = durationField2.subtract((-1L), (-3599990L));
        long long8 = durationField2.getMillis(1L, 100L);
        boolean boolean9 = durationField2.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3599989999L + "'", long5 == 3599989999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1000L + "'", long8 == 1000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String str2 = partial0.toString("82800000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = partial0.toString("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "82800000" + "'", str2, "82800000");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        boolean boolean12 = dateTimeField10.isLeap((long) 'u');
        java.lang.String str14 = dateTimeField10.getAsText((-1L));
        org.joda.time.DurationField durationField15 = dateTimeField10.getLeapDurationField();
        int int16 = dateTimeField10.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:49.295Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:49.295Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:49.295Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "999" + "'", str14, "999");
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DurationField durationField22 = durationFieldType20.getField(chronology21);
        boolean boolean23 = localDateTime17.isSupported(durationFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = localTime9.isEqual((org.joda.time.ReadablePartial) localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withField(dateTimeFieldType8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial12 = new org.joda.time.Partial(dateTimeFieldType8, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = localDate8.getField((int) (short) 0);
        int int21 = dateTimeField18.getDifference((long) 59, (long) (byte) 0);
        java.lang.String str22 = dateTimeField18.getName();
        java.util.Locale locale25 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = dateTimeField18.set((long) (short) 0, "December", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"December\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "year" + "'", str22, "year");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(1);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        java.lang.Object obj26 = mutablePeriod25.clone();
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod25.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        mutablePeriod25.setPeriod(readableDuration28, chronology30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long36 = dateTimeZone34.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 31, dateTimeZone34);
        org.joda.time.Chronology chronology39 = chronology30.withZone(dateTimeZone34);
        boolean boolean41 = dateTimeZone34.isStandardOffset((long) 259);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) localDate20, dateTimeZone34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-3599990L) + "'", long36 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withChronology(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.parse("DateTimeField[era]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) mutableDateTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.MutableDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0 };
        int[] intArray4 = new int[] { 1, 100 };
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial9 = new org.joda.time.Partial(dateTimeFieldTypeArray1, intArray4, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusYears(0);
        int int13 = localDateTime10.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, readableDuration8, periodType9);
        org.joda.time.PeriodType periodType12 = periodType9.withMinutesRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 23, periodType9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight15 = org.joda.time.DateMidnight.now(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) period13, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 182);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(14);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime14, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays((-292275054));
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localDateTime12.isEqual((org.joda.time.ReadablePartial) localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("d\351c.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"de?c.\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        int int5 = dateTimeField3.getMaximumTextLength(locale4);
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = property7.getAsText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property7.add(1568664811008000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1568664811008000000 * 60000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "48" + "'", str10, "48");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime localTime3 = localTime0.withHourOfDay(20);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = dateTimeZone5.getShortName((long) 86399999, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime0.toString("1969-12-31T13:48:49.073-01:00", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay5.dayOfMonth();
        java.lang.String str8 = property7.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay10 = property7.setCopy("PT0S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "30" + "'", str8, "30");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone6);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 59);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(dateTimeZone6);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.hourOfDay();
        java.lang.String str14 = property13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 59L + "'", long11 == 59L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[hourOfDay]" + "'", str14, "Property[hourOfDay]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(100L, chronology14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray18 = new int[] {};
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Partial partial20 = new org.joda.time.Partial(dateTimeFieldTypeArray17, intArray18, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = dateTimeField10.add((org.joda.time.ReadablePartial) timeOfDay15, 113, intArray18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 113");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:51.558Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:51.558Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:51.558Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long6 = dateTimeZone4.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withField(dateTimeFieldType8, (int) '4');
        org.joda.time.LocalDate localDate11 = dateMidnight10.toLocalDate();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableDuration13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        java.lang.Object obj16 = mutablePeriod15.clone();
        org.joda.time.LocalDate localDate18 = localDate11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, (int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate11.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfYear(3);
        org.joda.time.LocalDate localDate24 = localDate22.withYear((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period34 = period31.plusHours((int) 'a');
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Period period36 = period34.negated();
        int[] intArray38 = chronology28.get((org.joda.time.ReadablePeriod) period34, (-1L));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight44.withField(dateTimeFieldType45, (int) '4');
        org.joda.time.LocalDate localDate48 = dateMidnight47.toLocalDate();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableDuration50);
        org.joda.time.MutablePeriod mutablePeriod52 = period51.toMutablePeriod();
        java.lang.Object obj53 = mutablePeriod52.clone();
        org.joda.time.LocalDate localDate55 = localDate48.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod52, (int) (byte) 1);
        org.joda.time.LocalDate localDate57 = localDate48.withYearOfEra(59);
        org.joda.time.LocalDate.Property property58 = localDate48.monthOfYear();
        java.util.Locale locale59 = java.util.Locale.ENGLISH;
        java.lang.String str60 = property58.getAsShortText(locale59);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = dateTimeField2.set((org.joda.time.ReadablePartial) localDate24, (int) (short) -1, intArray38, "1969-12-31T13:48:28.296-01:00", locale59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T13:48:28.296-01:00\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3599990L) + "'", long6 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "PT0S");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3599990L) + "'", long43 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(mutablePeriod52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "PT0S");
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Feb" + "'", str60, "Feb");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, (long) (byte) -1, 1969);
        org.joda.time.DurationField durationField14 = chronology8.months();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime18.toMutableDateTime();
        java.lang.Object obj22 = mutableDateTime21.clone();
        org.joda.time.Chronology chronology23 = mutableDateTime21.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.weekyears();
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) durationField14, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:51.671Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:51.671Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:51.671Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(obj22);
// flaky:         org.junit.Assert.assertEquals(obj22.toString(), "1969-12-31T14:48:51.671Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "1969-12-31T14:48:51.671Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "1969-12-31T14:48:51.671Z");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = localDateTime7.isSupported(durationFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime7.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField20 = localDateTime7.getField(445);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 445");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(30, (int) (byte) 10, 1969, 316, (int) 'a', 100, 365, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 316 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period7 = period2.withWeeks((int) (byte) -1);
        int[] intArray8 = period7.getValues();
        org.joda.time.Period period9 = period7.negated();
        int int10 = period7.getYears();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.halfdayOfDay();
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        int int25 = dateTimeField23.getMaximumTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = property16.setCopy("1910", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1910 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str9 = dateTimeFieldType8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = timeOfDay7.withField(dateTimeFieldType8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "clockhourOfDay" + "'", str9, "clockhourOfDay");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        boolean boolean19 = localDate8.isSupported(durationFieldType18);
        org.joda.time.LocalDate.Property property20 = localDate8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.LocalDate localDate38 = localDate29.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate40 = localDate29.minusDays((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology42 = null;
        boolean boolean43 = dateTimeFieldType41.isSupported(chronology42);
        boolean boolean44 = localDate29.isSupported(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = localDate8.get(dateTimeFieldType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0S");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) 'u');
        org.joda.time.DateTime dateTime10 = dateTime5.minusHours(31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime5.toString("1969-12-31T13:48:28.296-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property6.addToCopy((-3600000));
        java.lang.String str11 = property6.getAsText();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "365" + "'", str11, "365");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone4 = chronology1.getZone();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = partial0.getFormatter();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, (int) '4');
        org.joda.time.DateTime dateTime10 = dateMidnight9.toDateTime();
        boolean boolean11 = partial0.isMatch((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableDuration13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.PeriodType periodType16 = mutablePeriod15.getPeriodType();
        org.joda.time.Partial partial17 = partial0.plus((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial20 = partial0.with(dateTimeFieldType18, 30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(partial17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((long) 86399999);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long11 = dateTimeZone9.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime4.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime14, periodType18);
        org.joda.time.PeriodType periodType20 = mutablePeriod19.getPeriodType();
        boolean boolean22 = periodType20.equals((java.lang.Object) 'u');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3599990L) + "'", long11 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((-292275054));
        org.joda.time.YearMonthDay yearMonthDay7 = dateTime4.toYearMonthDay();
        int int8 = yearMonthDay7.getYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DurationField durationField21 = durationFieldType19.getField(chronology20);
        boolean boolean22 = localDateTime16.isSupported(durationFieldType19);
        java.lang.String str23 = durationFieldType19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay7.withFieldAdded(durationFieldType19, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1969 + "'", int8 == 1969);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3599990L) + "'", long13 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "seconds" + "'", str23, "seconds");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        mutablePeriod3.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime14 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration15 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        java.lang.Object obj20 = mutablePeriod19.clone();
        mutablePeriod19.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime30 = dateTime26.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration31 = mutablePeriod19.toDurationTo((org.joda.time.ReadableInstant) dateTime26);
        long long32 = duration31.getMillis();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime37.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime43 = dateTime37.withDurationAdded(readableDuration41, (int) (short) 1);
        int int44 = dateTime37.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay47.toDateTime(timeOfDay48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime49.toMutableDateTime();
        java.lang.Object obj53 = mutableDateTime52.clone();
        org.joda.time.Chronology chronology54 = mutableDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.era();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType45.getField(chronology54);
        org.joda.time.DateTime dateTime58 = dateTime37.withField(dateTimeFieldType45, 59);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long70 = dateTimeZone68.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone68);
        org.joda.time.DateTime dateTime73 = dateTime63.withZoneRetainFields(dateTimeZone68);
        org.joda.time.DateTime dateTime76 = dateTime73.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableDuration59, (org.joda.time.ReadableInstant) dateTime73, periodType77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) dateTime37, periodType77);
        int int80 = dateTime37.getSecondOfMinute();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "P1669W5D");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "P1669W5D");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "P1669W5D");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "P32Y");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1009843200000L + "'", long32 == 1009843200000L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 85 + "'", int44 == 85);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(obj53);
// flaky:         org.junit.Assert.assertEquals(obj53.toString(), "1969-12-31T14:48:53.086Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1969-12-31T14:48:53.086Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1969-12-31T14:48:53.086Z");
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-3599990L) + "'", long70 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(periodType77);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 53 + "'", int80 == 53);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        int int5 = durationField2.getDifference((long) 603, 0L);
        long long8 = durationField2.add((long) 86399, (long) 100);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 186399L + "'", long8 == 186399L);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        long long13 = dateTimeField11.roundCeiling((long) 619);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:53.296Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:53.296Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:53.296Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 345600000L + "'", long13 == 345600000L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) ' ', 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        long long14 = dateTimeZone11.previousTransition((long) 86399999);
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        int int16 = mutableDateTime10.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86399999L + "'", long14 == 86399999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.previousTransition((long) 100);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) 1969);
        org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(dateTimeZone1);
        int int7 = dateMidnight6.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField7 = null;
        mutableDateTime6.setRounding(dateTimeField7, (int) '#');
        mutableDateTime6.addWeekyears(619);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime6.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = mutableDateTime6.toString("PT1009843200S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone14);
        org.joda.time.DateTime dateTime19 = dateTime9.withZoneRetainFields(dateTimeZone14);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = dateTimeZone14.getShortName((-3599990L), locale21);
        java.lang.String str25 = dateTimeZone14.getShortName(978307200035L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-3600000), (int) (byte) 10, 31, 23, (-292275054), 86399999, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-01:00" + "'", str23, "-01:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-01:00" + "'", str25, "-01:00");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(844, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 844 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 851);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("12", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone8);
        long long13 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, (long) 59);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((-1L), dateTimeZone8);
        long long18 = dateTimeZone8.adjustOffset((long) 23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) (short) 0, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 59L + "'", long13 == 59L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 23L + "'", long18 == 23L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("274", (double) 525);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=525.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.addCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond(8);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime5.withSecondOfMinute(619);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 619 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: " + "'", str3, "java.io.IOException: ");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        int int6 = localTime5.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime5.toString("Feb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49734508 + "'", int6 == 49734508);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter2.parseLocalDateTime("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeZone4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.minus(0L);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(1970, 316, 851, 14, 445, 1970, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 445 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.minusHours(12);
        int int3 = localTime0.getMillisOfDay();
        org.joda.time.LocalTime localTime5 = localTime0.plusMinutes(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localTime0.getField(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight21 = property19.withMinimumValue();
        org.joda.time.DurationField durationField22 = property19.getLeapDurationField();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar29 = dateTime28.toGregorianCalendar();
        org.joda.time.DateTime dateTime31 = dateTime28.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long37 = dateTimeZone35.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.withField(dateTimeFieldType39, (int) '4');
        org.joda.time.LocalDate localDate42 = dateMidnight41.toLocalDate();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableDuration44);
        org.joda.time.MutablePeriod mutablePeriod46 = period45.toMutablePeriod();
        java.lang.Object obj47 = mutablePeriod46.clone();
        org.joda.time.LocalDate localDate49 = localDate42.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod46, (int) (byte) 1);
        org.joda.time.LocalDate localDate51 = localDate42.withYearOfEra(59);
        org.joda.time.LocalDate.Property property52 = localDate42.monthOfYear();
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale56 = locale55.stripExtensions();
        java.lang.String str57 = locale56.getVariant();
        java.lang.String str58 = dateTimeField33.getAsText((org.joda.time.ReadablePartial) localDate42, 365, locale56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight59 = property19.setCopy("era", locale56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"era\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3599990L) + "'", long37 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(mutablePeriod46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "PT0S");
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "365" + "'", str58, "365");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate17.withDayOfYear(3);
        int int20 = localDate19.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        mutablePeriod3.setYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableDuration8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period12 = period9.plusHours((int) 'a');
        org.joda.time.Period period14 = period9.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType15 = period9.getPeriodType();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType15, chronology17);
        int int20 = mutablePeriod19.getMonths();
        mutablePeriod19.addMinutes(525);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "P32Y");
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone8);
        org.joda.time.DateTime dateTime13 = dateTime3.withZoneRetainFields(dateTimeZone8);
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = dateTimeZone8.getShortName((-3599990L), locale15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.Chronology chronology26 = mutableDateTime24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        org.joda.time.DateMidnight dateMidnight28 = org.joda.time.DateMidnight.now(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) str17, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-01:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(obj25);
// flaky:         org.junit.Assert.assertEquals(obj25.toString(), "1969-12-31T14:48:54.853Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "1969-12-31T14:48:54.853Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "1969-12-31T14:48:54.853Z");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "48", "hi!", "United States", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "48", "hi!", "United States", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList22, filteringMode26);
        java.util.Locale locale31 = new java.util.Locale("2022-02-21", "-01:00", "1970");
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        boolean boolean33 = locale32.hasExtensions();
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale36.getVariant();
        java.lang.String str38 = locale36.getISO3Country();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay40.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay44.monthOfYear();
        int int46 = property45.getMaximumValueOverall();
        int int47 = property45.getMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTime(timeOfDay50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime51.toMutableDateTime();
        org.joda.time.DateTime dateTime55 = dateTime51.withEarlierOffsetAtOverlap();
        int int56 = property45.compareTo((org.joda.time.ReadableInstant) dateTime51);
        java.util.Locale locale57 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str58 = property45.getAsShortText(locale57);
        java.util.Locale locale59 = java.util.Locale.JAPANESE;
        java.lang.String str60 = locale57.getDisplayCountry(locale59);
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.JAPAN;
        java.util.Locale locale65 = java.util.Locale.JAPAN;
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay68 = null;
        org.joda.time.DateTime dateTime69 = yearMonthDay67.toDateTime(timeOfDay68);
        org.joda.time.DateTime dateTime71 = dateTime69.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime69.toMutableDateTime();
        java.lang.Object obj73 = mutableDateTime72.clone();
        int int74 = mutableDateTime72.getHourOfDay();
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay77 = null;
        org.joda.time.DateTime dateTime78 = yearMonthDay76.toDateTime(timeOfDay77);
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay76.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay80.monthOfYear();
        int int82 = property81.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField83 = property81.getField();
        mutableDateTime72.setRounding(dateTimeField83);
        java.util.Locale locale85 = java.util.Locale.US;
        int int86 = dateTimeField83.getMaximumTextLength(locale85);
        java.util.Locale locale87 = java.util.Locale.getDefault();
        java.lang.String str88 = locale87.getISO3Language();
        java.util.Locale locale89 = java.util.Locale.JAPANESE;
        java.util.Locale locale93 = new java.util.Locale("999", "", "0");
        java.util.Locale locale94 = java.util.Locale.ITALIAN;
        java.util.Locale[] localeArray95 = new java.util.Locale[] { locale31, locale32, locale36, locale57, locale62, locale64, locale65, locale85, locale87, locale89, locale93, locale94 };
        java.util.ArrayList<java.util.Locale> localeList96 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList96, localeArray95);
        java.util.Locale.FilteringMode filteringMode98 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList99 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList96, filteringMode98);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode24.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode26.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals(locale31.toString(), "2022-02-21_-01:00_1970");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 12 + "'", int46 == 12);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "d\351c." + "'", str58, "d\351c.");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str60, "\u30ab\u30ca\u30c0");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(obj73);
// flaky:         org.junit.Assert.assertEquals(obj73.toString(), "1969-12-31T14:48:54.909Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "1969-12-31T14:48:54.909Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "1969-12-31T14:48:54.909Z");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 14 + "'", int74 == 14);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(yearMonthDay80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 12 + "'", int82 == 12);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 9 + "'", int86 == 9);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "en");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "eng" + "'", str88, "eng");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "ja");
        org.junit.Assert.assertEquals(locale93.toString(), "999__0");
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "it");
        org.junit.Assert.assertNotNull(localeArray95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + filteringMode98 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode98.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList99);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("ISOChronology[Etc/UTC]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimeParser5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, readableDuration7, periodType8);
        org.joda.time.Period period11 = period10.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.addMinutes(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((-292275054));
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfCentury((int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime8.withMinuteOfHour(2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = localDate8.getField((int) (short) 0);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDate8.toString("1969-12-31T13:48:28.296-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, (int) '4');
        boolean boolean10 = dateMidnight1.isBefore((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.minus(0L);
        boolean boolean13 = dateMidnight9.isEqualNow();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, (int) '4');
        boolean boolean10 = dateMidnight1.isBefore((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withField(dateTimeFieldType16, (int) '4');
        org.joda.time.LocalDate localDate19 = dateMidnight18.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight18.getZone();
        boolean boolean21 = dateMidnight1.isBefore((org.joda.time.ReadableInstant) dateMidnight18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withDayOfWeek(888);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 888 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay5.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.withDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        int int10 = dateTime3.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime3.withDayOfYear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 71 + "'", int10 == 71);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: clockhourOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.minus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime4.withMinuteOfHour(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(1568664811008000000L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1568664811008000000 * 10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        mutablePeriod3.setYears((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        java.lang.Object obj16 = mutableDateTime15.clone();
        org.joda.time.Chronology chronology17 = mutableDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType8.getField(chronology17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) -1, periodType21, chronology22);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (short) -1, periodType25, chronology26);
        mutablePeriod23.add((org.joda.time.ReadablePeriod) mutablePeriod27);
        int[] intArray30 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod27, (long) (short) 100);
        java.lang.String str31 = chronology17.toString();
        mutablePeriod3.add((long) (byte) 0, chronology17);
        int int33 = mutablePeriod3.getYears();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "P32Y");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "1969-12-31T14:48:56.166Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "1969-12-31T14:48:56.166Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "1969-12-31T14:48:56.166Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str31, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        int int12 = dateTimeZone8.getStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(8, 4, 445, 20, 86399, 1, 49709009, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(603, 253, 1969, 19, 10, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundCeilingCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.Chronology chronology38 = localDate19.getChronology();
        int int39 = localDate19.getYear();
        int int40 = localDate19.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay42.toDateTime(timeOfDay43);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay42.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay46.monthOfYear();
        int int48 = property47.getMaximumValueOverall();
        int int49 = property47.getMinimumValue();
        int int50 = property47.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long54 = dateTimeZone52.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(dateTimeZone52);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight55.withField(dateTimeFieldType56, (int) '4');
        org.joda.time.LocalDate localDate59 = dateMidnight58.toLocalDate();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableDuration61);
        org.joda.time.MutablePeriod mutablePeriod63 = period62.toMutablePeriod();
        java.lang.Object obj64 = mutablePeriod63.clone();
        org.joda.time.LocalDate localDate66 = localDate59.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod63, (int) (byte) 1);
        org.joda.time.LocalDate localDate68 = localDate59.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate70 = localDate59.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long74 = dateTimeZone72.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime76 = localDate70.toDateTimeAtStartOfDay(dateTimeZone72);
        boolean boolean77 = property47.equals((java.lang.Object) localDate70);
        int int78 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate70);
        org.joda.time.LocalDate.Property property79 = localDate70.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate81 = localDate70.withYearOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0S");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 22 + "'", int40 == 22);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 12 + "'", int48 == 12);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-3599990L) + "'", long54 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(mutablePeriod63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "PT0S");
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-3599990L) + "'", long74 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(property79);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withField(dateTimeFieldType14, (int) '4');
        org.joda.time.LocalDate localDate17 = dateMidnight16.toLocalDate();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight7.withFields((org.joda.time.ReadablePartial) localDate17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate17.withDayOfMonth(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599990L) + "'", long12 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        int int24 = dateTimeZone20.getStandardOffset((long) (byte) 100);
        int int26 = dateTimeZone20.getStandardOffset((long) 1);
        org.joda.time.DateTime dateTime27 = yearMonthDay5.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime27.withMonthOfYear(603);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 603 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599990L) + "'", long22 == (-3599990L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3600000) + "'", int24 == (-3600000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-3600000) + "'", int26 == (-3600000));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(1);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate22 = property21.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate22.withEra(464);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 464 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(3599989999L);
        int int6 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime.Property property9 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.roundHalfFloorCopy();
        boolean boolean11 = localTime3.isBefore((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTime dateTime21 = dateTime18.minusMinutes((int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime();
        java.lang.Object obj30 = mutableDateTime29.clone();
        org.joda.time.Chronology chronology31 = mutableDateTime29.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.year();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((java.lang.Object) dateTime18, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) localTime3, periodType12, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(obj30);
// flaky:         org.junit.Assert.assertEquals(obj30.toString(), "1969-12-31T14:48:56.918Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "1969-12-31T14:48:56.918Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "1969-12-31T14:48:56.918Z");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withField(dateTimeFieldType10, (int) '4');
        org.joda.time.LocalDate localDate13 = dateMidnight12.toLocalDate();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.LocalDate localDate20 = localDate13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, (int) (byte) 1);
        org.joda.time.LocalDate.Property property21 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.roundFloorCopy();
        org.joda.time.LocalDate localDate23 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(1);
        org.joda.time.LocalDate localDate27 = localDate23.plusDays(31);
        int int28 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay30.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay34.monthOfYear();
        int int36 = property35.getMaximumValueOverall();
        int int37 = property35.getMinimumValue();
        int int38 = property35.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long42 = dateTimeZone40.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone40);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight43.withField(dateTimeFieldType44, (int) '4');
        org.joda.time.LocalDate localDate47 = dateMidnight46.toLocalDate();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableDuration49);
        org.joda.time.MutablePeriod mutablePeriod51 = period50.toMutablePeriod();
        java.lang.Object obj52 = mutablePeriod51.clone();
        org.joda.time.LocalDate localDate54 = localDate47.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod51, (int) (byte) 1);
        org.joda.time.LocalDate localDate56 = localDate47.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate58 = localDate47.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long62 = dateTimeZone60.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime64 = localDate58.toDateTimeAtStartOfDay(dateTimeZone60);
        boolean boolean65 = property35.equals((java.lang.Object) localDate58);
        int int66 = property35.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField67 = property35.getField();
        java.lang.String str68 = property35.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property35.getFieldType();
        org.joda.time.YearMonthDay.Property property70 = yearMonthDay1.property(dateTimeFieldType69);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay72 = property70.setCopy("2022-02-21T14:48:47.294Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:48:47.294Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12 + "'", int36 == 12);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-3599990L) + "'", long42 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "PT0S");
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-3599990L) + "'", long62 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Dec" + "'", str68, "Dec");
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(property70);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField12.set((long) (-1), "1970");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:57.203Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:57.203Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:57.203Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        mutablePeriod5.setPeriod((int) (short) 100, (int) (short) 10, (-292275054), 14, 12, (int) (byte) -1, 4, 31);
        mutablePeriod5.addSeconds((int) (short) 100);
        int int17 = mutablePeriod5.getMillis();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod22.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        mutablePeriod22.setPeriod(readableDuration25, chronology27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 31, dateTimeZone31);
        org.joda.time.Chronology chronology36 = chronology27.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField37 = chronology36.days();
        mutablePeriod5.setPeriod((long) 19, chronology36);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = chronology36.getDateTimeMillis(35L, (int) (short) 0, 316, 30, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 316 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3599990L) + "'", long33 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) ' ', 1);
        int int10 = dateMidnight9.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue(86399999, 167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86399999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "PT0S");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        java.lang.Object obj6 = mutablePeriod5.clone();
        mutablePeriod5.setYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Period period16 = period11.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType17 = period11.getPeriodType();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType17, chronology19);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(periodType17);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.halfdayOfDay();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 1, 31556952000L, periodType17, chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.dayOfWeek();
        java.util.Locale locale34 = new java.util.Locale("82800", "1969-12-29T00:00:00.000", "December");
        // The following exception was thrown during execution in test generation
        try {
            long long35 = dateTimeField28.set((long) 859, "UTC", locale34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "P32Y");
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals(locale34.toString(), "82800_1969-12-29T00:00:00.000_December");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        int int8 = mutableDateTime6.getHourOfDay();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay14.monthOfYear();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        mutableDateTime6.setRounding(dateTimeField17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime6.copy();
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:48:57.559Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:48:57.559Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:48:57.559Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(instant20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("2022-02-21T14:48:47.294Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:48:47.294Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = localDateTime7.isSupported(durationFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType14.isSupported(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.property(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime7.withYearOfEra(21);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(10L);
        boolean boolean22 = localDateTime19.isAfter((org.joda.time.ReadablePartial) localDateTime21);
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = localDateTime21.toString("DateTimeField[year]", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(49709009);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekyearOfCentury();
        long long5 = dateTimeField2.getDifferenceAsLong((long) (byte) 1, (long) 182);
        long long7 = dateTimeField2.remainder((-14042851113601L));
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86399L + "'", long7 == 86399L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate8.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.Period period1 = new org.joda.time.Period(1000L);
        org.joda.time.Days days2 = period1.toStandardDays();
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury((int) (short) 1);
        boolean boolean11 = dateMidnight9.isAfter((long) '4');
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, readableDuration20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight9, readableDuration12, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.withWeekOfWeekyear(993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 993 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(49, 32, 316);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) 'u');
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight13);
        mutableDateTime6.addMinutes(711);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setSecondOfMinute(525);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 525 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:00.531Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:00.531Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:00.531Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599990L) + "'", long12 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMonths((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long19 = dateTimeZone17.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DurationField durationField26 = durationFieldType24.getField(chronology25);
        boolean boolean27 = localDateTime20.isSupported(durationFieldType24);
        int int28 = localDateTime20.getCenturyOfEra();
        boolean boolean29 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3599990L) + "'", long19 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        int int8 = dateMidnight4.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withYearOfCentury((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.plusMonths(0);
        org.joda.time.Duration duration24 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight10.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.LocalDate localDate26 = dateMidnight25.toLocalDate();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:00.665Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:00.665Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:00.665Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3599990L) + "'", long18 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        int int2 = property1.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology11 = mutableDateTime9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = chronology11.add(readablePeriod13, (long) (byte) -1, 1969);
        org.joda.time.DurationField durationField17 = chronology11.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) property1, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "1969-12-31T14:49:00.775Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1969-12-31T14:49:00.775Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1969-12-31T14:49:00.775Z");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        int int8 = mutableDateTime6.getHourOfDay();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay14.monthOfYear();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        mutableDateTime6.setRounding(dateTimeField17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime6.copy();
        mutableDateTime19.addMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.property(dateTimeFieldType22);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        java.lang.Object obj31 = mutableDateTime30.clone();
        org.joda.time.Chronology chronology32 = mutableDateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.era();
        int int35 = dateTimeField33.getMaximumValue((long) (short) 100);
        mutableDateTime19.setRounding(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:00.795Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:00.795Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:00.795Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(obj31);
// flaky:         org.junit.Assert.assertEquals(obj31.toString(), "1969-12-31T14:49:00.795Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "1969-12-31T14:49:00.795Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "1969-12-31T14:49:00.795Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime9.getValue(445);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 445");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone8);
        org.joda.time.DateTime dateTime13 = dateTime3.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTime.Property property14 = dateTime13.secondOfDay();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale16.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property14.setCopy("DateTimeField[year]", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[year]\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime5.addWeekyears((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 851);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = partial1.toString(dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.secondOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) property11, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:01.184Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:01.184Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:01.184Z");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate19 = property16.withMinimumValue();
        org.joda.time.LocalDate localDate21 = property16.addWrapFieldToCopy(85);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate21.withMonthOfYear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        java.lang.Object obj16 = mutableDateTime15.clone();
        org.joda.time.Chronology chronology17 = mutableDateTime15.getChronology();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime15.add(readableDuration18);
        mutableDateTime15.setMillis((long) (-1));
        int int22 = mutableDateTime15.getMinuteOfHour();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = mutableDateTime15.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:01.273Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:01.273Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:01.273Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "1969-12-31T14:49:01.273Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "1969-12-31T14:49:01.273Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "1969-12-31T14:49:01.273Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology4 = yearMonthDay3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.Chronology chronology12 = chronology4.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology13 = chronology12.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial15 = new org.joda.time.Partial(dateTimeFieldType0, 30, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period21 = period18.plusHours((int) 'a');
        org.joda.time.Period period23 = period18.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType24 = period18.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        java.lang.Object obj32 = mutableDateTime31.clone();
        org.joda.time.Chronology chronology33 = mutableDateTime31.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.weekyears();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (-292275054), periodType24, chronology33);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.DateTime dateTime39 = dateTime13.withChronology(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) localDateTime5, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(obj32);
// flaky:         org.junit.Assert.assertEquals(obj32.toString(), "1969-12-31T14:49:01.564Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "1969-12-31T14:49:01.564Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "1969-12-31T14:49:01.564Z");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateTime dateTime7 = dateMidnight6.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withYearOfCentury(1990);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1990 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((int) 'u', (int) '4', (-1), chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'weekyears' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        java.lang.String str1 = timeOfDay0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "T14:49:01.793" + "'", str1, "T14:49:01.793");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period13 = period10.plusHours((int) 'a');
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period15 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        boolean boolean19 = period13.isSupported(durationFieldType16);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay7.withFieldAdded(durationFieldType16, 30);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        java.lang.Object obj26 = mutablePeriod25.clone();
        mutablePeriod25.setYears((int) ' ');
        int int29 = mutablePeriod25.getDays();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay7.plus((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str32 = dateTimeFieldType31.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeOfDay30.get(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "P32Y");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "clockhourOfDay" + "'", str32, "clockhourOfDay");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay1.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withField(dateTimeFieldType10, (int) '4');
        org.joda.time.LocalDate localDate13 = dateMidnight12.toLocalDate();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.LocalDate localDate20 = localDate13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, (int) (byte) 1);
        org.joda.time.LocalDate.Property property21 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.roundFloorCopy();
        org.joda.time.LocalDate localDate23 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(1);
        org.joda.time.LocalDate localDate27 = localDate23.plusDays(31);
        int int28 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long34 = dateTimeZone32.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone32);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(dateTimeZone32);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableDuration39);
        org.joda.time.MutablePeriod mutablePeriod41 = period40.toMutablePeriod();
        org.joda.time.Period period43 = period40.plusHours((int) 'a');
        org.joda.time.Minutes minutes44 = period43.toStandardMinutes();
        org.joda.time.Period period45 = period43.negated();
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DurationField durationField48 = durationFieldType46.getField(chronology47);
        boolean boolean49 = period43.isSupported(durationFieldType46);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay37.withFieldAdded(durationFieldType46, 30);
        boolean boolean52 = periodType29.isSupported(durationFieldType46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate54 = localDate23.withFieldAdded(durationFieldType46, 2134);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3599990L) + "'", long34 == (-3599990L));
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        int int7 = dateTime3.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime3.minus((long) 49709009);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateTime9.isSupported(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = property2.set("year");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"year\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth(3);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay16.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone27);
        long long32 = dateTimeZone22.getMillisKeepLocal(dateTimeZone27, (long) 59);
        org.joda.time.DateMidnight dateMidnight33 = yearMonthDay20.toDateMidnight(dateTimeZone22);
        mutableDateTime13.setZoneRetainFields(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime13.yearOfCentury();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType37 = periodType36.withDaysRemoved();
        org.joda.time.PeriodType periodType38 = periodType36.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableInstant) mutableDateTime13, periodType38);
        mutablePeriod39.setPeriod((long) 844, (long) 571);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3599990L) + "'", long29 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 59L + "'", long32 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.minus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime4.plusMinutes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withHourOfDay(49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus(0L);
        org.joda.time.Instant instant4 = instant0.plus(3599989999L);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withField(dateTimeFieldType14, (int) '4');
        org.joda.time.LocalDate localDate17 = dateMidnight16.toLocalDate();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight7.withFields((org.joda.time.ReadablePartial) localDate17);
        int int19 = localDate17.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599990L) + "'", long12 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, (long) (byte) -1, 1969);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = dateTimeField14.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dateTimeField14.set((long) 259, "49741008");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"49741008\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:02.319Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:02.319Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:02.319Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 1910, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withYearOfCentury((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        int int18 = localDate17.getCenturyOfEra();
        org.joda.time.LocalDate localDate20 = localDate17.plusMonths(2);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long25 = dateTimeZone23.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withHourOfDay((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDate17.compareTo((org.joda.time.ReadablePartial) localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3599990L) + "'", long25 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(32, 53341, 53341, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53341 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(464, 993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 464 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1969, (int) (byte) -1, 10, (int) (byte) 0);
        mutablePeriod4.addMonths((int) (byte) 100);
        int int7 = mutablePeriod4.getMillis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekyear();
        int int11 = property10.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays((-292275054));
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        java.lang.Object obj21 = mutablePeriod20.clone();
        org.joda.time.MutablePeriod mutablePeriod22 = mutablePeriod20.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        mutablePeriod20.setPeriod(readableDuration23, chronology25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long31 = dateTimeZone29.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 31, dateTimeZone29);
        org.joda.time.Chronology chronology34 = chronology25.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField35 = chronology25.seconds();
        org.joda.time.DurationField durationField36 = chronology25.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime15, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-292275054) + "'", int11 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3599990L) + "'", long31 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 851);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withDefaultYear(888);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.parse("T14:49:01.793", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = partial1.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableDuration4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        int int7 = mutablePeriod6.getHours();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        int int9 = mutablePeriod6.get(durationFieldType8);
        java.lang.String str10 = durationFieldType8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial12 = partial1.withFieldAdded(durationFieldType8, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "weekyears" + "'", str10, "weekyears");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        int int6 = localTime5.getMillisOfDay();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis((-292275054));
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime11.toYearMonthDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime11.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        java.lang.Object obj24 = mutableDateTime23.clone();
        org.joda.time.Chronology chronology25 = mutableDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.era();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology31 = yearMonthDay30.getChronology();
        boolean boolean32 = dateTimeFieldType28.isSupported(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime11.withField(dateTimeFieldType28, 30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = localTime5.withField(dateTimeFieldType28, 53327);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53327 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49742720 + "'", int6 == 49742720);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals(obj24.toString(), "1969-12-31T14:49:02.720Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "1969-12-31T14:49:02.720Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "1969-12-31T14:49:02.720Z");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeField8.getAsText((long) 100, locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(dateTimeZone14);
        int[] intArray23 = new int[] { '#', 3, 31 };
        int int24 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay19, intArray23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay27 = timeOfDay19.withField(dateTimeFieldType25, 49728473);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "82800" + "'", str11, "82800");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599990L) + "'", long16 == (-3599990L));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 3, 31]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86399 + "'", int24 == 86399);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=clockhourofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((int) (short) 100, 49, 49709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.Chronology chronology38 = localDate19.getChronology();
        int int39 = localDate19.getYear();
        int int40 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone42.convertUTCToLocal(10L);
        boolean boolean45 = localDate19.equals((java.lang.Object) long44);
        org.joda.time.LocalDate localDate47 = localDate19.withDayOfWeek(2);
        int int48 = localDate47.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599990L) + "'", long24 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "PT0S");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 22 + "'", int40 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-3599990L) + "'", long44 == (-3599990L));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.Partial partial10 = partial0.with(dateTimeFieldType6, (int) (short) 0);
        java.util.Locale locale12 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = partial0.toString("java.io.IOException: ", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(10L);
        java.lang.String str2 = localDateTime1.toString();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusYears(86399999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withTime(21, 53327, 1990, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53327 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01T00:00:00.010" + "'", str2, "1970-01-01T00:00:00.010");
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setDateTime(69, 0, (int) 'a', 0, 2022, 8, 550);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) ' ');
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minus(readableDuration9);
        int int11 = localDateTime5.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime5.getFieldType(53341);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53341");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 23);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTime(timeOfDay7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTime();
        java.lang.Object obj12 = mutableDateTime11.clone();
        org.joda.time.Chronology chronology13 = mutableDateTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) mutableDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "1969-12-31T14:49:03.653Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "1969-12-31T14:49:03.653Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "1969-12-31T14:49:03.653Z");
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 182);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay1, (org.joda.time.ReadablePartial) yearMonthDay3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period5.getSeconds();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate8.withMonthOfYear(445);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 445 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3599990L) + "'", long13 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        boolean boolean11 = dateTimeField9.isLeap((long) (short) 10);
        int int13 = dateTimeField9.getMaximumValue((long) 30);
        java.lang.String str14 = dateTimeField9.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeField9.add(1728000000L, 113);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:03.807Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:03.807Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:03.807Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.now(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition((long) 86399999);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withField(dateTimeFieldType11, (int) '4');
        org.joda.time.LocalDate localDate14 = dateMidnight13.toLocalDate();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        java.lang.Object obj19 = mutablePeriod18.clone();
        org.joda.time.LocalDate localDate21 = localDate14.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod18, (int) (byte) 1);
        org.joda.time.LocalDate.Property property22 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.roundFloorCopy();
        org.joda.time.LocalDate localDate24 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate26 = localDate24.plusWeeks(1);
        org.joda.time.LocalDate localDate28 = localDate24.plusDays(31);
        org.joda.time.LocalDate localDate30 = localDate28.minusWeeks((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDate28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 86399999L + "'", long4 == 86399999L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "PT0S");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime6.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime16, periodType20);
        org.joda.time.PeriodType periodType22 = mutablePeriod21.getPeriodType();
        org.joda.time.PeriodType periodType23 = periodType22.withMinutesRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period(1L, (long) 14, periodType23);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.minuteOfHour();
        mutableDateTime31.setMillisOfSecond((int) (byte) 10);
        mutableDateTime31.setYear(4);
        mutableDateTime31.addWeekyears(1969);
        org.joda.time.Duration duration39 = period24.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime31);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime31.setDayOfMonth(49709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49709 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3599990L) + "'", long13 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(duration39);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 23);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter4.getParser();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone7);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableDuration13);
        org.joda.time.LocalTime localTime15 = localTime11.plus((org.joda.time.ReadablePeriod) period14);
        int int16 = localTime11.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(10L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, (int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withField(dateTimeFieldType7, 20);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.plusMonths(86399999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(167, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 167 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeZone4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) 'u');
        org.joda.time.DateTime dateTime10 = dateTime5.minusHours(31);
        int int11 = dateTime5.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Days days4 = period2.toStandardDays();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(59);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTime dateTime21 = dateTime8.withYear(22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599990L) + "'", long15 == (-3599990L));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.addWrapField((int) 'u');
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = property24.getAsText(locale28);
        java.lang.String str31 = locale28.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = localDate15.toString("weekyears", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "279" + "'", str30, "279");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        int int9 = property6.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.secondOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = dateTimeField19.getAsText((long) 100, locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay23 = property6.setCopy("T09:36:02.375", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T09:36:02.375\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "82800" + "'", str22, "82800");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology15 = yearMonthDay14.getChronology();
        boolean boolean16 = dateTimeFieldType12.isSupported(chronology15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.months();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTime();
        java.lang.Object obj26 = mutableDateTime25.clone();
        org.joda.time.Chronology chronology27 = mutableDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.era();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType18.getField(chronology27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (short) -1, periodType31, chronology32);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) -1, periodType35, chronology36);
        mutablePeriod33.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        int[] intArray40 = chronology27.get((org.joda.time.ReadablePeriod) mutablePeriod37, (long) (short) 100);
        java.lang.String str41 = chronology27.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period42 = new org.joda.time.Period((java.lang.Object) chronology15, periodType17, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "1969-12-31T14:49:04.327Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1969-12-31T14:49:04.327Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1969-12-31T14:49:04.327Z");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(obj26);
// flaky:         org.junit.Assert.assertEquals(obj26.toString(), "1969-12-31T14:49:04.327Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "1969-12-31T14:49:04.327Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "1969-12-31T14:49:04.327Z");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str41, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        int int9 = property6.getMinimumValueOverall();
        java.lang.String str10 = property6.getAsString();
        java.util.Locale locale12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = property6.setCopy("Feb", locale12);
        org.joda.time.YearMonthDay yearMonthDay14 = property6.withMinimumValue();
        int int15 = yearMonthDay14.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12" + "'", str10, "12");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) -1, periodType5, chronology6);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        mutablePeriod12.add((long) (short) 0);
        int int15 = mutablePeriod12.getSeconds();
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod12.setYears(59);
        mutablePeriod12.setWeeks(550);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis(30);
        int int9 = dateTime8.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.minusYears(1);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusMonths(6);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.minus(readablePeriod9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay6.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone6);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 59);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(dateTimeZone6);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = timeOfDay12.getFieldType(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 59L + "'", long11 == 59L);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = localTime8.withHourOfDay(20);
        boolean boolean12 = localTime6.isBefore((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalTime.Property property15 = localTime8.property(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property16 = yearMonthDay1.property(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "clockhourOfDay" + "'", str14, "clockhourOfDay");
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(2021, 2, 85);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime6.toMutableDateTime();
        mutableDateTime12.addMinutes(12);
        mutableDateTime12.addSeconds(69);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime20.withDurationAdded(readableDuration24, (int) (short) 1);
        int int27 = dateTime20.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime20.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        java.lang.Object obj36 = mutableDateTime35.clone();
        int int37 = mutableDateTime35.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableDuration39);
        org.joda.time.MutablePeriod mutablePeriod41 = period40.toMutablePeriod();
        java.lang.Object obj42 = mutablePeriod41.clone();
        mutablePeriod41.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay47 = null;
        org.joda.time.DateTime dateTime48 = yearMonthDay46.toDateTime(timeOfDay47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime48.toMutableDateTime();
        org.joda.time.DateTime dateTime52 = dateTime48.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration53 = mutablePeriod41.toDurationTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Duration duration54 = duration53.toDuration();
        mutableDateTime35.add((org.joda.time.ReadableDuration) duration53);
        mutableDateTime28.add((org.joda.time.ReadableDuration) duration53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableDuration) duration53);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setSecondOfMinute((-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:04.698Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:04.698Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:04.698Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 698 + "'", int27 == 698);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(obj36);
// flaky:         org.junit.Assert.assertEquals(obj36.toString(), "1969-12-31T14:49:04.698Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "1969-12-31T14:49:04.698Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "1969-12-31T14:49:04.698Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 14 + "'", int37 == 14);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "P32Y");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration54);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay1, (org.joda.time.ReadablePartial) yearMonthDay3);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (short) -1, periodType6, chronology7);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay1.withYear(20);
        org.joda.time.Period period13 = org.joda.time.Period.years(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay1.withPeriodAdded((org.joda.time.ReadablePeriod) period13, 49728473);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.plusMillis(0);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMinutes(253);
        java.lang.String str23 = timeOfDay22.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = timeOfDay22.toString("era");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "T09:36:04.764" + "'", str23, "T09:36:04.764");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("d\351c.");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withField(dateTimeFieldType11, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight10.withField(dateTimeFieldType14, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight10.plusMonths(0);
        int int19 = dateMidnight18.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusHours((int) 'a');
        org.joda.time.Period period28 = period23.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType29 = period23.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay31.toDateTime(timeOfDay32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime33.toMutableDateTime();
        java.lang.Object obj37 = mutableDateTime36.clone();
        org.joda.time.Chronology chronology38 = mutableDateTime36.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.weekyears();
        org.joda.time.DateMidnight dateMidnight40 = org.joda.time.DateMidnight.now(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (-292275054), periodType29, chronology38);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight18.withChronology(chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(619, (int) (short) 10, 31, 6, 1990, (int) (short) 10, chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1990 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(obj37);
// flaky:         org.junit.Assert.assertEquals(obj37.toString(), "1969-12-31T14:49:05.008Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "1969-12-31T14:49:05.008Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "1969-12-31T14:49:05.008Z");
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateMidnight43);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.addCopy((int) (byte) 100);
        org.joda.time.LocalTime.Property property4 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime5 = property4.roundHalfFloorCopy();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay7.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime15 = dateTime12.withFieldAdded(durationFieldType13, (-1));
        org.joda.time.DateTime dateTime17 = dateTime12.withYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int19 = dateTime12.get(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime5.get(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 364 + "'", int19 == 364);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        mutablePeriod3.add((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) period8);
        int int11 = period8.getHours();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime3.withMonthOfYear(1910);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1910 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.LocalTime localTime11 = localTime5.minusMinutes(31);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded(readableDuration19, (int) (short) 1);
        int int22 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        java.lang.Object obj31 = mutableDateTime30.clone();
        org.joda.time.Chronology chronology32 = mutableDateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.era();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType23.getField(chronology32);
        org.joda.time.DateTime dateTime36 = dateTime15.withField(dateTimeFieldType23, 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime38 = localTime5.withField(dateTimeFieldType23, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 203 + "'", int22 == 203);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(obj31);
// flaky:         org.junit.Assert.assertEquals(obj31.toString(), "1969-12-31T14:49:05.203Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "1969-12-31T14:49:05.203Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "1969-12-31T14:49:05.203Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay22.toDateTime(timeOfDay23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay22.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime27 = yearMonthDay26.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay26.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay26.plusMonths((-292275054));
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology34 = yearMonthDay33.getChronology();
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableDuration36);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        org.joda.time.Period period40 = period37.plusHours((int) 'a');
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Period period42 = period40.negated();
        int[] intArray44 = chronology34.get((org.joda.time.ReadablePeriod) period40, (-1L));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long49 = dateTimeZone47.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property53 = dateTime50.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = property53.getField();
        java.util.Locale locale56 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str57 = dateTimeField54.getAsText((long) 100, locale56);
        int int60 = dateTimeField54.getDifference((long) 49709009, (long) 8);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long66 = dateTimeZone64.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.minusMonths((int) ' ');
        org.joda.time.LocalDateTime.Property property72 = localDateTime67.weekyear();
        org.joda.time.LocalDateTime localDateTime74 = property72.addToCopy((int) '#');
        java.util.Locale locale76 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale77 = locale76.stripExtensions();
        java.lang.String str78 = locale77.getVariant();
        java.lang.String str79 = locale77.getISO3Country();
        java.util.Set<java.lang.String> strSet80 = locale77.getUnicodeLocaleAttributes();
        int int81 = property72.getMaximumTextLength(locale77);
        java.lang.String str82 = dateTimeField54.getAsText(59, locale77);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray83 = dateTimeField20.set((org.joda.time.ReadablePartial) yearMonthDay26, 1970, intArray44, "999", locale77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-3599990L) + "'", long49 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "82800" + "'", str57, "82800");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 49709 + "'", int60 == 49709);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-3599990L) + "'", long66 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 9 + "'", int81 == 9);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "59" + "'", str82, "59");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period7 = period2.withWeeks((int) (byte) -1);
        java.lang.String str8 = period2.toString();
        org.joda.time.Period period10 = period2.multipliedBy((int) (short) -1);
        org.joda.time.Period period12 = period2.minusMillis(2021);
        org.joda.time.Period period14 = period12.minusYears(0);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        boolean boolean12 = dateTimeField10.isLeap((long) 'u');
        long long15 = dateTimeField10.getDifferenceAsLong((long) 1969, (long) 2022);
        long long17 = dateTimeField10.roundHalfCeiling(345600000L);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:05.373Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:05.373Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:05.373Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-53L) + "'", long15 == (-53L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 345600000L + "'", long17 == 345600000L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMonths((int) 'u');
        int int14 = localDateTime13.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = partial0.getFormatter();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, (int) '4');
        org.joda.time.LocalDate localDate10 = dateMidnight9.toLocalDate();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.LocalDate localDate17 = localDate10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, (int) (byte) 1);
        org.joda.time.LocalDate localDate19 = localDate10.minusDays((int) (byte) -1);
        int int20 = localDate19.getCenturyOfEra();
        org.joda.time.LocalDate localDate22 = localDate19.plusMonths(2);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DurationField durationField25 = durationFieldType23.getField(chronology24);
        boolean boolean26 = localDate19.isSupported(durationFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial28 = partial0.withFieldAdded(durationFieldType23, 2134);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "PT0S");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "48", "hi!", "United States", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "48", "hi!", "United States", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList22, filteringMode26);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale30.getVariant();
        java.lang.String str32 = locale30.getISO3Country();
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "48", "hi!", "United States", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.util.Locale locale49 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale50 = java.util.Locale.ENGLISH;
        java.util.Locale locale51 = java.util.Locale.FRENCH;
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale48, locale49, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList53);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode24.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode26.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertNotNull(localeList56);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period13 = period10.plusHours((int) 'a');
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period15 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        boolean boolean19 = period13.isSupported(durationFieldType16);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay7.withFieldAdded(durationFieldType16, 30);
        org.joda.time.DateTime dateTime22 = timeOfDay21.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.withMillisOfSecond(20);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay24.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay27 = property25.addWrapFieldToCopy(550);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withSecondOfMinute(888);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 888 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(timeOfDay27);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime12.withEarlierOffsetAtOverlap();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = property6.getAsShortText(locale18);
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.lang.Object obj22 = locale20.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d\351c." + "'", str19, "d\351c.");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str21, "\u30ab\u30ca\u30c0");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "ja");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withField(dateTimeFieldType8, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight4.plusMonths(0);
        org.joda.time.Period period14 = org.joda.time.Period.hours(1);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.minus((org.joda.time.ReadablePeriod) period14);
        int int16 = dateMidnight12.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        boolean boolean12 = dateTimeField10.isLeap((long) 'u');
        java.lang.String str14 = dateTimeField10.getAsText((-1L));
        org.joda.time.DurationField durationField15 = dateTimeField10.getLeapDurationField();
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("dayOfMonth");
        java.lang.String str19 = dateTimeField10.getAsShortText(113, locale18);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay21.toDateTime(timeOfDay22);
        org.joda.time.DateTime dateTime24 = yearMonthDay21.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar25 = dateTime24.toGregorianCalendar();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar25);
        int int27 = localDate26.getMonthOfYear();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period34 = period31.plusHours((int) 'a');
        org.joda.time.Period period36 = period31.withWeeks((int) (byte) -1);
        int[] intArray37 = period36.getValues();
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField10.set((org.joda.time.ReadablePartial) localDate26, 844, intArray37, "1969-12-31", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:05.886Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:05.886Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:05.886Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "999" + "'", str14, "999");
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "113" + "'", str19, "113");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(gregorianCalendar25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, -1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property6.setCopy("UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        mutableDateTime6.setMillisOfSecond((int) (byte) 10);
        mutableDateTime6.setYear(4);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.previousTransition((long) 100);
        boolean boolean19 = dateTimeZone15.isStandardOffset((long) 1969);
        mutableDateTime13.setZoneRetainFields(dateTimeZone15);
        java.lang.String str22 = dateTimeZone15.getName((long) 9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-01:00" + "'", str22, "-01:00");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.LocalTime localTime5 = localTime2.withHourOfDay(20);
        boolean boolean6 = localTime0.isBefore((org.joda.time.ReadablePartial) localTime2);
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        int int4 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.plusDays((-292275054));
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay6.dayOfMonth();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = yearMonthDay6.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = yearMonthDay6.getFieldType(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        long long5 = durationField2.getMillis((long) 5, 1009843200000L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, readableDuration7, periodType8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = dateTime14.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime3.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        boolean boolean28 = dateMidnight19.isBefore((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        boolean boolean30 = dateMidnight19.isEqual(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        java.lang.Object obj35 = mutablePeriod34.clone();
        mutablePeriod34.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        org.joda.time.DateTime dateTime45 = dateTime41.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration46 = mutablePeriod34.toDurationTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight19.minus((org.joda.time.ReadableDuration) duration46);
        java.lang.String str49 = duration46.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime51 = dateTime17.withDurationAdded((org.joda.time.ReadableDuration) duration46, 49728473);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1009843200000 * 49728473");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3599990L) + "'", long23 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "P32Y");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT1009843200S" + "'", str49, "PT1009843200S");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        java.lang.Object obj11 = mutableDateTime10.clone();
        int int12 = mutableDateTime10.getHourOfDay();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay14.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay18.monthOfYear();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        mutableDateTime10.setRounding(dateTimeField21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime10, "1969-12-31T13:48:28.296-01:00", 53341);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "1969-12-31T14:49:08.536Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1969-12-31T14:49:08.536Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1969-12-31T14:49:08.536Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 23);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withField(dateTimeFieldType10, (int) '4');
        org.joda.time.LocalDate localDate13 = dateMidnight12.toLocalDate();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.LocalDate localDate20 = localDate13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, (int) (byte) 1);
        org.joda.time.LocalDate.Property property21 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.roundFloorCopy();
        org.joda.time.LocalDate localDate23 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(1);
        org.joda.time.LocalDate.Property property26 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        int int8 = mutableDateTime6.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDate(19, 199, 261);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 199 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:08.680Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:08.680Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:08.680Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property6.addToCopy((-3600000));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfMonth(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(459, 0, 888);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 459 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "it");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight21 = property19.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay28.monthOfYear();
        int int30 = property29.getMaximumValueOverall();
        int int31 = property29.getMinimumValue();
        int int32 = property29.getMinimumValueOverall();
        java.lang.String str33 = property29.getAsString();
        java.util.Locale locale35 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = property29.setCopy("Feb", locale35);
        org.joda.time.DateTimeField dateTimeField37 = property29.getField();
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        boolean boolean39 = locale38.hasExtensions();
        java.lang.String str40 = property29.getAsShortText(locale38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight41 = property19.setCopy("2022-02-21T14:48:47.294Z", locale38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:48:47.294Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "12" + "'", str33, "12");
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Dec" + "'", str40, "Dec");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 851);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withDefaultYear(888);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = dateTimeFormatter4.parseLocalDateTime("892");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDate10.getFields();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Period period7 = period5.negated();
        org.joda.time.Period period9 = period5.minusMonths(100);
        java.lang.Class<?> wildcardClass10 = period9.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = property19.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusWeeks((int) 'u');
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.minusDays(86399);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableDuration19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        java.lang.Object obj22 = mutablePeriod21.clone();
        mutablePeriod21.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        org.joda.time.DateTime dateTime32 = dateTime28.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration33 = mutablePeriod21.toDurationTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight15.withDurationAdded((org.joda.time.ReadableDuration) duration34, (int) (short) -1);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight6.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusMonths(182);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay42.toDateTime(timeOfDay43);
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar46 = dateTime45.toGregorianCalendar();
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar46);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight49 = org.joda.time.DateMidnight.now(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight50 = localDate47.toDateMidnight(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((-3599990L), dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight39.withZoneRetainFields(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "P32Y");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(gregorianCalendar46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(dateMidnight52);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        mutableDateTime6.setMillisOfSecond((int) (byte) 10);
        mutableDateTime6.setYear(4);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundFloor();
        mutableDateTime13.setMinuteOfHour((int) (short) 0);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay5.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.plusMonths((-292275054));
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField17 = null;
        mutableDateTime16.setRounding(dateTimeField17, (int) '#');
        mutableDateTime16.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long26 = dateTimeZone24.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone24);
        mutableDateTime16.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay9.toDateMidnight(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(dateTimeZone32);
        long long35 = dateTimeZone32.previousTransition((long) 86399999);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeZone24, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599990L) + "'", long26 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 86399999L + "'", long35 == 86399999L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.Chronology chronology6 = dateTime3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime3.withWeekOfWeekyear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay5.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.plusMonths((-292275054));
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField17 = null;
        mutableDateTime16.setRounding(dateTimeField17, (int) '#');
        mutableDateTime16.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long26 = dateTimeZone24.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone24);
        mutableDateTime16.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight30 = yearMonthDay9.toDateMidnight(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.MutablePeriod mutablePeriod36 = period35.toMutablePeriod();
        org.joda.time.Period period38 = period35.plusHours((int) 'a');
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Period period40 = period38.negated();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DurationField durationField43 = durationFieldType41.getField(chronology42);
        boolean boolean44 = period38.isSupported(durationFieldType41);
        mutableDateTime32.add((org.joda.time.ReadablePeriod) period38);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight47 = org.joda.time.DateMidnight.now(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long51 = dateTimeZone49.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone49);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight52.withField(dateTimeFieldType53, (int) '4');
        boolean boolean56 = dateMidnight47.isBefore((org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        boolean boolean58 = dateMidnight47.isEqual(readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant59, readableDuration60);
        org.joda.time.MutablePeriod mutablePeriod62 = period61.toMutablePeriod();
        java.lang.Object obj63 = mutablePeriod62.clone();
        mutablePeriod62.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay68 = null;
        org.joda.time.DateTime dateTime69 = yearMonthDay67.toDateTime(timeOfDay68);
        org.joda.time.DateTime dateTime71 = dateTime69.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime69.toMutableDateTime();
        org.joda.time.DateTime dateTime73 = dateTime69.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration74 = mutablePeriod62.toDurationTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Duration duration75 = duration74.toDuration();
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight47.minus((org.joda.time.ReadableDuration) duration74);
        mutableDateTime32.add((org.joda.time.ReadableDuration) duration74);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight30.withDurationAdded((org.joda.time.ReadableDuration) duration74, 30);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599990L) + "'", long26 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-3599990L) + "'", long51 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(mutablePeriod62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "P32Y");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(dateMidnight76);
        org.junit.Assert.assertNotNull(dateMidnight79);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) 'u');
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.plusMonths(167);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.LocalTime localTime24 = localTime21.withHourOfDay(20);
        boolean boolean25 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str27 = dateTimeFieldType26.getName();
        org.joda.time.LocalTime.Property property28 = localTime21.property(dateTimeFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight30 = dateMidnight18.withField(dateTimeFieldType26, 86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:09.924Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:09.924Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:09.924Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599990L) + "'", long12 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "clockhourOfDay" + "'", str27, "clockhourOfDay");
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.LocalTime localTime3 = localTime0.withHourOfDay(20);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime3.getValue(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1969");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay(49728473);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49728473 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableDuration2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.plusHours((int) 'a');
        org.joda.time.Period period8 = period3.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType9 = period3.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        java.lang.Object obj17 = mutableDateTime16.clone();
        org.joda.time.Chronology chronology18 = mutableDateTime16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-292275054), periodType9, chronology18);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime23.setMinuteOfDay(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "1969-12-31T14:49:10.057Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1969-12-31T14:49:10.057Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1969-12-31T14:49:10.057Z");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property16.setCopy("YearDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"YearDay\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime3.withDate(253, 1969, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMillis(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withSecondOfMinute(459);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 459 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 851, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDate(182, (int) (byte) 1, 499);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 499 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withWeekyear(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withField(dateTimeFieldType11, 167);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight7.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setHourOfDay(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(10L);
        java.lang.String str13 = localDateTime12.toString();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusYears(86399999);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = localDate8.isEqual((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.010" + "'", str13, "1970-01-01T00:00:00.010");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.LocalTime localTime8 = dateTime6.toLocalTime();
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime8.withSecondOfMinute(571);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 571 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeField3.set((long) (byte) -1, "UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        boolean boolean21 = dateTimeField20.isLenient();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay31.monthOfYear();
        int int33 = property32.getMaximumValueOverall();
        int int34 = property32.getMinimumValue();
        int int35 = property32.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long39 = dateTimeZone37.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.withField(dateTimeFieldType41, (int) '4');
        org.joda.time.LocalDate localDate44 = dateMidnight43.toLocalDate();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableDuration46);
        org.joda.time.MutablePeriod mutablePeriod48 = period47.toMutablePeriod();
        java.lang.Object obj49 = mutablePeriod48.clone();
        org.joda.time.LocalDate localDate51 = localDate44.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod48, (int) (byte) 1);
        org.joda.time.LocalDate localDate53 = localDate44.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate55 = localDate44.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long59 = dateTimeZone57.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime61 = localDate55.toDateTimeAtStartOfDay(dateTimeZone57);
        boolean boolean62 = property32.equals((java.lang.Object) localDate55);
        int int63 = property32.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField64 = property32.getField();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long68 = dateTimeZone66.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(dateTimeZone66);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight69.withField(dateTimeFieldType70, (int) '4');
        org.joda.time.LocalDate localDate73 = dateMidnight72.toLocalDate();
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant74, readableDuration75);
        org.joda.time.MutablePeriod mutablePeriod77 = period76.toMutablePeriod();
        java.lang.Object obj78 = mutablePeriod77.clone();
        org.joda.time.LocalDate localDate80 = localDate73.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod77, (int) (byte) 1);
        org.joda.time.LocalDate localDate82 = localDate73.minusDays((int) (byte) -1);
        int int83 = localDate82.getCenturyOfEra();
        int int84 = dateTimeField64.getMinimumValue((org.joda.time.ReadablePartial) localDate82);
        int[] intArray85 = localDate82.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray87 = dateTimeField20.add((org.joda.time.ReadablePartial) localTime24, 59, intArray85, 711);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-3599990L) + "'", long39 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "PT0S");
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-3599990L) + "'", long59 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-3599990L) + "'", long68 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(dateMidnight72);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertNotNull(mutablePeriod77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "PT0S");
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 20 + "'", int83 == 20);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[2022, 2, 22]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        int int20 = localDate18.getValue(1);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.addWrapField((int) 'u');
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale34 = locale33.stripExtensions();
        java.lang.String str35 = property29.getAsText(locale33);
        java.lang.String str36 = locale33.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.getVariant();
        java.lang.String str41 = locale39.getISO3Country();
        java.lang.String str42 = locale33.getDisplayScript(locale39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = localDate18.toString("1969-12-31T13:49:09.220-01:00", locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "32" + "'", str35, "32");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period7 = period2.withWeeks((int) (byte) -1);
        int[] intArray8 = period7.getValues();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        int int17 = dateTime13.getWeekyear();
        org.joda.time.LocalDate localDate18 = dateTime13.toLocalDate();
        org.joda.time.DateTime dateTime20 = dateTime13.minusMinutes(0);
        org.joda.time.Duration duration21 = period9.toDurationFrom((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        java.lang.Object obj26 = mutablePeriod25.clone();
        mutablePeriod25.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration37 = mutablePeriod25.toDurationTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration38 = duration37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight40 = org.joda.time.DateMidnight.now(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone42.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight45.withField(dateTimeFieldType46, (int) '4');
        boolean boolean49 = dateMidnight40.isBefore((org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        boolean boolean51 = dateMidnight40.isEqual(readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.MutablePeriod mutablePeriod55 = period54.toMutablePeriod();
        java.lang.Object obj56 = mutablePeriod55.clone();
        mutablePeriod55.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime();
        org.joda.time.DateTime dateTime66 = dateTime62.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration67 = mutablePeriod55.toDurationTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration68 = duration67.toDuration();
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight40.minus((org.joda.time.ReadableDuration) duration67);
        java.lang.String str70 = duration67.toString();
        boolean boolean71 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration67);
        boolean boolean72 = duration21.isEqual((org.joda.time.ReadableDuration) duration37);
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay75 = null;
        org.joda.time.DateTime dateTime76 = yearMonthDay74.toDateTime(timeOfDay75);
        org.joda.time.DateTime dateTime78 = dateTime76.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime76.toMutableDateTime();
        java.lang.Object obj80 = mutableDateTime79.clone();
        org.joda.time.Chronology chronology81 = mutableDateTime79.getChronology();
        org.joda.time.DurationField durationField82 = chronology81.weekyears();
        org.joda.time.DateMidnight dateMidnight83 = org.joda.time.DateMidnight.now(chronology81);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period(readableInstant84, readableDuration85);
        org.joda.time.MutablePeriod mutablePeriod87 = period86.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long91 = dateTimeZone89.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight92 = new org.joda.time.DateMidnight(dateTimeZone89);
        org.joda.time.DateMidnight dateMidnight94 = dateMidnight92.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight96 = dateMidnight92.plusMonths(0);
        org.joda.time.Duration duration97 = period86.toDurationTo((org.joda.time.ReadableInstant) dateMidnight96);
        org.joda.time.DateMidnight dateMidnight98 = dateMidnight83.plus((org.joda.time.ReadableDuration) duration97);
        boolean boolean99 = duration37.isEqual((org.joda.time.ReadableDuration) duration97);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, -1, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "P32Y");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-3599990L) + "'", long44 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "P32Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "P32Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "P32Y");
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PT1009843200S" + "'", str70, "PT1009843200S");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(obj80);
// flaky:         org.junit.Assert.assertEquals(obj80.toString(), "1969-12-31T14:49:10.945Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "1969-12-31T14:49:10.945Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "1969-12-31T14:49:10.945Z");
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(durationField82);
        org.junit.Assert.assertNotNull(dateMidnight83);
        org.junit.Assert.assertNotNull(mutablePeriod87);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-3599990L) + "'", long91 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight94);
        org.junit.Assert.assertNotNull(dateMidnight96);
        org.junit.Assert.assertNotNull(duration97);
        org.junit.Assert.assertNotNull(dateMidnight98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = property19.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long26 = dateTimeZone24.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property30 = dateTime27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = property30.getField();
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = dateTimeField31.getAsText((long) 100, locale33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.lang.String str37 = dateTimeField31.getAsText(59L, locale36);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("82800");
        java.lang.String str40 = locale36.getDisplayCountry(locale39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay41 = property19.setCopy("", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599990L) + "'", long26 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "82800" + "'", str34, "82800");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "82800" + "'", str37, "82800");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "United Kingdom" + "'", str40, "United Kingdom");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime4 = property1.getLocalTime();
        int int5 = localTime4.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withField(dateTimeFieldType11, (int) '4');
        org.joda.time.LocalDate localDate14 = dateMidnight13.toLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean17 = localDate14.isSupported(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime4.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        java.lang.String str12 = dateTimeField10.getAsShortText((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:11.442Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:11.442Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:11.442Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone6);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 59);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(dateTimeZone6);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.withField(dateTimeFieldType19, (int) '4');
        org.joda.time.LocalDate localDate22 = dateMidnight21.toLocalDate();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableDuration24);
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.LocalDate localDate29 = localDate22.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod26, (int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate22.withYearOfEra(59);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long35 = dateTimeZone33.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long40 = dateTimeZone38.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone38);
        long long43 = dateTimeZone33.getMillisKeepLocal(dateTimeZone38, (long) 59);
        org.joda.time.DateTime dateTime44 = localDate22.toDateTimeAtStartOfDay(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = property13.compareTo((org.joda.time.ReadablePartial) localDate22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599990L) + "'", long8 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 59L + "'", long11 == 59L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3599990L) + "'", long17 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "PT0S");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3599990L) + "'", long35 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-3599990L) + "'", long40 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 59L + "'", long43 == 59L);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        boolean boolean21 = dateMidnight18.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3599990L) + "'", long14 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59L + "'", long17 == 59L);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.plusMonths(0);
        org.joda.time.Duration duration24 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight10.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withWeekyear((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "1969-12-31T14:49:11.571Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1969-12-31T14:49:11.571Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1969-12-31T14:49:11.571Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3599990L) + "'", long18 == (-3599990L));
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateMidnight27);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        org.joda.time.LocalTime localTime8 = property6.getLocalTime();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.eras();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = new org.joda.time.DurationFieldType[] { durationFieldType9, durationFieldType11 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [eras, centuries]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        int int8 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime.Property property9 = dateTime4.secondOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(86399999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withField(dateTimeFieldType12, (int) '4');
        org.joda.time.LocalDate localDate15 = dateMidnight14.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight14.getZone();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(86399, 0, (int) '#', 459, 0, 53341, 2, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 459 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3599990L) + "'", long10 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property1.addCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond(8);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = dateTimeZone7.getShortName((long) 86399999, locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localTime5.toString("secondOfDay", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Property[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[millisOfDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property18 = localDate17.monthOfYear();
        org.joda.time.LocalDate localDate19 = property18.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate21 = property18.setCopy(5);
        int int22 = localDate21.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology14.add(readablePeriod16, (long) (byte) -1, 1969);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.halfdayOfDay();
        boolean boolean21 = dateTimeFieldType5.isSupported(chronology14);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 59, periodType3, chronology14);
        org.joda.time.Period period24 = period22.multipliedBy(993);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.MutablePeriod mutablePeriod30 = mutablePeriod28.toMutablePeriod();
        mutablePeriod30.setPeriod((int) (short) 100, (int) (short) 10, (-292275054), 14, 12, (int) (byte) -1, 4, 31);
        mutablePeriod30.addSeconds((int) (short) 100);
        int int42 = mutablePeriod30.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period43 = period22.plus((org.joda.time.ReadablePeriod) mutablePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "1969-12-31T14:49:11.880Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "1969-12-31T14:49:11.880Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "1969-12-31T14:49:11.880Z");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 31 + "'", int42 == 31);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime12.setZone(dateTimeZone15);
        mutableDateTime12.add((long) 20);
        org.joda.time.DateTime dateTime19 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusHours((int) 'a');
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Period period27 = period25.negated();
        org.joda.time.Period period29 = period25.minusMonths(100);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.months();
        int int31 = period29.get(durationFieldType30);
        boolean boolean32 = yearMonthDay1.equals((java.lang.Object) int31);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "1969-12-31T14:49:11.963Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "1969-12-31T14:49:11.963Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "1969-12-31T14:49:11.963Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-100) + "'", int31 == (-100));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableDuration2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.plusHours((int) 'a');
        org.joda.time.Period period8 = period3.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType9 = period3.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        java.lang.Object obj17 = mutableDateTime16.clone();
        org.joda.time.Chronology chronology18 = mutableDateTime16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-292275054), periodType9, chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "1969-12-31T14:49:11.980Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1969-12-31T14:49:11.980Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1969-12-31T14:49:11.980Z");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period13 = period10.plusHours((int) 'a');
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period15 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        boolean boolean19 = period13.isSupported(durationFieldType16);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay7.withFieldAdded(durationFieldType16, 30);
        org.joda.time.DateTime dateTime22 = timeOfDay21.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.withMillisOfSecond(20);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay24.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay27 = property25.addWrapFieldToCopy(550);
        org.joda.time.DurationField durationField28 = property25.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay30 = property25.setCopy("DateTimeField[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[hourOfDay]\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay7.millisOfSecond();
        int int20 = property19.get();
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay25 = property19.setCopy("", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 94 + "'", int20 == 94);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "United States" + "'", str23, "United States");
        org.junit.Assert.assertNotNull(charSet24);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, 20);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.plusMillis(0);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMinutes(253);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long26 = dateTimeZone24.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(dateTimeZone24);
        org.joda.time.LocalTime.Property property29 = localTime28.millisOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalTime localTime31 = property29.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long35 = dateTimeZone33.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(dateTimeZone33);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableDuration39);
        org.joda.time.LocalTime localTime41 = localTime37.plus((org.joda.time.ReadablePeriod) period40);
        int int42 = period40.getYears();
        org.joda.time.LocalTime localTime44 = localTime31.withPeriodAdded((org.joda.time.ReadablePeriod) period40, 12);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay20.minus((org.joda.time.ReadablePeriod) period40);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = timeOfDay20.getValue(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599990L) + "'", long26 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3599990L) + "'", long35 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(timeOfDay45);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime12.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599990L) + "'", long4 == (-3599990L));
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        int int10 = period8.getYears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period8.getFieldType(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599990L) + "'", long3 == (-3599990L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United Kingdom\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(10L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withField(dateTimeFieldType11, (int) '4');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withField(dateTimeFieldType11, 20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599990L) + "'", long9 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone10);
        long long15 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) 59);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) 603, dateTimeZone10);
        java.lang.String str18 = dateTimeZone10.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(2134, 0, 0, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3599990L) + "'", long7 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599990L) + "'", long12 == (-3599990L));
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 59L + "'", long15 == 59L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-01:00" + "'", str18, "-01:00");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        boolean boolean4 = locale3.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = partial1.toString("java.io.IOException: ", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}
