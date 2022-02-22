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
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1), (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period3 = period2.toPeriod();
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) period2, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en_US");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime1.toString("hi!", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1645514151873L + "'", long0 == 1645514151873L);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime0.withDate((int) (byte) 1, 382, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 382 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-22T07:15:51.797Z/2022-02-22T07:15:51.797Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-22t07:15:51.797z/2022-02-22t07:15:51.797z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval6 = interval2.withStart((org.joda.time.ReadableInstant) dateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-1), chronology2);
        org.joda.time.Period period4 = period3.toPeriod();
        org.joda.time.LocalTime localTime5 = localTime0.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime5.withField(dateTimeFieldType6, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime.Property property3 = dateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = property3.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime0.withFieldAdded(durationFieldType3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-1), (int) (byte) 1, (-1), 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-1), chronology2);
        org.joda.time.Period period4 = period3.toPeriod();
        org.joda.time.LocalTime localTime5 = localTime0.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = dateTime9.get(dateTimeFieldType10);
        boolean boolean12 = localTime6.isSupported(dateTimeFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime5.withField(dateTimeFieldType10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        int int8 = dateTime0.getYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTime0.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435 + "'", int3 == 435);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getMinuteOfHour();
        int int2 = localTime0.size();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) int2, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 100, 0, 54, 17, 0, 1970, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime10, (org.joda.time.ReadablePartial) localTime11, periodType12);
        int int14 = localTime11.getMillisOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(10L, chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        int int19 = dateTime17.get(dateTimeFieldType18);
        boolean boolean20 = localTime11.equals((java.lang.Object) dateTimeFieldType18);
        int[] intArray25 = new int[] { 16, 4, 15 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localTime11, (int) (short) 100, intArray25, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435 + "'", int3 == 435);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26155707 + "'", int14 == 26155707);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[16, 4, 15]");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property8.setCopy("2022-02-22T07:15:55.811Z/2022-02-22T07:15:55.811Z", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:15:55.811Z/2022-02-22T07:15:55.811Z\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435 + "'", int3 == 435);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (-1), chronology6);
        org.joda.time.Period period8 = period7.toPeriod();
        int int9 = period8.size();
        int int10 = period8.getMinutes();
        int[] intArray11 = period8.getValues();
        org.joda.time.Period period13 = period8.withMonths(26155103);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval14 = interval4.withPeriodAfterStart((org.joda.time.ReadablePeriod) period8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(435, (int) (short) 100, 0, 26155103, (int) (byte) 10, 26153877, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26155103 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(10L, chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 10, chronology10);
        boolean boolean12 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(3);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (-1), chronology15);
        org.joda.time.Period period17 = period16.toPeriod();
        int int18 = period17.size();
        int int19 = period17.getMinutes();
        int[] intArray20 = period17.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) localTime12, 22, intArray20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435 + "'", int3 == 435);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Interval interval5 = interval3.toInterval();
        long long6 = interval3.getEndMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = interval3.equals((java.lang.Object) dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime0.withField(dateTimeFieldType7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645514156919L + "'", long6 == 1645514156919L);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (-1), chronology6);
        org.joda.time.Period period8 = period7.toPeriod();
        org.joda.time.Period period9 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period9.withPeriodType(periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 435);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("\u4e2d\u56fd\u8a9e", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.lang.String str10 = dateTimeField9.toString();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime11, (org.joda.time.ReadablePartial) localTime12, periodType13);
        int int15 = localTime12.getMillisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(10L, chronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = dateTime18.get(dateTimeFieldType19);
        boolean boolean21 = localTime12.equals((java.lang.Object) dateTimeFieldType19);
        int[] intArray29 = new int[] { 26151451, ' ', 0, 70, 3, 2022 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField9.set((org.joda.time.ReadablePartial) localTime12, 100, intArray29, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[minuteOfDay]" + "'", str10, "DateTimeField[minuteOfDay]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 435 + "'", int15 == 435);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[26151451, 32, 0, 70, 3, 2022]");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology1.getDateTimeMillis((int) (short) 10, (int) 'a', (int) 'a', (int) ' ', 54, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getYear();
        int int10 = dateTime7.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.withSecondOfMinute(122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (int) (short) 1, locale21);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale21.getDisplayLanguage(locale23);
        java.lang.String str25 = locale23.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str24, "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ja_JP" + "'", str25, "ja_JP");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = property3.getAsText(locale4);
        java.lang.String str7 = timeZone1.getDisplayName(locale4);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "435" + "'", str6, "435");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642" + "'", str7, "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        long long7 = duration6.getMillis();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus((org.joda.time.ReadableDuration) duration6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withDate((int) (short) 1, 435, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.MutableInterval mutableInterval1 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks((int) (byte) 10);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plus((org.joda.time.ReadableDuration) duration8);
        mutableInterval1.setDurationAfterStart((org.joda.time.ReadableDuration) duration8);
        boolean boolean12 = date0.equals((java.lang.Object) mutableInterval1);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Tue Feb 22 07:15:58 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate0.withWeekOfWeekyear(453);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 453 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.Duration duration2 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.Period period7 = duration2.toPeriod(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 3, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withMonthOfYear(17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        long long7 = duration6.getMillis();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus((org.joda.time.ReadableDuration) duration6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) date0, periodType2, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Tue Feb 22 07:15:59 UTC 2022");
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 16);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime0.minusHours(7);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(10L, chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.YearMonthDay yearMonthDay18 = dateTime15.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 435 + "'", int3 == 435);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay18);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        long long8 = duration7.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plus((org.joda.time.ReadableDuration) duration7);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration12 = org.joda.time.Duration.millis((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime.Property property3 = dateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = property3.setCopy((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(26151451);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMonthOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ja_JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ja_JP' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray1 = new org.joda.time.DurationFieldType[] { durationFieldType0 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.forFields(durationFieldTypeArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [halfdays]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray1);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset(1969, 2, 54, 14, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withTime(100, 1970, 14, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset(2782, 4, (int) (byte) -1, 3, 26155103, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("DateTimeField[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: DateTimeField[minuteOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (int) (short) 1, locale21);
        java.lang.String str23 = locale21.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh_TW" + "'", str23, "zh_TW");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(3);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime7, (org.joda.time.ReadablePartial) localTime8, periodType9);
        int int11 = localTime8.getMillisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(10L, chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localTime8.equals((java.lang.Object) dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime6.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26160841 + "'", int11 == 26160841);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTime0.withHourOfDay(38270);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38270 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 10, chronology6);
        boolean boolean8 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        boolean boolean11 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology20);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 1, (long) ' ', periodType15, chronology20);
        org.joda.time.DateTime dateTime24 = dateTime9.plus((org.joda.time.ReadablePeriod) period23);
        java.lang.Class<?> wildcardClass25 = dateTime24.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationFrom(readableInstant2);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration7 = duration3.withDurationAdded((long) 32772, (int) (byte) 10);
        long long8 = duration7.getStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) duration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = property1.getAsText(locale2);
        java.lang.String str5 = locale2.toLanguageTag();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DurationField durationField8 = chronology7.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) locale2, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26162243" + "'", str4, "26162243");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja-JP" + "'", str5, "ja-JP");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (-1), chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.LocalTime localTime6 = localTime1.minus((org.joda.time.ReadablePeriod) period5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (int) (short) 1, locale21);
        org.joda.time.DurationField durationField23 = dateTimeField9.getDurationField();
        long long25 = durationField23.getMillis(11);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 660000L + "'", long25 == 660000L);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        int int4 = dateTimeField2.getLeapAmount((long) 26151451);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.withFields(readablePartial8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime11, (org.joda.time.ReadablePartial) localTime12, periodType13);
        org.joda.time.Period period16 = period14.minusHours(26155103);
        org.joda.time.Period period17 = period16.toPeriod();
        int[] intArray18 = period16.getValues();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField2.set((org.joda.time.ReadablePartial) localTime7, (-292275054), intArray18, "2022-02-22T07:16:01.326Z", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:16:01.326Z\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, -26155103, 0, 0, 0]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-22t07:15:55.265z/2022-02-22t07:15:55.265z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        int int3 = localDate2.getCenturyOfEra();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime4, (org.joda.time.ReadablePartial) localTime5, periodType6);
        int int8 = localTime5.getMillisOfDay();
        org.joda.time.LocalTime localTime10 = localTime5.plusHours((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate2.compareTo((org.joda.time.ReadablePartial) localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26162872 + "'", int8 == 26162872);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology7.getDateTimeMillis(26155103, 1, 4, 11, 26153877, 54, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26153877 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks(1439);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("weekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime0.compareTo(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(2);
        long long17 = chronology8.set((org.joda.time.ReadablePartial) localDateTime13, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDateTime13.toString("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645514163525L + "'", long17 == 1645514163525L);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTime(chronology13);
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) 7, (long) (short) 100, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(26155103, 11, (int) (short) -1, 26151451, 435, 15, 14, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26151451 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        long long7 = duration6.getMillis();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus((org.joda.time.ReadableDuration) duration6);
        int int9 = localDateTime2.getHourOfDay();
        int int10 = localDateTime2.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks14 = period12.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDateTime6.toString("ja_JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = periodType0.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("26153877", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime2.withField(dateTimeFieldType3, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = localDate1.toDateMidnight(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate1.getValue(26161182);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26161182");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (-1), chronology6);
        org.joda.time.Period period8 = period7.toPeriod();
        org.joda.time.Period period9 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        boolean boolean11 = period4.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = new org.joda.time.DurationFieldType[] { durationFieldType10, durationFieldType12, durationFieldType13, durationFieldType14, durationFieldType15 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [centuries, halfdays, hours, halfdays]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate0.toString("ja_JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        int int8 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime.Property property9 = dateTime0.millisOfSecond();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) property9, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType5 = periodType4.withDaysRemoved();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.Period period11 = new org.joda.time.Period(1645514161529L, periodType5, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(22, (int) (short) 100, 1969, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        long long6 = mutableInterval5.getStartMillis();
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.Period period13 = duration8.toPeriod(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval5.setDurationAfterStart((org.joda.time.ReadableDuration) duration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645514165055L + "'", long6 == 1645514165055L);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.Period period3 = period1.normalizedStandard(periodType2);
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = periodType2.getFieldType(26151451);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26151451");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.Period period3 = period1.normalizedStandard(periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        int int5 = periodType2.indexOf(durationFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = periodType2.getFieldType((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property1.setCopy(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.DateTime dateTime5 = dateTime0.minusHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withDayOfWeek(453);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 453 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 10, chronology6);
        boolean boolean8 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        boolean boolean11 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology20);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 1, (long) ' ', periodType15, chronology20);
        org.joda.time.DateTime dateTime24 = dateTime9.plus((org.joda.time.ReadablePeriod) period23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ja-JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ja-JP' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addWrapFieldToCopy(7);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.Period period12 = duration7.toPeriod(chronology9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) property3, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar4.add(26151451, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        boolean boolean10 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime.Property property11 = dateTime0.weekOfWeekyear();
        boolean boolean13 = dateTime0.isAfter((long) (byte) 10);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getSeconds();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Tue Feb 22 07:16:06 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        java.lang.String str12 = dateTimeField9.getAsShortText((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField9.set(0L, "26161962");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26161962 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str6 = dateTimeField2.getAsShortText(1645514151873L, locale5);
        org.joda.time.DurationField durationField7 = dateTimeField2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks((int) (byte) 10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime12, (org.joda.time.ReadablePartial) localTime13, periodType14);
        org.joda.time.Period period17 = period15.minusHours(26155103);
        org.joda.time.Period period18 = period17.toPeriod();
        int[] intArray19 = period17.getValues();
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField2.set((org.joda.time.ReadablePartial) localDateTime10, 26155103, intArray19, "2022-02-22T07:15:55.773Z/2022-02-22T07:15:55.773Z", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:15:55.773Z/2022-02-22T07:15:55.773Z\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, -26155103, 0, 0, 0]");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) (byte) 10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 539 + "'", int4 == 539);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Duration duration2 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.Period period7 = duration2.toPeriod(chronology4);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(327L, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology4.getDateTimeMillis((long) 12, 2782, (-292275054), 26165, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2782 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime0.withField(dateTimeFieldType4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) ' ', 2, 6, 86399999, (int) (byte) -1, 382);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.Duration duration9 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology11);
        org.joda.time.Period period14 = duration9.toPeriod(chronology11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(327L, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(4, 13, 26151451, 35, 0, (int) (byte) 100, 16, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology4.getDateTimeMillis(0, (-1), 474, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        long long5 = interval2.getEndMillis();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        int int9 = dateTime6.getMinuteOfDay();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime6.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime6.minus((long) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval19 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645514169072L + "'", long5 == 1645514169072L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 436 + "'", int9 == 436);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.clear(26153877);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26153877");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514169149,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=9,MILLISECOND=149,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514169149L + "'", long2 == 1645514169149L);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime7 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        int int11 = period9.getValue(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration15 = period9.toDurationTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology16.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) period4, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 100, 22, 474, 86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(2782);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime10.withHourOfDay(26153877);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26153877 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("2022-02-22T07:15:53.208Z/2022-02-22T07:15:53.208Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:15:53.208Z/2022-02...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period3 = period2.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(435);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime0.withHourOfDay(54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType24 = periodType23.withMillisRemoved();
        org.joda.time.Period period25 = interval2.toPeriod(periodType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = period25.withMinutes(4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22T07:16:10.185Z/2022-02-22T07:16:10.185Z" + "'", str3, "2022-02-22T07:16:10.185Z/2022-02-22T07:16:10.185Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(interval20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = calendar27.getActualMinimum(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str26, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514170203,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=10,MILLISECOND=203,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime7.withDate((int) 'x', (int) '#', 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) 10);
        org.joda.time.Period period13 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Seconds seconds14 = duration1.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = seconds14.getValue(453);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 453");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(seconds14);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(35, 26165, 38270, 15, (int) '4', 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str6 = dateTimeField2.getAsShortText(1645514151873L, locale5);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = dateTimeField2.getAsShortText(26153877, locale8);
        long long11 = dateTimeField2.roundFloor((long) 1439);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = property15.getAsText(locale16);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField2.set((long) (-1), "2022-02-22T07:16:01.326Z", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:16:01.326Z\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "26153877" + "'", str9, "26153877");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "26171029" + "'", str18, "26171029");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property3.addWrapFieldToCopy(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withEra(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        java.lang.String str14 = dateTimeZone12.getName((long) ' ');
        java.lang.String str16 = dateTimeZone12.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(0L, dateTimeZone12);
        org.joda.time.DateTime dateTime18 = dateTime9.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((int) (byte) 0, 122, 24, 1969, 2, 1439, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("hourOfHalfday", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond(26171181);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26171181 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone9.getName((long) ' ');
        java.lang.String str13 = dateTimeZone9.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = localTime1.isAfter((org.joda.time.ReadablePartial) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 781 + "'", int4 == 781);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        int int3 = dateTime0.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(53, 38222, (int) (byte) 1, 2022, 26165, 38270, 366, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayScript();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        int int7 = dateTimeField5.getLeapAmount((long) 26151451);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getISO3Language();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder13.set((int) '#', 86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zho" + "'", str12, "zho");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTime dateTime8 = dateTime2.toDateTime(chronology6);
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) 7, (long) (short) 100, chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        long long14 = durationField11.add((long) 1970, (int) (short) -1);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3598030L) + "'", long14 == (-3598030L));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getYear();
        int int10 = dateTime7.getEra();
        org.joda.time.Duration duration12 = org.joda.time.Duration.millis((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DateTime dateTime13 = dateTime7.toDateTime(chronology11);
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, (long) ' ', periodType6, chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withCenturyOfEra(2);
        long long20 = chronology11.set((org.joda.time.ReadablePartial) localDateTime16, (long) (short) 10);
        java.lang.String str21 = chronology11.toString();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((int) (short) 100, 5, 26161182, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26161182 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645514172487L + "'", long20 == 1645514172487L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str21, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime13, (org.joda.time.ReadablePartial) localTime14, periodType15);
        org.joda.time.Period period17 = period12.minus((org.joda.time.ReadablePeriod) period16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType19 = period17.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property7.addCopy((long) (byte) 0);
        java.lang.String str13 = localTime12.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "07:16:13.178" + "'", str13, "07:16:13.178");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime8.getMinuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(10L, chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        int int16 = dateTime14.get(dateTimeFieldType15);
        int int17 = dateTime8.get(dateTimeFieldType15);
        boolean boolean18 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property19 = dateTime8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeUtils.getZone(dateTimeZone20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) dateTime8, dateTimeZone21);
        boolean boolean23 = dateTimeZone21.isFixed();
        long long26 = dateTimeZone21.adjustOffset((long) 21, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(16, 3, 100, 26160257, (int) (short) -1, 0, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26160257 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 436 + "'", int11 == 436);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 21L + "'", long26 == 21L);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withDayOfWeek(17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        int int4 = calendar1.getGreatestMinimum(6);
        calendar1.set((int) (short) 0, 100, 5);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        int int15 = dateTime11.getYearOfCentury();
        int int16 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime11.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = dateTimeField20.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks((int) (byte) 10);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        long long29 = duration28.getMillis();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plus((org.joda.time.ReadableDuration) duration28);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str33 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDateTime24, (int) (short) 1, locale32);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale32.getDisplayLanguage(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = calendar1.getDisplayName(13, 38270, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=100,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=5,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=14,MILLISECOND=90,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514174090L + "'", long2 == 1645514174090L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 436 + "'", int14 == 436);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1439 + "'", int21 == 1439);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str35, "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(382);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        boolean boolean9 = interval7.isAfter((long) 10);
        org.joda.time.Duration duration10 = interval7.toDuration();
        org.joda.time.Duration duration13 = duration10.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime14.getMinuteOfDay();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime20 = dateTime14.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period22 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime14, periodType21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime0.withPeriodAdded((org.joda.time.ReadablePeriod) period22, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = period22.withMonths(122);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration13);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 436 + "'", int17 == 436);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53, 292278993, (int) ' ', 453, 1439, 1, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 453 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        java.lang.String str12 = dateTimeField9.getAsShortText((long) (byte) 1);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime13.getMinuteOfDay();
        int int17 = dateTime13.getYearOfCentury();
        int int18 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime13.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now();
        int int24 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str32 = dateTimeField28.getAsShortText(1645514151873L, locale31);
        java.lang.String str33 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localTime23, 0, locale31);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        int[] intArray37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) localDateTime34, (-292275054), intArray37, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 436 + "'", int16 == 436);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1439 + "'", int24 == 1439);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("DateTimeField[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: DateTimeField[minuteOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.Date date9 = new java.util.Date(12, 100, (-292275054), (-1), 436, (int) '#');
        int int10 = date9.getDay();
        int int11 = date9.getSeconds();
        boolean boolean12 = timeZone1.inDaylightTime(date9);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 04 06:16:35 UTC 798287");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField11 = durationFieldType7.getField(chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        boolean boolean14 = durationFieldType7.isSupported(chronology13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) property5, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        java.lang.Object obj31 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str26, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514174887,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=14,MILLISECOND=887,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period(21, (int) (byte) 100, 35, 292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate2.withPeriodAdded((org.joda.time.ReadablePeriod) period9, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 292278993 * 53");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '#');
        int int3 = period1.getValue(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Duration duration7 = period1.toDurationTo((org.joda.time.ReadableInstant) dateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withMillisOfSecond(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("ja");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ja\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        java.lang.String str9 = interval8.toString();
        org.joda.time.DateTime dateTime10 = interval8.getEnd();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        boolean boolean20 = interval8.equals((java.lang.Object) duration17);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean25 = interval23.isAfter((long) 10);
        org.joda.time.Interval interval26 = interval8.overlap((org.joda.time.ReadableInterval) interval23);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.months();
        org.joda.time.Period period28 = interval8.toPeriod(periodType27);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType30 = periodType29.withMillisRemoved();
        org.joda.time.Period period31 = interval8.toPeriod(periodType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) dateTime3, periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-22T07:16:15.280Z/2022-02-22T07:16:15.280Z" + "'", str9, "2022-02-22T07:16:15.280Z/2022-02-22T07:16:15.280Z");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(interval26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        java.util.Locale locale7 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime5.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '??? (??)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.util.Date date1 = localDate0.toDate();
        date1.setMinutes(1969);
        java.time.Instant instant4 = date1.toInstant();
        java.util.Date date5 = java.util.Date.from(instant4);
        date5.setMinutes(16);
        java.lang.Object obj8 = date5.clone();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Feb 23 08:49:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Feb 23 08:16:00 UTC 2022");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Wed Feb 23 08:16:00 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Wed Feb 23 08:16:00 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Wed Feb 23 08:16:00 UTC 2022");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(3);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) ' ', dateTimeZone8);
        int int10 = dateTime9.getYearOfCentury();
        org.joda.time.DateTime.Property property11 = dateTime9.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime6.withField(dateTimeFieldType12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(26171181, 26161182, 26155103, (-1), 453);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (int) (short) 1, locale21);
        org.joda.time.DurationField durationField23 = dateTimeField9.getDurationField();
        long long24 = durationField23.getUnitMillis();
        long long26 = durationField23.getValueAsLong(327L);
        long long28 = durationField23.getMillis(54);
        int int31 = durationField23.getDifference((long) 1969, (long) 13);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60000L + "'", long24 == 60000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3240000L + "'", long28 == 3240000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        boolean boolean10 = interval8.isAfter((long) 10);
        org.joda.time.Duration duration11 = interval8.toDuration();
        org.joda.time.Duration duration14 = duration11.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime.Property property16 = dateTime2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime2.withDate(26155103, 1439, 26175498);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.Period period0 = new org.joda.time.Period();
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1645514170762L);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        boolean boolean2 = mutableInterval0.isAfter((long) 16);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate7 = localDate5.plusDays((int) (byte) 10);
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval0.setStart((org.joda.time.ReadableInstant) dateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (short) -1, 453, 2, 26153423);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: PT0.001S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(436, 0, 4, 26161182, 2022, 6, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26161182 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        int int3 = localDate2.getCenturyOfEra();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays((int) '#');
        int int6 = localDate5.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate5.withDayOfWeek(26167);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26167 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1970, (int) 'a', 26176117, (-292275054), 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime0.withHourOfDay(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Etc/UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getYear();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.withFields(readablePartial13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology16);
        int int18 = localTime17.getSecondOfMinute();
        org.joda.time.Period period19 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime12, (org.joda.time.ReadablePartial) localTime17);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.Period period21 = period19.plus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = dateTime7.minus((org.joda.time.ReadablePeriod) period19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval23 = new org.joda.time.Interval((java.lang.Object) period19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-22T07:16:15.918");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int3 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period13 = period11.minusHours(100);
        int int14 = period11.size();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-22T07:16:01.326Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-22t07:16:01.326z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayScript();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        int int7 = dateTimeField5.getLeapAmount((long) 26151451);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getISO3Language();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder0.set(26171, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zho" + "'", str12, "zho");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        long long5 = interval2.getEndMillis();
        java.lang.String str6 = interval2.toString();
        org.joda.time.DateTime dateTime7 = interval2.getStart();
        org.joda.time.DateTime dateTime9 = dateTime7.withYear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645514178428L + "'", long5 == 1645514178428L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-22T07:16:18.428Z/2022-02-22T07:16:18.428Z" + "'", str6, "2022-02-22T07:16:18.428Z/2022-02-22T07:16:18.428Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period5 = period3.minusHours(26155103);
        org.joda.time.Period period6 = period5.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period6.getValue(366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 366");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = timeZone1.getDisplayName(true, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str26, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514178517,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=18,MILLISECOND=517,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        java.util.Locale locale30 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = calendar27.getDisplayName(7, 24, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str26, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514178577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=18,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar1.getLeastMaximum(26171);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26171");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514178646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=18,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        int int3 = localDate2.getCenturyOfEra();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays((int) '#');
        int int6 = localDate5.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDate5.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        calendar27.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calendar27.getMaximum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str26, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1439);
        org.joda.time.Period period3 = period1.withMillis(12);
        int int4 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfCeilingCopy();
        int int10 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-22T07:15:53.208Z/2022-02-22T07:15:53.208Z", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.util.Date date1 = localDate0.toDate();
        java.lang.Object obj2 = date1.clone();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Tue Feb 22 00:00:00 UTC 2022");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(21L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, 26151451, 38222);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26151451 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
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
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("35");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 35 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(26176117, 54, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) "+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = localDate1.toDateMidnight(dateTimeZone2);
        int int4 = localDate1.getDayOfMonth();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate1.withFieldAdded(durationFieldType5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        int int7 = period5.getValue(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration11 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) 2, chronology12);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusYears(382);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        boolean boolean26 = interval24.isAfter((long) 10);
        org.joda.time.Duration duration27 = interval24.toDuration();
        org.joda.time.Duration duration30 = duration27.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime37 = dateTime31.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period39 = duration27.toPeriodFrom((org.joda.time.ReadableInstant) dateTime31, periodType38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime17.withPeriodAdded((org.joda.time.ReadablePeriod) period39, 2);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime43);
        int int45 = dateTime42.getMinuteOfDay();
        int int46 = dateTime42.getYearOfCentury();
        int int47 = dateTime42.getDayOfMonth();
        org.joda.time.DateTime dateTime49 = dateTime42.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField51 = property50.getField();
        int int52 = dateTimeField51.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusWeeks((int) (byte) 10);
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period57.toDurationFrom(readableInstant58);
        long long60 = duration59.getMillis();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.plus((org.joda.time.ReadableDuration) duration59);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str64 = dateTimeField51.getAsText((org.joda.time.ReadablePartial) localDateTime55, (int) (short) 1, locale63);
        org.joda.time.ReadablePartial readablePartial65 = null;
        int int66 = dateTimeField51.getMaximumValue(readablePartial65);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = localDateTime67.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.plusYears(26151451);
        org.joda.time.Period period73 = new org.joda.time.Period((long) '#');
        int int75 = period73.getValue(0);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Duration duration79 = period73.toDurationTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime71.withPeriodAdded((org.joda.time.ReadablePeriod) period73, 0);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (-1), chronology83);
        org.joda.time.Period period85 = period84.toPeriod();
        int int86 = period85.size();
        int int87 = period85.getMinutes();
        int[] intArray88 = period85.getValues();
        int int89 = dateTimeField51.getMinimumValue((org.joda.time.ReadablePartial) localDateTime81, intArray88);
        // The following exception was thrown during execution in test generation
        try {
            chronology12.validate((org.joda.time.ReadablePartial) localDateTime41, intArray88);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration30);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 436 + "'", int34 == 436);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 436 + "'", int45 == 436);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 22 + "'", int46 == 22);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 22 + "'", int47 == 22);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1439 + "'", int52 == 1439);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 35L + "'", long60 == 35L);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1" + "'", str64, "1");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1439 + "'", int66 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
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
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(17, 32769, 26165, 436, (int) 'x', 814);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 436 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusWeeks(26161182);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withMonthOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        long long5 = interval2.getEndMillis();
        java.lang.String str6 = interval2.toString();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.withFields(readablePartial10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime11.withFieldAdded(durationFieldType12, 38270);
        boolean boolean15 = interval2.equals((java.lang.Object) 38270);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645514182234L + "'", long5 == 1645514182234L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-22T07:16:22.234Z/2022-02-22T07:16:22.234Z" + "'", str6, "2022-02-22T07:16:22.234Z/2022-02-22T07:16:22.234Z");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 1, (long) ' ', periodType4, chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        int int21 = dateTime17.getYearOfCentury();
        int int22 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime17.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = dateTimeField26.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime30, (int) (short) 1, locale38);
        org.joda.time.ReadablePartial readablePartial40 = null;
        int int41 = dateTimeField26.getMaximumValue(readablePartial40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = localDateTime42.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusYears(26151451);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        int int50 = period48.getValue(0);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration54 = period48.toDurationTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime46.withPeriodAdded((org.joda.time.ReadablePeriod) period48, 0);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (-1), chronology58);
        org.joda.time.Period period60 = period59.toPeriod();
        int int61 = period60.size();
        int int62 = period60.getMinutes();
        int[] intArray63 = period60.getValues();
        int int64 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56, intArray63);
        int[] intArray66 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDateTime15, 6, intArray63, 0);
        java.util.Calendar.Builder builder67 = builder0.setFields(intArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder70 = builder67.setWeekDefinition(2036, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 436 + "'", int20 == 436);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1439 + "'", int27 == 1439);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1439 + "'", int41 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        boolean boolean3 = calendar1.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar1.getActualMinimum(436);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 436");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514182505,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=22,MILLISECOND=505,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514182505L + "'", long2 == 1645514182505L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(15);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(1645514160806L, (long) 70, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.withFields(readablePartial8);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(3);
        boolean boolean12 = calendar4.before((java.lang.Object) localTime11);
        int int13 = localTime11.getHourOfDay();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514182744,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=22,MILLISECOND=744,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2021-12-14T07:16:22.352", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 1, (long) ' ', periodType4, chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        int int21 = dateTime17.getYearOfCentury();
        int int22 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime17.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = dateTimeField26.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime30, (int) (short) 1, locale38);
        org.joda.time.ReadablePartial readablePartial40 = null;
        int int41 = dateTimeField26.getMaximumValue(readablePartial40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = localDateTime42.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusYears(26151451);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        int int50 = period48.getValue(0);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration54 = period48.toDurationTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime46.withPeriodAdded((org.joda.time.ReadablePeriod) period48, 0);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (-1), chronology58);
        org.joda.time.Period period60 = period59.toPeriod();
        int int61 = period60.size();
        int int62 = period60.getMinutes();
        int[] intArray63 = period60.getValues();
        int int64 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56, intArray63);
        int[] intArray66 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDateTime15, 6, intArray63, 0);
        java.util.Calendar.Builder builder67 = builder0.setFields(intArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder70 = builder0.setWeekDefinition(474, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 436 + "'", int20 == 436);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1439 + "'", int27 == 1439);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1439 + "'", int41 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayScript();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.hourOfHalfday();
        int int6 = dateTimeField4.getLeapAmount((long) 26151451);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int9 = dateTimeField4.getMaximumShortTextLength(locale8);
        java.lang.String str10 = locale0.getDisplayCountry(locale8);
        java.util.Set<java.lang.Character> charSet11 = locale8.getExtensionKeys();
        java.util.Locale locale12 = locale8.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale8.getUnicodeLocaleType("2022-02-22T07:16:06.004Z/2022-02-22T07:16:06.004Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-22T07:16:06.004Z/2022-02-22T07:16:06.004Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.lang.String str4 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642" + "'", str4, "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hourOfHalfday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds(9);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfSecond();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(26151451);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period6, 0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property15.setCopy("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??? (??)\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(3);
        int int17 = localDateTime16.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.property(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime20 = property19.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks(1439);
        boolean boolean23 = mutableInterval13.equals((java.lang.Object) 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.lang.String str8 = property1.getAsShortText(locale7);
        int int9 = property1.getMaximumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u897f\u66a6" + "'", str8, "\u897f\u66a6");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DateTime dateTime13 = dateTime7.toDateTime(chronology11);
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, (long) ' ', periodType6, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.weeks();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 10, 1645514153096L, chronology11);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval18 = new org.joda.time.Interval((java.lang.Object) (-1.0d), chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.withFields(readablePartial8);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(3);
        boolean boolean12 = calendar4.before((java.lang.Object) localTime11);
        java.lang.String str13 = calendar4.toString();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514184375,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=24,MILLISECOND=375,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util.GregorianCalendar[time=1645514184375,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=24,MILLISECOND=375,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str13, "java.util.GregorianCalendar[time=1645514184375,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=24,MILLISECOND=375,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        boolean boolean10 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime2);
        int int11 = dateTime2.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property12 = dateTime2.dayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime2.minus(22560257L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.withEra(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        int int6 = period4.getValue(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Duration duration10 = period4.toDurationTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime2.withTime((int) (byte) 0, 10, (int) '4', 1640);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1640 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = periodType1.getFieldType(26153423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26153423");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology14);
        org.joda.time.Period period17 = new org.joda.time.Period((long) 1, (long) ' ', periodType9, chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withCenturyOfEra(2);
        long long23 = chronology14.set((org.joda.time.ReadablePartial) localDateTime19, (long) (short) 10);
        java.lang.String str24 = chronology14.toString();
        long long28 = chronology14.add((long) (short) -1, 0L, (int) 'x');
        org.joda.time.DurationField durationField29 = chronology14.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localTime2, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645514184659L + "'", long23 == 1645514184659L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str24, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        boolean boolean4 = interval2.isAfterNow();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Interval interval6 = interval2.gap(readableInterval5);
        org.joda.time.Chronology chronology7 = null; // flaky: interval6.getChronology();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22T07:16:24.746Z/2022-02-22T07:16:24.746Z" + "'", str3, "2022-02-22T07:16:24.746Z/2022-02-22T07:16:24.746Z");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate4 = property3.getLocalDate();
        org.joda.time.LocalDate localDate5 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate6 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Date date6 = new java.util.Date(12, 100, (-292275054), (-1), 436, (int) '#');
        int int7 = date6.getDay();
        int int8 = date6.getSeconds();
        java.lang.String str9 = date6.toGMTString();
        java.lang.String str10 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Wed Nov 04 06:16:35 UTC 798287");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4 Nov 798287 06:16:35 GMT" + "'", str9, "4 Nov 798287 06:16:35 GMT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed Nov 04 06:16:35 UTC 798287" + "'", str10, "Wed Nov 04 06:16:35 UTC 798287");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DurationField durationField2 = chronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.hourOfDay();
        boolean boolean4 = dateTimeField3.isLenient();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundCeilingCopy();
        java.lang.String str10 = property7.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16" + "'", str10, "16");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(0L);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime11 = localTime2.plusMillis((int) (short) -1);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime14.getMinuteOfDay();
        int int18 = dateTime14.getYearOfCentury();
        int int19 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime14.minusWeeks((int) (short) 0);
        boolean boolean22 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property23 = dateTime12.weekOfWeekyear();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime25 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime25.withDayOfWeek(122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime4.getMinuteOfDay();
        int int8 = dateTime4.getYearOfCentury();
        int int9 = dateTime4.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(10L, chronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = dateTime18.get(dateTimeFieldType19);
        int int21 = dateTime12.get(dateTimeFieldType19);
        boolean boolean22 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property23 = dateTime12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeUtils.getZone(dateTimeZone24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) dateTime12, dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime4.toMutableDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = mutableDateTime27.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(32769, 26176117, 26153877, 86399999, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.DateTime dateTime23 = interval2.getStart();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Interval interval28 = interval26.toInterval();
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        boolean boolean30 = interval2.isBefore((org.joda.time.ReadableInterval) interval28);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.Interval interval32 = interval28.withPeriodAfterStart(readablePeriod31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval34 = interval28.withStartMillis(22560257L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z" + "'", str3, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(interval20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(interval32);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property7 = localDate4.yearOfEra();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime15 = dateTime9.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime9.minus((long) 10);
        org.joda.time.DateTime dateTime21 = dateTime9.minusHours(7);
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getChronology(chronology24);
        org.joda.time.DurationField durationField26 = chronology25.years();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.centuryOfEra();
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.lang.String str31 = dateTimeField27.getAsText((int) (byte) 0, locale29);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale29);
        java.lang.String str33 = property22.getAsText(locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = property7.setCopy("2022-02-22T07:16:21.713Z/2022-02-22T07:16:21.713Z", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:16:21.713Z/2022-02-22T07:16:21.713Z\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645514185409,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=25,MILLISECOND=409,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6728\u66dc\u65e5" + "'", str33, "\u6728\u66dc\u65e5");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 26153423);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26153423 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Date date5 = new java.util.Date((int) '4', 32772, (int) (short) -1, 8, 14);
        int int6 = date5.getYear();
        date5.setMinutes((int) '4');
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.Period period14 = period10.plusWeeks(1969);
        org.joda.time.Duration duration15 = period14.toStandardDuration();
        boolean boolean16 = date5.equals((java.lang.Object) duration15);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Dec 30 08:52:00 UTC 4682");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2782 + "'", int6 == 2782);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        long long3 = calendar1.getTimeInMillis();
        int int5 = calendar1.getMinimum(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar1.getGreatestMinimum(26167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26167");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514185958,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=25,MILLISECOND=958,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514185958L + "'", long2 == 1645514185958L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514185958L + "'", long3 == 1645514185958L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1439);
        org.joda.time.Period period3 = period1.withMillis(12);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period1.getValue(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        long long6 = mutableInterval5.getStartMillis();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withMinuteOfHour((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval5.setEnd((org.joda.time.ReadableInstant) dateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property7.addCopy(3);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withFieldAdded(durationFieldType13, 1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime10.withFieldAdded(durationFieldType13, 26175498);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(2);
        int int9 = localDateTime6.getYear();
        int int10 = localDateTime6.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = localDateTime6.get(dateTimeFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate4.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime0, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMonthOfYear(5);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withTime((int) (short) -1, (int) 'x', 382, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.hourOfHalfday();
        org.joda.time.DurationField durationField5 = durationFieldType1.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 'a', chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        long long9 = calendar8.getTimeInMillis();
        long long10 = calendar8.getTimeInMillis();
        int int12 = calendar8.getMinimum(0);
        org.joda.time.Duration duration14 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.Period period19 = duration14.toPeriod(chronology16);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeUtils.getZone(dateTimeZone22);
        boolean boolean25 = dateTimeZone23.equals((java.lang.Object) 1645514161708L);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone23);
        boolean boolean27 = calendar8.after((java.lang.Object) chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(0, 26179754, (-292275054), 26167, 26184703, 5, (int) '#', chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26167 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645514186881,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=26,MILLISECOND=881,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645514186881L + "'", long9 == 1645514186881L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645514186881L + "'", long10 == 1645514186881L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(26181277);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        int int20 = period18.getValue(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration24 = period18.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime13.toDateTime(chronology25);
        java.lang.String str27 = dateTime13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration28 = new org.joda.time.Duration((java.lang.Object) dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1997-07-08T12:03:00.032Z" + "'", str27, "1997-07-08T12:03:00.032Z");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime16.getMinuteOfDay();
        int int20 = dateTime16.getYearOfCentury();
        int int21 = dateTime16.getDayOfMonth();
        org.joda.time.DateTime dateTime23 = dateTime16.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        int int26 = dateTimeField25.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks((int) (byte) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        long long34 = duration33.getMillis();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plus((org.joda.time.ReadableDuration) duration33);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime29, (int) (short) 1, locale37);
        org.joda.time.ReadablePartial readablePartial39 = null;
        int int40 = dateTimeField25.getMaximumValue(readablePartial39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime41.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.plusYears(26151451);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        int int49 = period47.getValue(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration53 = period47.toDurationTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime45.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 0);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (-1), chronology57);
        org.joda.time.Period period59 = period58.toPeriod();
        int int60 = period59.size();
        int int61 = period59.getMinutes();
        int[] intArray62 = period59.getValues();
        int int63 = dateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) localDateTime55, intArray62);
        int[] intArray65 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDateTime14, 6, intArray62, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int67 = localDateTime14.get(dateTimeFieldType66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1439 + "'", int26 == 1439);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1439 + "'", int40 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMillis(0);
        int int5 = localDateTime0.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withTime(2022, 54, 32772, 26151451);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        long long8 = duration7.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plus((org.joda.time.ReadableDuration) duration7);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        int int15 = dateTime11.getYearOfCentury();
        int int16 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime11.minusWeeks((int) (short) 0);
        int int19 = dateTime11.getYear();
        org.joda.time.DateTime dateTime21 = dateTime11.minusYears((int) (byte) 1);
        mutableInterval0.setStart((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("26179305", (double) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=19.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds(9);
        org.joda.time.LocalTime localTime9 = localTime5.plusSeconds(1970);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime5.withFieldAdded(durationFieldType10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period3 = period2.toPeriod();
        int int4 = period3.size();
        int int5 = period3.getMinutes();
        int[] intArray6 = period3.getValues();
        org.joda.time.Period period8 = period3.withMonths(26155103);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = mutablePeriod9.getValue(999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Set<java.lang.String> strSet1 = org.joda.time.DateTimeZone.getAvailableIDs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("2022-02-22T07:16:10.118Z/2022-02-22T07:16:10.118Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekOfWeekyear();
        int int4 = localDateTime0.getYearOfEra();
        int int5 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.minusMillis(0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayScript();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        int int7 = dateTimeField5.getLeapAmount((long) 26151451);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getISO3Language();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder17 = builder0.setDate(20, 26160257, 16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        int int22 = dateTimeField20.getLeapAmount((long) 26151451);
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int25 = dateTimeField20.getMaximumShortTextLength(locale24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        int int32 = dateTime29.getMinuteOfDay();
        int int33 = dateTime29.getYearOfCentury();
        int int34 = dateTime29.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime29.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        int int39 = dateTimeField38.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks((int) (byte) 10);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        long long47 = duration46.getMillis();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plus((org.joda.time.ReadableDuration) duration46);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str51 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localDateTime42, (int) (short) 1, locale50);
        int int52 = dateTimeField28.getMaximumTextLength(locale50);
        java.lang.String str53 = locale24.getDisplayLanguage(locale50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.hourOfHalfday();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime58);
        int int60 = dateTime57.getMinuteOfDay();
        int int61 = dateTime57.getYearOfCentury();
        int int62 = dateTime57.getDayOfMonth();
        org.joda.time.DateTime dateTime64 = dateTime57.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property65 = dateTime64.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField66 = property65.getField();
        int int67 = dateTimeField66.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minusWeeks((int) (byte) 10);
        org.joda.time.Period period72 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = period72.toDurationFrom(readableInstant73);
        long long75 = duration74.getMillis();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime70.plus((org.joda.time.ReadableDuration) duration74);
        java.util.Locale locale78 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str79 = dateTimeField66.getAsText((org.joda.time.ReadablePartial) localDateTime70, (int) (short) 1, locale78);
        int int80 = dateTimeField56.getMaximumTextLength(locale78);
        java.lang.String str81 = locale24.getDisplayLanguage(locale78);
        java.util.Calendar.Builder builder82 = builder17.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant83 = new org.joda.time.Instant((java.lang.Object) locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zho" + "'", str12, "zho");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 70 + "'", int33 == 70);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1439 + "'", int39 == 1439);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1" + "'", str51, "1");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 70 + "'", int61 == 70);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1439 + "'", int67 == 1439);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 35L + "'", long75 == 35L);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1" + "'", str79, "1");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(2);
        long long17 = chronology8.set((org.joda.time.ReadablePartial) localDateTime13, (long) (short) 10);
        java.lang.String str18 = chronology8.toString();
        long long22 = chronology8.add((long) (short) -1, 0L, (int) 'x');
        org.joda.time.DurationField durationField23 = chronology8.minutes();
        int int26 = durationField23.getValue((long) (byte) 100, (-3598030L));
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(10L, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = dateTime8.get(dateTimeFieldType9);
        int int11 = dateTime2.get(dateTimeFieldType9);
        boolean boolean12 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime.Property property13 = dateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) dateTime2, dateTimeZone15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(10L, chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyear();
        int int21 = dateTime19.get(dateTimeFieldType20);
        org.joda.time.DateMidnight dateMidnight22 = dateTime19.toDateMidnight();
        org.joda.time.DateTime dateTime23 = localDate16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate25 = localDate16.plusYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField27 = localDate25.getField(26165);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26165");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.days();
        int int2 = periodType0.indexOf(durationFieldType1);
        int int3 = periodType0.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        long long7 = dateTime6.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime6.withLaterOffsetAtOverlap();
        java.lang.String str9 = dateTime6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str9, "1970-01-01T00:00:00.035Z");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        int int4 = dateTimeField2.getLeapAmount((long) 26151451);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        long long10 = dateTimeField2.addWrapField((long) 26160257, 26155103);
        org.joda.time.DurationField durationField11 = dateTimeField2.getRangeDurationField();
        boolean boolean12 = dateTimeField2.isSupported();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22560257L + "'", long10 == 22560257L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Locale.Category category0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.withWeekyear(1);
        org.joda.time.LocalDate.Property property4 = localDate1.year();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy(7);
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = dateTimeField8.getAsText(1645514170915L, locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        int int5 = calendar4.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar4.getGreatestMinimum(26153423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26153423");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514189903,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=29,MILLISECOND=903,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"millisOfSecond\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("07:16:08.152");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 07:16:08.152 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMonths(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withDayOfMonth(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = periodType10.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime0, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMonthOfYear(5);
        int int11 = localDateTime8.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime1.withMillisOfSecond((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, 1970);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Interval interval11 = interval9.toInterval();
        long long12 = interval9.getEndMillis();
        java.lang.String str13 = interval9.toString();
        org.joda.time.DateTime dateTime14 = interval9.getStart();
        org.joda.time.Chronology chronology15 = interval9.getChronology();
        org.joda.time.Period period16 = new org.joda.time.Period(0L, 1645514152681L, chronology15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusYears(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withField(dateTimeFieldType22, 26184703);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26184703 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z" + "'", str13, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period5 = org.joda.time.Period.years(10);
        org.joda.time.LocalTime localTime7 = localTime0.withPeriodAdded((org.joda.time.ReadablePeriod) period5, 1);
        int int8 = period5.getWeeks();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property1 = localTime0.hourOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.centuryOfEra();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = dateTimeField6.getAsText((int) (byte) 0, locale8);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property1.setCopy("2022-02-22T07:15:55.811Z/2022-02-22T07:15:55.811Z", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:15:55.811Z/2022-02-22T07:15:55.811Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645514191090,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=31,MILLISECOND=90,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime4.withFieldAdded(durationFieldType5, 38270);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime4.withMinuteOfHour(26181277);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26181277 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Period period1 = org.joda.time.Period.years(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes15 = duration14.toStandardMinutes();
        boolean boolean16 = calendar1.equals((java.lang.Object) duration14);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514191566,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=31,MILLISECOND=566,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property5 = localDate0.property(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (short) 10, 21, 26179754, 26184703, 17, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26184703 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.DateTime dateTime23 = interval2.getStart();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate26 = localDate24.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate28 = localDate26.plusDays((int) (byte) 10);
        org.joda.time.Interval interval29 = localDate28.toInterval();
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtStartOfDay();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, readableInstant31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval33 = interval2.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z" + "'", str3, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(interval20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.DateTime dateTime5 = dateTime0.minusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone7.getName((long) ' ');
        java.lang.String str11 = dateTimeZone7.getName((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime5.withZone(dateTimeZone7);
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.util.Calendar calendar16 = dateTime5.toCalendar(locale13);
        java.lang.String str17 = calendar16.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-349200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=27,DAY_OF_YEAR=361,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.util.GregorianCalendar[time=-349200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=27,DAY_OF_YEAR=361,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str17, "java.util.GregorianCalendar[time=-349200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=27,DAY_OF_YEAR=361,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Interval interval19 = interval17.toInterval();
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval21 = interval2.gap((org.joda.time.ReadableInterval) interval19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = interval21.getEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z" + "'", str3, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNull(interval21);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.setCopy("2022-02-22T07:15:53.208Z/2022-02-22T07:15:53.208Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:15:53.208Z/2022-02-22T07:15:53.208Z\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        java.lang.String str12 = dateTimeField9.getAsShortText((long) (byte) 1);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.withWeekyear(1);
        org.joda.time.LocalDate.Property property16 = localDate13.year();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.LocalDate localDate18 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate19 = property16.withMaximumValue();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime20.getMinuteOfDay();
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.LocalDate localDate27 = localDate19.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        int int32 = dateTime29.getMinuteOfDay();
        int int33 = dateTime29.getYearOfCentury();
        int int34 = dateTime29.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime29.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        int int39 = dateTimeField38.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks((int) (byte) 10);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        long long47 = duration46.getMillis();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plus((org.joda.time.ReadableDuration) duration46);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str51 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localDateTime42, (int) (short) 1, locale50);
        org.joda.time.ReadablePartial readablePartial52 = null;
        int int53 = dateTimeField38.getMaximumValue(readablePartial52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = localDateTime54.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.plusYears(26151451);
        org.joda.time.Period period60 = new org.joda.time.Period((long) '#');
        int int62 = period60.getValue(0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Duration duration66 = period60.toDurationTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime58.withPeriodAdded((org.joda.time.ReadablePeriod) period60, 0);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (-1), chronology70);
        org.joda.time.Period period72 = period71.toPeriod();
        int int73 = period72.size();
        int int74 = period72.getMinutes();
        int[] intArray75 = period72.getValues();
        int int76 = dateTimeField38.getMinimumValue((org.joda.time.ReadablePartial) localDateTime68, intArray75);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray78 = dateTimeField9.set((org.joda.time.ReadablePartial) localDate27, 100, intArray75, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 70 + "'", int33 == 70);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1439 + "'", int39 == 1439);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1" + "'", str51, "1");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1439 + "'", int53 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 8 + "'", int73 == 8);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getYear();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.withFields(readablePartial13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology16);
        int int18 = localTime17.getSecondOfMinute();
        org.joda.time.Period period19 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime12, (org.joda.time.ReadablePartial) localTime17);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.Period period21 = period19.plus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = dateTime7.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime16.getMinuteOfDay();
        int int20 = dateTime16.getYearOfCentury();
        int int21 = dateTime16.getDayOfMonth();
        org.joda.time.DateTime dateTime23 = dateTime16.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        int int26 = dateTimeField25.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks((int) (byte) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        long long34 = duration33.getMillis();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plus((org.joda.time.ReadableDuration) duration33);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime29, (int) (short) 1, locale37);
        org.joda.time.ReadablePartial readablePartial39 = null;
        int int40 = dateTimeField25.getMaximumValue(readablePartial39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime41.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.plusYears(26151451);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        int int49 = period47.getValue(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration53 = period47.toDurationTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime45.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 0);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (-1), chronology57);
        org.joda.time.Period period59 = period58.toPeriod();
        int int60 = period59.size();
        int int61 = period59.getMinutes();
        int[] intArray62 = period59.getValues();
        int int63 = dateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) localDateTime55, intArray62);
        int[] intArray65 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDateTime14, 6, intArray62, 0);
        int int66 = dateTimeField12.getMaximumValue();
        java.lang.String str67 = dateTimeField12.toString();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1439 + "'", int26 == 1439);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1439 + "'", int40 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 292278993 + "'", int66 == 292278993);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "DateTimeField[yearOfEra]" + "'", str67, "DateTimeField[yearOfEra]");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        int int3 = localDate2.getYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(10L, chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        int int8 = dateTime6.get(dateTimeFieldType7);
        java.lang.String str9 = dateTimeFieldType7.toString();
        boolean boolean10 = localDate2.isSupported(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localDate2.toString("2022-02-22T07:16:17.534Z/2022-02-22T07:16:17.534Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38270 + "'", int3 == 38270);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "weekyear" + "'", str9, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekOfWeekyear();
        int int4 = localDateTime0.getYearOfEra();
        int int5 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.dayOfMonth();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property6.setCopy("2022-02-22T07:16:15.918", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:16:15.918\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekOfWeekyear();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime5.getMinuteOfDay();
        org.joda.time.DateTime dateTime10 = dateTime5.minusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        java.lang.String str14 = dateTimeZone12.getName((long) ' ');
        java.lang.String str16 = dateTimeZone12.getName((long) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime10.withZone(dateTimeZone12);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Calendar calendar21 = dateTime10.toCalendar(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property3.setCopy("26169576", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26169576 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-349200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=27,DAY_OF_YEAR=361,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) 382);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.plusHours((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime2.getValue(26155103);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26155103");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.Period period3 = period1.normalizedStandard(periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        int int5 = periodType2.indexOf(durationFieldType4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(10L, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        boolean boolean12 = periodType2.equals((java.lang.Object) yearMonthDay11);
        org.joda.time.PeriodType periodType13 = periodType2.withMillisRemoved();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone16.getName((long) ' ');
        java.lang.String str20 = dateTimeZone16.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(0L, dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) periodType2, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime13, (org.joda.time.ReadablePartial) localTime14, periodType15);
        org.joda.time.Period period17 = period12.minus((org.joda.time.ReadablePeriod) period16);
        int int18 = period17.getYears();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = locale31.getDisplayScript();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        int int37 = dateTimeField35.getLeapAmount((long) 26151451);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int40 = dateTimeField35.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale31.getDisplayCountry(locale39);
        java.util.Set<java.lang.Character> charSet42 = locale39.getExtensionKeys();
        java.lang.String str43 = timeZone1.getDisplayName(locale39);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str26, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645514195106,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=35,MILLISECOND=106,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "China" + "'", str41, "China");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Greenwich Mean Time" + "'", str43, "Greenwich Mean Time");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.dayOfMonth();
        java.util.Date date10 = new java.util.Date(0, 54, 6, 0, (int) 'x');
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromDateFields(date10);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.hourOfHalfday();
        org.joda.time.DateTime dateTime23 = dateTime17.toDateTime(chronology21);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 1, (long) ' ', periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.yearOfEra();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        int int32 = dateTime29.getMinuteOfDay();
        int int33 = dateTime29.getYearOfCentury();
        int int34 = dateTime29.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime29.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        int int39 = dateTimeField38.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks((int) (byte) 10);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        long long47 = duration46.getMillis();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plus((org.joda.time.ReadableDuration) duration46);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str51 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localDateTime42, (int) (short) 1, locale50);
        org.joda.time.ReadablePartial readablePartial52 = null;
        int int53 = dateTimeField38.getMaximumValue(readablePartial52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = localDateTime54.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.plusYears(26151451);
        org.joda.time.Period period60 = new org.joda.time.Period((long) '#');
        int int62 = period60.getValue(0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Duration duration66 = period60.toDurationTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime58.withPeriodAdded((org.joda.time.ReadablePeriod) period60, 0);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (-1), chronology70);
        org.joda.time.Period period72 = period71.toPeriod();
        int int73 = period72.size();
        int int74 = period72.getMinutes();
        int[] intArray75 = period72.getValues();
        int int76 = dateTimeField38.getMinimumValue((org.joda.time.ReadablePartial) localDateTime68, intArray75);
        int[] intArray78 = dateTimeField25.addWrapPartial((org.joda.time.ReadablePartial) localDateTime27, 6, intArray75, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = dateTimeField4.set((org.joda.time.ReadablePartial) localTime11, 0, intArray75, 26153371);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26153371 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Jul 06 02:00:00 UTC 1904");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField25);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 436 + "'", int32 == 436);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22 + "'", int33 == 22);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 22 + "'", int34 == 22);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1439 + "'", int39 == 1439);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1" + "'", str51, "1");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1439 + "'", int53 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 8 + "'", int73 == 8);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime1, (org.joda.time.ReadablePartial) localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(2);
        long long17 = chronology8.set((org.joda.time.ReadablePartial) localDateTime13, (long) (short) 10);
        org.joda.time.DurationField durationField18 = chronology8.seconds();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        int int25 = dateTime22.getMinuteOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(10L, chronology27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyear();
        int int30 = dateTime28.get(dateTimeFieldType29);
        int int31 = dateTime22.get(dateTimeFieldType29);
        boolean boolean32 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property33 = dateTime22.weekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeUtils.getZone(dateTimeZone34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) dateTime22, dateTimeZone35);
        boolean boolean37 = dateTimeZone35.isFixed();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(3786912000000L, dateTimeZone35);
        int[] intArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate((org.joda.time.ReadablePartial) localDate38, intArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645514195565L + "'", long17 == 1645514195565L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 436 + "'", int25 == 436);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period4 = period2.plusWeeks(86399999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = period4.getFieldType(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DurationField durationField2 = chronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.centuryOfEra();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = dateTimeField3.getAsText((int) (byte) 0, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond(26151451);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26151451 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(26151451);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury(26178719);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26178719 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.withFields(readablePartial11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology14);
        int int16 = localTime15.getSecondOfMinute();
        org.joda.time.Period period17 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime10, (org.joda.time.ReadablePartial) localTime15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.Period period19 = period17.plus(readablePeriod18);
        org.joda.time.Period period21 = period19.withMinutes(26151451);
        org.joda.time.LocalTime localTime22 = localTime0.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime23, (org.joda.time.ReadablePartial) localTime24, periodType25);
        int int27 = localTime24.getMillisOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(10L, chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        int int32 = dateTime30.get(dateTimeFieldType31);
        boolean boolean33 = localTime24.equals((java.lang.Object) dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = localTime0.get(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26196373 + "'", int27 == 26196373);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        int int4 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property5.addNoWrapToCopy(26165);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26196512 + "'", int4 == 26196512);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.Date date5 = new java.util.Date(0, 54, 6, 0, (int) 'x');
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime6.withMinuteOfHour(26167);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26167 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jul 06 02:00:00 UTC 1904");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, 1970);
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds(26171);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusWeeks((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime9.getValue(26160257);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26160257");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = property1.getAsText(locale2);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime5.getMinuteOfDay();
        int int9 = dateTime5.getYearOfCentury();
        int int10 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime5.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        int int14 = property1.compareTo((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property1.remainder();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26196638" + "'", str4, "26196638");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 436 + "'", int8 == 436);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology14);
        org.joda.time.Period period17 = new org.joda.time.Period((long) 1, (long) ' ', periodType9, chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(2022, 382, 13, (int) '4', 4, 26151451, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        long long8 = duration7.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plus((org.joda.time.ReadableDuration) duration7);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.Period period14 = period12.normalizedStandard(periodType13);
        boolean boolean16 = periodType13.equals((java.lang.Object) 6);
        org.joda.time.Period period17 = duration7.toPeriod(periodType13);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes20 = duration19.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = period17.minus((org.joda.time.ReadablePeriod) minutes20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(minutes20);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("2022-02-22T07:16:06.004Z/2022-02-22T07:16:06.004Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) (byte) 10, 0L);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTime(chronology13);
        org.joda.time.Period period16 = duration8.toPeriod(chronology13);
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10);
        int[] intArray21 = chronology13.get((org.joda.time.ReadablePeriod) period18, (long) 26161182, (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(12, 382, 12, 2036, (int) (short) 1, 26183771, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2036 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, -7, -16, -1, -181]");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(3);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localTime4.getFields();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.lang.String str6 = timeZone3.getDisplayName(false, 0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.Period period8 = new org.joda.time.Period(1645514161529L, periodType2, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusMillis(0);
        int int15 = localDateTime14.getMillisOfDay();
        int int16 = localDateTime14.getYear();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getChronology(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.DateTime dateTime28 = dateTime22.toDateTime(chronology26);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 1, (long) ' ', periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.yearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        int int37 = dateTime34.getMinuteOfDay();
        int int38 = dateTime34.getYearOfCentury();
        int int39 = dateTime34.getDayOfMonth();
        org.joda.time.DateTime dateTime41 = dateTime34.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        int int44 = dateTimeField43.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusWeeks((int) (byte) 10);
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        long long52 = duration51.getMillis();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.plus((org.joda.time.ReadableDuration) duration51);
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str56 = dateTimeField43.getAsText((org.joda.time.ReadablePartial) localDateTime47, (int) (short) 1, locale55);
        org.joda.time.ReadablePartial readablePartial57 = null;
        int int58 = dateTimeField43.getMaximumValue(readablePartial57);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = localDateTime59.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.plusYears(26151451);
        org.joda.time.Period period65 = new org.joda.time.Period((long) '#');
        int int67 = period65.getValue(0);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime();
        org.joda.time.Interval interval70 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime68, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Duration duration71 = period65.toDurationTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime63.withPeriodAdded((org.joda.time.ReadablePeriod) period65, 0);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) (-1), chronology75);
        org.joda.time.Period period77 = period76.toPeriod();
        int int78 = period77.size();
        int int79 = period77.getMinutes();
        int[] intArray80 = period77.getValues();
        int int81 = dateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) localDateTime73, intArray80);
        int[] intArray83 = dateTimeField30.addWrapPartial((org.joda.time.ReadablePartial) localDateTime32, 6, intArray80, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray85 = dateTimeField9.set((org.joda.time.ReadablePartial) localDateTime14, 30864, intArray83, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30864");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26197289 + "'", int15 == 26197289);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeField30);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 436 + "'", int37 == 436);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 22 + "'", int38 == 22);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 22 + "'", int39 == 22);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1439 + "'", int44 == 1439);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 35L + "'", long52 == 35L);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1" + "'", str56, "1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1439 + "'", int58 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 8 + "'", int78 == 8);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("26160671", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=26160671");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Interval interval21 = interval19.toInterval();
        long long22 = interval19.getEndMillis();
        java.lang.String str23 = interval19.toString();
        org.joda.time.DateTime dateTime24 = interval19.getStart();
        org.joda.time.Chronology chronology25 = interval19.getChronology();
        org.joda.time.Period period26 = new org.joda.time.Period(0L, 1645514152681L, chronology25);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime14.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusDays(100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 1);
        int int37 = localDateTime33.get(dateTimeFieldType36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = localTime2.withField(dateTimeFieldType36, 382);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645514197512L + "'", long22 == 1645514197512L);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-02-22T07:16:37.512Z/2022-02-22T07:16:37.512Z" + "'", str23, "2022-02-22T07:16:37.512Z/2022-02-22T07:16:37.512Z");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        java.lang.String str12 = dateTimeField10.getAsText(1645514171043L);
        long long15 = dateTimeField10.addWrapField((long) 26183771, 0);
        boolean boolean16 = dateTimeField10.isLenient();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "16" + "'", str12, "16");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 26183771L + "'", long15 == 26183771L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str6 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514197768,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=37,MILLISECOND=768,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514197769,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=37,MILLISECOND=769,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Heure de Greenwich" + "'", str6, "Heure de Greenwich");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '4', 5, 22, 995, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 995 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        long long3 = calendar1.getTimeInMillis();
        int int5 = calendar1.getMinimum(0);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514197948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=37,MILLISECOND=948,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514197948L + "'", long2 == 1645514197948L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514197948L + "'", long3 == 1645514197948L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        java.lang.String str3 = calendar1.getCalendarType();
        int int5 = calendar1.getActualMaximum(3);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514197988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=37,MILLISECOND=988,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514197988L + "'", long2 == 1645514197988L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gregory" + "'", str3, "gregory");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) 10, 0L);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(chronology12);
        org.joda.time.Period period15 = duration7.toPeriod(chronology12);
        org.joda.time.Days days16 = duration7.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = interval2.withDurationAfterStart((org.joda.time.ReadableDuration) duration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        long long3 = calendar1.getTimeInMillis();
        int int5 = calendar1.getMinimum(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.Period period12 = duration7.toPeriod(chronology9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone15);
        boolean boolean18 = dateTimeZone16.equals((java.lang.Object) 1645514161708L);
        org.joda.time.Chronology chronology19 = chronology9.withZone(dateTimeZone16);
        boolean boolean20 = calendar1.after((java.lang.Object) chronology9);
        int int21 = calendar1.getFirstDayOfWeek();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = calendar1.getDisplayName(0, (int) (byte) 10, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514198395,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=38,MILLISECOND=395,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514198395L + "'", long2 == 1645514198395L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514198395L + "'", long3 == 1645514198395L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean3 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.text.DateFormatSymbols dateFormatSymbols0 = java.text.DateFormatSymbols.getInstance();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.hourOfHalfday();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime4.getMinuteOfDay();
        int int8 = dateTime4.getYearOfCentury();
        int int9 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime4.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTimeField13.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks((int) (byte) 10);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        long long22 = duration21.getMillis();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plus((org.joda.time.ReadableDuration) duration21);
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str26 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime17, (int) (short) 1, locale25);
        int int27 = dateTimeField3.getMaximumTextLength(locale25);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        int int31 = dateTime28.getMinuteOfDay();
        int int32 = dateTime28.getYearOfCentury();
        int int33 = dateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime35 = dateTime28.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        int int38 = dateTimeField37.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks((int) (byte) 10);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        long long46 = duration45.getMillis();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plus((org.joda.time.ReadableDuration) duration45);
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str50 = dateTimeField37.getAsText((org.joda.time.ReadablePartial) localDateTime41, (int) (short) 1, locale49);
        java.lang.String str51 = locale25.getDisplayLanguage(locale49);
        java.text.DateFormatSymbols dateFormatSymbols52 = new java.text.DateFormatSymbols(locale25);
        java.lang.String str53 = dateFormatSymbols52.getLocalPatternChars();
        java.lang.String[] strArray54 = dateFormatSymbols52.getMonths();
        dateFormatSymbols0.setShortWeekdays(strArray54);
        org.junit.Assert.assertNotNull(dateFormatSymbols0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 436 + "'", int7 == 436);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1439 + "'", int14 == 1439);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 436 + "'", int31 == 436);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 22 + "'", int32 == 22);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22 + "'", int33 == 22);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1439 + "'", int38 == 1439);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u6587" + "'", str51, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "GyMdkHmsSEDFwWahKzZ" + "'", str53, "GyMdkHmsSEDFwWahKzZ");
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        int int2 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(17, 0, 15, 26153423, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26153423 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.DateTime dateTime5 = dateTime0.minusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone7.getName((long) ' ');
        java.lang.String str11 = dateTimeZone7.getName((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime5.withZone(dateTimeZone7);
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.util.Calendar calendar16 = dateTime5.toCalendar(locale13);
        // The following exception was thrown during execution in test generation
        try {
            calendar16.clear(26153423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26153423");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645164998859,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=18,DAY_OF_YEAR=49,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=16,SECOND=38,MILLISECOND=859,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.lang.String str8 = property1.getAsShortText(locale7);
        int int9 = property1.getMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ap. J.-C." + "'", str8, "ap. J.-C.");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths(7);
        org.joda.time.DateTime dateTime14 = dateTime10.withMinuteOfHour((int) (short) 10);
        int int15 = dateTime10.getMillisOfSecond();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 90 + "'", int15 == 90);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 914);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime2.minusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone9.getName((long) ' ');
        java.lang.String str13 = dateTimeZone9.getName((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime7.withZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval15 = new org.joda.time.Interval(1645514195900L, (long) 26165, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate4 = property3.getLocalDate();
        org.joda.time.LocalDate localDate5 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate6 = property3.withMaximumValue();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfYear((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate6.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(10L, chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        int int29 = period27.getValue(0);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration33 = period27.toDurationTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadablePeriod) period27);
        mutableInterval34.setStartMillis((long) (short) 0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.hourOfHalfday();
        org.joda.time.DateTime dateTime43 = dateTime37.toDateTime(chronology41);
        org.joda.time.DateTime.Property property44 = dateTime37.monthOfYear();
        boolean boolean45 = mutableInterval34.contains((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType50 = periodType49.withSecondsRemoved();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.hourOfHalfday();
        org.joda.time.DateTime dateTime57 = dateTime51.toDateTime(chronology55);
        org.joda.time.Period period58 = new org.joda.time.Period((long) 1, (long) ' ', periodType50, chronology55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.withCenturyOfEra(2);
        long long64 = chronology55.set((org.joda.time.ReadablePartial) localDateTime60, (long) (short) 10);
        java.lang.String str65 = chronology55.toString();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 26151451, chronology55);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadablePeriod) period66);
        mutableInterval67.setInterval(1645514163115L, 1645514168288L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = interval20.isBefore((org.joda.time.ReadableInterval) mutableInterval67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22T07:16:40.786Z/2022-02-22T07:16:40.786Z" + "'", str3, "2022-02-22T07:16:40.786Z/2022-02-22T07:16:40.786Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(interval20);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(localDateTime62);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1645514200786L + "'", long64 == 1645514200786L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str65, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.roundCeilingCopy();
        java.lang.String str12 = property7.getAsString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        int int21 = dateTime17.getYearOfCentury();
        int int22 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime17.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = dateTimeField26.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime30, (int) (short) 1, locale38);
        int int40 = dateTimeField16.getMaximumTextLength(locale38);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        int int47 = dateTime43.getYearOfCentury();
        int int48 = dateTime43.getDayOfMonth();
        org.joda.time.DateTime dateTime50 = dateTime43.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        int int53 = dateTimeField52.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusWeeks((int) (byte) 10);
        org.joda.time.Period period58 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        long long61 = duration60.getMillis();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.plus((org.joda.time.ReadableDuration) duration60);
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str65 = dateTimeField52.getAsText((org.joda.time.ReadablePartial) localDateTime56, (int) (short) 1, locale64);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale64.getDisplayLanguage(locale66);
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone42, locale66);
        boolean boolean69 = locale66.hasExtensions();
        int int70 = dateTimeField16.getMaximumShortTextLength(locale66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime71 = property7.setCopy("PT0S", locale66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "16" + "'", str12, "16");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 436 + "'", int20 == 436);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1439 + "'", int27 == 1439);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Heure de Greenwich");
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 436 + "'", int46 == 436);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 22 + "'", int47 == 22);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 22 + "'", int48 == 22);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1439 + "'", int53 == 1439);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 35L + "'", long61 == 35L);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1" + "'", str65, "1");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "chinois" + "'", str67, "chinois");
        org.junit.Assert.assertNotNull(calendar68);
// flaky:         org.junit.Assert.assertEquals(calendar68.toString(), "java.util.GregorianCalendar[time=1645514199966,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=39,MILLISECOND=966,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.util.Date date1 = localDate0.toDate();
        date1.setMinutes(1969);
        boolean boolean5 = date1.equals((java.lang.Object) 1645514166551L);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Feb 23 08:49:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("PT26160256.999S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT26160256.999S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        int int6 = period4.getValue(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Duration duration10 = period4.toDurationTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 453, 436);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(1645514197437L, 26179754);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645514197437 * 26179754");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getChronology(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.DateTime dateTime20 = dateTime14.toDateTime(chronology18);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 1, (long) ' ', periodType13, chronology18);
        org.joda.time.DurationField durationField22 = chronology18.weeks();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 10, 1645514153096L, chronology18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(1645514161529L, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(38270, 19, 1970, 41, 0, 914, 32772, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("07:16:13.178");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '07:16:13.178' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime16.getMinuteOfDay();
        int int20 = dateTime16.getYearOfCentury();
        int int21 = dateTime16.getDayOfMonth();
        org.joda.time.DateTime dateTime23 = dateTime16.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        int int26 = dateTimeField25.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks((int) (byte) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        long long34 = duration33.getMillis();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plus((org.joda.time.ReadableDuration) duration33);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime29, (int) (short) 1, locale37);
        org.joda.time.ReadablePartial readablePartial39 = null;
        int int40 = dateTimeField25.getMaximumValue(readablePartial39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime41.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.plusYears(26151451);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        int int49 = period47.getValue(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration53 = period47.toDurationTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime45.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 0);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (-1), chronology57);
        org.joda.time.Period period59 = period58.toPeriod();
        int int60 = period59.size();
        int int61 = period59.getMinutes();
        int[] intArray62 = period59.getValues();
        int int63 = dateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) localDateTime55, intArray62);
        int[] intArray65 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDateTime14, 6, intArray62, 0);
        int int66 = dateTimeField12.getMaximumValue();
        int int68 = dateTimeField12.get((long) 814);
        // The following exception was thrown during execution in test generation
        try {
            long long71 = dateTimeField12.set(1645514182234L, "Etc/UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 436 + "'", int19 == 436);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1439 + "'", int26 == 1439);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1439 + "'", int40 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 292278993 + "'", int66 == 292278993);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1970 + "'", int68 == 1970);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dateTime8.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.hourOfHalfday();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str8 = dateTimeField4.getAsShortText(1645514151873L, locale7);
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = dateTimeField4.getAsShortText(26153877, locale10);
        java.util.Locale.Builder builder12 = builder1.setLocale(locale10);
        java.lang.String str13 = locale10.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7" + "'", str8, "7");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "26153877" + "'", str11, "26153877");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) ' ', dateTimeZone4);
        int int6 = dateTime5.getYearOfCentury();
        boolean boolean7 = localDate2.equals((java.lang.Object) int6);
        java.lang.String str8 = localDate2.toString();
        org.joda.time.DateMidnight dateMidnight9 = localDate2.toDateMidnight();
        int int10 = dateMidnight9.getYear();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10022-02-22" + "'", str8, "10022-02-22");
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10022 + "'", int10 == 10022);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(26151451);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period6, 0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(26151451);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.withWeekyear(1);
        org.joda.time.LocalDate.Property property21 = localDate18.year();
        org.joda.time.LocalDate localDate23 = property21.addWrapFieldToCopy(7);
        org.joda.time.DateTimeField dateTimeField24 = property21.getField();
        org.joda.time.DateTimeField dateTimeField25 = property21.getField();
        org.joda.time.LocalDate localDate27 = property21.setCopy(382);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = localDateTime16.isEqual((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("26180847");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"26180847\" is malformed at \"180847\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.Date date8 = new java.util.Date(0, 54, 6, 0, (int) 'x');
        java.lang.String str9 = date8.toLocaleString();
        boolean boolean10 = timeZone1.inDaylightTime(date8);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Jul 06 02:00:00 UTC 1904");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1904-07-06 02:00:00" + "'", str9, "1904-07-06 02:00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra(2);
        int int4 = localDateTime1.getYear();
        int int5 = localDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = localDateTime1.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26202570 + "'", int7 == 26202570);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("\u706b\u66dc\u65e5", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DurationFieldType[] durationFieldTypeArray0 = new org.joda.time.DurationFieldType[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.forFields(durationFieldTypeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Types array must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldTypeArray0);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DateTime dateTime13 = dateTime7.toDateTime(chronology11);
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, (long) ' ', periodType6, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.weeks();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 10, 1645514153096L, chronology11);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(1645514161529L, chronology11);
        org.joda.time.DateTimeField dateTimeField18 = chronology11.hourOfDay();
        int int20 = dateTimeField18.get(1645514161529L);
        long long22 = dateTimeField18.roundHalfEven((long) 53);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        boolean boolean10 = interval8.isAfter((long) 10);
        org.joda.time.Duration duration11 = interval8.toDuration();
        org.joda.time.Duration duration14 = duration11.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeUtils.getZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone21.getName((long) ' ');
        org.joda.time.DateTime dateTime24 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.time();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime24, periodType25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.Period period29 = period26.normalizedStandard(periodType28);
        org.joda.time.Period period31 = period26.plusMillis(32770);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter6.parseLocalTime("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(382);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDate(38222, 0, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '#');
        int int3 = period1.getValue(0);
        int int4 = period1.getYears();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period1.getValue(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Date date5 = new java.util.Date(0, 54, 6, 0, (int) 'x');
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy(30864);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30864 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jul 06 02:00:00 UTC 1904");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now();
        int int11 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.Period period13 = org.joda.time.Period.hours(12);
        org.joda.time.LocalTime localTime14 = localTime10.minus((org.joda.time.ReadablePeriod) period13);
        java.lang.String str15 = period13.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1439 + "'", int11 == 1439);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT12H" + "'", str15, "PT12H");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setVariant("2022-02-22T07:16:02.139Z/2022-02-22T07:16:02.139Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2022-02-22T07:16:02.139Z/2022-02-22T07:16:02.139Z [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.era();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(100);
        org.joda.time.Period period13 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime1.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        int int21 = period19.getValue(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration25 = period19.toDurationTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime(chronology26);
        org.joda.time.DurationField durationField28 = chronology26.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) 1009843200000L, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(4, 814);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 814 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-22T07:16:42.391Z/2022-02-22T07:16:42.391Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:16:42.391Z/2022-02-22T07:16:42.391Z\" is malformed at \"Z/2022-02-22T07:16:42.391Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Interval interval9 = interval7.toInterval();
        long long10 = interval7.getEndMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean12 = interval7.equals((java.lang.Object) dateTimeFieldType11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime13, (org.joda.time.ReadablePartial) localTime14, periodType15);
        int int17 = localTime14.getMillisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(10L, chronology19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        int int22 = dateTime20.get(dateTimeFieldType21);
        boolean boolean23 = localTime14.equals((java.lang.Object) dateTimeFieldType21);
        boolean boolean24 = interval7.equals((java.lang.Object) boolean23);
        boolean boolean25 = interval2.overlaps((org.joda.time.ReadableInterval) interval7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval27 = interval2.withEndMillis((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22T07:16:43.812Z/2022-02-22T07:16:43.812Z" + "'", str3, "2022-02-22T07:16:43.812Z/2022-02-22T07:16:43.812Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645514203812L + "'", long10 == 1645514203812L);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 26203812 + "'", int17 == 26203812);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(26151451);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period6, 0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(26151451);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.withWeekyear(1);
        org.joda.time.LocalDate.Property property22 = localDate19.year();
        org.joda.time.LocalDate localDate24 = property22.addWrapFieldToCopy(7);
        org.joda.time.DateTimeField dateTimeField25 = property22.getField();
        org.joda.time.DateTimeField dateTimeField26 = property22.getField();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = dateTimeField26.getAsText(1645514170915L, locale28);
        java.lang.String str30 = locale28.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = property17.setCopy("gregory", locale28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr" + "'", str30, "fr");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime8.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime.Property property2 = dateTime0.weekyear();
        java.lang.String str3 = property2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = property2.setCopy("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[Etc/UTC]\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "weekyear" + "'", str3, "weekyear");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        int int4 = dateTime1.getMinuteOfDay();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime7 = dateTime1.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str9 = dateTimeFieldType8.toString();
        int int10 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime12 = dateTime7.withMillisOfSecond(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(readableInstant0, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 436 + "'", int4 == 436);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.Period period12 = duration7.toPeriod(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(2036, 659, 26179754, (-457087), 1, 9, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -457087 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.dayOfMonth();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime5, (org.joda.time.ReadablePartial) localTime6, periodType7);
        org.joda.time.Period period10 = org.joda.time.Period.years(10);
        org.joda.time.LocalTime localTime12 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 1);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType17 = periodType16.withSecondsRemoved();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTime dateTime24 = dateTime18.toDateTime(chronology22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) 1, (long) ' ', periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField26 = chronology22.yearOfEra();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        int int33 = dateTime30.getMinuteOfDay();
        int int34 = dateTime30.getYearOfCentury();
        int int35 = dateTime30.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime30.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property38 = dateTime37.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = dateTimeField39.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks((int) (byte) 10);
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        long long48 = duration47.getMillis();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plus((org.joda.time.ReadableDuration) duration47);
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str52 = dateTimeField39.getAsText((org.joda.time.ReadablePartial) localDateTime43, (int) (short) 1, locale51);
        org.joda.time.ReadablePartial readablePartial53 = null;
        int int54 = dateTimeField39.getMaximumValue(readablePartial53);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = localDateTime55.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.plusYears(26151451);
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#');
        int int63 = period61.getValue(0);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Duration duration67 = period61.toDurationTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime59.withPeriodAdded((org.joda.time.ReadablePeriod) period61, 0);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((long) (-1), chronology71);
        org.joda.time.Period period73 = period72.toPeriod();
        int int74 = period73.size();
        int int75 = period73.getMinutes();
        int[] intArray76 = period73.getValues();
        int int77 = dateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) localDateTime69, intArray76);
        int[] intArray79 = dateTimeField26.addWrapPartial((org.joda.time.ReadablePartial) localDateTime28, 6, intArray76, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray81 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localTime12, 54, intArray76, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField26);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 436 + "'", int33 == 436);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 22 + "'", int34 == 22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1439 + "'", int40 == 1439);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 35L + "'", long48 == 35L);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1" + "'", str52, "1");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1439 + "'", int54 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 8 + "'", int74 == 8);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(382);
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = localDate8.toString("\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642", locale10);
        org.joda.time.LocalDate localDate13 = localDate8.withYear(21);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone15.getName((long) ' ');
        long long19 = dateTimeZone15.previousTransition((long) (short) 1);
        org.joda.time.Interval interval20 = localDate8.toInterval(dateTimeZone15);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        int int26 = dateTime24.getDayOfYear();
        int int27 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime24);
        long long30 = dateTimeZone15.adjustOffset(1645514176563L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(435, 382, 26200719, 17, (int) '#', 26178, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26178 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642" + "'", str11, "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1645514176563L + "'", long30 == 1645514176563L);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(13, 86399999, 1439, (int) (byte) 100, 32770, (-292275054), 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear(1);
        int int7 = localDate6.getCenturyOfEra();
        org.joda.time.LocalDate localDate9 = localDate6.plusDays((int) '#');
        int int10 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDate6.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        long long8 = duration7.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plus((org.joda.time.ReadableDuration) duration7);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        long long16 = duration14.getStandardSeconds();
        mutableInterval0.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration14);
        long long18 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration14);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 453, (long) 10022);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("PT0.010S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT0.010S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime2.toYearMonthDay();
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        int int6 = dateTime2.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime2.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("2022-02-22T07:16:17.534Z/2022-02-22T07:16:17.534Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2022-02-22T07:16:17.534Z/2022-02-22T07:16:17.534Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("2022-02-22T07:16:09.216Z/2022-02-22T07:16:09.216Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:16:09.216Z/2022-02...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, 1970);
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds(26171);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusWeeks((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localDateTime3.toString("2022-02-22T07:16:36.304Z/2022-02-22T07:16:36.304Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours14 = period12.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.withWeekyear(1);
        org.joda.time.LocalDate.Property property4 = localDate1.year();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        java.util.Date date6 = localDate5.toDate();
        date6.setMinutes(436);
        date6.setMinutes(22);
        java.util.Calendar.Builder builder11 = builder0.setInstant(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder14 = builder11.setWeekDefinition(0, 10022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Feb 22 00:22:00 UTC 2022");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate0.minusYears((int) '#');
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(10L, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekyear();
        int int15 = dateTime13.get(dateTimeFieldType14);
        int int16 = dateTime7.get(dateTimeFieldType14);
        boolean boolean17 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property18 = dateTime7.weekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeUtils.getZone(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone20);
        boolean boolean22 = dateTimeZone20.isFixed();
        org.joda.time.DateMidnight dateMidnight23 = localDate4.toDateMidnight(dateTimeZone20);
        org.joda.time.LocalDate.Property property24 = localDate4.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 436 + "'", int10 == 436);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = property1.getAsText(locale2);
        org.joda.time.DateTime dateTime6 = property1.setCopy((int) '#');
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime10 = dateTime7.plusWeeks(100);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfCentury(0);
        long long13 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        int int21 = period19.getValue(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration25 = period19.toDurationTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 7, chronology26);
        org.joda.time.DurationField durationField29 = chronology26.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) property1, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26207027" + "'", str4, "26207027");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60480000000L) + "'", long13 == (-60480000000L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print((long) 995);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar4.getLeastMaximum(26167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26167");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514206499,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=46,MILLISECOND=499,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        int int6 = localTime2.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfEra(3);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime19.getMinuteOfDay();
        int int23 = dateTime19.getYearOfCentury();
        int int24 = dateTime19.getDayOfMonth();
        org.joda.time.DateTime dateTime26 = dateTime19.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        int int29 = dateTimeField28.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusWeeks((int) (byte) 10);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        long long37 = duration36.getMillis();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plus((org.joda.time.ReadableDuration) duration36);
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime32, (int) (short) 1, locale40);
        int int42 = dateTimeField18.getMaximumTextLength(locale40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        int int47 = dateTime43.getYearOfCentury();
        int int48 = dateTime43.getDayOfMonth();
        org.joda.time.DateTime dateTime50 = dateTime43.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        int int53 = dateTimeField52.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusWeeks((int) (byte) 10);
        org.joda.time.Period period58 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        long long61 = duration60.getMillis();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.plus((org.joda.time.ReadableDuration) duration60);
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str65 = dateTimeField52.getAsText((org.joda.time.ReadablePartial) localDateTime56, (int) (short) 1, locale64);
        java.lang.String str66 = locale40.getDisplayLanguage(locale64);
        java.text.DateFormatSymbols dateFormatSymbols67 = new java.text.DateFormatSymbols(locale40);
        java.lang.String str68 = dateTimeZone13.getName((long) (short) 0, locale40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = localTime2.toString("2022-02-22T07:16:22.943Z/2022-02-22T07:16:22.943Z", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 436 + "'", int22 == 436);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1439 + "'", int29 == 1439);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 436 + "'", int46 == 436);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 22 + "'", int47 == 22);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 22 + "'", int48 == 22);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1439 + "'", int53 == 1439);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 35L + "'", long61 == 35L);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1" + "'", str65, "1");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u6587" + "'", str66, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00" + "'", str68, "+00:00");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks(1439);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withWeekyear(0);
        int int11 = localDateTime6.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime6.withTime(54, 1969, 914, 38222);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        java.io.Writer writer7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withFieldAdded(durationFieldType10, 1970);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Interval interval19 = interval17.toInterval();
        long long20 = interval17.getEndMillis();
        java.lang.String str21 = interval17.toString();
        org.joda.time.DateTime dateTime22 = interval17.getStart();
        org.joda.time.Chronology chronology23 = interval17.getChronology();
        org.joda.time.Period period24 = new org.joda.time.Period(0L, 1645514152681L, chronology23);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime12.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusDays(100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (org.joda.time.ReadablePartial) localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645514208049L + "'", long20 == 1645514208049L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-02-22T07:16:48.049Z/2022-02-22T07:16:48.049Z" + "'", str21, "2022-02-22T07:16:48.049Z/2022-02-22T07:16:48.049Z");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(710, (int) (byte) 1, 38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DateTime dateTime10 = property8.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property8.setCopy(38270);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38270 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CA" + "'", str2, "fr-CA");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        int int7 = dateTime0.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks((int) (byte) 10);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        long long17 = duration16.getMillis();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plus((org.joda.time.ReadableDuration) duration16);
        mutableInterval9.setDurationAfterStart((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = mutableInterval9.toDuration();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks((int) (byte) 10);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        long long28 = duration27.getMillis();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plus((org.joda.time.ReadableDuration) duration27);
        long long30 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration27);
        boolean boolean31 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration34 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime35.getMinuteOfDay();
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime41 = dateTime35.plus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = dateTime35.minus((long) 10);
        org.joda.time.Period period46 = duration34.toPeriodFrom((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property48 = dateTime47.era();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.plusWeeks((int) (byte) 1);
        int int52 = property48.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime54);
        boolean boolean57 = interval55.isAfter((long) 10);
        org.joda.time.Duration duration58 = interval55.toDuration();
        org.joda.time.Duration duration61 = duration58.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval62 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableDuration) duration61);
        org.joda.time.Duration duration64 = duration34.withDurationAdded((org.joda.time.ReadableDuration) duration61, 26160257);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval65 = interval32.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration34);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 436 + "'", int38 == 436);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration64);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getMinuteOfHour();
        int int2 = localTime0.size();
        org.joda.time.LocalTime localTime4 = localTime0.minusMinutes((int) (byte) -1);
        org.joda.time.LocalTime localTime6 = localTime0.minusHours(2);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(10L, chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localTime7.isSupported(dateTimeFieldType11);
        org.joda.time.LocalTime.Property property14 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime15 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime16 = property14.roundCeilingCopy();
        org.joda.time.LocalTime localTime17 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = localTime0.withFields((org.joda.time.ReadablePartial) localTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime18.withMinuteOfHour(26153877);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26153877 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-22T07:16:12.518Z/2022-02-22T07:16:12.518Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:16:12.518Z/2022-02-22T07:16:...\" is malformed at \"T07:16:12.518Z/2022-02-22T07:16:...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension(' ', "2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        java.lang.Appendable appendable7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime8.getMinuteOfDay();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime8.minus((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable7, (org.joda.time.ReadableInstant) dateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 436 + "'", int11 == 436);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(2782);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (-1), chronology12);
        org.joda.time.Period period14 = period13.toPeriod();
        int int15 = period14.size();
        int int16 = period14.getMinutes();
        int[] intArray17 = period14.getValues();
        org.joda.time.Duration duration18 = period14.toStandardDuration();
        org.joda.time.LocalTime localTime20 = localTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period14, 0);
        int int21 = localTime8.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28789106 + "'", int21 == 28789106);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField4 = durationFieldType0.getField(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) dateTimeField5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        long long3 = calendar1.getTimeInMillis();
        int int5 = calendar1.getMinimum(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.Period period12 = duration7.toPeriod(chronology9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone15);
        boolean boolean18 = dateTimeZone16.equals((java.lang.Object) 1645514161708L);
        org.joda.time.Chronology chronology19 = chronology9.withZone(dateTimeZone16);
        boolean boolean20 = calendar1.after((java.lang.Object) chronology9);
        java.lang.Object obj21 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514208665,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=48,MILLISECOND=665,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514208665L + "'", long2 == 1645514208665L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514208665L + "'", long3 == 1645514208665L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals(obj21.toString(), "java.util.GregorianCalendar[time=1645514208665,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=48,MILLISECOND=665,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "java.util.GregorianCalendar[time=1645514208665,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=48,MILLISECOND=665,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "java.util.GregorianCalendar[time=1645514208665,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=48,MILLISECOND=665,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Date date6 = new java.util.Date(12, 100, (-292275054), (-1), 436, (int) '#');
        java.lang.String str7 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Wed Nov 04 06:16:35 UTC 798287");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Wed Nov 04 06:16:35 UTC 798287" + "'", str7, "Wed Nov 04 06:16:35 UTC 798287");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks(1439);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withWeekyear(0);
        int int11 = localDateTime6.getEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minusWeeks(26181277);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime6.withHourOfDay(995);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 995 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(26151451, 86399999, 41, 26155103, 2782, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26155103 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks(474);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 10, chronology13);
        boolean boolean15 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        boolean boolean18 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.DateTime dateTime29 = dateTime23.toDateTime(chronology27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, (long) ' ', periodType22, chronology27);
        org.joda.time.DateTime dateTime31 = dateTime16.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DateTime.Property property32 = dateTime16.era();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate35 = localDate33.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime38 = localDate35.toDateTimeAtStartOfDay();
        boolean boolean39 = dateTime38.isEqualNow();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.days();
        org.joda.time.Period period44 = period42.normalizedStandard(periodType43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.hours();
        int int46 = periodType43.indexOf(durationFieldType45);
        org.joda.time.DateTime dateTime48 = dateTime38.withFieldAdded(durationFieldType45, 435);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate50 = localDate6.withFieldAdded(durationFieldType45, 26200719);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(10L, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = dateTime8.get(dateTimeFieldType9);
        int int11 = dateTime2.get(dateTimeFieldType9);
        boolean boolean12 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 436 + "'", int5 == 436);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalDateTime localDateTime14 = dateTime2.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property15.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            calendar5.add(26208878, (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514209816,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=49,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514209816,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=49,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = localDateTime0.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusYears(26151451);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period6, 0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime4.era();
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property15.setCopy("\u897f\u66a6", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("2022-02-22T07:16:14.481Z/2022-02-22T07:16:14.481Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime4.getMinuteOfDay();
        int int8 = dateTime4.getYearOfCentury();
        int int9 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime4.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now();
        int int15 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Period period17 = org.joda.time.Period.hours(12);
        org.joda.time.LocalTime localTime18 = localTime14.minus((org.joda.time.ReadablePeriod) period17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDate0.isAfter((org.joda.time.ReadablePartial) localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 436 + "'", int7 == 436);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1439 + "'", int15 == 1439);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter2.parseMutableDateTime("26197216");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("26179305");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"26179305\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        int int3 = localDate2.getYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(10L, chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        int int8 = dateTime6.get(dateTimeFieldType7);
        java.lang.String str9 = dateTimeFieldType7.toString();
        boolean boolean10 = localDate2.isSupported(dateTimeFieldType7);
        org.joda.time.DateTime dateTime11 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property13 = localDate2.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38222 + "'", int3 == 38222);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "weekyear" + "'", str9, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime15 = dateTime9.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period17 = duration5.toPeriodFrom((org.joda.time.ReadableInstant) dateTime9, periodType16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTime9.toString("2022-02-22T07:16:24.324Z/2022-02-22T07:16:24.324Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration8);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 436 + "'", int12 == 436);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.hourOfHalfday();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(chronology3);
        org.joda.time.Period period6 = duration1.toPeriod(chronology3);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology3);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology3);
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime8, readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = localTime0.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("0", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        int int7 = period5.getValue(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration11 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(85751619240000L, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime14.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll((int) (short) 100, 382);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514212127,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=52,MILLISECOND=127,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        int int6 = dateTime3.getMinuteOfDay();
        int int7 = dateTime3.getYearOfCentury();
        int int8 = dateTime3.getDayOfMonth();
        org.joda.time.DateTime dateTime10 = dateTime3.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        int int13 = dateTimeField12.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks((int) (byte) 10);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        long long21 = duration20.getMillis();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plus((org.joda.time.ReadableDuration) duration20);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = dateTimeField12.getAsText((org.joda.time.ReadablePartial) localDateTime16, (int) (short) 1, locale24);
        int int26 = dateTimeField2.getMaximumTextLength(locale24);
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        java.lang.String str28 = locale24.getDisplayName(locale27);
        java.lang.String str29 = locale27.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 436 + "'", int6 == 436);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1439 + "'", int13 == 1439);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)" + "'", str28, "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ja_JP" + "'", str29, "ja_JP");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.util.Date date5 = new java.util.Date((int) '4', 32772, (int) (short) -1, 8, 14);
        int int6 = date5.getMonth();
        int int7 = date5.getMonth();
        org.junit.Assert.assertEquals(date5.toString(), "Sat Dec 30 08:14:00 UTC 4682");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 26160257);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.lang.String str5 = localDate2.toString("\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642", locale4);
        org.joda.time.LocalDate localDate7 = localDate2.withYear(21);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone9.getName((long) ' ');
        long long13 = dateTimeZone9.previousTransition((long) (short) 1);
        org.joda.time.Interval interval14 = localDate2.toInterval(dateTimeZone9);
        org.joda.time.DateTime dateTime15 = localDate2.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642" + "'", str5, "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale7 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter2.parseDateTime("2022-02-22T07:16:53.531Z/2022-02-22T07:16:53.531Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.minusMonths(26165);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "2022-02-22T07:16:44.860Z/2022-02-22T07:16:44.860Z", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) "2022-02-22T07:16:19.913Z/2022-02-22T07:16:19.913Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:16:19.913Z/2022-02-22T07:16:19.913Z\" is malformed at \"/2022-02-22T07:16:19.913Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        int int4 = calendar1.getGreatestMinimum(6);
        int int5 = calendar1.getWeekYear();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.withFields(readablePartial9);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(3);
        boolean boolean13 = calendar1.equals((java.lang.Object) localTime12);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514213265,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=53,MILLISECOND=265,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514213265L + "'", long2 == 1645514213265L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DateTime.Property property7 = dateTime0.monthOfYear();
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale9.getDisplayScript();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        int int15 = dateTimeField13.getLeapAmount((long) 26151451);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int18 = dateTimeField13.getMaximumShortTextLength(locale17);
        java.lang.String str19 = locale9.getDisplayCountry(locale17);
        java.lang.String str20 = locale9.getISO3Language();
        java.lang.String str21 = locale9.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = property7.setCopy("0", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois (Chine)" + "'", str21, "chinois (Chine)");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str6 = dateTimeField2.getAsShortText(1645514151873L, locale5);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = dateTimeField2.getAsShortText(26153877, locale8);
        long long11 = dateTimeField2.roundHalfEven((long) 382);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        int int16 = dateTime12.getYearOfCentury();
        int int17 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime19 = dateTime12.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = dateTimeField21.getMaximumValue();
        java.lang.String str24 = dateTimeField21.getAsShortText((long) (byte) 1);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime25.getMinuteOfDay();
        int int29 = dateTime25.getYearOfCentury();
        int int30 = dateTime25.getDayOfMonth();
        org.joda.time.DateTime dateTime32 = dateTime25.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property33 = dateTime32.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.now();
        int int36 = dateTimeField34.getMaximumValue((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str44 = dateTimeField40.getAsShortText(1645514151873L, locale43);
        java.lang.String str45 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localTime35, 0, locale43);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        int int49 = period47.getValue(0);
        org.joda.time.Period period51 = period47.plusWeeks(1969);
        org.joda.time.LocalTime localTime53 = localTime35.withPeriodAdded((org.joda.time.ReadablePeriod) period47, (int) (byte) 100);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime55, (org.joda.time.ReadablePartial) localTime56, periodType57);
        org.joda.time.Period period60 = period58.minusHours(26155103);
        org.joda.time.Period period61 = period60.toPeriod();
        int[] intArray62 = period60.getValues();
        int[] intArray64 = dateTimeField2.set((org.joda.time.ReadablePartial) localTime53, (int) (byte) 1, intArray62, 0);
        org.joda.time.Period period66 = org.joda.time.Period.hours(1439);
        org.joda.time.Period period68 = period66.withSeconds((int) '4');
        org.joda.time.LocalTime localTime70 = localTime53.withPeriodAdded((org.joda.time.ReadablePeriod) period68, 86399999);
        java.lang.String str71 = localTime53.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "26153877" + "'", str9, "26153877");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 436 + "'", int15 == 436);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1439 + "'", int22 == 1439);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 436 + "'", int28 == 436);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22 + "'", int30 == 22);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1439 + "'", int36 == 1439);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "7" + "'", str44, "7");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, -26155103, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 0, 0, 0, -26155103, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(localTime70);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "07:16:57.908" + "'", str71, "07:16:57.908");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        int int4 = dateTimeField2.getLeapAmount((long) 26151451);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        long long10 = dateTimeField2.addWrapField((long) 26160257, 26155103);
        org.joda.time.DurationField durationField11 = dateTimeField2.getRangeDurationField();
        long long14 = durationField11.getDifferenceAsLong(1645514195900L, (long) 26153423);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22560257L + "'", long10 == 22560257L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 38090L + "'", long14 == 38090L);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getMinuteOfHour();
        int int2 = localTime0.size();
        org.joda.time.LocalTime localTime4 = localTime0.minusMinutes((int) (byte) -1);
        org.joda.time.LocalTime.Property property5 = localTime0.minuteOfHour();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str15 = dateTimeField11.getAsShortText(1645514151873L, locale14);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = dateTimeField11.getAsShortText(26153877, locale17);
        java.util.Locale.Builder builder19 = builder8.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localTime0.toString("2022-02-22T07:16:06.079Z/2022-02-22T07:16:06.079Z", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "26153877" + "'", str18, "26153877");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Date date5 = new java.util.Date(0, 54, 6, 0, (int) 'x');
        long long6 = date5.getTime();
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jul 06 02:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2066680800000L) + "'", long6 == (-2066680800000L));
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withLocale(locale5);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.parse("zh-TW", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone6.getName((long) ' ');
        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        long long14 = dateTimeZone6.adjustOffset(1645514153208L, false);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withZone(dateTimeZone6);
        java.lang.Appendable appendable17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(3);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(appendable17, (org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645514153208L + "'", long14 == 1645514153208L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        int int8 = dateTime0.getYear();
        org.joda.time.DateTime dateTime10 = dateTime0.plusYears(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withDayOfWeek(209);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 209 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 436 + "'", int3 == 436);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTime dateTime8 = dateTime2.toDateTime(chronology6);
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) 7, (long) (short) 100, chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.clockhourOfHalfday();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        int int12 = localTime11.getMinuteOfHour();
        int int13 = localTime11.size();
        org.joda.time.LocalTime localTime15 = localTime11.minusMinutes((int) (byte) -1);
        org.joda.time.LocalTime localTime17 = localTime11.minusHours(2);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(10L, chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        int int23 = dateTime21.get(dateTimeFieldType22);
        boolean boolean24 = localTime18.isSupported(dateTimeFieldType22);
        org.joda.time.LocalTime.Property property25 = localTime18.minuteOfHour();
        org.joda.time.LocalTime localTime26 = property25.withMaximumValue();
        org.joda.time.LocalTime localTime27 = property25.roundCeilingCopy();
        org.joda.time.LocalTime localTime28 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = localTime11.withFields((org.joda.time.ReadablePartial) localTime28);
        int[] intArray32 = new int[] { 9 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = dateTimeField10.set((org.joda.time.ReadablePartial) localTime29, 995, intArray32, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[9]");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime16.getMinuteOfDay();
        int int20 = dateTime16.getYearOfCentury();
        int int21 = dateTime16.getDayOfMonth();
        org.joda.time.DateTime dateTime23 = dateTime16.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        int int26 = dateTimeField25.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks((int) (byte) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        long long34 = duration33.getMillis();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plus((org.joda.time.ReadableDuration) duration33);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str38 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime29, (int) (short) 1, locale37);
        org.joda.time.ReadablePartial readablePartial39 = null;
        int int40 = dateTimeField25.getMaximumValue(readablePartial39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime41.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.plusYears(26151451);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        int int49 = period47.getValue(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration53 = period47.toDurationTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime45.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 0);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (-1), chronology57);
        org.joda.time.Period period59 = period58.toPeriod();
        int int60 = period59.size();
        int int61 = period59.getMinutes();
        int[] intArray62 = period59.getValues();
        int int63 = dateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) localDateTime55, intArray62);
        int[] intArray65 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDateTime14, 6, intArray62, 0);
        int int66 = dateTimeField12.getMaximumValue();
        long long69 = dateTimeField12.add((long) 16, 995);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 436 + "'", int19 == 436);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1439 + "'", int26 == 1439);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1439 + "'", int40 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 292278993 + "'", int66 == 292278993);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 31399228800016L + "'", long69 == 31399228800016L);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (long) 26213693);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) ' ', dateTimeZone3);
        int int5 = dateTime4.getYearOfCentury();
        org.joda.time.DateTime.Property property6 = dateTime4.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str12 = interval11.toString();
        org.joda.time.DateTime dateTime13 = interval11.getEnd();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks((int) (byte) 10);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        long long21 = duration20.getMillis();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plus((org.joda.time.ReadableDuration) duration20);
        boolean boolean23 = interval11.equals((java.lang.Object) duration20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = interval26.isAfter((long) 10);
        org.joda.time.Interval interval29 = interval11.overlap((org.joda.time.ReadableInterval) interval26);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.months();
        org.joda.time.Period period31 = interval11.toPeriod(periodType30);
        org.joda.time.DateTime dateTime32 = interval11.getStart();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Interval interval37 = interval35.toInterval();
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        boolean boolean39 = interval11.isBefore((org.joda.time.ReadableInterval) interval37);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval37);
        org.joda.time.MutableInterval mutableInterval41 = interval37.toMutableInterval();
        boolean boolean42 = interval8.contains((org.joda.time.ReadableInterval) interval37);
        org.joda.time.Period period43 = interval8.toPeriod();
        org.joda.time.Chronology chronology44 = interval8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval45 = new org.joda.time.Interval((long) 26151451, (-60480000000L), chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-22T07:16:55.433Z/2022-02-22T07:16:55.433Z" + "'", str12, "2022-02-22T07:16:55.433Z/2022-02-22T07:16:55.433Z");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(interval29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(mutableInterval41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        int int20 = period18.getValue(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration24 = period18.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime13.toDateTime(chronology25);
        org.joda.time.DurationField durationField27 = chronology25.months();
        long long30 = durationField27.getDifferenceAsLong((long) 11, 1645514173546L);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-625L) + "'", long30 == (-625L));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        int int3 = localDate2.getCenturyOfEra();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays((int) '#');
        java.util.Date date6 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = localDate5.withWeekyear(26176117);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate5.withEra(38270);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38270 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 27 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.withFields(readablePartial8);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(3);
        boolean boolean12 = calendar4.before((java.lang.Object) localTime11);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.roll((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514215388,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=55,MILLISECOND=388,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.util.Date date1 = localDate0.toDate();
        int int2 = date1.getYear();
        int int3 = date1.getMinutes();
        int int4 = date1.getDate();
        java.lang.Object obj5 = date1.clone();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 122 + "'", int2 == 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Tue Feb 22 00:00:00 UTC 2022");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        int int4 = calendar1.getGreatestMinimum(6);
        java.util.Date date5 = calendar1.getTime();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.Object obj7 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514215779,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=55,MILLISECOND=779,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514215779L + "'", long2 == 1645514215779L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Feb 22 07:16:55 UTC 2022");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "java.util.GregorianCalendar[time=1645514215779,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=55,MILLISECOND=779,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "java.util.GregorianCalendar[time=1645514215779,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=55,MILLISECOND=779,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "java.util.GregorianCalendar[time=1645514215779,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=55,MILLISECOND=779,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTimeFormatter2.parseDateTime("10022-02-22");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(14, 26153877, 41, 1, 26184703, 26178, 26208878, 32769, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate4 = property3.roundCeilingCopy();
        org.joda.time.LocalDate localDate6 = property3.addWrapFieldToCopy((int) (byte) 0);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        int int14 = dateTime10.getYearOfCentury();
        int int15 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime10.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        int int20 = dateTimeField19.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks((int) (byte) 10);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        long long28 = duration27.getMillis();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plus((org.joda.time.ReadableDuration) duration27);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) localDateTime23, (int) (short) 1, locale31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale31.getDisplayLanguage(locale33);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone9, locale33);
        boolean boolean36 = locale33.hasExtensions();
        java.lang.String str37 = locale33.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = property3.setCopy("UnsupportedDurationField[eras]", locale33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UnsupportedDurationField[eras]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Heure de Greenwich");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 436 + "'", int13 == 436);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1439 + "'", int20 == 1439);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "chinois" + "'", str34, "chinois");
        org.junit.Assert.assertNotNull(calendar35);
// flaky:         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1645514216231,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=56,MILLISECOND=231,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fr-CA" + "'", str37, "fr-CA");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = property1.getAsText(locale2);
        org.joda.time.DateTime dateTime5 = property1.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis(11);
        org.joda.time.DateTime dateTime11 = dateTime5.withDate(474, (int) (byte) 1, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime5.withDayOfWeek(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26217246" + "'", str4, "26217246");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property8.setCopy(10022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, 1970);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Interval interval11 = interval9.toInterval();
        long long12 = interval9.getEndMillis();
        java.lang.String str13 = interval9.toString();
        org.joda.time.DateTime dateTime14 = interval9.getStart();
        org.joda.time.Chronology chronology15 = interval9.getChronology();
        org.joda.time.Period period16 = new org.joda.time.Period(0L, 1645514152681L, chronology15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((int) 'a');
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withEra(1640);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1640 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1645514217484L + "'", long12 == 1645514217484L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-22T07:16:57.484Z/2022-02-22T07:16:57.484Z" + "'", str13, "2022-02-22T07:16:57.484Z/2022-02-22T07:16:57.484Z");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 100);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 1, (long) ' ', periodType4, chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        int int21 = dateTime17.getYearOfCentury();
        int int22 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime17.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = dateTimeField26.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime30, (int) (short) 1, locale38);
        org.joda.time.ReadablePartial readablePartial40 = null;
        int int41 = dateTimeField26.getMaximumValue(readablePartial40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = localDateTime42.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusYears(26151451);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        int int50 = period48.getValue(0);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration54 = period48.toDurationTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime46.withPeriodAdded((org.joda.time.ReadablePeriod) period48, 0);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (-1), chronology58);
        org.joda.time.Period period60 = period59.toPeriod();
        int int61 = period60.size();
        int int62 = period60.getMinutes();
        int[] intArray63 = period60.getValues();
        int int64 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56, intArray63);
        int[] intArray66 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDateTime15, 6, intArray63, 0);
        java.util.Calendar.Builder builder67 = builder0.setFields(intArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar68 = builder67.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid era");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 436 + "'", int20 == 436);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1439 + "'", int27 == 1439);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1439 + "'", int41 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId6 = timeZone5.toZoneId();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone(zoneId6);
        boolean boolean8 = timeZone1.hasSameRules(timeZone7);
        java.lang.Object obj9 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        int int7 = period5.getValue(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration11 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) 2, chronology12);
        org.joda.time.DurationField durationField17 = chronology12.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration18 = new org.joda.time.Duration((java.lang.Object) durationField17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType24 = periodType23.withMillisRemoved();
        org.joda.time.Period period25 = interval2.toPeriod(periodType24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (-1), chronology27);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) (byte) 10, 0L);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology36);
        org.joda.time.Period period39 = duration31.toPeriod(chronology36);
        org.joda.time.Period period40 = period28.plus((org.joda.time.ReadablePeriod) period39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval41 = interval2.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22T07:16:58.563Z/2022-02-22T07:16:58.563Z" + "'", str3, "2022-02-22T07:16:58.563Z/2022-02-22T07:16:58.563Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(interval20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Locale locale2 = new java.util.Locale("2022-02-22T07:16:06.916Z/2022-02-22T07:16:06.916Z", "millisOfDay");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-22t07:16:06.916z/2022-02-22t07:16:06.916z_MILLISOFDAY");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.roundCeilingCopy();
        int int12 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) period6);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval13.setStartMillis(1645514197988L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period13 = period11.minusHours(100);
        org.joda.time.Duration duration14 = period11.toStandardDuration();
        java.lang.Object obj15 = null;
        boolean boolean16 = duration14.equals(obj15);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int3 = timeZone1.getRawOffset();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime8.getMinuteOfDay();
        int int12 = dateTime8.getYearOfCentury();
        int int13 = dateTime8.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime8.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = dateTimeField17.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks((int) (byte) 10);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        long long26 = duration25.getMillis();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plus((org.joda.time.ReadableDuration) duration25);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str30 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime21, (int) (short) 1, locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        int int35 = dateTime31.getYearOfCentury();
        int int36 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime31.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = dateTimeField40.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks((int) (byte) 10);
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        long long49 = duration48.getMillis();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plus((org.joda.time.ReadableDuration) duration48);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = dateTimeField40.getAsText((org.joda.time.ReadablePartial) localDateTime44, (int) (short) 1, locale52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale52.getDisplayLanguage(locale54);
        java.lang.String str56 = locale29.getDisplayLanguage(locale54);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap57 = calendar5.getDisplayNames(13, 1640, locale54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645514217973,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=57,MILLISECOND=973,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514217974,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=57,MILLISECOND=974,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 436 + "'", int11 == 436);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1439 + "'", int18 == 1439);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 436 + "'", int34 == 436);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1439 + "'", int41 == 1439);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 35L + "'", long49 == 35L);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1" + "'", str53, "1");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str55, "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str56, "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DateTime dateTime18 = dateTime12.toDateTime(chronology16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) 1, (long) ' ', periodType11, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withCenturyOfEra(2);
        long long25 = chronology16.set((org.joda.time.ReadablePartial) localDateTime21, (long) (short) 10);
        java.lang.String str26 = chronology16.toString();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 26151451, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(2, 9, 26155103, 123, 1, 2036, 19, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 123 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1645514219111L + "'", long25 == 1645514219111L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str26, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone6.getName((long) ' ');
        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        long long14 = dateTimeZone6.adjustOffset(1645514153208L, false);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.Chronology chronology17 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = dateTimeFormatter2.parseLocalDateTime("\u516c\u5143");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645514153208L + "'", long14 == 1645514153208L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        int int4 = calendar1.getGreatestMinimum(6);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (-1), chronology7);
        org.joda.time.Period period9 = period8.toPeriod();
        int int10 = period9.size();
        int int11 = period9.getMinutes();
        int[] intArray12 = period9.getValues();
        org.joda.time.Period period14 = period9.withMonths(26155103);
        org.joda.time.Period period16 = period14.minusDays((-292275054));
        int int17 = period14.getHours();
        org.joda.time.Period period19 = period14.withMinutes(914);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology22);
        boolean boolean25 = period14.isSupported(durationFieldType20);
        boolean boolean26 = calendar1.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645514218444,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=58,MILLISECOND=444,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645514218444L + "'", long2 == 1645514218444L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.hourOfHalfday();
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(1645514195486L, 1645513200000L, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-22T07:16:36.764Z/2022-02-22T07:16:36.764Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:16:36.764Z/2022-02-22T07:16:...\" is malformed at \"T07:16:36.764Z/2022-02-22T07:16:...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(1);
        org.joda.time.LocalDate.Property property3 = localDate0.year();
        org.joda.time.LocalDate localDate4 = property3.getLocalDate();
        org.joda.time.LocalDate localDate5 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withWeekOfWeekyear(453);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 453 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(2);
        long long17 = chronology8.set((org.joda.time.ReadablePartial) localDateTime13, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withTime(100, 70, 26198934, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645514220048L + "'", long17 == 1645514220048L);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime5 = localTime2.minusMinutes(2022);
        int int6 = localTime2.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime0, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusHours((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) ' ', dateTimeZone13);
        int int15 = dateTime14.getYearOfCentury();
        org.joda.time.DateTime.Property property16 = dateTime14.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.Interval interval18 = property16.toInterval();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str22 = interval21.toString();
        org.joda.time.DateTime dateTime23 = interval21.getEnd();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks((int) (byte) 10);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        long long31 = duration30.getMillis();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plus((org.joda.time.ReadableDuration) duration30);
        boolean boolean33 = interval21.equals((java.lang.Object) duration30);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        boolean boolean38 = interval36.isAfter((long) 10);
        org.joda.time.Interval interval39 = interval21.overlap((org.joda.time.ReadableInterval) interval36);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.months();
        org.joda.time.Period period41 = interval21.toPeriod(periodType40);
        org.joda.time.DateTime dateTime42 = interval21.getStart();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Interval interval47 = interval45.toInterval();
        org.joda.time.MutableInterval mutableInterval48 = interval47.toMutableInterval();
        boolean boolean49 = interval21.isBefore((org.joda.time.ReadableInterval) interval47);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval47);
        org.joda.time.MutableInterval mutableInterval51 = interval47.toMutableInterval();
        boolean boolean52 = interval18.contains((org.joda.time.ReadableInterval) interval47);
        boolean boolean53 = interval18.isBeforeNow();
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval18);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(1645514177812L, chronology54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) 'x', chronology54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 437 + "'", int3 == 437);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(interval18);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022-02-22T07:17:00.418Z/2022-02-22T07:17:00.418Z" + "'", str22, "2022-02-22T07:17:00.418Z/2022-02-22T07:17:00.418Z");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(interval39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(mutableInterval48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(mutableInterval51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(chronology54);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.lang.String str10 = dateTimeField9.toString();
        long long13 = dateTimeField9.addWrapField((long) 14, 26161182);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.parse("0");
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.hourOfHalfday();
        org.joda.time.DateTime dateTime27 = dateTime21.toDateTime(chronology25);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 1, (long) ' ', periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField29 = chronology25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime34);
        int int36 = dateTime33.getMinuteOfDay();
        int int37 = dateTime33.getYearOfCentury();
        int int38 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime40 = dateTime33.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        int int43 = dateTimeField42.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks((int) (byte) 10);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        long long51 = duration50.getMillis();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.plus((org.joda.time.ReadableDuration) duration50);
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str55 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localDateTime46, (int) (short) 1, locale54);
        org.joda.time.ReadablePartial readablePartial56 = null;
        int int57 = dateTimeField42.getMaximumValue(readablePartial56);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = localDateTime58.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.plusYears(26151451);
        org.joda.time.Period period64 = new org.joda.time.Period((long) '#');
        int int66 = period64.getValue(0);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Duration duration70 = period64.toDurationTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime62.withPeriodAdded((org.joda.time.ReadablePeriod) period64, 0);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (-1), chronology74);
        org.joda.time.Period period76 = period75.toPeriod();
        int int77 = period76.size();
        int int78 = period76.getMinutes();
        int[] intArray79 = period76.getValues();
        int int80 = dateTimeField42.getMinimumValue((org.joda.time.ReadablePartial) localDateTime72, intArray79);
        int[] intArray82 = dateTimeField29.addWrapPartial((org.joda.time.ReadablePartial) localDateTime31, 6, intArray79, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray84 = dateTimeField9.set((org.joda.time.ReadablePartial) localDate15, 26198934, intArray82, 26176117);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26176117 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 437 + "'", int3 == 437);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateTimeField[minuteOfDay]" + "'", str10, "DateTimeField[minuteOfDay]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 42120014L + "'", long13 == 42120014L);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField29);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 437 + "'", int36 == 437);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 22 + "'", int37 == 22);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 22 + "'", int38 == 22);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1439 + "'", int43 == 1439);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35L + "'", long51 == 35L);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1" + "'", str55, "1");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1439 + "'", int57 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 8 + "'", int77 == 8);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = property1.getAsText(locale2);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime5.getMinuteOfDay();
        int int9 = dateTime5.getYearOfCentury();
        int int10 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime5.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        int int14 = property1.compareTo((org.joda.time.ReadableInstant) dateTime13);
        java.lang.Character[] charArray18 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet19 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet19, charArray18);
        boolean boolean22 = charSet19.add((java.lang.Character) ' ');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays((int) (byte) 10);
        org.joda.time.Interval interval28 = localDate27.toInterval();
        org.joda.time.LocalDate localDate30 = localDate27.withYear(38270);
        boolean boolean31 = charSet19.contains((java.lang.Object) localDate27);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int33 = localDate27.get(dateTimeFieldType32);
        org.joda.time.DateTime.Property property34 = dateTime13.property(dateTimeFieldType32);
        org.joda.time.Instant instant35 = dateTime13.toInstant();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26220768" + "'", str4, "26220768");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 437 + "'", int8 == 437);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 382 + "'", int33 == 382);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(instant35);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localTime1.toString("2022-02-22T07:16:18.829Z/2022-02-22T07:16:18.829Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter2.parseMutableDateTime("CAN");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(26218500, 453, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26218500 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter6.parseLocalTime("26168547");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.era();
        org.joda.time.DateTime.Property property5 = dateTime3.weekyear();
        org.joda.time.DateTime dateTime7 = property5.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone9.getName((long) ' ');
        java.lang.String str13 = dateTimeZone9.getName((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime7.withZoneRetainFields(dateTimeZone9);
        org.joda.time.Interval interval15 = localDate0.toInterval(dateTimeZone9);
        org.joda.time.LocalDate localDate17 = localDate0.minusDays(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate17.withDayOfWeek(26200719);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26200719 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime7 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        int int11 = period9.getValue(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration15 = period9.toDurationTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getChronology(chronology16);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) 2, chronology16);
        org.joda.time.DurationField durationField21 = chronology16.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) '#', 122, (int) (byte) 10, 304, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str6 = dateTimeField2.getAsShortText(1645514151873L, locale5);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = dateTimeField2.getAsShortText(26153877, locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) ' ', dateTimeZone11);
        int int13 = dateTime12.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime12.toYearMonthDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime16.getMinuteOfDay();
        org.joda.time.DateTime dateTime21 = dateTime16.minusHours((int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime24 = dateTime21.withYear(38222);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.hourOfHalfday();
        org.joda.time.DateTime dateTime33 = dateTime27.toDateTime(chronology31);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) 7, (long) (short) 100, chronology31);
        org.joda.time.DateTimeField dateTimeField35 = chronology31.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime24.toMutableDateTime(chronology31);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime37, (org.joda.time.ReadablePartial) localTime38, periodType39);
        org.joda.time.Period period42 = period40.minusHours(26155103);
        int[] intArray45 = chronology31.get((org.joda.time.ReadablePeriod) period42, 1645514177012L, (long) 21);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField2.add((org.joda.time.ReadablePartial) yearMonthDay14, 41, intArray45, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "26153877" + "'", str9, "26153877");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
        org.junit.Assert.assertNotNull(yearMonthDay14);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 437 + "'", int19 == 437);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-52, -1, -3, 0, -7, -16, -16, -991]");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.centuryOfEra();
        org.joda.time.DurationField durationField2 = property1.getLeapDurationField();
        java.util.Locale locale4 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property1.setCopy("2022-02-22T07:16:12.518Z/2022-02-22T07:16:12.518Z", locale4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:16:12.518Z/2022-02-22T07:16:12.518Z\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNull(durationField2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
    }
}
