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
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) 'a', (int) (byte) 10, (int) '4', chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) (short) -1, (int) (short) 0, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((java.lang.Object) 904);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setWeekOfWeekyear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateMidnight8.toString("", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 0, 53617719, (int) (short) 1, (int) (short) 1, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617719 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(21, 0, 904);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 904 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = property1.setCopy("Italian");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Italian\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53618899 + "'", int5 == 53618899);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53617719, (int) (short) 10, (int) (byte) 10, (int) (byte) 10, 53618195, 904);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTime(localTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate2.withEra(8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53619248, (int) (short) -1, 53617440);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619248 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = periodType0.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Years" + "'", str1, "Years");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.weekyear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate9.toDateMidnight(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = localDateTime3.isBefore((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53619851 + "'", int5 == 53619851);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("2022-02-21T14:53:37.096Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-21T14:53:37.096Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (byte) 0, 53619708, (int) '4', 2, 21, 53617649, (int) 'a', (int) (short) 0, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) ' ', 2, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = property11.setCopy("Italian");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Italian\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) property6, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53620098 + "'", int5 == 53620098);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate2.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addYears((int) (short) 100);
        java.lang.Object obj8 = mutablePeriod3.clone();
        mutablePeriod3.setSeconds(904);
        mutablePeriod3.addSeconds(904);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "P100YT1808S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "P100YT1808S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "P100YT1808S");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        long long6 = java.util.Date.UTC(53618165, 21, 53619079, 53619079, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1696849422476452000L + "'", long6 == 1696849422476452000L);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) periodType2, dateTimeZone4);
        int int6 = localDateTime5.getDayOfMonth();
        int int7 = localDateTime5.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.millisOfSecond();
        int int9 = localDateTime5.getEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.era();
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        int int13 = localDateTime5.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property14 = localTime0.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53620534 + "'", int7 == 53620534);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 100, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.Duration duration20 = period16.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean21 = locale12.equals((java.lang.Object) mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = property11.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(21);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate9.toDateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfEra();
        int int17 = dateMidnight15.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property18 = dateMidnight15.year();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        long long21 = dateTimeField19.remainder((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField19, 53617649);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 53617649");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 31535999999L + "'", long21 == 31535999999L);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period2.getFieldType((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) periodType9, dateTimeZone11);
        int int13 = localDateTime12.getDayOfMonth();
        int int14 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        int int16 = localDateTime12.getEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = localDateTime12.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime3.property(dateTimeFieldType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        java.lang.String str25 = localDate24.toString();
        org.joda.time.LocalDate localDate27 = localDate24.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((java.lang.Object) property21, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53621340 + "'", int5 == 53621340);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53621340 + "'", int14 == 53621340);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) periodType4, dateTimeZone6);
        int int8 = localDateTime7.getDayOfMonth();
        int int9 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfSecond();
        int int11 = localDateTime7.getEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.era();
        org.joda.time.LocalDateTime.Property property13 = localDateTime7.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53621371 + "'", int9 == 53621371);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setWeekOfWeekyear(53618165);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618165 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 432 + "'", int2 == 432);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        int int11 = dateTime10.getWeekOfWeekyear();
        boolean boolean13 = dateTime10.isBefore((long) 53619248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("2022-02-21T14:53:37.719");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:53:37.719\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = durationField7.getValue(259200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withDayOfWeek((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 1970-01-01 [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("en-CA", "Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.add((long) 1, 53620972);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.TimeZone timeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder7.setTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withDayOfMonth(53620623);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620623 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime0.withFieldAdded(durationFieldType4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str14 = locale12.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField9.set((long) 12, "2022-02-21T14:53:37.096Z", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:37.096Z\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53622895 + "'", int5 == 53622895);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.getMillis((long) 7, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property6.setCopy("PT0.100S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0.100S\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(2);
        java.lang.Class<?> wildcardClass5 = localDateTime4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property8.addToCopy((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53623317 + "'", int5 == 53623317);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate5.withDayOfWeek(53619988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619988 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
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
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.add((long) 3, 53617440);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setRounding(dateTimeField9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        int int6 = localDate5.getDayOfYear();
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate5.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.yearOfEra();
        int int13 = dateMidnight11.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property14 = dateMidnight11.year();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.plusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight11);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(periodType18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod19, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateMidnight21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight21);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = periodType0.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Years" + "'", str1, "Years");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        long long14 = dateTimeField12.remainder((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMillis(2);
        int[] intArray21 = new int[] {};
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField12.set((org.joda.time.ReadablePartial) localDateTime17, 0, intArray21, "", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31535999999L + "'", long14 == 31535999999L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = property7.set("IT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"IT\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 229 + "'", int2 == 229);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = strSet1.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateMidnight8.toString("en-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.subtract((long) (short) 0, 53619079);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(12, 35, 53619079, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        int int5 = localTime3.size();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime3.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str2 = locale0.getExtension('a');
        boolean boolean4 = locale0.equals((java.lang.Object) 20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        int int7 = period2.size();
        org.joda.time.Period period9 = period2.withWeeks(842);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period2.withPeriodType(periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('#', "en-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((-292275054), 53619988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        int int4 = localDate3.getDayOfYear();
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate3.toDateTime(localTime5, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate3.toDateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.yearOfEra();
        int int11 = dateMidnight9.getMinuteOfHour();
        int int12 = dateMidnight9.getMonthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) dateMidnight9, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) builder0, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = calendar0.isSet((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455225493,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=45,MILLISECOND=493,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("2022-02-21T14:53:45.094Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dateTimeFormatter2.parseMillis("2022-02-21T14:53:45.309");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
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
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("PT0.100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT0.100S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DateMidnight dateMidnight13 = property11.roundFloorCopy();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight17 = property11.setCopy("", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField7.getMillis((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutablePeriod9.add(readableDuration10);
        mutablePeriod9.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration14, readableInstant15, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutablePeriod17.add(readableDuration18);
        mutablePeriod17.addMonths((int) '#');
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField31, 53619708);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 53619708");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T14:53:46.102Z" + "'", str5, "2022-02-21T14:53:46.102Z");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime5.setZone(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.minuteOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        mutableDateTime5.setChronology(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(53619770, 2, 1, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619770 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        int int7 = date6.getSeconds();
        java.lang.String str8 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Fri Jul 01 14:56:05 UTC 53619791" + "'", str8, "Fri Jul 01 14:56:05 UTC 53619791");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Seconds seconds7 = period2.toStandardSeconds();
        org.joda.time.Period period9 = period2.plusYears(0);
        org.joda.time.Period period11 = period2.withHours(53617440);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = period2.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(53618165, 53619079, 53617891, 2057);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618165 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property1.setCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        java.util.Date date5 = mutableDateTime2.toDate();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = mutableDateTime2.toString("Italian", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:53:46 UTC 2022");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        boolean boolean12 = property11.isLeap();
        int int13 = property11.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property11.setCopy("PT0.100S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0.100S\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateMidnight8.isSupported(dateTimeFieldType11);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.minus((org.joda.time.ReadablePeriod) period17);
        int int19 = period17.getYears();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = durationField7.getValue((long) 53620623);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfWeek(53625645);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625645 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("P100YT904S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P100YT904S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar0.get((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455227251,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=251,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        int int18 = mutableDateTime2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDateTime(7, 53618165, (int) '#', 0, 53619770, 53620623, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619770 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime0.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology6.getDateTimeMillis((long) (-1), 4, 5, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        mutableDateTime9.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, (int) (byte) 0);
        mutableDateTime9.add(durationFieldType14, 8);
        org.joda.time.LocalDate localDate20 = localDate2.withFieldAdded(durationFieldType14, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDate20.getFieldType(53625266);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53625266");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableDuration8, readableInstant9, periodType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutablePeriod11.add(readableDuration12);
        mutablePeriod11.addMonths((int) '#');
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime19.setZone(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime26 = dateTime23.withFieldAdded(durationFieldType24, (int) (byte) 0);
        mutableDateTime19.add(durationFieldType24, 8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod11.add(durationFieldType24, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
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
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.setHours(12);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) periodType8, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(465);
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDateTime13, (-292275054), locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period5.getFieldType(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property1.setCopy("era");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"era\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(20, 53620972, 53619079, 1970, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620972 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration11, readableInstant12, periodType13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutablePeriod14.add(readableDuration15);
        mutablePeriod14.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration19, readableInstant20, periodType21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutablePeriod22.add(readableDuration23);
        mutablePeriod22.addMonths((int) '#');
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay10.plus((org.joda.time.ReadablePeriod) mutablePeriod22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = yearMonthDay28.getValue(598);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 598");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay28);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.subtract((long) 185, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = yearMonthDay8.getValue(409);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 409");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DateMidnight dateMidnight13 = property11.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.withMonthOfYear(53617891);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617891 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("PT0.100S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (byte) 100, 53626980, 53628444, 53627214, (int) (short) -1, 0, 14, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627214 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.setMillis(0);
        int int6 = mutablePeriod3.getYears();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate9.toDateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfEra();
        int int17 = dateMidnight15.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property18 = dateMidnight15.year();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.plusYears((int) ' ');
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight15);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableDuration22, readableInstant23, periodType24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutablePeriod25.add(readableDuration26);
        mutablePeriod25.addMonths((int) '#');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        int int33 = localDate32.getDayOfYear();
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate32.toDateTime(localTime34, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = localDate32.toDateMidnight(dateTimeZone37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfEra();
        int int40 = dateMidnight38.getMinuteOfHour();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 100, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.copy();
        org.joda.time.Duration duration47 = period43.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight38.plus((org.joda.time.ReadableDuration) duration47);
        mutablePeriod25.add((org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.years();
        java.lang.String str51 = periodType50.getName();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.PeriodType periodType53 = periodType50.withYearsRemoved();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, (org.joda.time.ReadableDuration) duration47, periodType53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 1, chronology56);
        java.lang.String str58 = localDate57.toString();
        org.joda.time.LocalDate localDate60 = localDate57.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology61 = localDate60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((java.lang.Object) int6, periodType53, chronology61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Years" + "'", str51, "Years");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01" + "'", str58, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) 'u', chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.withMonthOfYear(53617649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617649 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        int int11 = dateMidnight8.getMonthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateMidnight8, chronology21);
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateMidnight8.toString(dateTimeFormatter27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNull(chronology28);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
        int int4 = period2.getMonths();
        int int5 = period2.getHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period2.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(53620623, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455229995,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=49,MILLISECOND=995,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate10.toDateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        int int18 = dateMidnight16.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.year();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.plusYears((int) ' ');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight16);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableDuration23, readableInstant24, periodType25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutablePeriod26.add(readableDuration27);
        mutablePeriod26.addMonths((int) '#');
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        int int34 = localDate33.getDayOfYear();
        org.joda.time.LocalTime localTime35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate33.toDateTime(localTime35, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = localDate33.toDateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfEra();
        int int41 = dateMidnight39.getMinuteOfHour();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 100, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        org.joda.time.Duration duration48 = period44.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight39.plus((org.joda.time.ReadableDuration) duration48);
        mutablePeriod26.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.years();
        java.lang.String str52 = periodType51.getName();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(periodType51);
        org.joda.time.PeriodType periodType54 = periodType51.withYearsRemoved();
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration48, periodType54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(598, (int) (short) 1, 53629402, 0, 6, 15, 53620623, (int) (byte) 100, periodType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Years" + "'", str52, "Years");
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.Object obj0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(obj0);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.withMillisOfSecond(20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeOfDay1.toString("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.withMillis((long) ' ');
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis(53618333);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfEra();
        org.joda.time.DateTime dateTime29 = dateTime20.toDateTime(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) ' ', chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate10.toDateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        int int18 = dateMidnight16.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.year();
        org.joda.time.DateMidnight.Property property20 = dateMidnight16.centuryOfEra();
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        int int23 = property20.getMaximumTextLength(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTime6.toString("Years", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.yearOfEra();
        int int5 = property4.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay8.withChronologyRetainFields(chronology18);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay8.withFieldAdded(durationFieldType21, 53625645);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(465);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-21T14:53:37.096Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-21T14:53:37.096Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutablePeriod9.add(readableDuration10);
        mutablePeriod9.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration14, readableInstant15, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutablePeriod17.add(readableDuration18);
        mutablePeriod17.addMonths((int) '#');
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod9);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = mutableDateTime1.toString("2022-02-21T14:53:49.549Z", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T14:53:50.847Z" + "'", str5, "2022-02-21T14:53:50.847Z");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType12.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay8.withFieldAdded(durationFieldType14, 53617891);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime9 = dateTime6.withFieldAdded(durationFieldType7, (int) (byte) 0);
        mutableDateTime2.add(durationFieldType7, 8);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfMonth(53625266);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625266 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(465);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.setCopy("HI!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"HI!\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withHourOfDay(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int3 = localTime1.get(dateTimeFieldType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime1.withMinuteOfHour(736);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 736 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.parse("und", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localDateTime3.getField(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = calendar0.getDisplayName((int) (byte) 0, (int) (short) -1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455231587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=587,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime3.toString("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime9 = dateTime6.withFieldAdded(durationFieldType7, (int) (byte) 0);
        mutableDateTime2.add(durationFieldType7, 8);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear((int) (short) 100);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) dateTime12);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfHour(53617719);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617719 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.monthOfYear();
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.dayOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withDefaultYear(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateMidnight2.toString(dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422466L) + "'", long4 == (-27422466L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime3.toString("PeriodType[DayTime]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        int int9 = period8.getHours();
        org.joda.time.Period period11 = period8.plusMonths(2);
        org.joda.time.Period period13 = period8.minusMonths(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration14 = period13.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AD");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        int int5 = localDate4.getDayOfYear();
        org.joda.time.LocalTime localTime6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate4.toDateTime(localTime6, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = localDate4.toDateMidnight(dateTimeZone9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.yearOfEra();
        int int12 = dateMidnight10.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property13 = dateMidnight10.year();
        org.joda.time.DateMidnight.Property property14 = dateMidnight10.centuryOfEra();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        int int17 = property14.getMaximumTextLength(locale15);
        boolean boolean18 = languageRange1.equals((java.lang.Object) property14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) mutableDateTime9, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) period13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Years" + "'", str11, "Years");
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        int int6 = localDate5.getDayOfYear();
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate5.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime12.setZone(dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime19 = dateTime16.withFieldAdded(durationFieldType17, (int) (byte) 0);
        mutableDateTime12.add(durationFieldType17, 8);
        org.joda.time.LocalDate localDate23 = localDate5.withFieldAdded(durationFieldType17, 3);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        int int27 = localDate26.getDayOfYear();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate26.toDateTime(localTime28, dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = localDate26.toDateMidnight(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate26.withYear(53619770);
        int int35 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate26);
        boolean boolean36 = strSet1.contains((java.lang.Object) int35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = strSet1.add("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        int int18 = mutableDateTime2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDateTime(53632562, 0, 53617891, 185, 53625309, 53617719, 53629078);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 185 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dateTimeFormatter11.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime13, "2022-02-21T14:53:45.309", 53625266);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime9 = dateTime6.withFieldAdded(durationFieldType7, (int) (byte) 0);
        mutableDateTime2.add(durationFieldType7, 8);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfEra();
        org.joda.time.DurationField durationField13 = property12.getLeapDurationField();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusYears((int) (byte) 0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(10L, (-1L), periodType10, chronology11);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.plus((org.joda.time.ReadablePeriod) period12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime3.withSecondOfMinute(53628335);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628335 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2032-02-21T14:53:47.960Z", (double) 53625309);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.3625309E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.lang.String str5 = locale3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ko_KR" + "'", str5, "ko_KR");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) timeOfDay0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = property11.setCopy("AD");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"AD\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        int int5 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology15);
        mutableDateTime1.setChronology(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology15.getDateTimeMillis(2, 53618195, (int) (short) -1, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withMillisOfSecond(53620134);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620134 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property8.setCopy(2057);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2057 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        org.joda.time.Period period10 = period2.minusMillis(0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) 1, chronology18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusMonths(53617719);
        int int22 = yearMonthDay19.getDayOfMonth();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        java.lang.String str26 = localDate25.toString();
        org.joda.time.LocalDate localDate28 = localDate25.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay19.withChronologyRetainFields(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) 0, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(yearMonthDay31);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        boolean boolean9 = dateTimeField7.isLeap((long) 53619770);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean19 = localTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime20 = localDate12.toLocalDateTime(localTime17);
        int[] intArray27 = new int[] { 53621101, (byte) -1, 842, 5, 53619248 };
        java.util.Locale locale29 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField7.set((org.joda.time.ReadablePartial) localDate12, 53629078, intArray27, "1970-01-01", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[53621101, -1, 842, 5, 53619248]");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.PeriodType periodType10 = periodType8.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'u', (-144832), 53633398, 53625645, 53617891, 0, 53617440, 53626980, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Years" + "'", str9, "Years");
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime0.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (long) 53620134);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("100", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print((long) 598);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        boolean boolean8 = durationField7.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.getDifferenceAsLong((long) 53628444, (long) 53617891);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute(53632);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53632 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("weekyear", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("PeriodType[DayTime]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'PeriodType[DayTime]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime14 = localTime11.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime11.toDateTimeToday(dateTimeZone15);
        org.joda.time.Chronology chronology17 = localTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) yearMonthDay8, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        java.lang.String str9 = durationField7.toString();
        org.joda.time.DurationFieldType durationFieldType10 = durationField7.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField7.getMillis(53632);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[eras]" + "'", str9, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertNotNull(durationFieldType10);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter5.parseMillis("UnsupportedDurationField[eras]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.TimeZone timeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder7.setTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IT" + "'", str6, "IT");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        int int10 = mutableDateTime9.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        mutableDateTime9.setZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) locale5, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IT" + "'", str6, "IT");
        org.junit.Assert.assertNotNull(builder7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 610 + "'", int10 == 610);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property8.setCopy(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53635705 + "'", int5 == 53635705);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.subtract((long) 53625266, 53620623);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime5 = property1.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localTime5.getField(342);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 342");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422466L) + "'", long4 == (-27422466L));
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        long long11 = dateTimeField9.remainder((long) 14);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField9.set((-27422466L), "");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14L + "'", long11 == 14L);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getExtension('a');
        java.lang.String str17 = dateTimeField12.getAsText((long) 53617440, locale14);
        java.lang.String str18 = locale14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en_CA" + "'", str18, "en_CA");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        java.lang.String str9 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField7.subtract((long) 70, 185);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[eras]" + "'", str9, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        mutableDateTime20.add(durationFieldType21, (int) (byte) 0);
        int int24 = periodType18.indexOf(durationFieldType21);
        mutableDateTime2.add(durationFieldType21, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((java.lang.Object) property27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        long long14 = dateTimeField12.remainder((long) (short) -1);
        java.lang.String str16 = dateTimeField12.getAsText((long) 8);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property23 = localDate19.dayOfWeek();
        org.joda.time.LocalDate localDate24 = property23.withMaximumValue();
        int[] intArray26 = new int[] {};
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField12.set((org.joda.time.ReadablePartial) localDate24, (int) '#', intArray26, "IT", locale28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"IT\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31535999999L + "'", long14 == 31535999999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay8.withDayOfMonth(53628506);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628506 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Period period1 = org.joda.time.Period.hours(20);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        mutablePeriod12.setMillis(0);
        org.joda.time.LocalDate localDate15 = localDate7.plus((org.joda.time.ReadablePeriod) mutablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate15.withDayOfMonth(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean7 = localTime5.isSupported(dateTimeFieldType6);
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType6.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = timeOfDay2.withField(dateTimeFieldType6, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        java.util.Calendar.Builder builder16 = builder12.setDate(4, 70, 53);
        java.util.Date date23 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        date23.setYear(53620623);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder26 = builder16.setInstant(date23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 01 14:56:05 UTC 53622523");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(904, 902);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455236766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=56,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:53:56 UTC 2022");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53634384, (int) (short) -1, 5, 53618333, 19, 873);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618333 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addMonths((int) '#');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTime(localTime19, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate17.toDateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        int int25 = dateMidnight23.getMinuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration32);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration32);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod3.copy();
        mutablePeriod3.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(mutablePeriod36);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=isochronology[utc]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        int int9 = period8.getHours();
        org.joda.time.Period period11 = period8.plusMonths(2);
        org.joda.time.Period period13 = period11.withSeconds(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours14 = period13.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (long) 53632583);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        java.lang.String str9 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField7.getMillis(53625645, (long) 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[eras]" + "'", str9, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime10 = localTime7.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime7.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(10);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter5.print((org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addSeconds(53617440);
        org.joda.time.DateTime dateTime15 = dateTime4.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.seconds();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime19.setZone(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.minuteOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        java.lang.String str26 = localDate25.toString();
        org.joda.time.LocalDate localDate28 = localDate25.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.eras();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.year();
        mutableDateTime19.setChronology(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) dateTime4, periodType16, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = mutablePeriod2.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        boolean boolean8 = durationField7.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.subtract((long) 21, (long) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        int int10 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withWeekyear(736);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime3.withTime(53625266, 53617891, 53619248, 902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625266 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53637544 + "'", int5 == 53637544);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(53637942, 53627306, 409, (int) '4', (int) '#', 53629402, 53627214);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setTime(53628506, 0, 0, 53628506);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628506 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = yearMonthDay8.getFieldType(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.getMillis(259200000L, (long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) 1, chronology15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay16.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight19.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight19.withField(dateTimeFieldType28, 842);
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay16.property(dateTimeFieldType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property32 = timeOfDay7.property(dateTimeFieldType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (long) 773);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder11 = builder0.setWeekDate(47, 53627214, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar12 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addWrapFieldToCopy(53618195);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property1.setCopy("era", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"era\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422466L) + "'", long4 == (-27422466L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(409, 12, 53620972, (int) '#', 53618195, 53629078, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        mutableDateTime5.addMinutes(0);
        java.lang.String str9 = mutableDateTime5.toString();
        int int10 = mutableDateTime5.getYearOfEra();
        org.joda.time.Chronology chronology11 = mutableDateTime5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime5, "UnsupportedDurationField[eras]", 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-21T14:53:58.999Z" + "'", str9, "2022-02-21T14:53:58.999Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422466L) + "'", long4 == (-27422466L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime5 = property1.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property1.roundFloorCopy();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property1.setCopy("AD", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"AD\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422466L) + "'", long4 == (-27422466L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) '4', 873, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.LocalDate localDate8 = localDate2.withWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate11 = localDate2.withField(dateTimeFieldType9, 53628506);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withYearOfCentury(53626518);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626518 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusHours((int) (short) 1);
        org.joda.time.LocalTime localTime5 = localTime0.withHourOfDay(3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology12.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((java.lang.Object) 3, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime4 = localTime2.minusHours(1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) dateTime16, dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53639684 + "'", int5 == 53639684);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        int int3 = localTime0.getHourOfDay();
        int int4 = localTime0.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime0.toString("2022-02-21T14:53:53.322");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) periodType9, dateTimeZone11);
        int int13 = localDateTime12.getDayOfMonth();
        int int14 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        int int16 = localDateTime12.getEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = localDateTime12.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime3.property(dateTimeFieldType19);
        int int22 = localDateTime3.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDateTime3.toString("53617440-02-21T14:53:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53640102 + "'", int5 == 53640102);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53640102 + "'", int14 == 53640102);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53640102 + "'", int22 == 53640102);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 53627306);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.DateTime dateTime3 = localDate1.toDateTime(localTime2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType5.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime2.withFieldAdded(durationFieldType7, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField7.getMillis(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        boolean boolean5 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("2032-02-21T14:53:47.960Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate.Property property17 = localDate15.year();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate.Property property22 = localDate20.year();
        org.joda.time.Period period23 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate20);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer12, (org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        boolean boolean8 = durationField7.isSupported();
        boolean boolean9 = durationField7.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) durationField7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.UnsupportedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = durationField7.getDifference(0L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.Period period10 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        int int15 = localDate14.getDayOfYear();
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate14.toDateTime(localTime16, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfEra();
        int int22 = dateMidnight20.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = dateMidnight20.isSupported(dateTimeFieldType23);
        org.joda.time.DateMidnight.Property property25 = dateMidnight20.weekOfWeekyear();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        int int27 = property25.getMaximumShortTextLength(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = localDate2.toString("", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        boolean boolean9 = mutablePeriod3.equals((java.lang.Object) (byte) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 14, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((java.lang.Object) (byte) 1, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(2);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        mutableDateTime17.setZone(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.year();
        mutableDateTime17.setChronology(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime11, periodType14, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53641450 + "'", int5 == 53641450);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Seconds seconds16 = period11.toStandardSeconds();
        org.joda.time.Period period18 = period11.plusYears(0);
        org.joda.time.Period period20 = period11.withHours(53617440);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay8.withPeriodAdded((org.joda.time.ReadablePeriod) period20, (-53617748));
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay8, readablePartial23, periodType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLanguage("53617440-02-21T14:54:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 53617440-02-21T14:54:00.000Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withDayOfMonth(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateMidnight8.toString("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.years();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 53629078, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology7.getDateTimeMillis(342, 70, 100, 53637942);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withCenturyOfEra(2022);
        int int8 = dateMidnight2.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = dateMidnight2.withMonthOfYear(53620134);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620134 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withTime(23, 53618165, 8, 53640490);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618165 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53642250 + "'", int5 == 53642250);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder15 = builder12.setWeekDefinition(2057, 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.lang.String str10 = property8.getAsShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = property8.addNoWrapToCopy(53634467);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "54" + "'", str10, "54");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        boolean boolean8 = durationField7.isSupported();
        boolean boolean9 = durationField7.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.getMillis(1692308073081600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.copy();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        mutableDateTime7.setZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(53617649, 53619079, 11, 4, 53621101, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53621101 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfEra();
        org.joda.time.DateTime dateTime15 = dateTime6.toDateTime(chronology13);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfDay();
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property16.setCopy("millisOfSecond", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfSecond\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds(47);
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis(53634384);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        boolean boolean8 = durationField7.isSupported();
        boolean boolean9 = durationField7.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField7.subtract((long) 19, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        java.lang.String str9 = dateTimeZone8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(53633322, 3, 10, (int) 'u', 53617440, 53627306, 35, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+14:53:39.988" + "'", str9, "+14:53:39.988");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Date date5 = new java.util.Date(53627306, 2, 52, 53619079, 10);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = timeOfDay6.getFieldType(465);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 465");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Sat Feb 20 07:10:00 UTC 53635323");
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((java.lang.Object) chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale3);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.setWeekDate((-292275054), (int) (short) 100, 53628506);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53628506");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455243216,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=3,MILLISECOND=216,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology6.getDateTimeMillis(342, 53633322, 3, 999, 0, 53626518, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((-27422466L));
        org.joda.time.Instant instant4 = instant0.minus((long) 'x');
        java.lang.Class<?> wildcardClass5 = instant4.getClass();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("\u30a4\u30bf\u30ea\u30a2\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Interval interval11 = dateMidnight8.toInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime();
        int int13 = mutableDateTime12.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(35);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withWeekyear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Locale locale2 = new java.util.Locale("2022-02-21T14:53:49.549Z", "UTC");
        java.lang.Object obj3 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-21t14:53:49.549z_UTC");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "2022-02-21t14:53:49.549z_UTC");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "2022-02-21t14:53:49.549z_UTC");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "2022-02-21t14:53:49.549z_UTC");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) (byte) 0, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 100, 523, 53626727, 53619079);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.plusYears((int) ' ');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight8);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalTime localTime20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate18.toDateTime(localTime20, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = localDate18.toDateMidnight(dateTimeZone23);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.yearOfEra();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight24.toMutableDateTime(dateTimeZone27);
        boolean boolean29 = localDate14.equals((java.lang.Object) dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = localDate14.withYearOfCentury(842);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 842 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(53638166, 53643546, 53628506, (-1), (int) (byte) -1, 53639426, 0, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        java.util.Date date1 = dateTime0.toDate();
        int int2 = dateTime0.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:54:03 UTC 2022");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMinutes((int) (short) 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        mutableDateTime14.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, (int) (byte) 0);
        mutableDateTime14.add(durationFieldType19, 8);
        org.joda.time.LocalDate localDate25 = localDate7.withFieldAdded(durationFieldType19, 3);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 1, chronology27);
        int int29 = localDate28.getDayOfYear();
        org.joda.time.LocalTime localTime30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate28.toDateTime(localTime30, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = localDate28.toDateMidnight(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate28.withYear(53619770);
        int int37 = localDate7.compareTo((org.joda.time.ReadablePartial) localDate28);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = timeOfDay4.compareTo((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) (short) -1);
        org.joda.time.LocalTime localTime5 = localTime3.minusMillis(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime3.withMinuteOfHour(185);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 185 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withDayOfMonth(47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.add((long) 53620623);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDayOfYear(53620134);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620134 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4131L + "'", long6 == 4131L);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        mutableDateTime10.setZoneRetainFields(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) dateTime8, dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay16 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonthDay16.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay16.minusYears((int) 'u');
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((java.lang.Integer) 1);
        boolean boolean26 = dateTimeFormatter25.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = yearMonthDay19.toString(dateTimeFormatter25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(999, 53627306, 0, 1970, 53627214, 53640196, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property9.setCopy("14:53:45.116");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:53:45.116\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53644472 + "'", int5 == 53644472);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        calendar0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(53618165, 53634467);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455244683,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=4,MILLISECOND=683,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1), 70, 53644151, 53628444, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628444 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        mutableDateTime9.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, (int) (byte) 0);
        mutableDateTime9.add(durationFieldType14, 8);
        org.joda.time.LocalDate localDate20 = localDate2.withFieldAdded(durationFieldType14, 3);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTime(localTime25, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate23.toDateMidnight(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate23.withYear(53619770);
        int int32 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property33 = localDate23.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant34 = new org.joda.time.Instant((java.lang.Object) property33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.weekyear();
        java.lang.String str7 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusMinutes(53619708);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekOfWeekyear(53618165);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618165 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53644902 + "'", int5 == 53644902);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T14:54:04.902" + "'", str7, "2022-02-21T14:54:04.902");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        int int7 = dateTimeField6.getMaximumValue();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1439 + "'", int7 == 1439);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(53620972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620972 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addSeconds(53617440);
        org.joda.time.DateTime dateTime15 = dateTime4.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        java.lang.Class<?> wildcardClass16 = mutablePeriod10.getClass();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) mutableDateTime9, periodType10);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = mutableDateTime5.toString("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Years" + "'", str11, "Years");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) (short) -1);
        org.joda.time.LocalTime localTime5 = localTime3.minusMillis(2022);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime7 = timeOfDay6.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = timeOfDay6.getFieldType(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime5.withField(dateTimeFieldType9, 552);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 552 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        calendar0.set(53628444, 53629078, 904, 53634467, 53632);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Locale locale14 = locale13.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = calendar0.getDisplayName(2057, 53643303, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=53628444,MONTH=53629078,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=904,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=53634467,MINUTE=53632,SECOND=5,MILLISECOND=748,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = dateMidnight18.isSupported(dateTimeFieldType21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight18.weekOfWeekyear();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        int int25 = property23.getMaximumShortTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = dateTimeField7.set((long) 20, "", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime3 = property1.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime5 = property1.addWrapFieldToCopy(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localTime5.getField(53618195);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53618195");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addWrapFieldToCopy(15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay28 = property24.setCopy("Fri Jul 01 14:56:05 UTC 53619791");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Fri Jul 01 14:56:05 UTC 53619791\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getLeapDurationField();
        long long12 = dateTimeField9.roundCeiling((long) 53643546);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53646242 + "'", int5 == 53646242);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        long long6 = java.util.Date.UTC(656, 53646242, 409, 1, 100, 21);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 141094517856021000L + "'", long6 == 141094517856021000L);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.DateTime.Property property7 = dateTime4.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay26 = property24.setCopy(53620972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620972 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(552, 53632, 53636825, 598, (-292275054), 0, 53640641, 873, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.getName();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(periodType0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.addSeconds((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Years" + "'", str1, "Years");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration3, readableInstant4, periodType5);
        mutablePeriod6.addYears((int) (byte) 0);
        int int9 = mutablePeriod6.getMonths();
        mutablePeriod6.addMinutes((int) (byte) 0);
        int int12 = mutablePeriod6.getMinutes();
        org.joda.time.ReadableInterval readableInterval13 = null;
        mutablePeriod6.setPeriod(readableInterval13);
        org.joda.time.DateTime dateTime16 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod6, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) dateTime2, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) periodType6, dateTimeZone8);
        int int10 = localDateTime9.getDayOfMonth();
        int int11 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.millisOfSecond();
        int int13 = localDateTime9.getEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.era();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) periodType15, dateTimeZone17);
        int int19 = localDateTime18.getDayOfMonth();
        int int20 = localDateTime18.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.millisOfSecond();
        int int22 = localDateTime18.getEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.era();
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        int int26 = localDateTime18.get(dateTimeFieldType25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime9.property(dateTimeFieldType25);
        boolean boolean28 = localDateTime3.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDateTime.Property property29 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDateTime3.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53646947 + "'", int11 == 53646947);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 21 + "'", int19 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53646947 + "'", int20 == 53646947);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.year();
        mutableDateTime2.setChronology(chronology12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = timeOfDay0.getFieldType(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay0.getFieldType(53628444);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53628444");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        int int7 = date6.getHours();
        java.lang.Object obj8 = date6.clone();
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 14 + "'", int7 == 14);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Fri Jul 01 14:56:05 UTC 53619791");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(3, 409, 53640196, 53619770, (-292275054), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField10.set((long) 53620972, "en-CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en-CA\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addYears((int) (short) 100);
        java.lang.Object obj15 = mutablePeriod10.clone();
        mutablePeriod10.setSeconds(904);
        org.joda.time.LocalDate localDate18 = localDate5.minus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfEra();
        java.util.Locale locale24 = new java.util.Locale("hi!", "Years", "1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = property19.setCopy("", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!_YEARS_1970-01-01");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53628335, 53638166, 598, 53645766, 12, 53632562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53645766 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        int int4 = localDate3.getDayOfYear();
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate3.toDateTime(localTime5, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = localDate3.toDateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.yearOfEra();
        int int11 = dateMidnight9.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property12 = dateMidnight9.year();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.plusYears((int) ' ');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight9);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableDuration16, readableInstant17, periodType18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutablePeriod19.add(readableDuration20);
        mutablePeriod19.addMonths((int) '#');
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        int int27 = localDate26.getDayOfYear();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate26.toDateTime(localTime28, dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = localDate26.toDateMidnight(dateTimeZone31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfEra();
        int int34 = dateMidnight32.getMinuteOfHour();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 100, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime39.copy();
        org.joda.time.Duration duration41 = period37.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight32.plus((org.joda.time.ReadableDuration) duration41);
        mutablePeriod19.add((org.joda.time.ReadableDuration) duration41);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.years();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(periodType44);
        org.joda.time.PeriodType periodType47 = periodType44.withYearsRemoved();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableDuration) duration41, periodType47);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) (short) 1, chronology53);
        java.lang.String str55 = localDate54.toString();
        org.joda.time.LocalDate localDate57 = localDate54.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology58 = localDate57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.eras();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology58);
        org.joda.time.DateTimeField dateTimeField61 = chronology58.year();
        java.lang.String str62 = chronology58.toString();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 35, periodType47, chronology58);
        mutablePeriod63.setPeriod((long) 53626980);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod63.setPeriod(99, 53617440, 53639426, 0, 14, 53620972, 904, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Years" + "'", str45, "Years");
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01" + "'", str55, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ISOChronology[UTC]" + "'", str62, "ISOChronology[UTC]");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        int int17 = localDate16.getDayOfYear();
        org.joda.time.LocalDate.Property property18 = localDate16.weekOfWeekyear();
        org.joda.time.LocalDate localDate19 = property18.roundHalfEvenCopy();
        boolean boolean20 = localDate12.isAfter((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property21 = localDate12.yearOfEra();
        org.joda.time.LocalDate localDate23 = localDate12.plusMonths(342);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (org.joda.time.ReadablePartial) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53627306, 53640490);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455248028,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=8,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay8.withChronologyRetainFields(chronology18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableDuration22, readableInstant23, periodType24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutablePeriod25.add(readableDuration26);
        mutablePeriod25.addMonths((int) '#');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        int int33 = localDate32.getDayOfYear();
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate32.toDateTime(localTime34, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = localDate32.toDateMidnight(dateTimeZone37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfEra();
        int int40 = dateMidnight38.getMinuteOfHour();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 100, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.copy();
        org.joda.time.Duration duration47 = period43.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight38.plus((org.joda.time.ReadableDuration) duration47);
        mutablePeriod25.add((org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.years();
        java.lang.String str51 = periodType50.getName();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.PeriodType periodType53 = periodType50.withYearsRemoved();
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration47, periodType53);
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay8.withPeriodAdded((org.joda.time.ReadablePeriod) period54, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay8.withMonthOfYear(465);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 465 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Years" + "'", str51, "Years");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(yearMonthDay56);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period18 = period12.plusDays((int) (byte) 10);
        int int19 = period18.getHours();
        org.joda.time.Period period21 = period18.plusMonths(2);
        org.joda.time.Period period23 = period18.minusMonths(12);
        org.joda.time.Period period25 = period18.withYears(2057);
        int[] intArray27 = chronology7.get((org.joda.time.ReadablePeriod) period25, 259200000L);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = period25.getValue(53625266);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53625266");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 3, 0, 0, 0, 0]");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        java.util.Date date7 = new java.util.Date(5, 53620972, 0);
        calendar0.setTime(date7);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53619079, 53626727);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=141007485139200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=4470319,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Apr 30 00:00:00 UTC 4470319");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder10 = builder0.set(6, (int) (short) 0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        java.util.Date date12 = dateTime11.toDate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder10.setInstant(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 14:54:08 UTC 2022");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) (short) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        long long19 = dateTimeField17.remainder((long) (short) -1);
        int int20 = dateTimeField17.getMinimumValue();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology30);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDate32, locale33);
        java.util.Locale locale35 = locale33.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = property1.setCopy("2022-02-21T14:53:37.096Z", locale33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:37.096Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31535999999L + "'", long19 == 31535999999L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-292275054) + "'", int20 == (-292275054));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "100" + "'", str34, "100");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.yearOfEra();
        int int5 = property4.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property4.setCopy(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        java.util.Date date5 = mutableDateTime2.toDate();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean9 = localTime7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime11 = localTime7.withFields((org.joda.time.ReadablePartial) localTime10);
        java.lang.String str12 = localTime7.toString();
        boolean boolean13 = date5.equals((java.lang.Object) str12);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:54:08 UTC 2022");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "14:54:08.577" + "'", str12, "14:54:08.577");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration11, readableInstant12, periodType13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutablePeriod14.add(readableDuration15);
        mutablePeriod14.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration19, readableInstant20, periodType21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutablePeriod22.add(readableDuration23);
        mutablePeriod22.addMonths((int) '#');
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay10.plus((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableDuration29, readableInstant30, periodType31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutablePeriod32.add(readableDuration33);
        mutablePeriod32.addMonths((int) '#');
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime40 = dateTime37.withFieldAdded(durationFieldType38, (int) (byte) 0);
        boolean boolean41 = mutablePeriod32.isSupported(durationFieldType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay10.withFieldAdded(durationFieldType38, (-144832));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        long long5 = calendar0.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getMinimum(53643303);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53643303");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455248786,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=8,MILLISECOND=786,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645455248786L + "'", long5 == 1645455248786L);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property19 = localDate15.weekOfWeekyear();
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone22 = dateMidnight21.getZone();
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime25 = dateTime20.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate12.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfSecond();
        org.joda.time.DateTime dateTime28 = property27.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTimeFormatter5.print((org.joda.time.ReadableInstant) dateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayCountry();
        org.joda.time.Instant instant3 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) locale0, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration15, readableInstant16, periodType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutablePeriod18.add(readableDuration19);
        mutablePeriod18.addMonths((int) '#');
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableDuration24, readableInstant25, periodType26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutablePeriod27.add(readableDuration28);
        mutablePeriod27.addMonths((int) '#');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        int int35 = localDate34.getDayOfYear();
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate34.toDateTime(localTime36, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = localDate34.toDateMidnight(dateTimeZone39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.yearOfEra();
        int int42 = dateMidnight40.getMinuteOfHour();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (byte) 100, chronology44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime47.copy();
        org.joda.time.Duration duration49 = period45.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight40.plus((org.joda.time.ReadableDuration) duration49);
        mutablePeriod27.add((org.joda.time.ReadableDuration) duration49);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration49);
        mutableDateTime5.add((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableDuration54, readableInstant55, periodType56);
        mutablePeriod57.addYears((int) (byte) 0);
        int int60 = mutablePeriod57.getMonths();
        mutablePeriod57.setWeeks(6);
        mutablePeriod57.setPeriod(873, 10, 53632583, 53627214, 2, 3, 19, 904);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.add((org.joda.time.ReadablePeriod) mutablePeriod57, 53620623);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 46810803879");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("UTC", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((int) (byte) 1, 53637942, 70, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637942 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        int int9 = period8.getHours();
        org.joda.time.Period period11 = period8.minusHours(5);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period8.withPeriodType(periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
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
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMaximumValue();
        int int10 = property8.get();
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property8.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = property8.setCopy("CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CA\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        long long14 = dateTimeField12.remainder((long) (short) -1);
        int int15 = dateTimeField12.getMinimumValue();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) 1, chronology23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.plusMonths(53617719);
        int int27 = yearMonthDay24.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay24.plusDays(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        java.lang.String str35 = localDate34.toString();
        org.joda.time.LocalDate localDate37 = localDate34.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfEra();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType31.getField(chronology38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 100, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.copy();
        org.joda.time.Duration duration47 = period43.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.Period period49 = period43.plusDays((int) (byte) 10);
        int int50 = period49.getHours();
        org.joda.time.Period period52 = period49.plusMonths(2);
        org.joda.time.Period period54 = period49.minusMonths(12);
        org.joda.time.Period period56 = period49.withYears(2057);
        int[] intArray58 = chronology38.get((org.joda.time.ReadablePeriod) period56, 259200000L);
        java.util.Locale locale62 = new java.util.Locale("", "hi!");
        java.util.Locale locale63 = java.util.Locale.ITALY;
        java.lang.String str64 = locale63.getDisplayLanguage();
        java.lang.String str65 = locale62.getDisplayCountry(locale63);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray66 = dateTimeField12.set((org.joda.time.ReadablePartial) yearMonthDay24, 14, intArray58, "53617440-02-21T14:54:00.000Z", locale62);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"53617440-02-21T14:54:00.000Z\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31535999999L + "'", long14 == 31535999999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-292275054) + "'", int15 == (-292275054));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals(locale62.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str64, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "HI!" + "'", str65, "HI!");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime5.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.plusYears((int) ' ');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight8);
        int int15 = localDate14.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtStartOfDay(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate14.withDayOfMonth(47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableDuration2, readableInstant3, periodType4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutablePeriod5.add(readableDuration6);
        mutablePeriod5.addSeconds(53617440);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.year();
        mutablePeriod5.setPeriod((long) 53618333, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(999, 96, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder10 = builder0.set(6, (int) (short) 0);
        java.util.TimeZone timeZone11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder0.setTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(662, 53619079, 53642637, 53626518, 53636547, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626518 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate.Property property14 = localDate12.year();
        org.joda.time.Period period15 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Days days16 = period15.toStandardDays();
        org.joda.time.LocalDate localDate17 = localDate2.minus((org.joda.time.ReadablePeriod) days16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate17.withYearOfCentury(53627214);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627214 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant7 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        mutableDateTime20.add(durationFieldType21, (int) (byte) 0);
        int int24 = periodType18.indexOf(durationFieldType21);
        mutableDateTime2.add(durationFieldType21, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundCeiling();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 1, chronology36);
        java.lang.String str38 = localDate37.toString();
        org.joda.time.LocalDate localDate40 = localDate37.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property41 = localDate37.weekOfWeekyear();
        org.joda.time.DateTime dateTime42 = localDate37.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone44 = dateMidnight43.getZone();
        boolean boolean46 = dateTimeZone44.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime47 = dateTime42.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = localDate34.toDateTimeAtStartOfDay(dateTimeZone44);
        mutableDateTime28.setZoneRetainFields(dateTimeZone44);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime28.setSecondOfDay(53629078);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53629078 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.subtract((long) 736, 736);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("14:53:45.116");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(35);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withWeekyear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime3.getFieldType(53626980);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53626980");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDayOfMonth(53620972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620972 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53650399 + "'", int5 == 53650399);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime12 = dateTime9.minusMonths(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime9.withSecondOfMinute(53625645);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625645 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(465);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(53625309);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625309 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromDateFields(date6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date6);
        int int9 = date6.getYear();
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53617891 + "'", int9 == 53617891);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addMonths((int) '#');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTime(localTime19, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate17.toDateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        int int25 = dateMidnight23.getMinuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration32);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration32);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod3.copy();
        org.joda.time.PeriodType periodType37 = mutablePeriod36.getPeriodType();
        mutablePeriod36.addSeconds(773);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType41 = mutablePeriod36.getFieldType(9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfWeek();
        int int8 = property7.get();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 1, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) property7, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(53617649, (int) (byte) 100, 53639426, 22, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
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
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("14:53:45.116");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14:53:45.116\" is malformed at \":53:45.116\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("T14:54:10.579", "1980-01-01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: T14:54:10.579 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.Instant instant7 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (short) 100, 53645, 53626518, 0, 5, 842, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 842 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean3 = localTime1.isSupported(dateTimeFieldType2);
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType2.getDurationType();
        boolean boolean5 = localTime0.isSupported(dateTimeFieldType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) 1, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType6.getField(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime0.withField(dateTimeFieldType6, 904);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.Weeks weeks18 = period17.toStandardWeeks();
        int int19 = period17.getHours();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        mutableDateTime20.add(durationFieldType21, (int) (byte) 0);
        int int24 = periodType18.indexOf(durationFieldType21);
        mutableDateTime2.add(durationFieldType21, 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        int int5 = calendar0.getWeekYear();
        calendar0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar0.getLeastMaximum(53642062);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53642062");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:54:11 UTC 2022");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        date4.setYear(736);
        int int7 = date4.getHours();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455252038,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=38,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sun Feb 21 14:54:12 UTC 2636");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 14 + "'", int7 == 14);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.getName();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) periodType3, dateTimeZone5);
        int int7 = localDateTime6.getDayOfMonth();
        int int8 = localDateTime6.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.millisOfSecond();
        int int10 = localDateTime6.getEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.era();
        boolean boolean12 = periodType0.equals((java.lang.Object) property11);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Years" + "'", str1, "Years");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53652083 + "'", int8 == 53652083);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        boolean boolean5 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("Jan 1, 1970 2:53:37 PM", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-21T14:53:56.547");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:53:56.547\" is malformed at \"T14:53:56.547\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-292275054), 718, 53632583, 792);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime2.getRoundingField();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNull(dateTimeField6);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.yearOfEra();
        int int5 = property4.getLeapAmount();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) property4, periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra(53617440);
        org.joda.time.DateTime dateTime14 = dateTime10.plusMinutes(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.withHourOfDay(53652083);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53652083 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalDate.Property property11 = localDate9.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property11.roundHalfEvenCopy();
        boolean boolean13 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property14 = localDate5.yearOfEra();
        java.util.Locale locale19 = new java.util.Locale("hi!", "Years", "1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property14.setCopy("DateTimeField[dayOfMonth]", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[dayOfMonth]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_YEARS_1970-01-01");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) periodType9, dateTimeZone11);
        int int13 = localDateTime12.getDayOfMonth();
        int int14 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        int int16 = localDateTime12.getEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = localDateTime12.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime3.property(dateTimeFieldType19);
        java.lang.String str22 = property21.getName();
        org.joda.time.LocalDateTime localDateTime23 = property21.withMinimumValue();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        int int27 = localDate26.getDayOfYear();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate26.toDateTime(localTime28, dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = localDate26.toDateMidnight(dateTimeZone31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfEra();
        int int34 = dateMidnight32.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property35 = dateMidnight32.year();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.plusYears((int) ' ');
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight32);
        org.joda.time.LocalDate.Property property39 = localDate38.dayOfYear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 1, chronology41);
        int int43 = localDate42.getDayOfYear();
        org.joda.time.LocalTime localTime44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate42.toDateTime(localTime44, dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = localDate42.toDateMidnight(dateTimeZone47);
        org.joda.time.DateMidnight.Property property49 = dateMidnight48.yearOfEra();
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone51 = dateMidnight50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = dateMidnight48.toMutableDateTime(dateTimeZone51);
        boolean boolean53 = localDate38.equals((java.lang.Object) dateTimeZone51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((java.lang.Object) localDateTime23, dateTimeZone51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53652659 + "'", int5 == 53652659);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53652659 + "'", int14 == 53652659);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyear" + "'", str22, "weekyear");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 53642062, 533L, chronology2);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusMonths(339);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53652735 + "'", int5 == 53652735);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) -1, 53, 53636547);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withYearOfEra((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        mutablePeriod3.setPeriod((long) 53617649, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod3.getFieldType(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate6 = property4.roundHalfCeilingCopy();
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate9 = property4.addToCopy(53);
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str13 = locale11.getExtension('a');
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayLanguage(locale15);
        java.lang.String str18 = locale11.getDisplayLanguage(locale15);
        java.util.Locale.setDefault(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property4.setCopy("1969", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str17, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u8a9e" + "'", str18, "\u82f1\u8a9e");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(457, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455252952,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=952,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType2, chronology3);
        java.lang.String str5 = mutablePeriod4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.001S" + "'", str5, "PT0.001S");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        long long6 = property4.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property4.setCopy("Years");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Years\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 259200000L + "'", long6 == 259200000L);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        calendar9.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        int int17 = localDate16.getDayOfYear();
        org.joda.time.LocalTime localTime18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTime(localTime18, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = localDate16.toDateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.yearOfEra();
        int int24 = dateMidnight22.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property25 = dateMidnight22.year();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        long long28 = dateTimeField26.remainder((long) (short) -1);
        int int29 = dateTimeField26.getMinimumValue();
        java.util.Date date36 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        org.joda.time.YearMonthDay yearMonthDay37 = org.joda.time.YearMonthDay.fromDateFields(date36);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 100, chronology40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime43.copy();
        org.joda.time.Duration duration45 = period41.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime44);
        int int46 = period41.size();
        org.joda.time.Period period48 = period41.plusHours(53619079);
        org.joda.time.Period period50 = period41.plusWeeks(773);
        int[] intArray51 = period41.getValues();
        int int52 = dateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) localDate38, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray54 = dateTimeField8.add((org.joda.time.ReadablePartial) localDateTime12, 53626705, intArray51, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53626705");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455253107,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=107,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 31535999999L + "'", long28 == 31535999999L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-292275054) + "'", int29 == (-292275054));
        org.junit.Assert.assertEquals(date36.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 292278993 + "'", int52 == 292278993);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeField9.getAsShortText(53643405, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53643405");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53653312 + "'", int5 == 53653312);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime4 = localTime2.minusHours(1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableDuration5, readableInstant6, periodType7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutablePeriod8.add(readableDuration9);
        mutablePeriod8.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableDuration13, readableInstant14, periodType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutablePeriod16.add(readableDuration17);
        mutablePeriod16.addMonths((int) '#');
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        mutablePeriod16.add((-1L));
        org.joda.time.LocalTime localTime24 = localTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.LocalTime.Property property25 = localTime2.secondOfMinute();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime27.copy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        mutableDateTime28.setZone(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.minuteOfDay();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime35 = dateTime32.withFieldAdded(durationFieldType33, (int) (byte) 0);
        mutableDateTime28.add(durationFieldType33, 8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = localTime2.withFieldAdded(durationFieldType33, 53648497);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(53633398, 53625266, 53, (int) 'u', 2057, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withEra(53618165);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618165 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(409);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime3.withSecondOfMinute(53632562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53632562 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        int int3 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        mutableDateTime2.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj0, dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute(53618195);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 888 + "'", int3 == 888);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(53629078, 53636547, 2, 53618333);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53629078 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.util.Locale locale10 = null;
        int int11 = dateTimeField9.getMaximumShortTextLength(locale10);
        long long13 = dateTimeField9.roundCeiling(10L);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        int int15 = dateTimeField9.getMaximumTextLength(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale14.getUnicodeLocaleType("8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60000L + "'", long13 == 60000L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.LocalDate localDate8 = localDate2.withWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate11 = localDate2.withField(dateTimeFieldType9, 53628506);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate11.getValue(53619079);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53619079");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        boolean boolean9 = mutablePeriod3.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass10 = mutablePeriod3.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.weekyear();
        java.lang.String str7 = localDateTime3.toString();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        mutablePeriod16.add(53617440, (int) (byte) 100, 2, 53618333, (int) 'x', 20, 53618165, 22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime3.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, 53649947);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2876572760625733");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53654458 + "'", int5 == 53654458);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T14:54:14.458" + "'", str7, "2022-02-21T14:54:14.458");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.monthOfYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.withYear((int) '4');
        int int9 = dateMidnight8.getMonthOfYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMinimumValue();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType12, chronology13);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay9.minus((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        java.lang.String str24 = durationField23.toString();
        java.lang.String str25 = durationField23.toString();
        org.joda.time.DurationFieldType durationFieldType26 = durationField23.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay28 = timeOfDay9.withFieldAdded(durationFieldType26, 53646596);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UnsupportedDurationField[eras]" + "'", str24, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UnsupportedDurationField[eras]" + "'", str25, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertNotNull(durationFieldType26);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        java.util.Calendar.Builder builder16 = builder12.setDate(4, 70, 53);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) 4, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = yearMonthDay10.getFieldType((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) mutableDateTime0, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.MutableDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str11 = locale9.getExtension('a');
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale3, locale4, locale5, locale6, locale7, locale8, locale9, locale12 };
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.List<java.util.Locale> localeList16 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        int int26 = localDate25.getDayOfYear();
        org.joda.time.LocalTime localTime27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate25.toDateTime(localTime27, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = localDate25.toDateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfEra();
        int int33 = dateMidnight31.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property34 = dateMidnight31.year();
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.lang.String str36 = property34.getAsText(locale35);
        java.util.Locale locale37 = java.util.Locale.JAPANESE;
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale17, locale18, locale19, locale20, locale21, locale22, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap44);
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream48 = strSet47.parallelStream();
        java.util.Spliterator<java.lang.String> strSpliterator49 = strSet47.spliterator();
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList45, (java.util.Collection<java.lang.String>) strSet47, filteringMode50);
        java.util.stream.Stream<java.lang.String> strStream52 = strList51.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localeList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970" + "'", str36, "1970");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strStream48);
        org.junit.Assert.assertNotNull(strSpliterator49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strStream52);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addToCopy(53629078);
        org.joda.time.tz.NameProvider nameProvider28 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale31 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str35 = nameProvider28.getShortName(locale31, "1980-01-01", "2022-02-21T14:53:49.549Z");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay36 = property24.setCopy("1970", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(nameProvider28);
        org.junit.Assert.assertEquals(locale31.toString(), "utc_2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        java.util.Date date1 = dateTime0.toDate();
        date1.setDate(902);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Sun Jul 21 14:54:15 UTC 2024");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        int int9 = mutableDateTime8.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDayOfYear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.lang.Appendable appendable12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutablePeriod23.add(readableDuration24);
        mutablePeriod23.addYears((int) (short) 100);
        java.lang.Object obj28 = mutablePeriod23.clone();
        mutablePeriod23.setSeconds(904);
        org.joda.time.LocalDate localDate31 = localDate18.minus((org.joda.time.ReadablePeriod) mutablePeriod23);
        int int32 = localDate18.getYearOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.copy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        mutableDateTime35.setZone(dateTimeZone36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.minuteOfDay();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime42 = dateTime39.withFieldAdded(durationFieldType40, (int) (byte) 0);
        mutableDateTime35.add(durationFieldType40, 8);
        boolean boolean45 = localDate18.isSupported(durationFieldType40);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable12, (org.joda.time.ReadablePartial) localDate18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        java.util.Date date7 = new java.util.Date(5, 53620972, 0);
        calendar0.setTime(date7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar0.getGreatestMinimum(53643405);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53643405");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=141007485139200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=4470319,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Apr 30 00:00:00 UTC 4470319");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.getName();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) periodType5, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(465);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.dayOfYear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        int int17 = mutableDateTime16.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        mutableDateTime16.setZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj14, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime10, dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) periodType3, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Years" + "'", str1, "Years");
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 963 + "'", int17 == 963);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        mutableDateTime20.add(durationFieldType21, (int) (byte) 0);
        int int24 = periodType18.indexOf(durationFieldType21);
        mutableDateTime2.add(durationFieldType21, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.yearOfEra();
        mutableDateTime2.addMillis(53629078);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 342, 47541L, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period3.getValue(792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 792");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-21T14:54:12.589");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.secondOfMinute();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        int int14 = localDate13.getDayOfYear();
        int int15 = localDate13.getCenturyOfEra();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDate13, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.yearOfEra();
        int int5 = property4.getLeapAmount();
        org.joda.time.DateTime dateTime6 = property4.withMinimumValue();
        java.lang.String str7 = property4.getAsText();
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022" + "'", str7, "2022");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        org.joda.time.Interval interval21 = dateMidnight18.toInterval();
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight18.toMutableDateTime();
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        mutableDateTime22.addWeeks(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        int int6 = timeOfDay0.getMillisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 710 + "'", int6 == 710);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay8.plusDays(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = yearMonthDay13.getFieldType(53619988);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53619988");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.copy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        mutableDateTime7.setZone(dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        mutableDateTime7.setChronology(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(53627306, 53628506, 53640641, 409, (-292275054), chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 409 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant11 = org.joda.time.Instant.parse("53619791-07-01", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(1439, 19, 2022, 32769, 32769, 53645766);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType0.getFieldType(53636547);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53636547");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime3 = property1.roundFloorCopy();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.yearOfEra();
        int int14 = dateMidnight12.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property15 = dateMidnight12.year();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.plusYears((int) ' ');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight12);
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime3, (org.joda.time.ReadablePartial) localDate18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter6.parseLocalTime("2022-02-21T14:53:37.096Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        mutableDateTime9.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, (int) (byte) 0);
        mutableDateTime9.add(durationFieldType14, 8);
        org.joda.time.LocalDate localDate20 = localDate2.withFieldAdded(durationFieldType14, 3);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTime(localTime25, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate23.toDateMidnight(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate23.withYear(53619770);
        int int32 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property39 = localDate35.weekOfWeekyear();
        org.joda.time.DateTime dateTime40 = localDate35.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime45 = dateTime40.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime47 = localDate2.toDateTimeAtMidnight(dateTimeZone42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate49 = localDate2.withWeekOfWeekyear(53635576);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635576 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        int int3 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        mutableDateTime2.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight0.withZoneRetainFields(dateTimeZone5);
        long long11 = dateTimeZone5.previousTransition(9223372036854775807L);
        org.junit.Assert.assertNotNull(dateMidnight0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 982 + "'", int3 == 982);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.util.Locale locale10 = null;
        int int11 = dateTimeField9.getMaximumShortTextLength(locale10);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str15 = dateTimeField9.getAsShortText((long) 792);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) property1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        java.lang.String str9 = durationField7.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 1, chronology17);
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        int int20 = durationField7.compareTo(durationField19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = durationField7.getValue((long) 53644667);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[eras]" + "'", str9, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        long long6 = java.util.Date.UTC(53656199, 8, 10, 53625645, 53646, (int) '4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1693416964734412000L + "'", long6 == 1693416964734412000L);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(465);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime7.getField(53619708);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53619708");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = property8.set("ko-KR");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ko-KR\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 355 + "'", int2 == 355);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property1.addNoWrapToCopy(2057);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.plusWeeks(773);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean9 = localTime7.isSupported(dateTimeFieldType8);
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType8.getDurationType();
        boolean boolean11 = localTime6.isSupported(dateTimeFieldType8);
        org.joda.time.LocalTime localTime13 = localTime6.plusHours(53620972);
        org.joda.time.LocalTime localTime15 = localTime6.plusMinutes((int) (short) -1);
        int int16 = localTime6.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDate2.isBefore((org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53658485 + "'", int16 == 53658485);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(2057, 10297, (int) 'u', chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10297 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime2.setZone(dateTimeZone4);
        mutableDateTime2.addYears(10);
        java.lang.String str9 = mutableDateTime2.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMillisOfSecond(53618195);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2032-02-21T14:54:18.528Z" + "'", str9, "2032-02-21T14:54:18.528Z");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.year();
        long long11 = dateTimeField8.getDifferenceAsLong((long) 53620972, (long) ' ');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate.Property property16 = localDate14.year();
        int int17 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate14);
        int int18 = dateTimeField8.getMaximumValue();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(periodType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) periodType19, dateTimeZone21);
        int int23 = localDateTime22.getDayOfMonth();
        int int24 = localDateTime22.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusMonths(339);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.plusSeconds(53633398);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime22.withYear(53620134);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis((-27422466L));
        org.joda.time.Chronology chronology36 = instant33.getChronology();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (short) 1, chronology39);
        int int41 = localDate40.getDayOfYear();
        org.joda.time.LocalDate localDate43 = localDate40.minusYears(53627214);
        int[] intArray45 = chronology36.get((org.joda.time.ReadablePartial) localDate43, (long) 342);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localDateTime22, 53643405, intArray45, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53643405");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-292275054) + "'", int17 == (-292275054));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292278993 + "'", int18 == 292278993);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 21 + "'", int23 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53658729 + "'", int24 == 53658729);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1970, 1, 1]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration11, readableInstant12, periodType13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutablePeriod14.add(readableDuration15);
        mutablePeriod14.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration19, readableInstant20, periodType21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutablePeriod22.add(readableDuration23);
        mutablePeriod22.addMonths((int) '#');
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay10.plus((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTime(timeOfDay29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        int int34 = localDate33.getDayOfYear();
        org.joda.time.LocalTime localTime35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate33.toDateTime(localTime35, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = localDate33.toDateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfEra();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = dateMidnight39.toMutableDateTime(dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight44 = yearMonthDay28.toDateMidnight(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(100L);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean49 = localTime47.isSupported(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType48.getDurationType();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.property(dateTimeFieldType48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property52 = yearMonthDay28.property(dateTimeFieldType48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.weekyear();
        int int7 = property6.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime9 = property6.setCopy(53619079);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property6.setCopy("UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53659070 + "'", int5 == 53659070);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-292275054) + "'", int7 == (-292275054));
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(22, 34, 53643546);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(100L);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getDurationType();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.property(dateTimeFieldType3);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(56, 53626727, (int) '4', 53656631, 305, 21, 902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53656631 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromDateFields(date6);
        date6.setHours(53643546);
        int int10 = date6.getDay();
        org.junit.Assert.assertEquals(date6.toString(), "Wed Feb 15 18:56:05 UTC 53625911");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable6, (long) 53646133);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime4 = localTime2.minusHours(1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableDuration5, readableInstant6, periodType7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutablePeriod8.add(readableDuration9);
        mutablePeriod8.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableDuration13, readableInstant14, periodType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutablePeriod16.add(readableDuration17);
        mutablePeriod16.addMonths((int) '#');
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        mutablePeriod16.add((-1L));
        org.joda.time.LocalTime localTime24 = localTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.LocalTime.Property property25 = localTime2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType27 = localTime2.getFieldType(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((-27422466L));
        org.joda.time.Chronology chronology10 = instant7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(53649515, 53646133, 100, 53619708, 53648497, 53628444, 52, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619708 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        int int11 = mutablePeriod10.getMinutes();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        mutablePeriod10.setPeriod((long) 53617649, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(53656199, 2022, 53629402, 894, 4, 53637942, 23, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.minusHours(1);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration11, readableInstant12, periodType13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutablePeriod14.add(readableDuration15);
        mutablePeriod14.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration19, readableInstant20, periodType21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutablePeriod22.add(readableDuration23);
        mutablePeriod22.addMonths((int) '#');
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        mutablePeriod22.add((-1L));
        org.joda.time.LocalTime localTime30 = localTime8.minus((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.LocalTime.Property property31 = localTime8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withPivotYear(53632583);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant14 = org.joda.time.Instant.parse("Jan 1, 1970 2:53:37 PM", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder11 = builder0.setWeekDate(47, 53627214, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder11.setCalendarType("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: IT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.parse("DateTimeField[weekOfWeekyear]", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        java.util.Date date7 = new java.util.Date(5, 53620972, 0);
        calendar0.setTime(date7);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53626705, 10297);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=141007485139200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=4470319,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Apr 30 00:00:00 UTC 4470319");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        java.lang.String str10 = mutableDateTime9.toString();
        mutableDateTime9.addMinutes(16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T14:54:19.924Z" + "'", str10, "2022-02-21T14:54:19.924Z");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder4.set(842, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IT" + "'", str6, "IT");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        mutableDateTime15.setZone(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.minuteOfDay();
        int int19 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.copy();
        mutableDateTime21.addMinutes(0);
        java.lang.String str25 = mutableDateTime21.toString();
        int int26 = mutableDateTime21.getYearOfEra();
        org.joda.time.Chronology chronology27 = mutableDateTime21.getChronology();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(chronology27);
        mutableDateTime15.setChronology(chronology27);
        java.lang.Object obj30 = mutableDateTime15.clone();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (org.joda.time.ReadableInstant) mutableDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022-02-21T14:54:20.047Z" + "'", str25, "2022-02-21T14:54:20.047Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(obj30);
// flaky:         org.junit.Assert.assertEquals(obj30.toString(), "2022-02-21T14:54:20.047Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "2022-02-21T14:54:20.047Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "2022-02-21T14:54:20.047Z");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addWrapFieldToCopy(15);
        org.joda.time.YearMonthDay yearMonthDay28 = property24.addWrapFieldToCopy(53626980);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay30 = property24.setCopy(53649612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649612 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }
}
