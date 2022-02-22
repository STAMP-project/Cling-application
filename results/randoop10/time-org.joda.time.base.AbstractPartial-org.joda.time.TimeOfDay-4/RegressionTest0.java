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
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Seconds seconds7 = period2.toStandardSeconds();
        int int8 = period2.getHours();
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 0, 26061444, (int) (short) 1, (int) (short) 1, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26061444 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(22, 0, 894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
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
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26062283 + "'", int5 == 26062283);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(26061444, (int) (short) 10, (int) (byte) 10, (int) (byte) 10, 26061790, 894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26061790 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(26062445, (int) (short) -1, 26061238);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062445 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26063096 + "'", int5 == 26063096);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) ' ', 2, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26063416 + "'", int5 == 26063416);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26063911 + "'", int7 == 26063911);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
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
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(22);
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
            mutableDateTime1.setRounding(dateTimeField19, 26061397);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 26061397");
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26064839 + "'", int5 == 26064839);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26064839 + "'", int14 == 26064839);
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
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26064864 + "'", int9 == 26064864);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setWeekOfWeekyear(26061764);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26061764 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 885 + "'", int2 == 885);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
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
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.add((long) 894, (-1));
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(2022, (int) 'a', (int) (byte) 10, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
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
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy(26061444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26061444 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26065712 + "'", int5 == 26065712);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
        int int10 = localDateTime3.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withDayOfMonth(26061764);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26061764 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26065929 + "'", int5 == 26065929);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime0.withFieldAdded(durationFieldType4, 26065744);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
        java.util.Locale locale15 = new java.util.Locale("hi!", "Years", "1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField9.set(1L, "1970", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26066018 + "'", int5 == 26066018);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!_YEARS_1970-01-01");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addSeconds(26061238);
        mutablePeriod3.addMillis((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) mutablePeriod3, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setTime((int) (short) 100, 26061444, 26063188, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 278 + "'", int2 == 278);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
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
        int int16 = localDate15.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-22T07:14:21.444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-22T07:14:21.444' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology12.getDateTimeMillis((int) (byte) 0, (int) 'x', 666, (int) (short) 1, (int) (short) -1, (int) 'a', 26061444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = property5.set("en-CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en-CA\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfWeek(8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 0, 26061764, (int) (byte) 1, 26064003, (int) (short) 100, (int) '#', 666);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26064003 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
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
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        int int9 = period8.getHours();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        mutableDateTime12.setZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) period8, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.add((long) 7, 26064394);
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
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        long long6 = java.util.Date.UTC(26061790, 666, 32772, (int) (byte) 1, (int) (byte) 0, 26061238);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 822433055876038000L + "'", long6 == 822433055876038000L);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property5.setCopy("de-DE");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"de-DE\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate2.toString("UnsupportedDurationField[eras]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.add((long) 3, (-292275054));
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
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = durationField7.getValue((long) 8);
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
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
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
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withYearOfCentury(894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withWeekOfWeekyear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26068636 + "'", int5 == 26068636);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutablePeriod12.add(readableDuration13);
        mutablePeriod12.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration17, readableInstant18, periodType19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutablePeriod20.add(readableDuration21);
        mutablePeriod20.addMonths((int) '#');
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration26, readableInstant27, periodType28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutablePeriod29.add(readableDuration30);
        mutablePeriod29.addMonths((int) '#');
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 1, chronology35);
        int int37 = localDate36.getDayOfYear();
        org.joda.time.LocalTime localTime38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTime(localTime38, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = localDate36.toDateMidnight(dateTimeZone41);
        org.joda.time.DateMidnight.Property property43 = dateMidnight42.yearOfEra();
        int int44 = dateMidnight42.getMinuteOfHour();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 100, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime49.copy();
        org.joda.time.Duration duration51 = period47.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight42.plus((org.joda.time.ReadableDuration) duration51);
        mutablePeriod29.add((org.joda.time.ReadableDuration) duration51);
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration51);
        boolean boolean55 = period8.equals((java.lang.Object) mutablePeriod12);
        mutablePeriod12.setMinutes(26061790);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 1, chronology59);
        java.lang.String str61 = localDate60.toString();
        org.joda.time.LocalDate localDate63 = localDate60.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology64 = localDate63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.eras();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) 26061790, chronology64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970-01-01" + "'", str61, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
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
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology6.getDateTimeMillis((int) (short) 1, 0, 26061397, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(10, 26067972, 26063188, 26062367, (int) (byte) 10, 26067310, (-292275054), chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062367 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property1.addNoWrapToCopy(26066836);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withTime(292278993, (int) 'a', 3, 894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26069005 + "'", int5 == 26069005);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = localDate2.isAfter(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeOfDay1.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property5.setCopy("1970", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) ' ', 867, 26068787, 1970, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
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
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.dayOfYear();
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property12.setCopy("2022-02-22T07:14:26.152Z", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:14:26.152Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for millisOfSecond must be in the range [0,999]");
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
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfYear(26064394);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26064394 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(190, 100, 32772, 2022, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 190 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("PT0.100S", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property1.addNoWrapToCopy(26065744);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 10);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withMonthsRemoved();
        org.joda.time.Period period5 = period1.normalizedStandard(periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period5.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Years" + "'", str3, "Years");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 26061238, 3, 26061397);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder7.set(26063479, 26062923);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(26068833);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26070556 + "'", int5 == 26070556);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) periodType7, dateTimeZone9);
        int int11 = localDateTime10.getDayOfMonth();
        int int12 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.millisOfSecond();
        int int14 = localDateTime10.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26070616 + "'", int12 == 26070616);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Seconds seconds7 = period2.toStandardSeconds();
        org.joda.time.Period period9 = period2.plusYears(0);
        org.joda.time.Period period11 = period2.withHours(26061238);
        org.joda.time.PeriodType periodType12 = period2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((java.lang.Object) period2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withWeekOfWeekyear(26061444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26061444 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) 26061444);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT7H14M21.445S" + "'", str4, "PT7H14M21.445S");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime3.getValue(26061238);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26061238");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26070738 + "'", int5 == 26070738);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.weekOfWeekyear();
        int int7 = localDate2.getDayOfWeek();
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) 1, (long) (byte) 1, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, readablePartial8, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime(dateTimeZone11);
        mutableDateTime12.setDate((long) 26066836);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setDayOfWeek(26063026);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26063026 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime5.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withMillisOfDay((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime9.getValue(26066836);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26066836");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26070899 + "'", int5 == 26070899);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime6.toString("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
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
        org.joda.time.DateTime dateTime35 = dateTime6.minus((org.joda.time.ReadableDuration) duration32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime35.withDayOfWeek(22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime0.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
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
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 22, 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.minus((org.joda.time.ReadablePeriod) period17);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateMidnight18.toString("hours", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "IT" + "'", str21, "IT");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray13 = new int[] { 867, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = dateTimeField8.addWrapField(readablePartial9, (int) (byte) -1, intArray13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[867, 100]");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant3 = new org.joda.time.Instant((java.lang.Object) localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime2.setZone(dateTimeZone4);
        mutableDateTime2.addMonths(26062923);
        int int9 = mutableDateTime2.getMonthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFieldType0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property10.setCopy("fr", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fr\" for dayOfWeek is not supported");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Date date6 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int7 = date6.getSeconds();
        date6.setTime((long) (short) -1);
        java.util.Date date16 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int17 = date16.getSeconds();
        boolean boolean18 = date6.after(date16);
        date16.setHours(1970);
        int int21 = date16.getSeconds();
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 24 02:22:44 UTC 26063514");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
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
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime.Property property12 = localDateTime3.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) 'a');
        boolean boolean25 = dateTimeZone21.isStandardOffset((long) 26067310);
        org.joda.time.DateTime dateTime26 = localDateTime19.toDateTime(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) property12, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26071757 + "'", int5 == 26071757);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale10.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property8.setCopy("en-CA", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en-CA\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26071779 + "'", int5 == 26071779);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "de" + "'", str12, "de");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        java.lang.String str11 = chronology9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(26064394, 4, 26069295, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26064394 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ISOChronology[UTC]" + "'", str11, "ISOChronology[UTC]");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(26063479, 915, 26071);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 915 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property4.setCopy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.withMinimumValue();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property8.setCopy("Nov 3, 26063513 4:22:44 PM", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Nov 3, 26063513 4:22:44 PM\" for minuteOfDay is not supported");
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
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
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
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property9.setCopy("Italian", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Italian\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26072594 + "'", int5 == 26072594);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(26065744, 26072651, 26061238, (int) (byte) 100, 26071282);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.setCopy(19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26072747 + "'", int5 == 26072747);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = localTime8.isSupported(dateTimeFieldType9);
        int int11 = mutableDateTime7.get(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime6.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (short) 100, 292278993, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26073035 + "'", int5 == 26073035);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("fr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"fr\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(26066836, 219, 2022, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 219 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setDays(26067310);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime(dateTimeZone11);
        mutableDateTime12.setDate((long) 26066836);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = mutableDateTime12.toString("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        int int3 = timeOfDay1.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.withMillisOfSecond(26072320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26072320 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        int int5 = property4.getMinimumValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-292275054) + "'", int5 == (-292275054));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(26067332, (int) (short) 10, 26063188);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder6.set(894, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        boolean boolean9 = mutablePeriod3.equals((java.lang.Object) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) boolean9, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusMinutes(44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay3.getFieldType(26062445);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26062445");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.withMaximumValue();
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfMonth(8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate9.getValue(26066836);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26066836");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableDuration1, readableInstant2, periodType3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutablePeriod4.add(readableDuration5);
        mutablePeriod4.addMonths((int) '#');
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.millis();
        mutablePeriod4.add(durationFieldType9, 5);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property13 = localTime12.minuteOfHour();
        org.joda.time.LocalTime localTime15 = localTime12.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime12.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean20 = localTime18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = localTime18.withFields((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.Period period23 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime12, (org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period26 = period23.withField(durationFieldType24, (int) '#');
        java.lang.String str27 = durationFieldType24.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.copy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        mutableDateTime30.setZone(dateTimeZone31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        int int36 = localDate35.getDayOfYear();
        org.joda.time.LocalTime localTime37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate35.toDateTime(localTime37, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = localDate35.toDateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfEra();
        int int43 = dateMidnight41.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property44 = dateMidnight41.year();
        boolean boolean45 = mutableDateTime30.isBefore((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.months();
        mutableDateTime30.add(durationFieldType46, 26064003);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property50 = localTime49.minuteOfHour();
        org.joda.time.LocalTime localTime51 = property50.roundFloorCopy();
        org.joda.time.LocalTime localTime53 = localTime51.plusMinutes((-292275054));
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.years();
        boolean boolean55 = localTime53.isSupported(durationFieldType54);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray57 = new org.joda.time.DurationFieldType[] { durationFieldType0, durationFieldType9, durationFieldType24, durationFieldType46, durationFieldType54, durationFieldType56 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.forFields(durationFieldTypeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [months, hours]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hours" + "'", str27, "hours");
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertNotNull(durationFieldTypeArray57);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale7.getDisplayCountry(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDate4.toString("hours", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Corea del Sud" + "'", str10, "Corea del Sud");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfEven();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setDayOfMonth(26070203);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26070203 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Seconds seconds7 = period2.toStandardSeconds();
        org.joda.time.Period period9 = period2.plusYears(0);
        org.joda.time.Period period11 = period2.withHours(26061238);
        org.joda.time.PeriodType periodType12 = period2.getPeriodType();
        org.joda.time.Period period14 = period2.plusMonths(26067332);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        int int9 = mutableDateTime5.get(dateTimeFieldType7);
        boolean boolean10 = localTime3.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        long long15 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.LocalTime localTime17 = property12.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType7.getField(chronology18);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        org.joda.time.DateMidnight.Property property22 = dateMidnight20.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay23 = dateMidnight20.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = yearMonthDay23.getFieldTypes();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        java.lang.String str28 = localDate27.toString();
        org.joda.time.LocalDate localDate30 = localDate27.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.year();
        long long37 = chronology31.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay23.withChronologyRetainFields(chronology31);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 1, chronology41);
        java.lang.String str43 = localDate42.toString();
        org.joda.time.LocalDate localDate45 = localDate42.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        int[] intArray47 = localDate45.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray49 = dateTimeField19.addWrapField((org.joda.time.ReadablePartial) yearMonthDay23, 292278993, intArray47, 248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292278993");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-27424365L) + "'", long15 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1147058000L + "'", long37 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 1, 1]");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((java.lang.Object) locale0, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(894);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withYear(1011396959);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1011396959 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod9, 26062923);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 26062923, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
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
        int int10 = dateMidnight8.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime6.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Period period11 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period14 = period11.withField(durationFieldType12, (int) '#');
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.years();
        java.lang.String str16 = periodType15.getName();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.PeriodType periodType18 = periodType15.withYearsRemoved();
        org.joda.time.Period period19 = period11.normalizedStandard(periodType15);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period22 = period11.withFieldAdded(durationFieldType20, 867);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        org.joda.time.DateMidnight.Property property25 = dateMidnight23.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight23.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = yearMonthDay26.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval29 = yearMonthDay26.toInterval(dateTimeZone28);
        long long32 = dateTimeZone28.adjustOffset((long) 26063479, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 867, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Years" + "'", str16, "Years");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 26063479L + "'", long32 == 26063479L);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        boolean boolean11 = dateMidnight8.equals((java.lang.Object) 1L);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.minus((long) 26062923);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusYears(26068787);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withMonthOfYear(114);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 114 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((-1));
        int int16 = property8.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 100, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.copy();
        org.joda.time.Duration duration23 = period19.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.Weeks weeks24 = period19.toStandardWeeks();
        org.joda.time.DateTime dateTime26 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period19, 6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime26.withDayOfWeek(26062367);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062367 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1011396959 + "'", int16 == 1011396959);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutablePeriod12.add(readableDuration13);
        mutablePeriod12.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration17, readableInstant18, periodType19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutablePeriod20.add(readableDuration21);
        mutablePeriod20.addMonths((int) '#');
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration26, readableInstant27, periodType28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutablePeriod29.add(readableDuration30);
        mutablePeriod29.addMonths((int) '#');
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 1, chronology35);
        int int37 = localDate36.getDayOfYear();
        org.joda.time.LocalTime localTime38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTime(localTime38, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = localDate36.toDateMidnight(dateTimeZone41);
        org.joda.time.DateMidnight.Property property43 = dateMidnight42.yearOfEra();
        int int44 = dateMidnight42.getMinuteOfHour();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 100, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime49.copy();
        org.joda.time.Duration duration51 = period47.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight42.plus((org.joda.time.ReadableDuration) duration51);
        mutablePeriod29.add((org.joda.time.ReadableDuration) duration51);
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration51);
        boolean boolean55 = period8.equals((java.lang.Object) mutablePeriod12);
        mutablePeriod12.setMonths(26062367);
        mutablePeriod12.setHours(1970);
        int int60 = mutablePeriod12.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((java.lang.Object) mutablePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
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
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate localDate23 = localDate20.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight16.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration25, readableInstant26, periodType27);
        mutablePeriod28.setMillis(0);
        org.joda.time.LocalDate localDate31 = localDate23.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate.Property property33 = localDate23.property(dateTimeFieldType32);
        int[] intArray37 = new int[] { 26069970, 26071829 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField12.addWrapField((org.joda.time.ReadablePartial) localDate23, 434, intArray37, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 434");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[26069970, 26071829]");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
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
        java.lang.String str14 = property11.getAsShortText();
        org.joda.time.DateMidnight dateMidnight15 = property11.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField16.set(0L, "IT");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(44, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.DateMidnight.Property property9 = dateMidnight7.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay10 = dateMidnight7.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonthDay10.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval13 = yearMonthDay10.toInterval(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((int) (short) 0, (int) (byte) 0, (int) 'a', (int) (byte) 1, 573, 26061444, (int) 'a', dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 573 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        int int9 = mutableDateTime5.get(dateTimeFieldType7);
        boolean boolean10 = localTime3.isSupported(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 26066836);
        org.joda.time.LocalDateTime localDateTime10 = localDate0.toLocalDateTime(localTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime10.getFieldType(26066836);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26066836");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) 'a');
        boolean boolean12 = dateTimeZone8.isStandardOffset((long) 26067310);
        org.joda.time.DateTime dateTime13 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.plusMillis(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfMonth(26074772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26074772 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        gregorianCalendar2.setTimeZone(timeZone3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = gregorianCalendar2.getMinimum(573);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 573");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(687120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 687120000 for minuteOfHour must be in the range [0,59]");
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
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(0, 26073757, (int) 'a', chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26073757 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) periodType1, dateTimeZone3);
        int int5 = localDateTime4.getDayOfMonth();
        int int6 = localDateTime4.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.millisOfSecond();
        int int8 = localDateTime4.getEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.era();
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.dayOfMonth();
        int int11 = localDateTime4.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property12 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime4.millisOfDay();
        org.joda.time.Chronology chronology14 = localDateTime4.getChronology();
        boolean boolean15 = durationFieldType0.isSupported(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = durationField16.add((long) 26062445, (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26075814 + "'", int6 == 26075814);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.DateMidnight.Property property8 = dateMidnight6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = dateMidnight6.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = yearMonthDay9.getFieldTypes();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        long long23 = chronology17.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay9.withChronologyRetainFields(chronology17);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = yearMonthDay24.toDateTimeAtMidnight(dateTimeZone29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(26067332, 637, 53, (int) (byte) 1, 26071829, 26070054, dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26071829 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1147058000L + "'", long23 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        int int9 = mutableDateTime5.get(dateTimeFieldType7);
        boolean boolean10 = localTime3.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        long long15 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.LocalTime localTime17 = property12.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType7.getField(chronology18);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.minusYears(100);
        org.joda.time.DateTime dateTime23 = localDate22.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        java.lang.String str28 = localDate27.toString();
        org.joda.time.LocalDate localDate30 = localDate27.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        int[] intArray32 = localDate30.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = dateTimeField19.addWrapPartial((org.joda.time.ReadablePartial) localDate22, 26063026, intArray32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26063026");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-27424365L) + "'", long15 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 1, 1]");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        boolean boolean16 = dateMidnight13.equals((java.lang.Object) 1L);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.minus((long) 26062923);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.plusYears(26068787);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 822649814496000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDate0.toDateTime(readableInstant8);
        org.joda.time.LocalDate.Property property10 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property11 = localDate0.dayOfWeek();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.add((long) 'u', 190);
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
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
        org.joda.time.Period period21 = period16.toPeriod();
        org.joda.time.Period period23 = period21.minusWeeks(687120000);
        boolean boolean24 = locale12.equals((java.lang.Object) period23);
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property13 = localDate9.weekOfWeekyear();
        int int14 = localDate9.getDayOfWeek();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.centuries();
        boolean boolean16 = localDate9.isSupported(durationFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime6.withFieldAdded(durationFieldType15, 26069500);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2606950000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addYears((int) (short) 100);
        java.lang.Object obj8 = mutablePeriod3.clone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTime(localTime13, dateTimeZone14);
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
        org.joda.time.DateTime dateTime44 = dateTime15.minus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 1, chronology46);
        java.lang.String str48 = localDate47.toString();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.eras();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.year();
        long long57 = chronology51.add(0L, (long) 26069500, 44);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration41, chronology51);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean61 = localTime59.isSupported(dateTimeFieldType60);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime63 = localTime59.withFields((org.joda.time.ReadablePartial) localTime62);
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean67 = localTime65.isSupported(dateTimeFieldType66);
        int int68 = mutableDateTime64.get(dateTimeFieldType66);
        boolean boolean69 = localTime62.isSupported(dateTimeFieldType66);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property71 = localTime70.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone73 = dateMidnight72.getZone();
        long long74 = property71.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.LocalTime localTime76 = property71.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology77 = localTime76.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = dateTimeFieldType66.getField(chronology77);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight((java.lang.Object) duration41, chronology77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1147058000L + "'", long57 == 1147058000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2022 + "'", int68 == 2022);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTimeZone73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-27424365L) + "'", long74 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField78);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.DateMidnight.Property property21 = dateMidnight19.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay22 = dateMidnight19.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonthDay22.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight29 = yearMonthDay22.toDateMidnight(dateTimeZone25);
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePartial) yearMonthDay22, (long) 26069970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay22.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1970, 1, 1]");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.getValueAsLong((long) 2022, (long) 'x');
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
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        int int5 = localDate4.getDayOfYear();
        org.joda.time.LocalTime localTime6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate4.toDateTime(localTime6, dateTimeZone7);
        boolean boolean9 = strSet1.contains((java.lang.Object) dateTimeZone7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime14.minusMillis((-1));
        boolean boolean17 = strSet1.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = strSet1.add("IT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeZone0.getDisplayName(false, 26074772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 26074772");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.util.Locale locale3 = new java.util.Locale("de-DE", "en-CA", "UnsupportedDurationField[eras]");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod();
        boolean boolean5 = locale3.equals((java.lang.Object) mutablePeriod4);
        org.junit.Assert.assertEquals(locale3.toString(), "de-de_EN-CA_UnsupportedDurationField[eras]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
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
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateMidnight.Property property13 = dateMidnight11.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight11.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonthDay14.getFieldTypes();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        long long28 = chronology22.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay14.withChronologyRetainFields(chronology22);
        org.joda.time.YearMonthDay.Property property30 = yearMonthDay14.year();
        org.joda.time.YearMonthDay yearMonthDay31 = property30.getYearMonthDay();
        java.util.Locale locale33 = java.util.Locale.FRENCH;
        boolean boolean34 = locale33.hasExtensions();
        java.lang.String str35 = locale33.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) yearMonthDay31, 26064394, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26064394");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26076776 + "'", int5 == 26076776);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1147058000L + "'", long28 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fr" + "'", str35, "fr");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        mutableDateTime5.addMinutes(894);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        mutableDateTime8.setChronology(chronology16);
        org.joda.time.DurationField durationField18 = chronology16.millis();
        mutableDateTime5.setChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(26071829, 9, (int) ' ', 1, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26071829 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        timeZone4.setRawOffset(26067972);
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str10 = locale8.getExtension('a');
        java.lang.String str11 = timeZone4.getDisplayName(locale8);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Greenwich Mean Time" + "'", str11, "Greenwich Mean Time");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        java.lang.String str6 = periodType5.getName();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.PeriodType periodType8 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType5.withWeeksRemoved();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        long long14 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.LocalTime localTime16 = property11.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(2L, (long) 26067972, periodType5, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) int2, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Years" + "'", str6, "Years");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-27424365L) + "'", long14 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = timeZone4.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642" + "'", str7, "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.DateMidnight.Property property21 = dateMidnight19.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay22 = dateMidnight19.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonthDay22.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight29 = yearMonthDay22.toDateMidnight(dateTimeZone25);
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePartial) yearMonthDay22, (long) 26069970);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property33 = localTime32.minuteOfHour();
        org.joda.time.LocalTime localTime35 = localTime32.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localTime32.toDateTimeToday(dateTimeZone36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean40 = localTime38.isSupported(dateTimeFieldType39);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime42 = localTime38.withFields((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.Period period43 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime32, (org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period46 = period43.withField(durationFieldType44, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay22.withFieldAdded(durationFieldType44, 26072867);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
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
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime8 = dateTime5.withFieldAdded(durationFieldType6, (int) (byte) 0);
        mutableDateTime1.add(durationFieldType6, 4);
        int int11 = mutableDateTime1.getDayOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        int int16 = localDate15.getDayOfYear();
        org.joda.time.LocalTime localTime17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTime(localTime17, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate15.toDateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfEra();
        int int23 = dateMidnight21.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property24 = dateMidnight21.year();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.plusYears((int) ' ');
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight21.plusDays(26063479);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plusYears(190);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.years();
        java.lang.String str32 = periodType31.getName();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType31);
        org.joda.time.PeriodType periodType34 = periodType31.withYearsRemoved();
        org.joda.time.PeriodType periodType35 = periodType31.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableInstant) dateMidnight30, periodType35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.millis();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(periodType38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) periodType38, dateTimeZone40);
        int int42 = localDateTime41.getDayOfMonth();
        int int43 = localDateTime41.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.millisOfSecond();
        int int45 = localDateTime41.getEra();
        org.joda.time.LocalDateTime.Property property46 = localDateTime41.era();
        org.joda.time.LocalDateTime.Property property47 = localDateTime41.dayOfMonth();
        int int48 = localDateTime41.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property49 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime.Property property50 = localDateTime41.millisOfDay();
        org.joda.time.Chronology chronology51 = localDateTime41.getChronology();
        boolean boolean52 = durationFieldType37.isSupported(chronology51);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod36.add(durationFieldType37, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Years" + "'", str32, "Years");
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 22 + "'", int42 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 26077589 + "'", int43 == 26077589);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
        java.lang.String str14 = property11.getAsShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = property11.setCopy("fr");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fr\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDate14.getFieldType(190);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 190");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
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
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableDuration5, readableInstant6, periodType7);
        mutablePeriod8.addYears((int) (byte) 0);
        int int11 = mutablePeriod8.getMonths();
        mutablePeriod8.addMinutes((int) (byte) 0);
        mutablePeriod8.addMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfYear(26072651);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26072651 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        mutableDateTime8.setZone(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.getName(0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) 26067972, locale16);
        long long19 = dateTimeZone10.nextTransition((long) 2);
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth(666);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 666 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.ReadableInstant readableInstant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = property19.compareTo(readableInstant21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTime(localTime15, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = localDate13.toDateMidnight(dateTimeZone18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.yearOfEra();
        int int21 = dateMidnight19.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property22 = dateMidnight19.year();
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = property22.getAsText(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.lang.String str26 = locale23.getDisplayScript(locale25);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale23.getDisplayScript(locale27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight29 = property9.setCopy("DateTimeField[year]", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[year]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970" + "'", str24, "1970");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
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
        org.joda.time.Interval interval14 = dateMidnight13.toInterval();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusMonths(867);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withMillis((long) 139);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight13.withMillis((long) 26069958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.LocalTime localTime1 = timeOfDay0.toLocalTime();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = timeOfDay0.getFieldTypes();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
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
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime.Property property12 = localDateTime3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime3.withDayOfYear(26068787);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26068787 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26078302 + "'", int5 == 26078302);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(26069075);
        int int8 = dateTime7.getYear();
        boolean boolean10 = dateTime7.isBefore(0L);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26069075 + "'", int8 == 26069075);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.add(1645514070156L, 26062445);
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
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate7 = property5.addWrapFieldToCopy(26070054);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withEra(44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.era();
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate5.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        int int10 = localDate9.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate9.withEra(434);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 434 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        gregorianCalendar2.setTimeZone(timeZone3);
        int int5 = gregorianCalendar2.getMinimalDaysInFirstWeek();
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
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = property19.getAsText(locale20);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale20.getDisplayScript(locale22);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale20.getDisplayScript(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = gregorianCalendar2.getDisplayName(26061397, 608, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970" + "'", str21, "1970");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 22);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        gregorianCalendar4.setTimeZone(timeZone5);
        boolean boolean7 = localTime1.equals((java.lang.Object) gregorianCalendar4);
        java.util.Date date14 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int15 = date14.getSeconds();
        date14.setTime((long) (short) -1);
        java.util.Date date24 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int25 = date24.getSeconds();
        boolean boolean26 = date14.after(date24);
        gregorianCalendar4.setTime(date14);
        java.time.Instant instant28 = gregorianCalendar4.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = gregorianCalendar4.getActualMaximum(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 03 16:22:44 UTC 26063513");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 44 + "'", int25 == 44);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant28);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        org.joda.time.DateTime.Property property2 = dateTime0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime0.withDayOfYear(894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.LocalTime localTime1 = timeOfDay0.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay0.plusMinutes(26074093);
        int int4 = timeOfDay3.size();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime6.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Period period11 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period14 = period11.withField(durationFieldType12, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = period11.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        int int5 = gregorianCalendar2.getFirstDayOfWeek();
        boolean boolean7 = gregorianCalendar2.isSet(3);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514079363L + "'", long3 == 1645514079363L);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        boolean boolean8 = durationField7.isPrecise();
        boolean boolean9 = durationField7.isPrecise();
        java.lang.String str10 = durationField7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DurationField[years]" + "'", str10, "DurationField[years]");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
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
        org.joda.time.ReadableInterval readableInterval17 = null;
        mutablePeriod3.add(readableInterval17);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(36, 26071567, (int) '#', 15, (int) 'a', dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gregorianCalendar2.getLeastMaximum((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514079890L + "'", long3 == 1645514079890L);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.DateMidnight.Property property21 = dateMidnight19.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay22 = dateMidnight19.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonthDay22.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight29 = yearMonthDay22.toDateMidnight(dateTimeZone25);
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePartial) yearMonthDay22, (long) 26069970);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay22.withFieldAdded(durationFieldType32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(durationFieldType32);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(26076299);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26076299 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
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
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.millisOfSecond();
        org.joda.time.Period period16 = new org.joda.time.Period((int) (byte) 10, (-1), 22, 100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime3.withPeriodAdded((org.joda.time.ReadablePeriod) period16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDate(36, 0, 641);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26080249 + "'", int5 == 26080249);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gregorianCalendar2.getMinimum(641);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 641");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514080279L + "'", long3 == 1645514080279L);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        boolean boolean11 = dateTime10.isAfterNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime10.withTime(26076408, 26065744, 26061790, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26076408 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        mutableDateTime8.setChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) property7, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property5.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.withMaximumValue();
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property6.setCopy("DateTimeField[year]", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[year]\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        int int11 = dateTime10.getWeekOfWeekyear();
        boolean boolean13 = dateTime10.isBefore((long) 26062445);
        int int14 = dateTime10.getYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 100, chronology16);
        org.joda.time.Seconds seconds18 = period17.toStandardSeconds();
        org.joda.time.DateTime dateTime19 = dateTime10.plus((org.joda.time.ReadablePeriod) seconds18);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone23);
        mutableDateTime20.setZoneRetainFields(dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) seconds18, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.Interval interval19 = yearMonthDay18.toInterval();
        org.joda.time.DateMidnight dateMidnight20 = yearMonthDay18.toDateMidnight();
        org.joda.time.Interval interval21 = yearMonthDay18.toInterval();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.copy();
        mutableDateTime23.addMinutes(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime30 = dateTime27.withFieldAdded(durationFieldType28, (int) (byte) 0);
        mutableDateTime23.add(durationFieldType28, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay18.withFieldAdded(durationFieldType28, 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        int int3 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        mutableDateTime2.setZoneRetainFields(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) 26071567, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 923 + "'", int3 == 923);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime6.toGregorianCalendar();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        gregorianCalendar8.setTimeZone(timeZone9);
        calendar5.setTimeZone(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = calendar5.isSet(26069075);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26069075");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.era();
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate5.yearOfEra();
        int int9 = property8.getMaximumValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292278993 + "'", int9 == 292278993);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        gregorianCalendar2.setTimeZone(timeZone3);
        int int5 = timeZone3.getRawOffset();
        java.lang.Object obj6 = timeZone3.clone();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime6.toGregorianCalendar();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        gregorianCalendar8.setTimeZone(timeZone9);
        java.util.Date date11 = gregorianCalendar8.getTime();
        java.util.Calendar.Builder builder12 = builder0.setInstant(date11);
        java.util.Calendar.Builder builder16 = builder12.setWeekDate(26069500, (int) 'u', 26071567);
        java.util.Date date17 = new java.util.Date();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder12.setInstant(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 22 07:14:41 UTC 2022");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Feb 22 07:14:41 UTC 2022");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        boolean boolean4 = gregorianCalendar2.isLenient();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTime(localTime10, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate8.toDateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.yearOfEra();
        int int16 = dateMidnight14.getMinuteOfHour();
        org.joda.time.Interval interval17 = dateMidnight14.toInterval();
        org.joda.time.DateMidnight.Property property18 = dateMidnight14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight14.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone4, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, 434, 26061790, (int) (short) -1, 26068787);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) 100, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.Duration duration9 = period5.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.hourOfDay();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, (long) (byte) 1, periodType13);
        mutableDateTime8.add((org.joda.time.ReadablePeriod) period14, 26067972);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "31 Dec 1969 23:59:59 GMT", 26081059);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        int int5 = localTime3.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime3.withMillisOfSecond(26068833);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26068833 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(26069500, 26065744, 26066836, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26069500 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDayOfYear(26067972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26067972 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26081652 + "'", int5 == 26081652);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyear();
        java.lang.String str8 = chronology6.toString();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeField9.getDifference((-1L), 1147058000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        boolean boolean4 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet3);
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        boolean boolean9 = strSet6.removeAll((java.util.Collection<java.lang.String>) strSet8);
        boolean boolean10 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet8.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strSet8.add("2022-02-22T07:14:29.089Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addYears((int) (short) 100);
        java.lang.Object obj8 = mutablePeriod3.clone();
        mutablePeriod3.setSeconds(894);
        mutablePeriod3.setMonths(26067310);
        mutablePeriod3.addMillis(10);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "P100Y26067310MT894.010S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "P100Y26067310MT894.010S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "P100Y26067310MT894.010S");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime4.withChronology(chronology11);
        org.joda.time.DateTime dateTime15 = dateTime13.plus((long) 26062445);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(10, (-292275054), 26077617, (int) (byte) 100, (int) (short) -1, (int) (short) -1, 26069958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar2.roll(26064003, 687120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514082143L + "'", long3 == 1645514082143L);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        mutableDateTime4.setChronology(chronology12);
        org.joda.time.DurationField durationField14 = chronology12.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(5, 26081164, 26080502, 10, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081164 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        java.lang.String str6 = periodType5.getName();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.PeriodType periodType8 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType5.withWeeksRemoved();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        long long14 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.LocalTime localTime16 = property11.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(2L, (long) 26067972, periodType5, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((int) '#', 26079926, (int) 'u', chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26079926 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Years" + "'", str6, "Years");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-27424365L) + "'", long14 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.copy();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        mutableDateTime7.setZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime4.toMutableDateTime(dateTimeZone9);
        boolean boolean14 = dateTime4.isEqual((long) 9);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        java.lang.Object obj21 = date20.clone();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "Thu Jan 01 07:14:32 UTC 1970");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.Chronology chronology14 = chronology6.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) dateTimeField15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.DateMidnight.Property property11 = dateMidnight9.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = dateMidnight9.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonthDay12.getFieldTypes();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.year();
        long long26 = chronology20.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay12.withChronologyRetainFields(chronology20);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay12.year();
        java.util.Locale locale29 = java.util.Locale.ITALY;
        int int30 = property28.getMaximumShortTextLength(locale29);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale29.getDisplayCountry(locale31);
        java.lang.String str33 = dateTimeField7.getAsText((long) 26063026, locale29);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) periodType34, dateTimeZone36);
        int int38 = localDateTime37.getDayOfMonth();
        int int39 = localDateTime37.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.millisOfSecond();
        int int41 = localDateTime37.getEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime37.era();
        org.joda.time.LocalDateTime.Property property43 = localDateTime37.dayOfMonth();
        int int44 = localDateTime37.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property45 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime.Property property46 = localDateTime37.millisOfDay();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        java.lang.String str51 = localDate50.toString();
        org.joda.time.LocalDate localDate53 = localDate50.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.weekyearOfCentury();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (byte) 100, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(chronology59);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime60.copy();
        org.joda.time.Duration duration62 = period58.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.Period period64 = period58.plusDays((int) (byte) 10);
        int int65 = period64.getHours();
        org.joda.time.Period period67 = period64.plusMonths(2);
        org.joda.time.Period period69 = period64.minusMonths(12);
        org.joda.time.Period period71 = period64.plusWeeks(26073687);
        int[] intArray73 = chronology54.get((org.joda.time.ReadablePeriod) period64, (long) 12);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray75 = dateTimeField7.addWrapField((org.joda.time.ReadablePartial) localDateTime37, 26061764, intArray73, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26061764");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1147058000L + "'", long26 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Italy" + "'", str32, "Italy");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970" + "'", str33, "1970");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 22 + "'", int38 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 26082296 + "'", int39 == 26082296);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 0, 0, 0, 0, 0, 12]");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.minusYears(100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        int int12 = dateTimeZone9.getOffsetFromLocal(31562062367L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(26080940, 26072939, 12, 26063479, 26080940, 2, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26063479 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks((int) '4');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.yearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime7.withChronology(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(666, 26066836, (int) 'a', chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26066836 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) 'a');
        boolean boolean12 = dateTimeZone8.isStandardOffset((long) 26067310);
        org.joda.time.DateTime dateTime13 = localDateTime6.toDateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        timeZone4.setRawOffset(26067972);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeZone4.getOffset(26076299, (int) '4', (int) (byte) 0, (int) (byte) -1, 26061877, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeOfDay4.getValue(867);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 867");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514082625L + "'", long3 == 1645514082625L);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1970-01-01");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime3.copy();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        mutableDateTime3.setZoneRetainFields(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = localDate1.isBefore((org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.Interval interval19 = yearMonthDay18.toInterval();
        int int20 = yearMonthDay18.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration21, readableInstant22, periodType23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutablePeriod24.add(readableDuration25);
        mutablePeriod24.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableDuration29, readableInstant30, periodType31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutablePeriod32.add(readableDuration33);
        mutablePeriod32.addMonths((int) '#');
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        mutablePeriod32.add((-1L));
        mutablePeriod32.addDays(32769);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.minutes();
        mutablePeriod32.set(durationFieldType42, 26063026);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay18.withFieldAdded(durationFieldType42, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(durationFieldType42);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
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
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale12.getDisplayScript(locale14);
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr_CA" + "'", str18, "fr_CA");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundCeiling();
        java.lang.String str4 = property2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = property2.set("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[yearOfEra]" + "'", str4, "Property[yearOfEra]");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withMillisOfDay((int) (byte) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime3.toString(dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26082742 + "'", int5 == 26082742);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        boolean boolean4 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet3);
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        boolean boolean7 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet6);
        java.lang.Throwable[] throwableArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable[] throwableArray9 = strSet6.toArray(throwableArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property1.setCopy(26079926);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26079926 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime1.add(readableDuration8, 26065744);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 885 + "'", int2 == 885);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 10);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.PeriodType periodType10 = periodType8.withMonthsRemoved();
        org.joda.time.Period period11 = period7.normalizedStandard(periodType8);
        boolean boolean12 = gregorianCalendar2.equals((java.lang.Object) periodType8);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Years" + "'", str9, "Years");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
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
        int int12 = dateMidnight8.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.withEra(56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate7 = localDate4.withYear(20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate4.withYearOfCentury(26077617);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26077617 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setMillisOfSecond(26081440);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081440 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = property1.addNoWrapToCopy(26069500);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime4 = localTime2.plusMinutes((-292275054));
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.years();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(26081164);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081164 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) 26063026);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType8);
        org.joda.time.PeriodType periodType11 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = periodType8.withWeeksRemoved();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        long long17 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.LocalTime localTime19 = property14.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(2L, (long) 26067972, periodType8, chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) 26063026, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Years" + "'", str9, "Years");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-27424365L) + "'", long17 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withDayOfMonth(1);
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((java.lang.Object) property11, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateMidnight$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(26075615);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime6.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withSecondOfMinute(26062367);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062367 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Seconds seconds7 = period2.toStandardSeconds();
        org.joda.time.Period period9 = period2.plusYears(0);
        org.joda.time.Period period11 = period2.withHours(26061238);
        org.joda.time.PeriodType periodType12 = period2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = periodType12.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("millisOfSecond", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.Interval interval19 = yearMonthDay18.toInterval();
        org.joda.time.DateMidnight dateMidnight20 = yearMonthDay18.toDateMidnight();
        org.joda.time.Interval interval21 = yearMonthDay18.toInterval();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay18.minusDays(35);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.era();
        boolean boolean31 = localDate29.isSupported(dateTimeFieldType30);
        org.joda.time.LocalDate localDate33 = localDate29.withDayOfYear((int) '4');
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone35 = dateMidnight34.getZone();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 1, chronology37);
        java.lang.String str39 = localDate38.toString();
        org.joda.time.LocalDate localDate41 = localDate38.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight34.withFields((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableDuration43, readableInstant44, periodType45);
        mutablePeriod46.setMillis(0);
        org.joda.time.LocalDate localDate49 = localDate41.plus((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate.Property property51 = localDate41.property(dateTimeFieldType50);
        boolean boolean52 = localDate29.isSupported(dateTimeFieldType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay23.withField(dateTimeFieldType50, 26078357);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26078357 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        java.lang.String str3 = property1.getAsText();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfEra();
        mutableDateTime5.addSeconds(292278993);
        int int9 = property1.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property1.addNoWrapToCopy(26067972);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14" + "'", str3, "14");
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withMinuteOfHour(3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Seconds seconds8 = period7.toStandardSeconds();
        int int9 = period7.getMonths();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay1.minus((org.joda.time.ReadablePeriod) period7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withMillisOfSecond(26081086);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081086 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) 26061444);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        org.joda.time.Weeks weeks5 = period2.toStandardWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter6 = null;
        java.lang.String str7 = period2.toString(periodFormatter6);
        org.joda.time.Duration duration8 = period2.toStandardDuration();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) duration8, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT7H14M21.445S" + "'", str4, "PT7H14M21.445S");
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT7H14M21.445S" + "'", str7, "PT7H14M21.445S");
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = property9.withMinimumValue();
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateMidnight10.toString("millisOfSecond", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(22);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        mutableDateTime1.addSeconds((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType11, 26071282);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26071282 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) 'x', 26063188, 26081165, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundCeiling();
        java.lang.String str4 = property2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = property2.set("en-CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en-CA\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[yearOfEra]" + "'", str4, "Property[yearOfEra]");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime6.toGregorianCalendar();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        gregorianCalendar8.setTimeZone(timeZone9);
        calendar5.setTimeZone(timeZone9);
        boolean boolean12 = timeZone9.useDaylightTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMillisOfSecond(26081642);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081642 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 448 + "'", int2 == 448);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 5);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        java.lang.String str11 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.era();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(1645514076554L, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(99, 26069075, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ISOChronology[UTC]" + "'", str11, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gregorianCalendar2.getActualMinimum(26068833);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26068833");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514084591L + "'", long3 == 1645514084591L);
        org.junit.Assert.assertNotNull(timeOfDay4);
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
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime9 = localTime6.plusMinutes(26072651);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withMinuteOfHour(26077617);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26077617 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
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
        int int15 = dateTimeField12.getDifference((long) (byte) 10, (long) (-1));
        long long18 = dateTimeField12.set((long) (byte) 100, "1970");
        java.lang.String str19 = dateTimeField12.toString();
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale22.toLanguageTag();
        java.lang.String str24 = locale21.getDisplayCountry(locale22);
        java.lang.String str25 = dateTimeField12.getAsShortText((long) 'u', locale21);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 1, chronology29);
        java.lang.String str31 = localDate30.toString();
        org.joda.time.LocalDate localDate33 = localDate30.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfMinute();
        int int38 = dateTimeField36.getMinimumValue((long) 26073757);
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.lang.String str41 = locale40.toLanguageTag();
        java.lang.String str42 = locale39.getDisplayCountry(locale40);
        int int43 = dateTimeField36.getMaximumTextLength(locale40);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = dateTimeField12.set(0L, "Coordinated Universal Time", locale40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for year is not supported");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[year]" + "'", str19, "DateTimeField[year]");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "de-DE" + "'", str23, "de-DE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970" + "'", str25, "1970");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "de-DE" + "'", str41, "de-DE");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 26069295);
        org.joda.time.DateTime dateTime2 = localTime1.toDateTimeToday();
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes(0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("en_US", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate localDate5 = localDate2.plusWeeks((int) (short) -1);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        mutableDateTime9.setZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDate7.toDateTime(readableInstant15);
        org.joda.time.LocalDate.Property property17 = localDate7.yearOfCentury();
        org.joda.time.LocalDate.Property property18 = localDate7.dayOfWeek();
        int int19 = localDate7.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int21 = localDate7.indexOf(dateTimeFieldType20);
        int int22 = dateTime6.get(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((int) (byte) 10, 219, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 219 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.plusMinutes(44);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.DateMidnight.Property property14 = dateMidnight12.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay15 = dateMidnight12.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay15.getFieldTypes();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.year();
        long long29 = chronology23.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay15.withChronologyRetainFields(chronology23);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        org.joda.time.DateMidnight.Property property33 = dateMidnight31.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay34 = dateMidnight31.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = yearMonthDay34.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone37 = dateMidnight36.getZone();
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight41 = yearMonthDay34.toDateMidnight(dateTimeZone37);
        int[] intArray43 = chronology23.get((org.joda.time.ReadablePartial) yearMonthDay34, (long) 26069970);
        // The following exception was thrown during execution in test generation
        try {
            chronology6.validate((org.joda.time.ReadablePartial) timeOfDay11, intArray43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1147058000L + "'", long29 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1970, 1, 1]");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32772, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) 'a');
        boolean boolean19 = dateTimeZone15.isStandardOffset((long) 26067310);
        org.joda.time.DateTime dateTime20 = localDateTime13.toDateTime(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(26071, 292278993, 10, 26073687, 9, 26063479, 32772, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26073687 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        boolean boolean4 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet3);
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        boolean boolean9 = strSet6.removeAll((java.util.Collection<java.lang.String>) strSet8);
        boolean boolean10 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet8.spliterator();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property13 = localTime12.minuteOfHour();
        org.joda.time.LocalTime localTime15 = localTime12.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime12.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean20 = localTime18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = localTime18.withFields((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.Period period23 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime12, (org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period26 = period23.withField(durationFieldType24, (int) '#');
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.years();
        java.lang.String str28 = periodType27.getName();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(periodType27);
        org.joda.time.PeriodType periodType30 = periodType27.withYearsRemoved();
        org.joda.time.Period period31 = period23.normalizedStandard(periodType27);
        org.joda.time.PeriodType periodType32 = periodType27.withSecondsRemoved();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekyear();
        java.lang.String str41 = chronology39.toString();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.era();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) strSpliterator11, periodType27, chronology39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Spliterators$EmptySpliterator$OfRef");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Years" + "'", str28, "Years");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ISOChronology[UTC]" + "'", str41, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1970, 434, 26071282, 26062445, 26062923, 6, 139);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062445 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("2022-02-22T07:14:40.894", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.weekOfWeekyear();
        int int7 = localDate2.getDayOfWeek();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.centuries();
        boolean boolean9 = localDate2.isSupported(durationFieldType8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate2.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(26068787, 0, 26081548, 53, 26071829, 666, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        java.lang.String str12 = chronology10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(44, 26062923, 26069500, 26082802, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[UTC]" + "'", str12, "ISOChronology[UTC]");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime6.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Period period11 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period14 = period11.withField(durationFieldType12, (int) '#');
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.years();
        java.lang.String str16 = periodType15.getName();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.PeriodType periodType18 = periodType15.withYearsRemoved();
        org.joda.time.Period period19 = period11.normalizedStandard(periodType15);
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = period19.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant21 = new org.joda.time.Instant((java.lang.Object) period19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Years" + "'", str16, "Years");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(26065744);
        java.util.Date date6 = localDateTime3.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withEra(973);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 973 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Feb 22 07:14:46 UTC 2022");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 26061238, 3, 26061397);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder0.setWeekDefinition(26061444, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        int int9 = mutableDateTime5.get(dateTimeFieldType7);
        boolean boolean10 = localTime3.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime12 = localTime3.minusHours(26061877);
        int int13 = localTime12.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Date date6 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int7 = date6.getSeconds();
        date6.setTime((long) (short) -1);
        java.lang.String str10 = date6.toGMTString();
        date6.setYear(56);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Dec 31 23:59:59 UTC 1956");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str10, "31 Dec 1969 23:59:59 GMT");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter16.print(259200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime3 = property1.withMinimumValue();
        java.lang.String str4 = localTime3.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "07:00:46.208" + "'", str4, "07:00:46.208");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        mutableDateTime2.setChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(26069075, 6, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26069075 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("PT0.100S");
        boolean boolean3 = timeZone2.observesDaylightTime();
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        org.joda.time.DateMidnight.Property property7 = dateMidnight5.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay8 = dateMidnight5.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonthDay8.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval11 = yearMonthDay8.toInterval(dateTimeZone10);
        long long14 = dateTimeZone10.adjustOffset((long) 26063479, true);
        boolean boolean16 = dateTimeZone10.isStandardOffset((long) 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) boolean4, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 26063479L + "'", long14 == 26063479L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        java.util.Calendar.Builder builder9 = builder0.setDate((int) (byte) 0, 26072651, 26072939);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder9.setWeekDefinition(26081165, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        boolean boolean6 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet5);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        boolean boolean11 = strSet8.removeAll((java.util.Collection<java.lang.String>) strSet10);
        boolean boolean12 = strSet5.removeAll((java.util.Collection<java.lang.String>) strSet10);
        boolean boolean13 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = strSet5.add("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        int int11 = dateTime10.getWeekOfWeekyear();
        boolean boolean13 = dateTime10.isBefore((long) 26062445);
        int int14 = dateTime10.getYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 100, chronology16);
        org.joda.time.Seconds seconds18 = period17.toStandardSeconds();
        org.joda.time.DateTime dateTime19 = dateTime10.plus((org.joda.time.ReadablePeriod) seconds18);
        org.joda.time.DateMidnight dateMidnight20 = dateTime19.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withWeekOfWeekyear(190);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 190 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
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
            mutableDateTime1.setMinuteOfDay(26071567);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26071567 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 926 + "'", int2 == 926);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology11);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        int int20 = localDate19.getDayOfYear();
        org.joda.time.LocalTime localTime21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate19.toDateTime(localTime21, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate19.toDateMidnight(dateTimeZone24);
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.yearOfEra();
        int int27 = dateMidnight25.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property28 = dateMidnight25.year();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withMillis((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime31 = dateMidnight25.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateMidnight25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfWeek();
        int int8 = mutableDateTime1.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfMinute(26067332);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26067332 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 508 + "'", int2 == 508);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 434 + "'", int8 == 434);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
        int int15 = dateTimeField12.getDifference((long) (byte) 10, (long) (-1));
        java.lang.String str17 = dateTimeField12.getAsShortText((-27424365L));
        java.lang.String str18 = dateTimeField12.toString();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.years();
        java.lang.String str22 = periodType21.getName();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(periodType21);
        org.joda.time.PeriodType periodType24 = periodType21.withYearsRemoved();
        org.joda.time.PeriodType periodType25 = periodType21.withWeeksRemoved();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        long long30 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.LocalTime localTime32 = property27.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(2L, (long) 26067972, periodType21, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) str18, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[year]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969" + "'", str17, "1969");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateTimeField[year]" + "'", str18, "DateTimeField[year]");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Years" + "'", str22, "Years");
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-27424365L) + "'", long30 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str12 = locale10.getExtension('a');
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale4, locale5, locale6, locale7, locale8, locale9, locale10, locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        boolean boolean22 = strSet19.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet19);
        boolean boolean24 = strSet0.addAll((java.util.Collection<java.lang.String>) strList23);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localeList17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 7, 100L, chronology12);
        org.joda.time.DateMidnight dateMidnight15 = org.joda.time.DateMidnight.now(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter3.withChronology(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.parse("Corea del Sud", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Period period1 = org.joda.time.Period.years(26073687);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add(6);
        mutableDateTime4.setMillisOfDay(26086669);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(26065744);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusSeconds(44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime(26076299, 4, 0, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26076299 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime3 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property1.setCopy(26081059);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081059 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Date date6 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int7 = date6.getSeconds();
        date6.setTime((long) (short) -1);
        java.lang.String str10 = date6.toGMTString();
        java.lang.String str11 = date6.toGMTString();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration12, readableInstant13, periodType14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutablePeriod15.add(readableDuration16);
        mutablePeriod15.addYears((int) (short) 100);
        java.lang.Object obj20 = mutablePeriod15.clone();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTime(localTime25, dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableDuration28, readableInstant29, periodType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutablePeriod31.add(readableDuration32);
        mutablePeriod31.addMonths((int) '#');
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 1, chronology37);
        int int39 = localDate38.getDayOfYear();
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate38.toDateTime(localTime40, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = localDate38.toDateMidnight(dateTimeZone43);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.yearOfEra();
        int int46 = dateMidnight44.getMinuteOfHour();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 100, chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime51.copy();
        org.joda.time.Duration duration53 = period49.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight44.plus((org.joda.time.ReadableDuration) duration53);
        mutablePeriod31.add((org.joda.time.ReadableDuration) duration53);
        org.joda.time.DateTime dateTime56 = dateTime27.minus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (short) 1, chronology58);
        java.lang.String str60 = localDate59.toString();
        org.joda.time.LocalDate localDate62 = localDate59.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology63 = localDate62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.eras();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.year();
        long long69 = chronology63.add(0L, (long) 26069500, 44);
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration53, chronology63);
        boolean boolean71 = date6.equals((java.lang.Object) duration53);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str10, "31 Dec 1969 23:59:59 GMT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str11, "31 Dec 1969 23:59:59 GMT");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01" + "'", str60, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1147058000L + "'", long69 == 1147058000L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime13.addMinutes(894);
        boolean boolean16 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) 'a');
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone18);
        long long25 = dateTimeZone18.convertLocalToUTC((long) 'a', false, (long) 26062923);
        mutableDateTime7.setZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(26076299, 26081548, 26085228, 11, 713, 26085228, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 713 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: millisOfSecond [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
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
        org.joda.time.DateMidnight dateMidnight12 = property11.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight13 = property11.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property11.setCopy("2022-02-22T07:14:40.894");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:14:40.894\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
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
        int int14 = property11.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight15 = property11.roundFloorCopy();
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = new java.util.Locale("", "hi!");
        java.util.Locale.setDefault(category17, locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = property11.setCopy("CA", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CA\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292278993 + "'", int14 == 292278993);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale20.toString(), "_HI!");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        int int9 = mutableDateTime5.get(dateTimeFieldType7);
        boolean boolean10 = localTime3.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime12 = localTime3.minusHours(26061877);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localTime3.isAfter(readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
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
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.lang.String str16 = property14.getAsText(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayScript(locale17);
        java.util.Calendar calendar19 = mutableDateTime1.toCalendar(locale15);
        java.lang.Class<?> wildcardClass20 = mutableDateTime1.getClass();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645514066152,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=14,SECOND=26,MILLISECOND=152,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) instant10);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(26071567, 26070054, 26074772, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26070054 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
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
        int int16 = dateMidnight12.getMinuteOfDay();
        org.joda.time.DateMidnight.Property property17 = dateMidnight12.yearOfEra();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.toLanguageTag();
        org.joda.time.DateMidnight dateMidnight21 = property17.setCopy("1970", locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = property2.set("millisOfSecond", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfSecond\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-CA" + "'", str20, "en-CA");
        org.junit.Assert.assertNotNull(dateMidnight21);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        int int5 = localTime4.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withMillisOfDay(1011396959);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1011396959 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26089200 + "'", int5 == 26089200);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime dateTime22 = dateTime19.plusHours((int) 'x');
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(26073687);
        org.joda.time.DateTime.Property property25 = dateTime19.minuteOfHour();
        org.joda.time.DateTime.Property property26 = dateTime19.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = property26.addToCopy(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        org.joda.time.DurationField durationField8 = chronology6.weekyears();
        long long9 = durationField8.getUnitMillis();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 31556952000L + "'", long9 == 31556952000L);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 26067332);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 915, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology7.getDateTimeMillis((long) 719, 26072569, 26080502, 0, 26085228);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26072569 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        long long3 = gregorianCalendar2.getTimeInMillis();
        gregorianCalendar2.roll(3, 20);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        mutableDateTime11.setZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate9.toDateTimeAtStartOfDay(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getID();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        int int22 = localDate21.getDayOfYear();
        org.joda.time.LocalTime localTime23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate21.toDateTime(localTime23, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = localDate21.toDateMidnight(dateTimeZone26);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.yearOfEra();
        int int29 = dateMidnight27.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property30 = dateMidnight27.year();
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = property30.getAsText(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale31.getDisplayScript(locale33);
        java.lang.String str35 = dateTimeZone14.getShortName((long) 666, locale33);
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = locale36.getCountry();
        java.lang.String str38 = locale33.getDisplayName(locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap39 = gregorianCalendar2.getDisplayNames(70, 26076299, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645514089467L + "'", long3 == 1645514089467L);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Etc/UTC" + "'", str17, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970" + "'", str32, "1970");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "IT" + "'", str37, "IT");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "tedesco (Germania)" + "'", str38, "tedesco (Germania)");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.Interval interval19 = yearMonthDay18.toInterval();
        int int20 = yearMonthDay18.getDayOfMonth();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean23 = localTime21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime21.withFields((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean29 = localTime27.isSupported(dateTimeFieldType28);
        int int30 = mutableDateTime26.get(dateTimeFieldType28);
        boolean boolean31 = localTime24.isSupported(dateTimeFieldType28);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property33 = localTime32.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone35 = dateMidnight34.getZone();
        long long36 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.LocalTime localTime38 = property33.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType28.getField(chronology39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay18.withField(dateTimeFieldType28, 235);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-27424365L) + "'", long36 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.withDayOfMonth(26081164);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081164 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("tedesco (Germania)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"tedesco (Germania)\" is malformed at \"edesco (Germania)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(472, 26084973, (int) 'u', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 472 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Date date6 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int7 = date6.getSeconds();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(26069970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26069970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 03 16:22:44 UTC 26063513");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.DateMidnight.Property property21 = dateMidnight19.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay22 = dateMidnight19.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonthDay22.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight29 = yearMonthDay22.toDateMidnight(dateTimeZone25);
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePartial) yearMonthDay22, (long) 26069970);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableDuration32, readableInstant33, periodType34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutablePeriod35.add(readableDuration36);
        mutablePeriod35.addSeconds(26061238);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay22.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod35, 1970);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay41.minusYears((int) (short) 1);
        org.joda.time.DateTime dateTime44 = yearMonthDay43.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay43.withDayOfMonth(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(26075615);
        int int9 = localTime8.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(894);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableDuration13, readableInstant14, periodType15);
        mutablePeriod16.addYears((int) (byte) 0);
        int int19 = mutablePeriod16.getMonths();
        mutablePeriod16.addMinutes((int) (byte) 0);
        mutablePeriod16.addDays((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, 35);
        org.joda.time.DateTime.Property property26 = dateTime10.yearOfCentury();
        int int27 = dateTime10.getHourOfDay();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter2.parseMutableDateTime("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withDayOfWeek(26079926);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26079926 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26090462 + "'", int5 == 26090462);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.withSeconds(26071);
        int int7 = period6.getMonths();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 26081059, dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) int7, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter16.print((long) 26085228);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        int int21 = property19.getMaximumShortTextLength(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale20.getDisplayCountry(locale22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 1, chronology27);
        java.lang.String str29 = localDate28.toString();
        org.joda.time.LocalDate localDate31 = localDate28.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekyearOfCentury();
        org.joda.time.Period period34 = new org.joda.time.Period((long) 7, 100L, chronology32);
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) str23, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Italy\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italy" + "'", str23, "Italy");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = property19.getAsText(locale21);
        java.lang.String str24 = property19.getAsText();
        org.joda.time.YearMonthDay yearMonthDay26 = property19.addWrapFieldToCopy(26087585);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.withDayOfMonth(26062367);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062367 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay26);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.Period period10 = new org.joda.time.Period((long) 7, 100L, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology8.getDateTimeMillis((long) 244, 26069295, 999, 26072867, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26069295 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.minus(26063479L);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        int int6 = timeZone4.getRawOffset();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone4.getDisplayName(false, 26086669, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 26086669");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.util.Date date3 = localDate2.toDate();
        java.util.Date date10 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int11 = date10.getSeconds();
        date10.setTime((long) (short) -1);
        java.util.Date date20 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int21 = date20.getSeconds();
        boolean boolean22 = date10.after(date20);
        int int23 = date3.compareTo(date20);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 44 + "'", int11 == 44);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Nov 03 16:22:44 UTC 26063513");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("Corea del Sud", "2022-08-22");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Corea del Sud [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
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
        java.lang.String str14 = property11.getAsShortText();
        org.joda.time.DateMidnight dateMidnight16 = property11.setCopy(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withYearOfCentury(26070203);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26070203 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        int int21 = date20.getDate();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 1, (long) (byte) 1, periodType24);
        org.joda.time.Period period27 = period25.withYears(190);
        org.joda.time.Period period29 = period25.minusMillis(32772);
        boolean boolean30 = date20.equals((java.lang.Object) period25);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withMinuteOfHour(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.withMinuteOfHour(26088339);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26088339 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 26066836);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(26067972);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.LocalDate localDate13 = localDate9.withDayOfYear((int) '4');
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight14.withFields((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableDuration23, readableInstant24, periodType25);
        mutablePeriod26.setMillis(0);
        org.joda.time.LocalDate localDate29 = localDate21.plus((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate.Property property31 = localDate21.property(dateTimeFieldType30);
        boolean boolean32 = localDate9.isSupported(dateTimeFieldType30);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = localTime3.get(dateTimeFieldType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 10);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withMonthsRemoved();
        org.joda.time.Period period5 = period1.normalizedStandard(periodType2);
        int int6 = period5.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period5.plusSeconds(9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Years" + "'", str3, "Years");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        int int6 = timeZone4.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.Date date14 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        boolean boolean15 = timeZone4.inDaylightTime(date14);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 03 16:22:44 UTC 26063513");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime.Property property12 = localDateTime3.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration15, readableInstant16, periodType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutablePeriod18.add(readableDuration19);
        mutablePeriod18.addMonths((int) '#');
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.millis();
        mutablePeriod18.add(durationFieldType23, 5);
        mutableDateTime14.add(durationFieldType23, 26071282);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime3.withFieldAdded(durationFieldType23, 26070054);
        org.joda.time.LocalDateTime.Property property30 = localDateTime3.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = property30.setCopy("2022-02-22T07:14:42.802");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:14:42.802\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26091795 + "'", int5 == 26091795);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime4.withChronology(chronology11);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks(3);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
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
        mutableDateTime2.setMillisOfSecond(3);
        mutableDateTime2.addWeeks(26067332);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod();
        mutableDateTime2.add((org.joda.time.ReadablePeriod) mutablePeriod22, 2);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfHour(26090247);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26090247 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
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
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration19, readableInstant20, periodType21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutablePeriod22.add(readableDuration23);
        mutablePeriod22.addMonths((int) '#');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        int int30 = localDate29.getDayOfYear();
        org.joda.time.LocalTime localTime31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTime(localTime31, dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = localDate29.toDateMidnight(dateTimeZone34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.yearOfEra();
        int int37 = dateMidnight35.getMinuteOfHour();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 100, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime42.copy();
        org.joda.time.Duration duration44 = period40.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight35.plus((org.joda.time.ReadableDuration) duration44);
        mutablePeriod22.add((org.joda.time.ReadableDuration) duration44);
        boolean boolean47 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        int int51 = localDate50.getDayOfYear();
        org.joda.time.LocalTime localTime52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate50.toDateTime(localTime52, dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = localDate50.toDateMidnight(dateTimeZone55);
        org.joda.time.DateMidnight.Property property57 = dateMidnight56.yearOfEra();
        int int58 = dateMidnight56.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property59 = dateMidnight56.year();
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight56.plusYears((int) ' ');
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight56);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight56.withYear(666);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (byte) 100, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(chronology68);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime69.copy();
        org.joda.time.Duration duration71 = period67.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime70);
        org.joda.time.Seconds seconds72 = period67.toStandardSeconds();
        org.joda.time.Period period74 = period67.plusYears(0);
        org.joda.time.Period period76 = period67.withHours(26061238);
        org.joda.time.PeriodType periodType77 = period67.getPeriodType();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateMidnight56, periodType77);
        org.joda.time.Chronology chronology79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((java.lang.Object) periodType77, chronology79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(seconds72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(periodType77);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("French (Canada)", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean23 = localTime21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime21.withFields((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int28 = timeOfDay27.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.withMinuteOfHour(3);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime24, (org.joda.time.ReadablePartial) timeOfDay27);
        org.joda.time.LocalTime localTime32 = timeOfDay27.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeFormatter20.print((org.joda.time.ReadablePartial) localTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(localTime32);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2022-02-22T07:14:29.089Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime dateTime22 = dateTime19.plusHours((int) 'x');
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(26073687);
        org.joda.time.DateTime.Property property25 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTime dateTime27 = dateTime26.withLaterOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime30 = dateTime26.withFieldAdded(durationFieldType28, 26065744);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        java.lang.String str35 = localDate34.toString();
        org.joda.time.LocalDate localDate37 = localDate34.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.secondOfMinute();
        org.joda.time.Period period41 = new org.joda.time.Period((long) 8, chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) durationFieldType28, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale15.getDisplayCountry(locale16);
        java.lang.String str19 = localDate7.toString("14", locale15);
        java.lang.String str20 = locale15.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter3.withLocale(locale15);
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.lang.String str23 = locale22.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight26.getZone();
        org.joda.time.DateMidnight.Property property28 = dateMidnight26.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay29 = dateMidnight26.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = yearMonthDay29.getFieldTypes();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        java.lang.String str34 = localDate33.toString();
        org.joda.time.LocalDate localDate36 = localDate33.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.year();
        long long43 = chronology37.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay29.withChronologyRetainFields(chronology37);
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType25.getField(chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter24.withChronology(chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.parse("Property[minuteOfHour]", dateTimeFormatter24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Corea del Sud" + "'", str18, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "14" + "'", str19, "14");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean (South Korea)" + "'", str20, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italian" + "'", str23, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1147058000L + "'", long43 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
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
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((java.lang.Object) property11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26092377 + "'", int5 == 26092377);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("2022-02-22T07:14:40.845Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.Period period8 = new org.joda.time.Period(1645514070156L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) chronology7, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withMinuteOfHour(3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Seconds seconds8 = period7.toStandardSeconds();
        int int9 = period7.getMonths();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay1.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateMidnight.Property property13 = dateMidnight11.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight11.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonthDay14.getFieldTypes();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        long long28 = chronology22.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay14.withChronologyRetainFields(chronology22);
        org.joda.time.YearMonthDay.Property property30 = yearMonthDay14.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property32 = timeOfDay10.property(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1147058000L + "'", long28 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.Chronology chronology20 = chronology12.withZone(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(46, 915, 26083497, 26085847, 26072167, (int) (short) 100, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26085847 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
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
        int int15 = dateTimeField12.getDifference((long) (byte) 10, (long) (-1));
        java.lang.String str17 = dateTimeField12.getAsShortText((-27424365L));
        java.lang.String str18 = dateTimeField12.toString();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime();
        org.joda.time.DateTime dateTime21 = localDate19.toDateTime(localTime20);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        org.joda.time.DateMidnight.Property property25 = dateMidnight23.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight23.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = yearMonthDay26.getFieldTypes();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 1, chronology29);
        java.lang.String str31 = localDate30.toString();
        org.joda.time.LocalDate localDate33 = localDate30.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.year();
        long long40 = chronology34.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay26.withChronologyRetainFields(chronology34);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone43 = dateMidnight42.getZone();
        org.joda.time.DateMidnight.Property property44 = dateMidnight42.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay45 = dateMidnight42.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray46 = yearMonthDay45.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone48 = dateMidnight47.getZone();
        boolean boolean50 = dateTimeZone48.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight52 = yearMonthDay45.toDateMidnight(dateTimeZone48);
        int[] intArray54 = chronology34.get((org.joda.time.ReadablePartial) yearMonthDay45, (long) 26069970);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDate19, 666, intArray54, 26086489);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 666");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969" + "'", str17, "1969");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateTimeField[year]" + "'", str18, "DateTimeField[year]");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1147058000L + "'", long40 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1970, 1, 1]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime6.toGregorianCalendar();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        gregorianCalendar8.setTimeZone(timeZone9);
        java.util.Date date11 = gregorianCalendar8.getTime();
        java.util.Calendar.Builder builder12 = builder0.setInstant(date11);
        java.util.Calendar.Builder builder16 = builder12.setWeekDate(26069500, (int) 'u', 26071567);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder19 = builder16.setWeekDefinition(0, 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 22 07:14:52 UTC 2022");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.DateMidnight.Property property27 = dateMidnight25.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay28 = dateMidnight25.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonthDay28.getFieldTypes();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        java.lang.String str33 = localDate32.toString();
        org.joda.time.LocalDate localDate35 = localDate32.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.year();
        long long42 = chronology36.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay28.withChronologyRetainFields(chronology36);
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType24.getField(chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter23.withChronology(chronology36);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.copy();
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone51 = dateMidnight50.getZone();
        mutableDateTime48.setZoneRetainFields(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDate46.toDateTimeAtStartOfDay(dateTimeZone51);
        java.lang.String str54 = dateTimeZone51.getID();
        org.joda.time.DateMidnight dateMidnight55 = org.joda.time.DateMidnight.now(dateTimeZone51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dateTimeFormatter23.print((org.joda.time.ReadableInstant) dateMidnight55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1147058000L + "'", long42 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Etc/UTC" + "'", str54, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateMidnight55);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = timeOfDay1.getValue(26092417);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26092417");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(22);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime1.set(dateTimeFieldType9, 26069958);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundCeiling();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj17 = mutableDateTime15.clone();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "2023-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "2023-01-01T00:00:00.000Z");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean6 = localDate2.isSupported(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate2.withWeekOfWeekyear(26080419);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26080419 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.Chronology chronology14 = chronology6.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        int int22 = localDate20.getMonthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.weekyearOfCentury();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 100, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.copy();
        org.joda.time.Duration duration38 = period34.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.Period period40 = period34.plusDays((int) (byte) 10);
        int int41 = period40.getHours();
        org.joda.time.Period period43 = period40.plusMonths(2);
        org.joda.time.Period period45 = period40.minusMonths(12);
        org.joda.time.Period period47 = period40.plusWeeks(26073687);
        int[] intArray49 = chronology30.get((org.joda.time.ReadablePeriod) period40, (long) 12);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = dateTimeField15.set((org.joda.time.ReadablePartial) localDate20, 1970, intArray49, "DurationField[years]", locale51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DurationField[years]\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, 0, 0, 12]");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("PT0.100S");
        gregorianCalendar2.setTimeZone(timeZone4);
        timeZone4.setRawOffset(26067972);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone4.getDisplayName(false, 26061764);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 26061764");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int7 = timeOfDay6.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.withMinuteOfHour(3);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime3, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Period period19 = period13.plusDays((int) (byte) 10);
        int int20 = period19.getHours();
        org.joda.time.Period period22 = period19.plusMonths(2);
        org.joda.time.Period period24 = period19.minusMonths(12);
        org.joda.time.Period period26 = period19.plusWeeks(26073687);
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 119);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay6.hourOfDay();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay33 = property30.setCopy("Coordinated Universal Time", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_IT");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
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
        java.lang.String str14 = property11.getAsShortText();
        org.joda.time.DateMidnight dateMidnight15 = property11.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withYearOfEra((int) (short) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        int int21 = localDate20.getDayOfYear();
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate20.toDateTime(localTime22, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration25, readableInstant26, periodType27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutablePeriod28.add(readableDuration29);
        mutablePeriod28.addMonths((int) '#');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        int int36 = localDate35.getDayOfYear();
        org.joda.time.LocalTime localTime37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate35.toDateTime(localTime37, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = localDate35.toDateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfEra();
        int int43 = dateMidnight41.getMinuteOfHour();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 100, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.copy();
        org.joda.time.Duration duration50 = period46.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight41.plus((org.joda.time.ReadableDuration) duration50);
        mutablePeriod28.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTime dateTime53 = dateTime24.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight15.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateMidnight.Property property55 = dateMidnight15.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight56 = property55.roundHalfFloorCopy();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292279000 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 666);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth(26065744);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26065744 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
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
        int int10 = localDateTime3.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withHourOfDay(608);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 608 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26093729 + "'", int5 == 26093729);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTime(localTime13, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate11.toDateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.yearOfEra();
        int int19 = dateMidnight17.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property20 = dateMidnight17.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight17.plusYears((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int24 = dateMidnight17.get(dateTimeFieldType23);
        org.joda.time.DateTime.Property property25 = dateTime7.property(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) property25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayCountry(locale5);
        boolean boolean8 = locale4.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeOfDay1.toString("Property[yearOfEra]", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de-DE" + "'", str6, "de-DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(26086371, (int) (byte) 1, 0, (int) '4', 0, 26074772, 26081440, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime5 = property1.withMaximumValue();
        java.lang.String str6 = property1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property1.addNoWrapToCopy(687120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[minuteOfHour]" + "'", str6, "Property[minuteOfHour]");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime dateTime22 = dateTime19.plusHours((int) 'x');
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(26073687);
        org.joda.time.DateTime dateTime26 = dateTime19.minus((long) 32772);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekOfWeekyear(7);
        boolean boolean29 = dateTime28.isEqualNow();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale21);
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(writer24, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate5 = localDate3.minusYears(100);
        int int6 = localDate3.getEra();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 10);
        org.joda.time.Period period10 = period8.withMillis(35);
        org.joda.time.LocalDate localDate11 = localDate3.minus((org.joda.time.ReadablePeriod) period8);
        int[] intArray12 = localDate3.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder0.setFields(intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2022, 2, 22]");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.minusYears(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property5.setCopy("CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CA\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(26069075);
        int int8 = dateTime7.getYear();
        org.joda.time.DateTime dateTime9 = dateTime7.withTimeAtStartOfDay();
        int int10 = dateTime9.getMinuteOfDay();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26069075 + "'", int8 == 26069075);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        mutableDateTime0.setChronology(chronology8);
        mutableDateTime0.addWeekyears(6);
        org.joda.time.DateTime dateTime12 = mutableDateTime0.toDateTime();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime15 = property14.roundFloorCopy();
        java.lang.String str16 = property14.getAsText();
        org.joda.time.DateTimeField dateTimeField17 = property14.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setRounding(dateTimeField17, 26071);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 26071");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "14" + "'", str16, "14");
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u30a4\u30bf\u30ea\u30a2", (double) 26086528);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.6086528E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((int) (byte) 10, 26092966, 26067332, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26092966 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale15.getDisplayCountry(locale16);
        java.lang.String str19 = localDate7.toString("14", locale15);
        java.lang.String str20 = locale15.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter3.withLocale(locale15);
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.lang.String str23 = locale22.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.parse("PT-1H", dateTimeFormatter21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Corea del Sud" + "'", str18, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "14" + "'", str19, "14");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean (South Korea)" + "'", str20, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italian" + "'", str23, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime dateTime22 = dateTime19.plusHours((int) 'x');
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(26073687);
        org.joda.time.DateTime.Property property25 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTime dateTime27 = property25.withMaximumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyears\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 0);
        org.joda.time.Period period3 = period1.plusMillis(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
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
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.lang.String str16 = property14.getAsText(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayScript(locale17);
        java.util.Calendar calendar19 = mutableDateTime1.toCalendar(locale15);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calendar19.getMaximum(472);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 472");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645514066152,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=14,SECOND=26,MILLISECOND=152,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int7 = timeOfDay6.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.withMinuteOfHour(3);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime3, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Period period19 = period13.plusDays((int) (byte) 10);
        int int20 = period19.getHours();
        org.joda.time.Period period22 = period19.plusMonths(2);
        org.joda.time.Period period24 = period19.minusMonths(12);
        org.joda.time.Period period26 = period19.plusWeeks(26073687);
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 119);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay6.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay32 = property30.setCopy(26086489);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26086489 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.DateMidnight.Property property27 = dateMidnight25.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay28 = dateMidnight25.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonthDay28.getFieldTypes();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        java.lang.String str33 = localDate32.toString();
        org.joda.time.LocalDate localDate35 = localDate32.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.year();
        long long42 = chronology36.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay28.withChronologyRetainFields(chronology36);
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType24.getField(chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter23.withChronology(chronology36);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        java.lang.String str51 = localDate50.toString();
        org.joda.time.LocalDate localDate53 = localDate50.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        mutableDateTime46.setChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.halfdayOfDay();
        org.joda.time.DurationField durationField57 = chronology54.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((java.lang.Object) chronology36, chronology54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1147058000L + "'", long42 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        org.joda.time.DateTime.Property property2 = dateTime0.yearOfCentury();
        int int3 = dateTime0.getYearOfCentury();
        org.joda.time.LocalTime localTime4 = dateTime0.toLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int6 = dateTime0.get(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime0.withMonthOfYear(26062367);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26062367 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
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
        long long16 = dateTimeField12.remainder((long) 26077394);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31535999999L + "'", long14 == 31535999999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 26077394L + "'", long16 == 26077394L);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime8 = localTime4.withFields((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        int int13 = mutableDateTime9.get(dateTimeFieldType11);
        boolean boolean14 = localTime7.isSupported(dateTimeFieldType11);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property16 = localTime15.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        long long19 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.LocalTime localTime21 = property16.addCopy((long) (-292275054));
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType11.getField(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, 32769, 26092417, (-292275054), chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-27424365L) + "'", long19 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.DateMidnight.Property property27 = dateMidnight25.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay28 = dateMidnight25.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonthDay28.getFieldTypes();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        java.lang.String str33 = localDate32.toString();
        org.joda.time.LocalDate localDate35 = localDate32.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.year();
        long long42 = chronology36.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay28.withChronologyRetainFields(chronology36);
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType24.getField(chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter23.withChronology(chronology36);
        java.lang.StringBuffer stringBuffer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter23.printTo(stringBuffer46, (long) 26080940);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1147058000L + "'", long42 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        boolean boolean4 = property2.equals((java.lang.Object) 59);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getCountry();
        java.lang.String str8 = locale6.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = property2.set("2022-02-22T07:14:20.934Z", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:14:20.934Z\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IT" + "'", str7, "IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology11);
        org.joda.time.Chronology chronology17 = dateTimeFormatter2.getChronology();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer18, 1645514087680L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime4 = property1.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime6.toString("2022-02-22T07:14:51.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime6.toGregorianCalendar();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        gregorianCalendar8.setTimeZone(timeZone9);
        java.util.Date date11 = gregorianCalendar8.getTime();
        java.util.Calendar.Builder builder12 = builder0.setInstant(date11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int[] intArray20 = localDate18.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder21 = builder0.setFields(intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 22 07:14:55 UTC 2022");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 1]");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone5);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.PeriodType periodType10 = periodType8.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) dateTime7, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Years" + "'", str9, "Years");
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        int int21 = property19.getMaximumShortTextLength(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) property19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.YearMonthDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate2.getValue(752);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 752");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        gregorianCalendar2.setFirstDayOfWeek((int) ' ');
        java.util.TimeZone timeZone6 = gregorianCalendar2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = gregorianCalendar2.getMinimum(26095703);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26095703");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (-1), chronology7);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay10.withChronologyRetainFields(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.withMonthOfYear(26081870);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081870 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableDuration5, readableInstant6, periodType7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutablePeriod8.add(readableDuration9);
        mutablePeriod8.addYears((int) (short) 100);
        java.lang.Object obj13 = mutablePeriod8.clone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        int int17 = localDate16.getDayOfYear();
        org.joda.time.LocalTime localTime18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTime(localTime18, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration21, readableInstant22, periodType23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutablePeriod24.add(readableDuration25);
        mutablePeriod24.addMonths((int) '#');
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        int int32 = localDate31.getDayOfYear();
        org.joda.time.LocalTime localTime33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate31.toDateTime(localTime33, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = localDate31.toDateMidnight(dateTimeZone36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.yearOfEra();
        int int39 = dateMidnight37.getMinuteOfHour();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 100, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime44.copy();
        org.joda.time.Duration duration46 = period42.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight37.plus((org.joda.time.ReadableDuration) duration46);
        mutablePeriod24.add((org.joda.time.ReadableDuration) duration46);
        org.joda.time.DateTime dateTime49 = dateTime20.minus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 1, chronology51);
        java.lang.String str53 = localDate52.toString();
        org.joda.time.LocalDate localDate55 = localDate52.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.eras();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.year();
        long long62 = chronology56.add(0L, (long) 26069500, 44);
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration46, chronology56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(885, 46, 86, 26073757, 168, chronology56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26073757 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.100S");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01" + "'", str53, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1147058000L + "'", long62 == 1147058000L);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar5 = builder0.build();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar8 = dateTime6.toGregorianCalendar();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        gregorianCalendar8.setTimeZone(timeZone9);
        calendar5.setTimeZone(timeZone9);
        calendar5.set(17, 26090247, 26080419);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = calendar5.isSet(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=17,MONTH=26090247,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=26080419,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate localDate5 = localDate2.plusWeeks((int) (short) -1);
        int int6 = localDate5.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.Period period9 = new org.joda.time.Period((long) 10);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.Period period13 = period9.normalizedStandard(periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(26086690, 713, 23, 26092087, 26085847, 26061790, 26061790, 26063188, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Years" + "'", str11, "Years");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableDuration5, readableInstant6, periodType7);
        mutablePeriod8.addYears((int) (byte) 0);
        int int11 = mutablePeriod8.getMonths();
        mutablePeriod8.addMinutes((int) (byte) 0);
        mutablePeriod8.addMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusYears(26064003);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMillisOfSecond(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withField(dateTimeFieldType27, 26067332);
        boolean boolean30 = localDateTime17.isSupported(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = period2.getFieldTypes();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.copy();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate10.toDateTimeAtStartOfDay(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) durationFieldTypeArray9, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: [Lorg.joda.time.DurationFieldType;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Etc/UTC" + "'", str18, "Etc/UTC");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.era();
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.setCopy("2022-02-22T07:14:21.444");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:14:21.444\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = property19.getAsText(locale21);
        java.lang.String str24 = property19.getAsText();
        org.joda.time.YearMonthDay yearMonthDay26 = property19.addWrapFieldToCopy(26087585);
        org.joda.time.YearMonthDay yearMonthDay27 = property19.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay27.minusDays(26063479);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275055 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay27);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
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
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.months();
        mutableDateTime2.add(durationFieldType18, 26064003);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        java.lang.String str26 = localDate25.toString();
        org.joda.time.LocalDate localDate28 = localDate25.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.weekyearOfCentury();
        org.joda.time.Period period31 = new org.joda.time.Period((long) 7, 100L, chronology29);
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.hourOfHalfday();
        int int34 = mutableDateTime2.get(dateTimeField33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) dateTimeField33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDateTimeField");
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
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology11);
        java.lang.Appendable appendable17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate localDate23 = localDate20.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property24 = localDate20.weekOfWeekyear();
        org.joda.time.DateTime dateTime25 = localDate20.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property26 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate28 = localDate20.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable17, (org.joda.time.ReadablePartial) localDate28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.era();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone4);
        org.joda.time.LocalDate.Property property8 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate10 = localDate7.withYear(20);
        org.joda.time.Chronology chronology11 = localDate7.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate.Property property13 = localDate7.property(dateTimeFieldType12);
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
        int int26 = dateMidnight22.getMinuteOfDay();
        org.joda.time.DateMidnight.Property property27 = dateMidnight22.yearOfEra();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.toLanguageTag();
        org.joda.time.DateMidnight dateMidnight31 = property27.setCopy("1970", locale29);
        int int32 = property13.getMaximumTextLength(locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = localDate0.toString("PT-1H", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en-CA" + "'", str30, "en-CA");
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(26092966, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(26078357, 10, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26078357 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay3.plusMonths(23);
        org.joda.time.LocalDate localDate7 = yearMonthDay6.toLocalDate();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = localTime8.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime8.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localTime8.toDateTimeToday();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
        mutableDateTime16.addMinutes(0);
        mutableDateTime16.setSecondOfDay(22);
        org.joda.time.Chronology chronology22 = null;
        mutableDateTime16.setChronology(chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime16.set(dateTimeFieldType24, 26069958);
        int int27 = dateTime14.get(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property28 = localDate7.property(dateTimeFieldType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26096867 + "'", int27 == 26096867);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZoneRetainFields(dateTimeZone3);
        mutableDateTime2.setSecondOfMinute(9);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) periodType7, dateTimeZone9);
        int int11 = localDateTime10.getDayOfMonth();
        int int12 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.millisOfSecond();
        int int14 = localDateTime10.getEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.era();
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.dayOfMonth();
        int int17 = localDateTime10.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property18 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime.Property property19 = localDateTime10.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableDuration22, readableInstant23, periodType24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutablePeriod25.add(readableDuration26);
        mutablePeriod25.addMonths((int) '#');
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.millis();
        mutablePeriod25.add(durationFieldType30, 5);
        mutableDateTime21.add(durationFieldType30, 26071282);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime10.withFieldAdded(durationFieldType30, 26070054);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(periodType37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) periodType37, dateTimeZone39);
        int int41 = localDateTime40.getDayOfMonth();
        int int42 = localDateTime40.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.millisOfSecond();
        int int44 = localDateTime40.getEra();
        org.joda.time.LocalDateTime.Property property45 = localDateTime40.era();
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.dayOfMonth();
        int int47 = localDateTime40.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property48 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime.Property property49 = localDateTime40.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(readableDuration52, readableInstant53, periodType54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        mutablePeriod55.add(readableDuration56);
        mutablePeriod55.addMonths((int) '#');
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.millis();
        mutablePeriod55.add(durationFieldType60, 5);
        mutableDateTime51.add(durationFieldType60, 26071282);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime40.withFieldAdded(durationFieldType60, 26070054);
        boolean boolean67 = localDateTime36.isSupported(durationFieldType60);
        mutableDateTime2.add(durationFieldType60, (int) (byte) 100);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((long) (short) 1, chronology71);
        java.lang.String str73 = localDate72.toString();
        org.joda.time.LocalDate localDate75 = localDate72.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology76 = localDate75.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setRounding(dateTimeField77, 26077394);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 26077394");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26096913 + "'", int12 == 26096913);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 22 + "'", int41 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 26096913 + "'", int42 == 26096913);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1970-01-01" + "'", str73, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 22);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        gregorianCalendar4.setTimeZone(timeZone5);
        boolean boolean7 = localTime1.equals((java.lang.Object) gregorianCalendar4);
        java.util.Date date14 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int15 = date14.getSeconds();
        date14.setTime((long) (short) -1);
        java.util.Date date24 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int25 = date24.getSeconds();
        boolean boolean26 = date14.after(date24);
        gregorianCalendar4.setTime(date14);
        gregorianCalendar4.set(23, 2022, 190, 26072320, 973, (-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = gregorianCalendar4.getMinimum(26072320);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26072320");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 03 16:22:44 UTC 26063513");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 44 + "'", int25 == 44);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime6.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Period period11 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period14 = period11.withField(durationFieldType12, (int) '#');
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.years();
        java.lang.String str16 = periodType15.getName();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.PeriodType periodType18 = periodType15.withYearsRemoved();
        org.joda.time.Period period19 = period11.normalizedStandard(periodType15);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 10);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.years();
        java.lang.String str23 = periodType22.getName();
        org.joda.time.PeriodType periodType24 = periodType22.withMonthsRemoved();
        org.joda.time.Period period25 = period21.normalizedStandard(periodType22);
        org.joda.time.Period period26 = period11.plus((org.joda.time.ReadablePeriod) period21);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Years" + "'", str16, "Years");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Years" + "'", str23, "Years");
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate7 = localDate4.withYear(20);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate7.getValue(26069295);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26069295");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        org.joda.time.YearMonthDay yearMonthDay20 = property19.withMinimumValue();
        org.joda.time.DurationField durationField21 = property19.getRangeDurationField();
        int int22 = property19.getMinimumValue();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.secondOfMinute();
        int int34 = dateTimeField32.getMinimumValue((long) 26073757);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.lang.String str37 = locale36.toLanguageTag();
        java.lang.String str38 = locale35.getDisplayCountry(locale36);
        int int39 = dateTimeField32.getMaximumTextLength(locale36);
        java.util.Set<java.lang.String> strSet40 = locale36.getUnicodeLocaleAttributes();
        org.joda.time.YearMonthDay yearMonthDay41 = property19.setCopy("3", locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = yearMonthDay41.toString("Corea del Sud");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNull(durationField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-292275054) + "'", int22 == (-292275054));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "de-DE" + "'", str37, "de-DE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(yearMonthDay41);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 915, chronology7);
        org.joda.time.LocalDate localDate12 = localDate10.withWeekyear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDate12.getFieldType(885);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 885");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 1, dateTimeZone1);
        int int3 = dateMidnight2.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
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
        int int15 = dateTimeField12.getDifference((long) (byte) 10, (long) (-1));
        long long18 = dateTimeField12.set((long) (byte) 100, "1970");
        java.lang.String str19 = dateTimeField12.toString();
        int int21 = dateTimeField12.get(0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[year]" + "'", str19, "DateTimeField[year]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, (int) 'a');
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis((long) 26072569);
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime dateTime22 = dateTime19.plusHours((int) 'x');
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(26073687);
        org.joda.time.DateTime.Property property25 = dateTime19.minuteOfHour();
        org.joda.time.DateTime.Property property26 = dateTime19.era();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay31 = dateMidnight28.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = yearMonthDay31.getFieldTypes();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.year();
        long long45 = chronology39.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay31.withChronologyRetainFields(chronology39);
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay31.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        java.lang.String str49 = property47.getAsString();
        int int50 = property47.getMinimumValueOverall();
        java.util.Locale locale51 = java.util.Locale.ENGLISH;
        int int52 = property47.getMaximumTextLength(locale51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = property26.setCopy("07:14:44.099", locale51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"07:14:44.099\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 07:14:32 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1147058000L + "'", long45 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022" + "'", str49, "2022");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-292275054) + "'", int50 == (-292275054));
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        gregorianCalendar2.setTimeZone(timeZone3);
        int int5 = gregorianCalendar2.getMinimalDaysInFirstWeek();
        long long6 = gregorianCalendar2.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = gregorianCalendar2.getMaximum(26085321);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26085321");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645514097483L + "'", long6 == 1645514097483L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 22);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        gregorianCalendar4.setTimeZone(timeZone5);
        boolean boolean7 = localTime1.equals((java.lang.Object) gregorianCalendar4);
        java.util.Date date14 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int15 = date14.getSeconds();
        date14.setTime((long) (short) -1);
        java.util.Date date24 = new java.util.Date(26061444, 2022, 190, 1, 0, 26061764);
        int int25 = date24.getSeconds();
        boolean boolean26 = date14.after(date24);
        gregorianCalendar4.setTime(date14);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) 22);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = dateTime30.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar32 = dateTime30.toGregorianCalendar();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        gregorianCalendar32.setTimeZone(timeZone33);
        boolean boolean35 = localTime29.equals((java.lang.Object) gregorianCalendar32);
        int int36 = gregorianCalendar4.compareTo((java.util.Calendar) gregorianCalendar32);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 03 16:22:44 UTC 26063513");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 44 + "'", int25 == 44);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        java.lang.String str9 = periodType8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(120, 26061877, 687120000, 854, 26090164, 0, 26069075, 26087585, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Millis" + "'", str9, "Millis");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 26091056);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.plusYears(26062367);
        int int6 = dateMidnight2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.DateMidnight.Property property9 = dateMidnight7.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay10 = dateMidnight7.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonthDay10.getFieldTypes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.year();
        long long24 = chronology18.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay10.withChronologyRetainFields(chronology18);
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay10.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight2.withField(dateTimeFieldType27, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property30 = timeOfDay1.property(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1147058000L + "'", long24 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((-1), 0, 608, 26086690, 26061444, 26071282, 26081165, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26086690 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime4 = localTime2.plusMinutes((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime4.getValue((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType16);
        int int18 = localDate7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate7.withDayOfMonth(26081059);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26081059 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 22);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        gregorianCalendar4.setTimeZone(timeZone5);
        boolean boolean7 = localTime1.equals((java.lang.Object) gregorianCalendar4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        boolean boolean15 = localDate13.isSupported(dateTimeFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime1.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter20.withZone(dateTimeZone24);
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay30 = dateMidnight27.toYearMonthDay();
        org.joda.time.DateTime dateTime31 = yearMonthDay30.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(stringBuffer26, (org.joda.time.ReadableInstant) dateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        java.lang.String str2 = periodType1.getName();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.PeriodType periodType4 = periodType1.withYearsRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 26061397, periodType4, chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfDay();
        java.lang.String str16 = dateTimeField15.getName();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Years" + "'", str2, "Years");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "clockhourOfDay" + "'", str16, "clockhourOfDay");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (-1), chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.yearOfEra();
        int int13 = dateTimeField11.getMaximumValue((long) 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        mutableDateTime8.setZone(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.getName(0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) 26067972, locale16);
        long long19 = dateTimeZone10.nextTransition((long) 2);
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        mutableDateTime1.setMillisOfDay(8);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.Interval interval19 = yearMonthDay18.toInterval();
        org.joda.time.DateMidnight dateMidnight20 = yearMonthDay18.toDateMidnight();
        org.joda.time.Interval interval21 = yearMonthDay18.toInterval();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay18.minusDays(35);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        mutableDateTime26.setZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate24.toDateTimeAtStartOfDay(dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime33 = yearMonthDay23.toDateTimeAtMidnight(dateTimeZone29);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = yearMonthDay23.toString("2022-02-22T07:14:38.600Z", locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1147058000L + "'", long17 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Etc/UTC" + "'", str32, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime7 = localTime4.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime4.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(26069075);
        int int12 = dateTime11.getYear();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(46, 26081165, (-292275054), (int) 'a', chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26069075 + "'", int12 == 26069075);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = localDateTime3.get(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property14 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime3.toString("tedesco (Germania)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26098322 + "'", int5 == 26098322);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 7, 100L, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology11);
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter16.getParser();
        java.lang.Appendable appendable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(appendable18, (long) 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser17);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int2 = timeOfDay1.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withMinuteOfHour(3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Seconds seconds8 = period7.toStandardSeconds();
        int int9 = period7.getMonths();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay1.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.withHourOfDay(26098041);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26098041 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26098438 + "'", int5 == 26098438);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 1970, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 26082282, dateTimeZone3);
        long long8 = dateTimeZone3.convertUTCToLocal(26081440L);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 26081440L + "'", long8 == 26081440L);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        int int6 = localDate4.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withDayOfWeek((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 100, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.copy();
        org.joda.time.Duration duration19 = period15.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight10.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration21, readableInstant22, periodType23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutablePeriod24.add(readableDuration25);
        mutablePeriod24.addMonths((int) '#');
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        int int32 = localDate31.getDayOfYear();
        org.joda.time.LocalTime localTime33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate31.toDateTime(localTime33, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = localDate31.toDateMidnight(dateTimeZone36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.yearOfEra();
        int int39 = dateMidnight37.getMinuteOfHour();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 100, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime44.copy();
        org.joda.time.Duration duration46 = period42.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight37.plus((org.joda.time.ReadableDuration) duration46);
        mutablePeriod24.add((org.joda.time.ReadableDuration) duration46);
        boolean boolean49 = duration19.isLongerThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration19, periodType50);
        org.joda.time.Period period52 = new org.joda.time.Period(10L, periodType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = period52.withHours(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(26067332, (int) (short) 10, 26063188);
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
        int int22 = dateTimeField19.getDifference((long) (byte) 10, (long) (-1));
        java.lang.String str24 = dateTimeField19.getAsShortText((-27424365L));
        java.lang.String str25 = dateTimeField19.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 1, chronology27);
        int int29 = localDate28.getDayOfYear();
        org.joda.time.LocalTime localTime30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate28.toDateTime(localTime30, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = localDate28.toDateMidnight(dateTimeZone33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.yearOfEra();
        int int36 = dateMidnight34.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property37 = dateMidnight34.year();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight34.plusYears((int) ' ');
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight34);
        int int41 = localDate40.getYearOfEra();
        org.joda.time.LocalDate localDate43 = localDate40.withYear(26080419);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone46 = dateMidnight45.getZone();
        org.joda.time.DateMidnight.Property property47 = dateMidnight45.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay48 = dateMidnight45.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = yearMonthDay48.getFieldTypes();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 1, chronology51);
        java.lang.String str53 = localDate52.toString();
        org.joda.time.LocalDate localDate55 = localDate52.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.eras();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.year();
        long long62 = chronology56.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay48.withChronologyRetainFields(chronology56);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone65 = dateMidnight64.getZone();
        org.joda.time.DateMidnight.Property property66 = dateMidnight64.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay67 = dateMidnight64.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = yearMonthDay67.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone70 = dateMidnight69.getZone();
        boolean boolean72 = dateTimeZone70.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(dateTimeZone70);
        org.joda.time.DateMidnight dateMidnight74 = yearMonthDay67.toDateMidnight(dateTimeZone70);
        int[] intArray76 = chronology56.get((org.joda.time.ReadablePartial) yearMonthDay67, (long) 26069970);
        int[] intArray78 = dateTimeField19.addWrapField((org.joda.time.ReadablePartial) localDate40, 0, intArray76, 26087585);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder79 = builder0.setFields(intArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1969" + "'", str24, "1969");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateTimeField[year]" + "'", str25, "DateTimeField[year]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01" + "'", str53, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1147058000L + "'", long62 == 1147058000L);
        org.junit.Assert.assertNotNull(yearMonthDay63);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(yearMonthDay67);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(dateMidnight74);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[26089555, 1, 1]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[26089555, 1, 1]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.copy();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        mutableDateTime7.setZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime4.toMutableDateTime(dateTimeZone9);
        java.lang.String str13 = dateTime4.toString();
        java.lang.String str15 = dateTime4.toString("44");
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0099-02-24T07:14:58.763Z" + "'", str13, "0099-02-24T07:14:58.763Z");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44" + "'", str15, "44");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("Years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addCopy((long) (-292275054));
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(26075615);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) periodType9, dateTimeZone11);
        int int13 = localDateTime12.getDayOfMonth();
        int int14 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        int int16 = localDateTime12.getEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYear(2022);
        int int19 = localDateTime18.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime8.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27424365L) + "'", long4 == (-27424365L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26098839 + "'", int14 == 26098839);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int7 = timeOfDay6.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.withMinuteOfHour(3);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime3, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Period period19 = period13.plusDays((int) (byte) 10);
        int int20 = period19.getHours();
        org.joda.time.Period period22 = period19.plusMonths(2);
        org.joda.time.Period period24 = period19.minusMonths(12);
        org.joda.time.Period period26 = period19.plusWeeks(26073687);
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 119);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay32 = timeOfDay6.withField(dateTimeFieldType30, 139);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        java.lang.String str2 = periodType1.getName();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.PeriodType periodType4 = periodType1.withYearsRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 26061397, periodType4, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology11.getDateTimeMillis((long) 687120000, (int) (short) 100, 26066836, 50, 46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Years" + "'", str2, "Years");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        gregorianCalendar2.setTimeZone(timeZone3);
        int int5 = gregorianCalendar2.getMinimalDaysInFirstWeek();
        long long6 = gregorianCalendar2.getTimeInMillis();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = gregorianCalendar2.compareTo(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645514098940L + "'", long6 == 1645514098940L);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
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
        org.joda.time.DateMidnight.Property property15 = dateMidnight8.dayOfMonth();
        java.util.Locale locale19 = new java.util.Locale("1970", "PT0.100S");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = property15.setCopy("\u30a4\u30bf\u30ea\u30a2", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"????\" for dayOfMonth is not supported");
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
        org.junit.Assert.assertEquals(locale19.toString(), "1970_PT0.100S");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) 26061444);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        int int5 = period2.getMinutes();
        org.joda.time.Period period7 = period2.withMillis(915);
        int int8 = period2.getMonths();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.eras();
        int int10 = period2.indexOf(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT7H14M21.445S" + "'", str4, "PT7H14M21.445S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 14 + "'", int5 == 14);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar2 = dateTime0.toGregorianCalendar();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar2);
        gregorianCalendar2.setFirstDayOfWeek((int) ' ');
        java.util.TimeZone timeZone6 = gregorianCalendar2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = gregorianCalendar2.getMaximum(867);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 867");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = localDate6.toString("14", locale14);
        java.lang.String str19 = locale14.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale14);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.Chronology chronology24 = dateTimeFormatter20.getChronolgy();
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(stringBuffer25, (long) 26095703);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Corea del Sud" + "'", str17, "Corea del Sud");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "14" + "'", str18, "14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(chronology24);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
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
            org.joda.time.DateMidnight dateMidnight14 = property11.addToCopy(1645514087536L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1645514087536");
        } catch (java.lang.ArithmeticException e) {
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
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        java.lang.String str14 = property11.getAsShortText();
        org.joda.time.DateMidnight dateMidnight15 = property11.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withYearOfEra((int) (short) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        int int21 = localDate20.getDayOfYear();
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate20.toDateTime(localTime22, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration25, readableInstant26, periodType27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutablePeriod28.add(readableDuration29);
        mutablePeriod28.addMonths((int) '#');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        int int36 = localDate35.getDayOfYear();
        org.joda.time.LocalTime localTime37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate35.toDateTime(localTime37, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = localDate35.toDateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfEra();
        int int43 = dateMidnight41.getMinuteOfHour();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 100, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.copy();
        org.joda.time.Duration duration50 = period46.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight41.plus((org.joda.time.ReadableDuration) duration50);
        mutablePeriod28.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTime dateTime53 = dateTime24.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight15.minus((org.joda.time.ReadableDuration) duration50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight57 = dateMidnight54.withDurationAdded((long) 26062367, 26073687);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223371985507200000 + 679541999637129");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateMidnight54);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-22T07:14:42.802");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-22T07:14:42.802' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 26067332);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        java.lang.String str11 = property10.getAsString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "50" + "'", str11, "50");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone2 = dateMidnight1.getZone();
        boolean boolean4 = dateTimeZone2.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate8 = localDate5.withYear(20);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, (int) (byte) 0);
        boolean boolean13 = localDate8.isSupported(durationFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime0.withFieldAdded(durationFieldType10, 26063479);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property8 = localDate2.yearOfCentury();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.PeriodType periodType11 = periodType9.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) property8, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Years" + "'", str10, "Years");
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime6.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Period period11 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property13 = localTime0.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withMonthsRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) chronology6, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }
}
